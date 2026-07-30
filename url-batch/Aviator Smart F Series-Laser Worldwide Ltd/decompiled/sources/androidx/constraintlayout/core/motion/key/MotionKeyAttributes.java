package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionKeyAttributes extends MotionKey {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttributes";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private int mVisibility = 0;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new HashMap<>();
    }

    private float getFloatValue(int i8) {
        if (i8 == 100) {
            return this.mFramePosition;
        }
        switch (i8) {
            case 303:
                return this.mAlpha;
            case 304:
                return this.mTranslationX;
            case 305:
                return this.mTranslationY;
            case 306:
                return this.mTranslationZ;
            case 307:
                return this.mElevation;
            case 308:
                return this.mRotationX;
            case 309:
                return this.mRotationY;
            case 310:
                return this.mRotation;
            case 311:
                return this.mScaleX;
            case 312:
                return this.mScaleY;
            case 313:
                return this.mPivotX;
            case 314:
                return this.mPivotY;
            case 315:
                return this.mProgress;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.mTransitionPathRotate;
            default:
                return Float.NaN;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x009a, code lost:
    
        if (r1.equals("pivotX") == false) goto L15;
     */
    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addValues(HashMap<String, SplineSet> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            SplineSet splineSet = hashMap.get(next);
            if (splineSet != null) {
                char c8 = 7;
                if (!next.startsWith("CUSTOM")) {
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1249320804:
                            if (next.equals("rotationZ")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -987906986:
                            break;
                        case -987906985:
                            if (next.equals("pivotY")) {
                                c8 = '\b';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c8 = '\t';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                c8 = '\n';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c8 = 11;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c8 = '\f';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
                                c8 = '\r';
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
                            if (!Float.isNaN(this.mRotationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!Float.isNaN(this.mRotationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!Float.isNaN(this.mRotation)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!Float.isNaN(this.mTranslationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!Float.isNaN(this.mTranslationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!Float.isNaN(this.mTranslationZ)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!Float.isNaN(this.mProgress)) {
                                splineSet.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!Float.isNaN(this.mRotationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!Float.isNaN(this.mRotationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!Float.isNaN(this.mScaleX)) {
                                splineSet.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!Float.isNaN(this.mScaleY)) {
                                splineSet.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!Float.isNaN(this.mElevation)) {
                                splineSet.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            } else {
                                break;
                            }
                        case '\f':
                            if (!Float.isNaN(this.mAlpha)) {
                                splineSet.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            } else {
                                break;
                            }
                        case '\r':
                            if (!Float.isNaN(this.mTransitionPathRotate)) {
                                splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            } else {
                                break;
                            }
                        default:
                            System.err.println("not supported by KeyAttributes " + next);
                            break;
                    }
                } else {
                    CustomVariable customVariable = this.mCustom.get(next.substring(7));
                    if (customVariable != null) {
                        ((SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo32clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return a.a(str);
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        System.out.println(" ------------- " + this.mFramePosition + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            int a8 = a.a(strArr[i8]);
            System.out.println(strArr[i8] + ":" + getFloatValue(a8));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.mAlpha)) {
            hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            hashMap.put("rotationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashMap.put("pivotX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashMap.put("pivotY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashMap.put("translationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashMap.put("translationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashMap.put("translationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashMap.put("pathRotate", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashMap.put("scaleX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashMap.put("scaleY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mProgress)) {
            hashMap.put("progress", Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        if (i8 == 100) {
            this.mFramePosition = i9;
            return true;
        }
        if (i8 == 301) {
            this.mCurveFit = i9;
            return true;
        }
        if (i8 == 302) {
            this.mVisibility = i9;
            return true;
        }
        if (setValue(i8, i9)) {
            return true;
        }
        return super.setValue(i8, i9);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        if (i8 == 100) {
            this.mTransitionPathRotate = f8;
            return true;
        }
        switch (i8) {
            case 303:
                this.mAlpha = f8;
                return true;
            case 304:
                this.mTranslationX = f8;
                return true;
            case 305:
                this.mTranslationY = f8;
                return true;
            case 306:
                this.mTranslationZ = f8;
                return true;
            case 307:
                this.mElevation = f8;
                return true;
            case 308:
                this.mRotationX = f8;
                return true;
            case 309:
                this.mRotationY = f8;
                return true;
            case 310:
                this.mRotation = f8;
                return true;
            case 311:
                this.mScaleX = f8;
                return true;
            case 312:
                this.mScaleY = f8;
                return true;
            case 313:
                this.mPivotX = f8;
                return true;
            case 314:
                this.mPivotY = f8;
                return true;
            case 315:
                this.mProgress = f8;
                return true;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                this.mTransitionPathRotate = f8;
                return true;
            default:
                return super.setValue(i8, f8);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 == 101) {
            this.mTargetString = str;
            return true;
        }
        if (i8 != 317) {
            return super.setValue(i8, str);
        }
        this.mTransitionEasing = str;
        return true;
    }
}
