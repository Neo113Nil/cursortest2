package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import io.reactivex.annotations.SchedulerSupport;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class TransitionParser {
    private static int map(String str, String... strArr) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (strArr[i8].equals(str)) {
                return i8;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) {
        parse(cLObject, transition);
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        int i8;
        int i9;
        String[] strArr;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("target");
        if (arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = arrayOrNull.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i10 = 0; i10 < arrayOrNull.size(); i10++) {
            typedBundleArr[i10] = new TypedBundle();
        }
        int i11 = 0;
        for (int i12 = 9; i11 < i12; i12 = 9) {
            String str = strArr2[i11];
            int i13 = iArr[i11];
            boolean z7 = zArr[i11];
            CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
            if (arrayOrNull3 != null && arrayOrNull3.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
            }
            if (arrayOrNull3 != null) {
                int i14 = 0;
                while (i14 < size) {
                    float f8 = arrayOrNull3.getFloat(i14);
                    String[] strArr3 = strArr2;
                    if (z7) {
                        f8 = transition.mToPixel.toPixels(f8);
                    }
                    typedBundleArr[i14].add(i13, f8);
                    i14++;
                    strArr2 = strArr3;
                }
                strArr = strArr2;
            } else {
                strArr = strArr2;
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (z7) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        typedBundleArr[i15].add(i13, floatOrNaN);
                    }
                }
            }
            i11++;
            strArr2 = strArr;
        }
        CLElement orNull = cLObject.getOrNull(SchedulerSupport.CUSTOM);
        if (orNull == null || !(orNull instanceof CLObject)) {
            customVariableArr = null;
        } else {
            CLObject cLObject3 = (CLObject) orNull;
            int size2 = cLObject3.size();
            customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, arrayOrNull.size(), size2);
            int i16 = 0;
            while (i16 < size2) {
                CLKey cLKey = (CLKey) cLObject3.get(i16);
                String content = cLKey.content();
                if (cLKey.getValue() instanceof CLArray) {
                    CLArray cLArray = (CLArray) cLKey.getValue();
                    int size3 = cLArray.size();
                    if (size3 == size && size3 > 0) {
                        if (cLArray.get(0) instanceof CLNumber) {
                            int i17 = 0;
                            while (i17 < size) {
                                customVariableArr[i17][i16] = new CustomVariable(content, TypedValues.Custom.TYPE_FLOAT, cLArray.get(i17).getFloat());
                                i17++;
                                cLObject3 = cLObject3;
                            }
                        } else {
                            cLObject2 = cLObject3;
                            int i18 = 0;
                            while (i18 < size) {
                                long parseColorString = ConstraintSetParser.parseColorString(cLArray.get(i18).content());
                                if (parseColorString != -1) {
                                    i9 = size2;
                                    customVariableArr[i18][i16] = new CustomVariable(content, TypedValues.Custom.TYPE_COLOR, (int) parseColorString);
                                } else {
                                    i9 = size2;
                                }
                                i18++;
                                size2 = i9;
                            }
                            i8 = size2;
                        }
                    }
                    cLObject2 = cLObject3;
                    i8 = size2;
                } else {
                    cLObject2 = cLObject3;
                    i8 = size2;
                    CLElement value = cLKey.getValue();
                    if (value instanceof CLNumber) {
                        float f9 = value.getFloat();
                        for (int i19 = 0; i19 < size; i19++) {
                            customVariableArr[i19][i16] = new CustomVariable(content, TypedValues.Custom.TYPE_FLOAT, f9);
                        }
                    } else {
                        long parseColorString2 = ConstraintSetParser.parseColorString(value.content());
                        if (parseColorString2 != -1) {
                            int i20 = 0;
                            while (i20 < size) {
                                customVariableArr[i20][i16] = new CustomVariable(content, TypedValues.Custom.TYPE_COLOR, (int) parseColorString2);
                                i20++;
                                parseColorString2 = parseColorString2;
                            }
                        }
                    }
                }
                i16++;
                cLObject3 = cLObject2;
                size2 = i8;
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        for (int i21 = 0; i21 < arrayOrNull2.size(); i21++) {
            for (int i22 = 0; i22 < size; i22++) {
                String string = arrayOrNull2.getString(i21);
                TypedBundle typedBundle = typedBundleArr[i22];
                if (stringOrNull2 != null) {
                    typedBundle.add(508, map(stringOrNull2, "spline", "linear"));
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(i22));
                transition.addKeyAttribute(string, typedBundle, customVariableArr != null ? customVariableArr[i22] : null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseKeyCycle(CLObject cLObject, Transition transition) {
        int[] iArr;
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", TypedValues.CycleType.S_WAVE_PERIOD, TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.CycleType.S_WAVE_PHASE};
        int[] iArr2 = {311, 312, 304, 305, 306, 308, 309, 310, TypedValues.CycleType.TYPE_ALPHA, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_WAVE_PHASE};
        int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = array2.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i8 = 0; i8 < size; i8++) {
            typedBundleArr[i8] = new TypedBundle();
        }
        boolean z7 = false;
        for (int i9 = 0; i9 < 12; i9++) {
            if (cLObject.has(strArr[i9]) && iArr3[i9] == 1) {
                z7 = true;
            }
        }
        int i10 = 0;
        for (int i11 = 12; i10 < i11; i11 = 12) {
            String str = strArr[i10];
            int i12 = iArr2[i10];
            int i13 = iArr3[i10];
            CLArray arrayOrNull = cLObject.getArrayOrNull(str);
            String[] strArr2 = strArr;
            if (arrayOrNull != null && arrayOrNull.size() != size) {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject);
            }
            if (arrayOrNull != null) {
                int i14 = 0;
                while (i14 < size) {
                    float f8 = arrayOrNull.getFloat(i14);
                    int[] iArr4 = iArr2;
                    if (i13 == 1) {
                        f8 = transition.mToPixel.toPixels(f8);
                    } else if (i13 == 2 && z7) {
                        f8 = transition.mToPixel.toPixels(f8);
                    }
                    typedBundleArr[i14].add(i12, f8);
                    i14++;
                    iArr2 = iArr4;
                }
                iArr = iArr2;
            } else {
                iArr = iArr2;
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (i13 == 1) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    } else if (i13 == 2 && z7) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        typedBundleArr[i15].add(i12, floatOrNaN);
                    }
                }
            }
            i10++;
            strArr = strArr2;
            iArr2 = iArr;
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        String stringOrNull3 = cLObject.getStringOrNull("easing");
        String stringOrNull4 = cLObject.getStringOrNull("waveShape");
        String stringOrNull5 = cLObject.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
        for (int i16 = 0; i16 < array.size(); i16++) {
            for (int i17 = 0; i17 < size; i17++) {
                String string = array.getString(i16);
                TypedBundle typedBundle = typedBundleArr[i17];
                if (stringOrNull2 != null) {
                    if (stringOrNull2.equals("linear")) {
                        typedBundle.add(401, 1);
                        typedBundle.addIfNotNull(501, stringOrNull);
                        if (stringOrNull3 != null) {
                            typedBundle.add(TypedValues.CycleType.TYPE_EASING, stringOrNull3);
                        }
                        if (stringOrNull4 != null) {
                            typedBundle.add(421, stringOrNull4);
                        }
                        if (stringOrNull5 == null) {
                            typedBundle.add(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, stringOrNull5);
                        }
                        typedBundle.add(100, array2.getInt(i17));
                        transition.addKeyCycle(string, typedBundle);
                    } else if (stringOrNull2.equals("spline")) {
                        typedBundle.add(401, 0);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                if (stringOrNull3 != null) {
                }
                if (stringOrNull4 != null) {
                }
                if (stringOrNull5 == null) {
                }
                typedBundle.add(100, array2.getInt(i17));
                transition.addKeyCycle(string, typedBundle);
            }
        }
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) {
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            for (int i8 = 0; i8 < arrayOrNull.size(); i8++) {
                CLElement cLElement = arrayOrNull.get(i8);
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull2 != null) {
            for (int i9 = 0; i9 < arrayOrNull2.size(); i9++) {
                CLElement cLElement2 = arrayOrNull2.get(i9);
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            for (int i10 = 0; i10 < arrayOrNull3.size(); i10++) {
                CLElement cLElement3 = arrayOrNull3.get(i10);
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) {
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                int i8 = 0;
                while (i8 < array.size()) {
                    String string = array.getString(i8);
                    int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.clear();
                    typedBundle.add(510, map);
                    if (stringOrNull3 != null) {
                        map(typedBundle, 508, stringOrNull3, "spline", "linear");
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i9 = 0;
                    while (i9 < array2.size()) {
                        typedBundle.add(100, array2.getInt(i9));
                        set(typedBundle, 506, arrayOrNull, i9);
                        set(typedBundle, 507, arrayOrNull2, i9);
                        set(typedBundle, 503, arrayOrNull3, i9);
                        set(typedBundle, 504, arrayOrNull4, i9);
                        transition.addKeyPosition(string, typedBundle);
                        i9++;
                        stringOrNull4 = stringOrNull4;
                    }
                    i8++;
                    stringOrNull4 = stringOrNull4;
                }
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        String stringOrNull = cLContainer.getStringOrNull("anchor");
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN("springDamping");
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe createOnSwipe = transition.createOnSwipe();
        createOnSwipe.setAnchorId(stringOrNull);
        createOnSwipe.setAnchorSide(map);
        createOnSwipe.setDragDirection(map2);
        createOnSwipe.setDragScale(floatOrNaN);
        createOnSwipe.setDragThreshold(floatOrNaN2);
        createOnSwipe.setMaxVelocity(floatOrNaN3);
        createOnSwipe.setMaxAcceleration(floatOrNaN4);
        createOnSwipe.setLimitBoundsTo(stringOrNull2);
        createOnSwipe.setAutoCompleteMode(map3);
        createOnSwipe.setOnTouchUp(map4);
        createOnSwipe.setSpringMass(floatOrNaN5);
        createOnSwipe.setSpringStiffness(floatOrNaN6);
        createOnSwipe.setSpringDamping(floatOrNaN7);
        createOnSwipe.setSpringStopThreshold(floatOrNaN8);
        createOnSwipe.setSpringBoundary(map5);
        createOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void set(TypedBundle typedBundle, int i8, CLArray cLArray, int i9) {
        if (cLArray != null) {
            typedBundle.add(i8, cLArray.getFloat(i9));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (r2 != false) goto L49;
     */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parse(@NonNull CLObject cLObject, @NonNull Transition transition) {
        transition.resetProperties();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z7 = true;
        boolean z8 = false;
        if (stringOrNull != null) {
            switch (stringOrNull) {
                case "startVertical":
                    typedBundle.add(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle.add(509, 2);
                    break;
                case "flip":
                    typedBundle.add(509, 3);
                    break;
                case "none":
                    typedBundle.add(509, 0);
                    break;
                case "above":
                    typedBundle.add(509, 5);
                    break;
                case "below":
                    typedBundle.add(509, 4);
                    break;
            }
            z8 = true;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
        } else {
            z7 = z8;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (!Float.isNaN(floatOrNaN)) {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        transition.setTransitionProperties(typedBundle);
        CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            parseOnSwipe(objectOrNull, transition);
        }
        parseKeyFrames(cLObject, transition);
    }

    private static void map(TypedBundle typedBundle, int i8, String str, String... strArr) {
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (strArr[i9].equals(str)) {
                typedBundle.add(i8, i9);
            }
        }
    }
}
