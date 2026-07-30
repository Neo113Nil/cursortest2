package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.fitness.data.WorkoutExercises;
import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        DesignElement(String str, String str2, HashMap<String, String> hashMap) {
            this.mId = str;
            this.mType = str2;
            this.mParams = hashMap;
        }

        public String getId() {
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        public String getType() {
            return this.mType;
        }
    }

    static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        FiniteGenerator(float f8, float f9, float f10, String str, String str2) {
            this.mFrom = f8;
            this.mTo = f9;
            this.mStep = f10;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f9;
            this.mInitial = f8;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i8 = (int) this.mInitial;
            int i9 = (int) this.mMax;
            int i10 = i8;
            while (i8 <= i9) {
                arrayList.add(this.mPrefix + i10 + this.mPostfix);
                i10 += (int) this.mStep;
                i8++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f8 = this.mCurrent;
            if (f8 >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f8 + this.mStep;
            }
            return this.mCurrent;
        }
    }

    interface GeneratedValue {
        float value();
    }

    static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        Generator(float f8, float f9) {
            this.mStart = f8;
            this.mIncrementBy = f9;
            this.mCurrent = f8;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        float get(Object obj) {
            if (!(obj instanceof CLString)) {
                if (obj instanceof CLNumber) {
                    return ((CLNumber) obj).getFloat();
                }
                return 0.0f;
            }
            String content = ((CLString) obj).content();
            if (this.mGenerators.containsKey(content)) {
                return this.mGenerators.get(content).value();
            }
            if (this.mMargins.containsKey(content)) {
                return this.mMargins.get(content).floatValue();
            }
            return 0.0f;
        }

        ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        void put(String str, int i8) {
            this.mMargins.put(str, Integer.valueOf(i8));
        }

        public void putOverride(String str, float f8) {
            this.mGenerators.put(str, new OverrideValue(f8));
        }

        void put(String str, float f8, float f9) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f8, f9));
        }

        void put(String str, float f8, float f9, float f10, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f8, f9, f10, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    static class OverrideValue implements GeneratedValue {
        float mValue;

        OverrideValue(float f8) {
            this.mValue = f8;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016a, code lost:
    
        if (r8.equals(com.baidu.platform.comapi.map.MapBundleKey.MapObjKey.OBJ_SL_VISI) == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyAttribute(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject, String str) {
        char c8;
        str.hashCode();
        char c9 = 2;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1349088399:
                if (str.equals(SchedulerSupport.CUSTOM)) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -1221029593:
                if (str.equals(x.KEY_HEIGHT)) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c8 = 16;
                    break;
                }
                c8 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c8 = 17;
                    break;
                }
                c8 = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c8 = 18;
                    break;
                }
                c8 = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c8 = 19;
                    break;
                }
                c8 = 65535;
                break;
            case 113126854:
                if (str.equals(x.KEY_WIDTH)) {
                    c8 = 20;
                    break;
                }
                c8 = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c8 = 21;
                    break;
                }
                c8 = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c8 = 22;
                    break;
                }
                c8 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c8 = 23;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                String string = cLObject.getString(str);
                boolean equals = string.equals("parent");
                Object obj = string;
                if (equals) {
                    obj = State.PARENT;
                }
                ConstraintReference constraints = state.constraints(obj);
                constraintReference.topToTop(constraints);
                constraintReference.bottomToBottom(constraints);
                break;
            case 1:
                String string2 = cLObject.getString(str);
                ConstraintReference constraints2 = string2.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string2);
                constraintReference.startToStart(constraints2);
                constraintReference.endToEnd(constraints2);
                constraintReference.topToTop(constraints2);
                constraintReference.bottomToBottom(constraints2);
                break;
            case 2:
                parseCustomProperties(cLObject, constraintReference, str);
                break;
            case 3:
                constraintReference.rotationX(layoutVariables.get(cLObject.get(str)));
                break;
            case 4:
                constraintReference.rotationY(layoutVariables.get(cLObject.get(str)));
                break;
            case 5:
                constraintReference.rotationZ(layoutVariables.get(cLObject.get(str)));
                break;
            case 6:
                constraintReference.translationX(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case 7:
                constraintReference.translationY(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case '\b':
                constraintReference.translationZ(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case '\t':
                constraintReference.setHeight(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case '\n':
                parseMotionProperties(cLObject.get(str), constraintReference);
                break;
            case 11:
                constraintReference.pivotX(layoutVariables.get(cLObject.get(str)));
                break;
            case '\f':
                constraintReference.pivotY(layoutVariables.get(cLObject.get(str)));
                break;
            case '\r':
                constraintReference.scaleX(layoutVariables.get(cLObject.get(str)));
                break;
            case 14:
                constraintReference.scaleY(layoutVariables.get(cLObject.get(str)));
                break;
            case 15:
                float f8 = layoutVariables.get(cLObject.get(str));
                if (state.isRtl()) {
                    f8 = 1.0f - f8;
                }
                constraintReference.horizontalBias(f8);
                break;
            case 16:
                constraintReference.setVerticalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case 17:
                constraintReference.alpha(layoutVariables.get(cLObject.get(str)));
                break;
            case 18:
                constraintReference.horizontalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case 19:
                constraintReference.verticalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case 20:
                constraintReference.setWidth(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case 21:
                constraintReference.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case 22:
                String string3 = cLObject.getString(str);
                boolean equals2 = string3.equals("parent");
                Object obj2 = string3;
                if (equals2) {
                    obj2 = State.PARENT;
                }
                ConstraintReference constraints3 = state.constraints(obj2);
                constraintReference.startToStart(constraints3);
                constraintReference.endToEnd(constraints3);
                break;
            case 23:
                String string4 = cLObject.getString(str);
                string4.hashCode();
                switch (string4.hashCode()) {
                    case -1901805651:
                        if (string4.equals("invisible")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 3178655:
                        if (string4.equals("gone")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 466743410:
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
                    case 0:
                        constraintReference.visibility(4);
                        constraintReference.alpha(0.0f);
                        break;
                    case 1:
                        constraintReference.visibility(8);
                        break;
                    case 2:
                        constraintReference.visibility(0);
                        break;
                }
            default:
                parseConstraint(state, layoutVariables, cLObject, constraintReference, str);
                break;
        }
    }

    private static int indexOf(String str, String... strArr) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (strArr[i8].equals(str)) {
                return i8;
            }
        }
        return -1;
    }

    static String lookForType(CLObject cLObject) {
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    static void override(CLObject cLObject, String str, CLObject cLObject2) {
        if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
            return;
        }
        CLObject object = cLObject.getObject(str);
        Iterator<String> it = cLObject2.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("clear")) {
                CLArray array = cLObject2.getArray("clear");
                for (int i8 = 0; i8 < array.size(); i8++) {
                    String stringOrNull = array.getStringOrNull(i8);
                    if (stringOrNull != null) {
                        switch (stringOrNull) {
                            case "transforms":
                                object.remove("visibility");
                                object.remove("alpha");
                                object.remove("pivotX");
                                object.remove("pivotY");
                                object.remove("rotationX");
                                object.remove("rotationY");
                                object.remove("rotationZ");
                                object.remove("scaleX");
                                object.remove("scaleY");
                                object.remove("translationX");
                                object.remove("translationY");
                                break;
                            case "constraints":
                                object.remove("start");
                                object.remove("end");
                                object.remove("top");
                                object.remove("bottom");
                                object.remove("baseline");
                                object.remove(TtmlNode.CENTER);
                                object.remove("centerHorizontally");
                                object.remove("centerVertically");
                                break;
                            case "dimensions":
                                object.remove(x.KEY_WIDTH);
                                object.remove(x.KEY_HEIGHT);
                                break;
                            default:
                                object.remove(stringOrNull);
                                break;
                        }
                    }
                }
            } else {
                object.put(next, cLObject2.get(next));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        if (r3.equals("top") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseBarrier(State state, String str, CLObject cLObject) {
        char c8;
        boolean z7 = !state.isRtl();
        BarrierReference barrier = state.barrier(str, State.Direction.END);
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.hashCode();
            char c9 = 2;
            switch (next.hashCode()) {
                case -1081309778:
                    if (next.equals("margin")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    float floatOrNaN = cLObject.getFloatOrNaN(next);
                    if (Float.isNaN(floatOrNaN)) {
                        break;
                    } else {
                        barrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                        break;
                    }
                case 1:
                    String string = cLObject.getString(next);
                    string.hashCode();
                    switch (string.hashCode()) {
                        case -1383228885:
                            if (string.equals("bottom")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 100571:
                            if (string.equals("end")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 115029:
                            break;
                        case 3317767:
                            if (string.equals(TtmlNode.LEFT)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 108511772:
                            if (string.equals(TtmlNode.RIGHT)) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 109757538:
                            if (string.equals("start")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                            barrier.setBarrierDirection(State.Direction.BOTTOM);
                            break;
                        case 1:
                            if (z7) {
                                barrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            } else {
                                barrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            }
                        case 2:
                            barrier.setBarrierDirection(State.Direction.TOP);
                            break;
                        case 3:
                            barrier.setBarrierDirection(State.Direction.LEFT);
                            break;
                        case 4:
                            barrier.setBarrierDirection(State.Direction.RIGHT);
                            break;
                        case 5:
                            if (z7) {
                                barrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            } else {
                                barrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            }
                    }
                case 2:
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull != null) {
                        for (int i8 = 0; i8 < arrayOrNull.size(); i8++) {
                            barrier.add(state.constraints(arrayOrNull.get(i8).content()));
                        }
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseChain(int i8, State state, LayoutVariables layoutVariables, CLArray cLArray) {
        String content;
        ChainReference horizontalChain = i8 == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() < 1) {
                return;
            }
            for (int i9 = 0; i9 < cLArray2.size(); i9++) {
                horizontalChain.add(cLArray2.getString(i9));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    Iterator<String> it = cLObject.names().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        next.hashCode();
                        if (next.equals(TtmlNode.TAG_STYLE)) {
                            CLElement cLElement3 = cLObject.get(next);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    content = cLArray3.getString(0);
                                    horizontalChain.bias(cLArray3.getFloat(1));
                                    content.hashCode();
                                    if (!content.equals("packed")) {
                                        horizontalChain.style(State.Chain.PACKED);
                                    } else if (content.equals("spread_inside")) {
                                        horizontalChain.style(State.Chain.SPREAD_INSIDE);
                                    } else {
                                        horizontalChain.style(State.Chain.SPREAD);
                                    }
                                }
                            }
                            content = cLElement3.content();
                            content.hashCode();
                            if (!content.equals("packed")) {
                            }
                        } else {
                            parseConstraint(state, layoutVariables, cLObject, horizontalChain, next);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseChainType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) {
        String next;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CLArray cLArray;
        float f8;
        float f9;
        float f10;
        float f11;
        String content;
        int i13 = 0;
        ChainReference horizontalChain = str.charAt(0) == 'h' ? state.horizontalChain() : state.verticalChain();
        horizontalChain.setKey(str2);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            next = it.next();
            next.hashCode();
            i8 = 6;
            i9 = 3;
            i10 = 2;
            i11 = 1;
            switch (next) {
                case "bottom":
                case "end":
                case "top":
                case "left":
                case "right":
                case "start":
                    parseConstraint(state, layoutVariables, cLObject, horizontalChain, next);
                    continue;
                    i13 = 0;
                case "contains":
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement;
                        if (cLArray2.size() >= 1) {
                            int i14 = 0;
                            while (i14 < cLArray2.size()) {
                                CLElement cLElement2 = cLArray2.get(i14);
                                if (cLElement2 instanceof CLArray) {
                                    CLArray cLArray3 = (CLArray) cLElement2;
                                    if (cLArray3.size() > 0) {
                                        String content2 = cLArray3.get(i13).content();
                                        int size = cLArray3.size();
                                        float f12 = Float.NaN;
                                        if (size == i10) {
                                            f8 = cLArray3.getFloat(i11);
                                            f9 = Float.NaN;
                                        } else if (size != i9) {
                                            if (size == 4) {
                                                f8 = cLArray3.getFloat(i11);
                                                f12 = toPix(state, cLArray3.getFloat(2));
                                                f11 = Float.NaN;
                                                f10 = Float.NaN;
                                                f9 = toPix(state, cLArray3.getFloat(3));
                                            } else if (size != i8) {
                                                f8 = Float.NaN;
                                                f9 = Float.NaN;
                                            } else {
                                                f8 = cLArray3.getFloat(i11);
                                                float pix = toPix(state, cLArray3.getFloat(i10));
                                                float pix2 = toPix(state, cLArray3.getFloat(i9));
                                                float pix3 = toPix(state, cLArray3.getFloat(4));
                                                f10 = toPix(state, cLArray3.getFloat(5));
                                                f11 = pix3;
                                                f12 = pix;
                                                f9 = pix2;
                                            }
                                            i12 = i14;
                                            float f13 = f8;
                                            cLArray = cLArray2;
                                            horizontalChain.addChainElement(content2, f13, f12, f9, f11, f10);
                                        } else {
                                            f8 = cLArray3.getFloat(i11);
                                            f9 = toPix(state, cLArray3.getFloat(i10));
                                            f12 = f9;
                                        }
                                        f11 = Float.NaN;
                                        f10 = Float.NaN;
                                        i12 = i14;
                                        float f132 = f8;
                                        cLArray = cLArray2;
                                        horizontalChain.addChainElement(content2, f132, f12, f9, f11, f10);
                                    } else {
                                        i12 = i14;
                                        cLArray = cLArray2;
                                    }
                                } else {
                                    i12 = i14;
                                    cLArray = cLArray2;
                                    horizontalChain.add(cLElement2.content());
                                }
                                cLArray2 = cLArray;
                                i14 = i12 + 1;
                                i13 = 0;
                                i11 = 1;
                                i10 = 2;
                                i9 = 3;
                                i8 = 6;
                            }
                            continue;
                            i13 = 0;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + cLElement.content() + "\"");
                    return;
                case "style":
                    CLElement cLElement3 = cLObject.get(next);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray4 = (CLArray) cLElement3;
                        if (cLArray4.size() > 1) {
                            content = cLArray4.getString(i13);
                            horizontalChain.bias(cLArray4.getFloat(1));
                            content.hashCode();
                            if (!content.equals("packed")) {
                                horizontalChain.style(State.Chain.PACKED);
                                break;
                            } else if (!content.equals("spread_inside")) {
                                horizontalChain.style(State.Chain.SPREAD);
                                break;
                            } else {
                                horizontalChain.style(State.Chain.SPREAD_INSIDE);
                                break;
                            }
                        }
                    }
                    content = cLElement3.content();
                    content.hashCode();
                    if (!content.equals("packed")) {
                    }
            }
            i13 = 0;
        }
    }

    static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF" + substring;
        }
        return Long.parseLong(substring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x00d0. Please report as an issue. */
    static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) {
        ConstraintReference constraints;
        char c8;
        boolean z7;
        boolean z8;
        char c9;
        boolean z9;
        boolean isRtl = state.isRtl();
        boolean z10 = !isRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                constraints = stringOrNull.equals("parent") ? state.constraints(State.PARENT) : state.constraints(stringOrNull);
                str.hashCode();
                switch (str) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraints.getKey());
                        constraintReference.baselineToBaseline(constraints);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints);
                        break;
                    case "end":
                        if (!z10) {
                            constraintReference.leftToLeft(constraints);
                            break;
                        } else {
                            constraintReference.rightToRight(constraints);
                            break;
                        }
                    case "top":
                        constraintReference.topToTop(constraints);
                        break;
                    case "start":
                        if (!z10) {
                            constraintReference.rightToRight(constraints);
                            break;
                        } else {
                            constraintReference.leftToLeft(constraints);
                            break;
                        }
                }
                return;
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        float pix = arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f;
        float pix2 = arrayOrNull.size() > 3 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3))) : 0.0f;
        ConstraintReference constraints2 = string.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string);
        str.hashCode();
        float f8 = pix2;
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                stringOrNull2.hashCode();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.baselineToBaseline(constraints2);
                        break;
                    case "bottom":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToBottom(constraints2);
                        break;
                    case "top":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToTop(constraints2);
                        break;
                }
                z7 = true;
                z8 = false;
                break;
            case 1:
                constraintReference.circularConstraint(constraints2, layoutVariables.get(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f);
                z7 = true;
                z8 = false;
                break;
            case 2:
                stringOrNull2.hashCode();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.bottomToBaseline(constraints2);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints2);
                        break;
                    case "top":
                        constraintReference.bottomToTop(constraints2);
                        break;
                }
                z7 = true;
                z8 = false;
                break;
            case 3:
                z7 = isRtl;
                z8 = true;
                break;
            case 4:
                stringOrNull2.hashCode();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.topToBaseline(constraints2);
                        break;
                    case "bottom":
                        constraintReference.topToBottom(constraints2);
                        break;
                    case "top":
                        constraintReference.topToTop(constraints2);
                        break;
                }
                z7 = true;
                z8 = false;
                break;
            case 5:
                z7 = true;
                z8 = true;
                break;
            case 6:
                z7 = false;
                z8 = true;
                break;
            case 7:
                z7 = z10;
                z8 = true;
                break;
            default:
                z7 = true;
                z8 = false;
                break;
        }
        if (z8) {
            stringOrNull2.hashCode();
            switch (stringOrNull2.hashCode()) {
                case 100571:
                    if (stringOrNull2.equals("end")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3317767:
                    if (stringOrNull2.equals(TtmlNode.LEFT)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 108511772:
                    if (stringOrNull2.equals(TtmlNode.RIGHT)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 109757538:
                    if (stringOrNull2.equals("start")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    z9 = isRtl;
                    break;
                case 1:
                default:
                    z9 = true;
                    break;
                case 2:
                    z9 = false;
                    break;
                case 3:
                    z9 = z10;
                    break;
            }
            if (z7) {
                if (z9) {
                    constraintReference.leftToLeft(constraints2);
                } else {
                    constraintReference.leftToRight(constraints2);
                }
            } else if (z9) {
                constraintReference.rightToLeft(constraints2);
            } else {
                constraintReference.rightToRight(constraints2);
            }
        }
        constraintReference.margin(Float.valueOf(pix)).marginGone(Float.valueOf(f8));
    }

    static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLObject object = cLObject.getObject(next);
            String stringOrNull = object.getStringOrNull("Extends");
            if (stringOrNull == null || stringOrNull.isEmpty()) {
                coreMotionScene.setConstraintSetContent(next, object.toJSON());
            } else {
                String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                if (constraintSet != null) {
                    CLObject parse = CLParser.parse(constraintSet);
                    ArrayList<String> names2 = object.names();
                    if (names2 != null) {
                        Iterator<String> it2 = names2.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            CLElement cLElement = object.get(next2);
                            if (cLElement instanceof CLObject) {
                                override(parse, next2, (CLObject) cLElement);
                            }
                        }
                        coreMotionScene.setConstraintSetContent(next, parse.toJSON());
                    }
                }
            }
        }
    }

    static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) {
        ArrayList<String> names;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (names = objectOrNull.names()) == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = objectOrNull.get(next);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(next, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long parseColorString = parseColorString(cLElement.content());
                if (parseColorString != -1) {
                    constraintReference.addCustomColor(next, (int) parseColorString);
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) {
        CLObject parse = CLParser.parse(str);
        ArrayList<String> names = parse.names();
        if (names != null && names.size() > 0) {
            String str2 = names.get(0);
            CLElement cLElement = parse.get(str2);
            str2.hashCode();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject = (CLObject) cLElement;
                ArrayList<String> names2 = cLObject.names();
                for (int i8 = 0; i8 < names2.size(); i8++) {
                    String str3 = names2.get(i8);
                    CLObject cLObject2 = (CLObject) cLObject.get(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String stringOrNull = cLObject2.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap hashMap = new HashMap();
                        int size = cLObject2.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            CLKey cLKey = (CLKey) cLObject2.get(i8);
                            String content = cLKey.content();
                            String content2 = cLKey.getValue().content();
                            if (content2 != null) {
                                hashMap.put(content, content2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, hashMap));
                    }
                }
            }
        }
    }

    static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) {
        CLElement cLElement = cLObject.get(str);
        Dimension createFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (!(cLElement instanceof CLObject)) {
            return createFixed;
        }
        CLObject cLObject2 = (CLObject) cLElement;
        String stringOrNull = cLObject2.getStringOrNull("value");
        if (stringOrNull != null) {
            createFixed = parseDimensionMode(stringOrNull);
        }
        CLElement orNull = cLObject2.getOrNull("min");
        if (orNull != null) {
            if (orNull instanceof CLNumber) {
                createFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
            } else if (orNull instanceof CLString) {
                createFixed.min(Dimension.WRAP_DIMENSION);
            }
        }
        CLElement orNull2 = cLObject2.getOrNull("max");
        if (orNull2 == null) {
            return createFixed;
        }
        if (orNull2 instanceof CLNumber) {
            createFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
            return createFixed;
        }
        if (!(orNull2 instanceof CLString)) {
            return createFixed;
        }
        createFixed.max(Dimension.WRAP_DIMENSION);
        return createFixed;
    }

    static Dimension parseDimensionMode(String str) {
        Dimension createFixed;
        createFixed = Dimension.createFixed(0);
        str.hashCode();
        switch (str) {
            case "preferWrap":
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case "parent":
                return Dimension.createParent();
            case "spread":
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case "wrap":
                return Dimension.createWrap();
            default:
                return str.endsWith("%") ? Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0) : str.contains(":") ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : createFixed;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03be A[Catch: NumberFormatException -> 0x024b, TryCatch #1 {NumberFormatException -> 0x024b, blocks: (B:77:0x0234, B:81:0x0243, B:82:0x024e, B:85:0x0256, B:163:0x03af, B:165:0x03be, B:166:0x03c5, B:169:0x03cd), top: B:76:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0243 A[Catch: NumberFormatException -> 0x024b, TryCatch #1 {NumberFormatException -> 0x024b, blocks: (B:77:0x0234, B:81:0x0243, B:82:0x024e, B:85:0x0256, B:163:0x03af, B:165:0x03be, B:166:0x03c5, B:169:0x03cd), top: B:76:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseFlowType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) {
        char c8;
        String content;
        String str3;
        String str4;
        Float valueOf;
        String content2;
        String str5;
        String str6;
        float f8;
        float f9;
        float f10;
        float f11;
        Float valueOf2;
        float f12;
        float f13;
        float f14;
        float f15;
        FlowReference flow = state.getFlow(str2, str.charAt(0) == 'v');
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.hashCode();
            int i8 = 4;
            switch (next.hashCode()) {
                case -1254185091:
                    if (next.equals("hAlign")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1237307863:
                    if (next.equals("hStyle")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1198076529:
                    if (next.equals("hFlowBias")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -853376977:
                    if (next.equals("vAlign")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -836499749:
                    if (next.equals("vStyle")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -806339567:
                    if (next.equals("padding")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -732635235:
                    if (next.equals("vFlowBias")) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -488900360:
                    if (next.equals("maxElement")) {
                        c8 = '\b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3169614:
                    if (next.equals("hGap")) {
                        c8 = '\t';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3575610:
                    if (next.equals("type")) {
                        c8 = '\n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3586688:
                    if (next.equals("vGap")) {
                        c8 = 11;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3657802:
                    if (next.equals("wrap")) {
                        c8 = '\f';
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    String content3 = cLObject.get(next).content();
                    content3.hashCode();
                    if (!content3.equals("end")) {
                        if (!content3.equals("start")) {
                            flow.setHorizontalAlign(2);
                            break;
                        } else {
                            flow.setHorizontalAlign(0);
                            break;
                        }
                    } else {
                        flow.setHorizontalAlign(1);
                        break;
                    }
                case 1:
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            str3 = cLArray.getString(0);
                            content = cLArray.getString(1);
                            str4 = cLArray.size() > 2 ? cLArray.getString(2) : "";
                            if (!content.equals("")) {
                                flow.setHorizontalStyle(State.Chain.getValueByString(content));
                            }
                            if (!str3.equals("")) {
                                flow.setFirstHorizontalStyle(State.Chain.getValueByString(str3));
                            }
                            if (!str4.equals("")) {
                                break;
                            } else {
                                flow.setLastHorizontalStyle(State.Chain.getValueByString(str4));
                                break;
                            }
                        }
                    }
                    content = cLElement.content();
                    str3 = "";
                    str4 = str3;
                    if (!content.equals("")) {
                    }
                    if (!str3.equals("")) {
                    }
                    if (!str4.equals("")) {
                    }
                case 2:
                    CLElement cLElement2 = cLObject.get(next);
                    Float valueOf3 = Float.valueOf(0.5f);
                    Float valueOf4 = Float.valueOf(0.5f);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement2;
                        if (cLArray2.size() > 1) {
                            valueOf3 = Float.valueOf(cLArray2.getFloat(0));
                            valueOf = Float.valueOf(cLArray2.getFloat(1));
                            if (cLArray2.size() > 2) {
                                valueOf4 = Float.valueOf(cLArray2.getFloat(2));
                            }
                            flow.horizontalBias(valueOf.floatValue());
                            if (valueOf3.floatValue() != 0.5f) {
                                flow.setFirstHorizontalBias(valueOf3.floatValue());
                            }
                            if (valueOf4.floatValue() != 0.5f) {
                                break;
                            } else {
                                flow.setLastHorizontalBias(valueOf4.floatValue());
                                break;
                            }
                        }
                    }
                    valueOf = Float.valueOf(cLElement2.getFloat());
                    flow.horizontalBias(valueOf.floatValue());
                    if (valueOf3.floatValue() != 0.5f) {
                    }
                    if (valueOf4.floatValue() != 0.5f) {
                    }
                case 3:
                    String content4 = cLObject.get(next).content();
                    content4.hashCode();
                    switch (content4) {
                        case "baseline":
                            flow.setVerticalAlign(3);
                            break;
                        case "bottom":
                            flow.setVerticalAlign(1);
                            break;
                        case "top":
                            flow.setVerticalAlign(0);
                            break;
                        default:
                            flow.setVerticalAlign(2);
                            break;
                    }
                case 4:
                    CLElement cLElement3 = cLObject.get(next);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray3 = (CLArray) cLElement3;
                        if (cLArray3.size() > 1) {
                            str5 = cLArray3.getString(0);
                            content2 = cLArray3.getString(1);
                            str6 = cLArray3.size() > 2 ? cLArray3.getString(2) : "";
                            if (!content2.equals("")) {
                                flow.setVerticalStyle(State.Chain.getValueByString(content2));
                            }
                            if (!str5.equals("")) {
                                flow.setFirstVerticalStyle(State.Chain.getValueByString(str5));
                            }
                            if (!str6.equals("")) {
                                break;
                            } else {
                                flow.setLastVerticalStyle(State.Chain.getValueByString(str6));
                                break;
                            }
                        }
                    }
                    content2 = cLElement3.content();
                    str5 = "";
                    str6 = str5;
                    if (!content2.equals("")) {
                    }
                    if (!str5.equals("")) {
                    }
                    if (!str6.equals("")) {
                    }
                case 5:
                    CLElement cLElement4 = cLObject.get(next);
                    if (cLElement4 instanceof CLArray) {
                        CLArray cLArray4 = (CLArray) cLElement4;
                        if (cLArray4.size() > 1) {
                            f8 = cLArray4.getInt(0);
                            f11 = cLArray4.getInt(1);
                            if (cLArray4.size() > 2) {
                                f10 = cLArray4.getInt(2);
                                try {
                                    f9 = ((CLArray) cLElement4).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f9 = 0.0f;
                                }
                            } else {
                                f10 = f8;
                                f9 = f11;
                            }
                            flow.setPaddingLeft(Math.round(toPix(state, f8)));
                            flow.setPaddingTop(Math.round(toPix(state, f11)));
                            flow.setPaddingRight(Math.round(toPix(state, f10)));
                            flow.setPaddingBottom(Math.round(toPix(state, f9)));
                            break;
                        }
                    }
                    f8 = cLElement4.getInt();
                    f9 = f8;
                    f10 = f9;
                    f11 = f10;
                    flow.setPaddingLeft(Math.round(toPix(state, f8)));
                    flow.setPaddingTop(Math.round(toPix(state, f11)));
                    flow.setPaddingRight(Math.round(toPix(state, f10)));
                    flow.setPaddingBottom(Math.round(toPix(state, f9)));
                case 6:
                    CLElement cLElement5 = cLObject.get(next);
                    Float valueOf5 = Float.valueOf(0.5f);
                    Float valueOf6 = Float.valueOf(0.5f);
                    try {
                        if (cLElement5 instanceof CLArray) {
                            CLArray cLArray5 = (CLArray) cLElement5;
                            if (cLArray5.size() > 1) {
                                valueOf5 = Float.valueOf(cLArray5.getFloat(0));
                                valueOf2 = Float.valueOf(cLArray5.getFloat(1));
                                if (cLArray5.size() > 2) {
                                    valueOf6 = Float.valueOf(cLArray5.getFloat(2));
                                }
                                flow.verticalBias(valueOf2.floatValue());
                                if (valueOf5.floatValue() != 0.5f) {
                                    flow.setFirstVerticalBias(valueOf5.floatValue());
                                }
                                if (valueOf6.floatValue() != 0.5f) {
                                    break;
                                } else {
                                    flow.setLastVerticalBias(valueOf6.floatValue());
                                    break;
                                }
                            }
                        }
                        flow.verticalBias(valueOf2.floatValue());
                        if (valueOf5.floatValue() != 0.5f) {
                        }
                        if (valueOf6.floatValue() != 0.5f) {
                        }
                    } catch (NumberFormatException unused2) {
                        break;
                    }
                    valueOf2 = Float.valueOf(cLElement5.getFloat());
                case 7:
                    CLElement cLElement6 = cLObject.get(next);
                    if (cLElement6 instanceof CLArray) {
                        CLArray cLArray6 = (CLArray) cLElement6;
                        if (cLArray6.size() >= 1) {
                            int i9 = 0;
                            while (i9 < cLArray6.size()) {
                                CLElement cLElement7 = cLArray6.get(i9);
                                if (cLElement7 instanceof CLArray) {
                                    CLArray cLArray7 = (CLArray) cLElement7;
                                    if (cLArray7.size() > 0) {
                                        String content5 = cLArray7.get(0).content();
                                        int size = cLArray7.size();
                                        if (size != 2) {
                                            if (size == 3) {
                                                f15 = cLArray7.getFloat(1);
                                                f13 = toPix(state, cLArray7.getFloat(2));
                                                f14 = f13;
                                            } else if (size != i8) {
                                                f13 = Float.NaN;
                                                f12 = Float.NaN;
                                            } else {
                                                f15 = cLArray7.getFloat(1);
                                                f14 = toPix(state, cLArray7.getFloat(2));
                                                f13 = toPix(state, cLArray7.getFloat(3));
                                            }
                                            f12 = f15;
                                            flow.addFlowElement(content5, f12, f14, f13);
                                        } else {
                                            f12 = cLArray7.getFloat(1);
                                            f13 = Float.NaN;
                                        }
                                        f14 = Float.NaN;
                                        flow.addFlowElement(content5, f12, f14, f13);
                                    }
                                } else {
                                    flow.add(cLElement7.content());
                                }
                                i9++;
                                i8 = 4;
                            }
                            break;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + cLElement6.content() + "\"");
                    return;
                case '\b':
                    flow.setMaxElementsWrap(cLObject.get(next).getInt());
                    break;
                case '\t':
                    flow.setHorizontalGap(cLObject.get(next).getInt());
                    break;
                case '\n':
                    if (!cLObject.get(next).content().equals("hFlow")) {
                        flow.setOrientation(1);
                        break;
                    } else {
                        flow.setOrientation(0);
                        break;
                    }
                case 11:
                    flow.setVerticalGap(cLObject.get(next).getInt());
                    break;
                case '\f':
                    flow.setWrapMode(State.Wrap.getValueByString(cLObject.get(next).content()));
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    break;
            }
        }
    }

    static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            ArrayList<String> list = layoutVariables.getList(next);
            if (list != null && (cLElement instanceof CLObject)) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    parseWidget(state, layoutVariables, it2.next(), (CLObject) cLElement);
                }
            }
        }
    }

    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) {
        String next;
        int i8;
        float f8;
        float f9;
        float f10;
        float f11;
        GridReference grid = state.getGrid(str2, str);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            next = it.next();
            next.hashCode();
            i8 = 0;
            switch (next) {
                case "orientation":
                    grid.setOrientation(cLObject.get(next).getInt());
                    break;
                case "padding":
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            f8 = cLArray.getInt(0);
                            f11 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f10 = cLArray.getInt(2);
                                try {
                                    f9 = ((CLArray) cLElement).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f9 = 0.0f;
                                }
                            } else {
                                f9 = f11;
                                f10 = f8;
                            }
                            grid.setPaddingStart(Math.round(toPix(state, f8)));
                            grid.setPaddingTop(Math.round(toPix(state, f11)));
                            grid.setPaddingEnd(Math.round(toPix(state, f10)));
                            grid.setPaddingBottom(Math.round(toPix(state, f9)));
                            break;
                        }
                    }
                    f8 = cLElement.getInt();
                    f9 = f8;
                    f10 = f9;
                    f11 = f10;
                    grid.setPaddingStart(Math.round(toPix(state, f8)));
                    grid.setPaddingTop(Math.round(toPix(state, f11)));
                    grid.setPaddingEnd(Math.round(toPix(state, f10)));
                    grid.setPaddingBottom(Math.round(toPix(state, f9)));
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull != null) {
                        for (int i9 = 0; i9 < arrayOrNull.size(); i9++) {
                            grid.add(state.constraints(arrayOrNull.get(i9).content()));
                        }
                        break;
                    } else {
                        break;
                    }
                case "hGap":
                    grid.setHorizontalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "rows":
                    int i10 = cLObject.get(next).getInt();
                    if (i10 > 0) {
                        grid.setRowsSet(i10);
                        break;
                    } else {
                        break;
                    }
                case "vGap":
                    grid.setVerticalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "flags":
                    String str3 = "";
                    try {
                        CLElement cLElement2 = cLObject.get(next);
                        if (cLElement2 instanceof CLNumber) {
                            i8 = cLElement2.getInt();
                        } else {
                            str3 = cLElement2.content();
                        }
                    } catch (Exception e8) {
                        System.err.println("Error parsing grid flags " + e8);
                    }
                    if (str3 != null && !str3.isEmpty()) {
                        grid.setFlags(str3);
                        break;
                    } else {
                        grid.setFlags(i8);
                        break;
                    }
                case "skips":
                    String content = cLObject.get(next).content();
                    if (content != null && content.contains(":")) {
                        grid.setSkips(content);
                        break;
                    }
                    break;
                case "spans":
                    String content2 = cLObject.get(next).content();
                    if (content2 != null && content2.contains(":")) {
                        grid.setSpans(content2);
                        break;
                    }
                    break;
                case "rowWeights":
                    String content3 = cLObject.get(next).content();
                    if (content3 != null && content3.contains(SystemInfoUtil.COMMA)) {
                        grid.setRowWeights(content3);
                        break;
                    }
                    break;
                case "columns":
                    int i11 = cLObject.get(next).getInt();
                    if (i11 > 0) {
                        grid.setColumnsSet(i11);
                        break;
                    } else {
                        break;
                    }
                case "columnWeights":
                    String content4 = cLObject.get(next).content();
                    if (content4 != null && content4.contains(SystemInfoUtil.COMMA)) {
                        grid.setColumnWeights(content4);
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    break;
            }
        }
    }

    static void parseGuideline(int i8, State state, CLArray cLArray) {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i8, state, stringOrNull, cLObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0083. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00f9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseGuidelineParams(int i8, State state, String str, CLObject cLObject) {
        char c8;
        char c9;
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        ConstraintReference constraints = state.constraints(str);
        if (i8 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z7 = !state.isRtl() || i8 == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraints.getFacade();
        Iterator<String> it = names.iterator();
        float f8 = 0.0f;
        boolean z8 = false;
        while (true) {
            boolean z9 = true;
            while (it.hasNext()) {
                String next = it.next();
                next.hashCode();
                switch (next.hashCode()) {
                    case -678927291:
                        if (next.equals("percent")) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 100571:
                        if (next.equals("end")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 3317767:
                        if (next.equals(TtmlNode.LEFT)) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 108511772:
                        if (next.equals(TtmlNode.RIGHT)) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 109757538:
                        if (next.equals("start")) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                        if (arrayOrNull == null) {
                            f8 = cLObject.getFloat(next);
                        } else {
                            if (arrayOrNull.size() > 1) {
                                String string = arrayOrNull.getString(0);
                                float f9 = arrayOrNull.getFloat(1);
                                string.hashCode();
                                switch (string.hashCode()) {
                                    case 100571:
                                        if (string.equals("end")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3317767:
                                        if (string.equals(TtmlNode.LEFT)) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 108511772:
                                        if (string.equals(TtmlNode.RIGHT)) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 109757538:
                                        if (string.equals("start")) {
                                            c9 = 3;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                switch (c9) {
                                    case 0:
                                        z9 = !z7;
                                        f8 = f9;
                                        break;
                                    case 1:
                                        f8 = f9;
                                        break;
                                    case 2:
                                        f8 = f9;
                                        z8 = true;
                                        z9 = false;
                                    case 3:
                                        z9 = z7;
                                        f8 = f9;
                                        break;
                                    default:
                                        f8 = f9;
                                        break;
                                }
                            }
                            z8 = true;
                        }
                        z8 = true;
                    case 1:
                        f8 = toPix(state, cLObject.getFloat(next));
                        z9 = !z7;
                    case 2:
                        f8 = toPix(state, cLObject.getFloat(next));
                    case 3:
                        f8 = toPix(state, cLObject.getFloat(next));
                        z9 = false;
                    case 4:
                        f8 = toPix(state, cLObject.getFloat(next));
                        z9 = z7;
                }
                while (it.hasNext()) {
                }
            }
            if (z8) {
                if (z9) {
                    guidelineReference.percent(f8);
                    return;
                } else {
                    guidelineReference.percent(1.0f - f8);
                    return;
                }
            }
            if (z9) {
                guidelineReference.start(Float.valueOf(f8));
                return;
            } else {
                guidelineReference.end(Float.valueOf(f8));
                return;
            }
        }
    }

    static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) {
        for (int i8 = 0; i8 < cLArray.size(); i8++) {
            CLElement cLElement = cLArray.get(i8);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.hashCode();
                    switch (string) {
                        case "vGuideline":
                            parseGuideline(1, state, cLArray2);
                            break;
                        case "hChain":
                            parseChain(0, state, layoutVariables, cLArray2);
                            break;
                        case "vChain":
                            parseChain(1, state, layoutVariables, cLArray2);
                            break;
                        case "hGuideline":
                            parseGuideline(0, state, cLArray2);
                            break;
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i8) {
        CLObject objectOrNull;
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = parse.get(next);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull(SchedulerSupport.CUSTOM)) != null) {
                    Iterator<String> it2 = objectOrNull.names().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        CLElement cLElement2 = objectOrNull.get(next2);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i8, next, next2, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            long parseColorString = parseColorString(cLElement2.content());
                            if (parseColorString != -1) {
                                transition.addCustomColor(i8, next, next2, (int) parseColorString);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e8) {
            System.err.println("Error parsing JSON " + e8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) {
        char c8;
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> names = cLObject.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                next.hashCode();
                switch (next.hashCode()) {
                    case -1897525331:
                        if (next.equals("stagger")) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -1310311125:
                        if (next.equals("easing")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -1285003983:
                        if (next.equals("quantize")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -791482387:
                        if (next.equals("pathArc")) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case -236944793:
                        if (next.equals("relativeTo")) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        typedBundle.add(600, cLObject.getFloat(next));
                        break;
                    case 1:
                        typedBundle.add(603, cLObject.getString(next));
                        break;
                    case 2:
                        CLElement cLElement2 = cLObject.get(next);
                        if (!(cLElement2 instanceof CLArray)) {
                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject.getInt(next));
                            break;
                        } else {
                            CLArray cLArray = (CLArray) cLElement2;
                            int size = cLArray.size();
                            if (size <= 0) {
                                break;
                            } else {
                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                if (size <= 1) {
                                    break;
                                } else {
                                    typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                    if (size <= 2) {
                                        break;
                                    } else {
                                        typedBundle.add(602, cLArray.getFloat(2));
                                        break;
                                    }
                                }
                            }
                        }
                    case 3:
                        String string = cLObject.getString(next);
                        int indexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (indexOf != -1) {
                            typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, indexOf);
                            break;
                        } else {
                            System.err.println(cLObject.getLine() + " pathArc = '" + string + "'");
                            break;
                        }
                    case 4:
                        typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject.getString(next));
                        break;
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        char c8;
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = parse.get(next);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement;
                    int hashCode = next.hashCode();
                    if (hashCode == -2137403731) {
                        if (next.equals("Header")) {
                            c8 = 2;
                            if (c8 != 0) {
                            }
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                    } else if (hashCode != -241441378) {
                        if (hashCode == 1101852654 && next.equals("ConstraintSets")) {
                            c8 = 0;
                            if (c8 != 0) {
                                parseConstraintSets(coreMotionScene, cLObject);
                            } else if (c8 == 1) {
                                parseTransitions(coreMotionScene, cLObject);
                            } else if (c8 == 2) {
                                parseHeader(coreMotionScene, cLObject);
                            }
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                    } else {
                        if (next.equals(TypedValues.TransitionType.NAME)) {
                            c8 = 1;
                            if (c8 != 0) {
                            }
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                    }
                }
            }
        } catch (CLParsingException e8) {
            System.err.println("Error parsing JSON " + e8);
        }
    }

    static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            coreMotionScene.setTransitionContent(next, cLObject.getObject(next).toJSON());
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            if (cLElement instanceof CLNumber) {
                layoutVariables.put(next, cLElement.getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_TO)), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                } else if (cLObject2.has(TypedValues.TransitionType.S_FROM) && cLObject2.has("step")) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_FROM)), layoutVariables.get(cLObject2.get("step")));
                } else if (cLObject2.has("ids")) {
                    CLArray array = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i8 = 0; i8 < array.size(); i8++) {
                        arrayList.add(array.getString(i8));
                    }
                    layoutVariables.put(next, arrayList);
                } else if (cLObject2.has("tag")) {
                    layoutVariables.put(next, state.getIdsForTag(cLObject2.getString("tag")));
                }
            }
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ba, code lost:
    
        if (r3.equals("hChain") == false) goto L30;
     */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void populateState(@NonNull CLObject cLObject, @NonNull State state, @NonNull LayoutVariables layoutVariables) {
        char c8;
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            next.hashCode();
            char c9 = 2;
            switch (next.hashCode()) {
                case -1824489883:
                    if (next.equals("Helpers")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1875016085:
                    if (next.equals("Generate")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1921490263:
                    if (next.equals("Variables")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    if (!(cLElement instanceof CLArray)) {
                        break;
                    } else {
                        parseHelpers(state, layoutVariables, (CLArray) cLElement);
                        break;
                    }
                case 1:
                    if (!(cLElement instanceof CLObject)) {
                        break;
                    } else {
                        parseGenerate(state, layoutVariables, (CLObject) cLElement);
                        break;
                    }
                case 2:
                    if (!(cLElement instanceof CLObject)) {
                        break;
                    } else {
                        parseVariables(state, layoutVariables, (CLObject) cLElement);
                        break;
                    }
                default:
                    if (!(cLElement instanceof CLObject)) {
                        if (!(cLElement instanceof CLNumber)) {
                            break;
                        } else {
                            layoutVariables.put(next, cLElement.getInt());
                            break;
                        }
                    } else {
                        CLObject cLObject2 = (CLObject) cLElement;
                        String lookForType = lookForType(cLObject2);
                        if (lookForType == null) {
                            parseWidget(state, layoutVariables, next, cLObject2);
                            break;
                        } else {
                            switch (lookForType.hashCode()) {
                                case -1785507558:
                                    if (lookForType.equals("vGuideline")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1354837162:
                                    if (lookForType.equals("column")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1252464839:
                                    break;
                                case -851656725:
                                    if (lookForType.equals("vChain")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -333143113:
                                    if (lookForType.equals("barrier")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 113114:
                                    if (lookForType.equals(WorkoutExercises.ROW)) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 3181382:
                                    if (lookForType.equals("grid")) {
                                        c9 = 6;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 98238902:
                                    if (lookForType.equals("hFlow")) {
                                        c9 = 7;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 111168196:
                                    if (lookForType.equals("vFlow")) {
                                        c9 = '\b';
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 965681512:
                                    if (lookForType.equals("hGuideline")) {
                                        c9 = '\t';
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            switch (c9) {
                                case 0:
                                    parseGuidelineParams(1, state, next, cLObject2);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    parseGridType(lookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case 2:
                                case 3:
                                    parseChainType(lookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case 4:
                                    parseBarrier(state, next, cLObject2);
                                    break;
                                case 7:
                                case '\b':
                                    parseFlowType(lookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case '\t':
                                    parseGuidelineParams(0, state, next, cLObject2);
                                    break;
                            }
                        }
                    }
            }
        }
    }

    private static float toPix(State state, float f8) {
        return state.getDpToPixel().toPixels(f8);
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            applyAttribute(state, layoutVariables, constraintReference, cLObject, it.next());
        }
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e8) {
            System.err.println("Error parsing JSON " + e8);
        }
    }
}
