package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.ironsource.mediationsdk.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class KeyAttributes extends Key {
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private boolean mVisibility = false;
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

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("transformPivotY");
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
            hashSet.add("transitionPathRotate");
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
        if (this.mCustomConstraints.size() > 0) {
            Iterator it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap hashMap) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            hashMap.put("rotation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.mCurveFit));
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
            hashMap.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
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
        if (this.mCustomConstraints.size() > 0) {
            Iterator it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = (SplineSet) hashMap.get(str);
            if (splineSet != null) {
                if (str.startsWith(j.f)) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) splineSet).setPoint(this.mFramePosition, constraintAttribute);
                    }
                } else {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            }
                        case "transformPivotX":
                            if (Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            }
                        case "transformPivotY":
                            if (Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            }
                        case "rotation":
                            if (Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            }
                        case "transitionPathRotate":
                            if (Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                splineSet.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            }
                    }
                }
            }
        }
    }

    public void setValue(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "motionProgress":
                this.mProgress = toFloat(obj);
                break;
            case "transitionEasing":
                this.mTransitionEasing = obj.toString();
                break;
            case "rotationX":
                this.mRotationX = toFloat(obj);
                break;
            case "rotationY":
                this.mRotationY = toFloat(obj);
                break;
            case "translationX":
                this.mTranslationX = toFloat(obj);
                break;
            case "translationY":
                this.mTranslationY = toFloat(obj);
                break;
            case "translationZ":
                this.mTranslationZ = toFloat(obj);
                break;
            case "scaleX":
                this.mScaleX = toFloat(obj);
                break;
            case "scaleY":
                this.mScaleY = toFloat(obj);
                break;
            case "transformPivotX":
                this.mPivotX = toFloat(obj);
                break;
            case "transformPivotY":
                this.mPivotY = toFloat(obj);
                break;
            case "rotation":
                this.mRotation = toFloat(obj);
                break;
            case "elevation":
                this.mElevation = toFloat(obj);
                break;
            case "transitionPathRotate":
                this.mTransitionPathRotate = toFloat(obj);
                break;
            case "alpha":
                this.mAlpha = toFloat(obj);
                break;
            case "curveFit":
                this.mCurveFit = toInt(obj);
                break;
            case "visibility":
                this.mVisibility = toBoolean(obj);
                break;
        }
    }

    private static class Loader {
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            mAttrMap.append(R.styleable.KeyAttribute_android_elevation, 2);
            mAttrMap.append(R.styleable.KeyAttribute_android_rotation, 4);
            mAttrMap.append(R.styleable.KeyAttribute_android_rotationX, 5);
            mAttrMap.append(R.styleable.KeyAttribute_android_rotationY, 6);
            mAttrMap.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            mAttrMap.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            mAttrMap.append(R.styleable.KeyAttribute_android_scaleX, 7);
            mAttrMap.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            mAttrMap.append(R.styleable.KeyAttribute_transitionEasing, 9);
            mAttrMap.append(R.styleable.KeyAttribute_motionTarget, 10);
            mAttrMap.append(R.styleable.KeyAttribute_framePosition, 12);
            mAttrMap.append(R.styleable.KeyAttribute_curveFit, 13);
            mAttrMap.append(R.styleable.KeyAttribute_android_scaleY, 14);
            mAttrMap.append(R.styleable.KeyAttribute_android_translationX, 15);
            mAttrMap.append(R.styleable.KeyAttribute_android_translationY, 16);
            mAttrMap.append(R.styleable.KeyAttribute_android_translationZ, 17);
            mAttrMap.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void read(KeyAttributes keyAttributes, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyAttributes.mAlpha = typedArray.getFloat(index, keyAttributes.mAlpha);
                        break;
                    case 2:
                        keyAttributes.mElevation = typedArray.getDimension(index, keyAttributes.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        keyAttributes.mRotation = typedArray.getFloat(index, keyAttributes.mRotation);
                        break;
                    case 5:
                        keyAttributes.mRotationX = typedArray.getFloat(index, keyAttributes.mRotationX);
                        break;
                    case 6:
                        keyAttributes.mRotationY = typedArray.getFloat(index, keyAttributes.mRotationY);
                        break;
                    case 7:
                        keyAttributes.mScaleX = typedArray.getFloat(index, keyAttributes.mScaleX);
                        break;
                    case 8:
                        keyAttributes.mTransitionPathRotate = typedArray.getFloat(index, keyAttributes.mTransitionPathRotate);
                        break;
                    case 9:
                        keyAttributes.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                            keyAttributes.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyAttributes.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyAttributes.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            keyAttributes.mTargetId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                            break;
                        }
                    case 12:
                        keyAttributes.mFramePosition = typedArray.getInt(index, keyAttributes.mFramePosition);
                        break;
                    case 13:
                        keyAttributes.mCurveFit = typedArray.getInteger(index, keyAttributes.mCurveFit);
                        break;
                    case 14:
                        keyAttributes.mScaleY = typedArray.getFloat(index, keyAttributes.mScaleY);
                        break;
                    case 15:
                        keyAttributes.mTranslationX = typedArray.getDimension(index, keyAttributes.mTranslationX);
                        break;
                    case 16:
                        keyAttributes.mTranslationY = typedArray.getDimension(index, keyAttributes.mTranslationY);
                        break;
                    case 17:
                        keyAttributes.mTranslationZ = typedArray.getDimension(index, keyAttributes.mTranslationZ);
                        break;
                    case 18:
                        keyAttributes.mProgress = typedArray.getFloat(index, keyAttributes.mProgress);
                        break;
                    case 19:
                        keyAttributes.mPivotX = typedArray.getDimension(index, keyAttributes.mPivotX);
                        break;
                    case 20:
                        keyAttributes.mPivotY = typedArray.getDimension(index, keyAttributes.mPivotY);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.mCurveFit = keyAttributes.mCurveFit;
        this.mVisibility = keyAttributes.mVisibility;
        this.mAlpha = keyAttributes.mAlpha;
        this.mElevation = keyAttributes.mElevation;
        this.mRotation = keyAttributes.mRotation;
        this.mRotationX = keyAttributes.mRotationX;
        this.mRotationY = keyAttributes.mRotationY;
        this.mPivotX = keyAttributes.mPivotX;
        this.mPivotY = keyAttributes.mPivotY;
        this.mTransitionPathRotate = keyAttributes.mTransitionPathRotate;
        this.mScaleX = keyAttributes.mScaleX;
        this.mScaleY = keyAttributes.mScaleY;
        this.mTranslationX = keyAttributes.mTranslationX;
        this.mTranslationY = keyAttributes.mTranslationY;
        this.mTranslationZ = keyAttributes.mTranslationZ;
        this.mProgress = keyAttributes.mProgress;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo2631clone() {
        return new KeyAttributes().copy(this);
    }
}
