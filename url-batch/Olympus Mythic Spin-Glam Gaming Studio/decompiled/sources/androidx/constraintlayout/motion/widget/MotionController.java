package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class MotionController {
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList mMotionPaths = new ArrayList();
    private float[] mVelocity = new float[1];
    private ArrayList mKeyList = new ArrayList();

    MotionPaths getKeyFrame(int i) {
        return (MotionPaths) this.mMotionPaths.get(i);
    }

    MotionController(View view) {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
    }

    public float getStartX() {
        return this.mStartMotionPath.x;
    }

    public float getStartY() {
        return this.mStartMotionPath.y;
    }

    public float getFinalX() {
        return this.mEndMotionPath.x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.y;
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    void buildPath(float[] fArr, int i) {
        double d;
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        HashMap hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : (SplineSet) hashMap.get("translationX");
        HashMap hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : (SplineSet) hashMap2.get("translationY");
        HashMap hashMap3 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap3 == null ? null : (ViewOscillator) hashMap3.get("translationX");
        HashMap hashMap4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap4 != null ? (ViewOscillator) hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f3 = i2 * f2;
            float f4 = this.mStaggerScale;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.mStaggerOffset;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, f);
                }
            }
            float f7 = f3;
            double d2 = f7;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator it = this.mMotionPaths.iterator();
            float f8 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.mKeyFrameEasing;
                double d3 = d2;
                if (easing2 != null) {
                    float f9 = motionPaths.time;
                    if (f9 < f7) {
                        f5 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = motionPaths.time;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) easing.get((f7 - f5) / r16)) * (f8 - f5)) + f5;
            } else {
                d = d4;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            if (viewOscillator != null) {
                fArr[i3] = fArr[i3] + viewOscillator.get(f7);
            } else if (splineSet != null) {
                fArr[i3] = fArr[i3] + splineSet.get(f7);
            }
            if (viewOscillator2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + viewOscillator2.get(f7);
            } else if (splineSet2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + splineSet2.get(f7);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    private float getPreCycleDistance() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = i * f2;
            double d3 = f4;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator it = this.mMotionPaths.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = motionPaths.time;
                    if (f7 < f4) {
                        easing = easing2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                d3 = (((float) easing.get((f4 - f6) / r17)) * (f5 - f6)) + f6;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            float f8 = f3;
            int i2 = i;
            this.mStartMotionPath.getCenter(d3, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (f8 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            } else {
                c = 0;
                f = f8;
            }
            d = fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = fArr[1];
        }
        return f3;
    }

    int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((MotionPaths) it.next()).mMode;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.mSpline[0].getPos(timePoints[i3], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i3], this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    private void insertKey(MotionPaths motionPaths) {
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e("MotionController", " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    void addKeys(ArrayList arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    public void setup(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        double[][] dArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap hashMap = new HashMap();
        int i3 = this.mPathMotionArc;
        if (i3 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i3;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key key = (Key) it.next();
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    insertKey(new MotionPaths(i, i2, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i4 = keyPosition.mCurveFit;
                    if (i4 != Key.UNSET) {
                        this.mCurveFitType = i4;
                    }
                } else if (key instanceof KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key);
                } else {
                    key.setInterpolation(hashMap);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(StringUtils.COMMA)[1];
                    Iterator it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key key2 = (Key) it3.next();
                        HashMap hashMap2 = key2.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = (ConstraintAttribute) hashMap2.get(str2)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(str, sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(str);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(str);
                    this.mAttributesMap.put(str, makeSpline2);
                }
            }
            ArrayList arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key key3 = (Key) it4.next();
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str3 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str3) || (num = (Integer) hashMap.get(str3)) == null) ? 0 : num.intValue();
                SplineSet splineSet = (SplineSet) this.mAttributesMap.get(str3);
                if (splineSet != null) {
                    splineSet.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(StringUtils.COMMA)[1];
                        Iterator it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key key4 = (Key) it6.next();
                            HashMap hashMap3 = key4.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = (ConstraintAttribute) hashMap3.get(str5)) != null) {
                                sparseArray2.append(key4.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(str4, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(str4, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(str4);
                        this.mTimeCycleAttributesMap.put(str4, makeSpline);
                    }
                }
            }
            ArrayList arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key key5 = (Key) it7.next();
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str6 : this.mTimeCycleAttributesMap.keySet()) {
                ((ViewTimeCycle) this.mTimeCycleAttributesMap.get(str6)).setup(hashMap.containsKey(str6) ? ((Integer) hashMap.get(str6)).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i5 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i5];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator it8 = this.mMotionPaths.iterator();
        int i6 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i6] = (MotionPaths) it8.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.mAttributeInterpolatorCount[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= i5) {
                    break;
                }
                if (motionPathsArr[i8].attributes.containsKey(str8) && (constraintAttribute = (ConstraintAttribute) motionPathsArr[i8].attributes.get(str8)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i7] = iArr[i7] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < i5; i9++) {
            motionPathsArr[i9].different(motionPathsArr[i9 - 1], zArr, this.mAttributeNames, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.mInterpolateVariables = new int[i10];
        int i12 = 2;
        int max = Math.max(2, i10);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                this.mInterpolateVariables[i13] = i14;
                i13++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, this.mInterpolateVariables.length);
        double[] dArr3 = new double[i5];
        for (int i15 = 0; i15 < i5; i15++) {
            motionPathsArr[i15].fillStandard(dArr2[i15], this.mInterpolateVariables);
            dArr3[i15] = motionPathsArr[i15].time;
        }
        int i16 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i16 >= iArr2.length) {
                break;
            }
            if (iArr2[i16] < MotionPaths.names.length) {
                String str9 = MotionPaths.names[this.mInterpolateVariables[i16]] + " [";
                for (int i17 = 0; i17 < i5; i17++) {
                    str9 = str9 + dArr2[i17][i16];
                }
            }
            i16++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i18 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i18];
            int i19 = 0;
            int i20 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i19 < i5) {
                if (motionPathsArr[i19].hasCustomData(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i5];
                        int[] iArr3 = new int[i12];
                        iArr3[c] = motionPathsArr[i19].getCustomDataCount(str10);
                        iArr3[0] = i5;
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    MotionPaths motionPaths = motionPathsArr[i19];
                    dArr = dArr2;
                    dArr4[i20] = motionPaths.time;
                    motionPaths.getCustomData(str10, dArr5[i20], 0);
                    i20++;
                } else {
                    dArr = dArr2;
                }
                i19++;
                dArr2 = dArr;
                i12 = 2;
                c = 1;
            }
            i18++;
            this.mSpline[i18] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr4, i20), (double[][]) Arrays.copyOf(dArr5, i20));
            dArr2 = dArr2;
            i12 = 2;
            c = 1;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr3, dArr2);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[i5];
            double[] dArr6 = new double[i5];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 2);
            for (int i21 = 0; i21 < i5; i21++) {
                iArr4[i21] = motionPathsArr[i21].mPathMotionArc;
                dArr6[i21] = r9.time;
                double[] dArr8 = dArr7[i21];
                dArr8[0] = r9.x;
                dArr8[1] = r9.y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr6, dArr7);
        }
        this.mCycleMap = new HashMap();
        if (this.mKeyList != null) {
            Iterator it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(str11);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f2)) {
                        f2 = getPreCycleDistance();
                    }
                    makeSpline3.setType(str11);
                    this.mCycleMap.put(str11, makeSpline3);
                }
            }
            Iterator it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key key6 = (Key) it10.next();
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).addCycleValues(this.mCycleMap);
                }
            }
            Iterator it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                ((ViewOscillator) it11.next()).setup(f2);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.x + " y: " + this.mStartMotionPath.y + " end: x: " + this.mEndMotionPath.x + " y: " + this.mEndMotionPath.y;
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public View getView() {
        return this.mView;
    }

    void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i, int i2, int i3) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - ((i4 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i == 2) {
            int i5 = viewState.left + viewState.right;
            rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i5 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i, viewState.rotation);
    }

    void rotate(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void setStartState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i3, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }

    private static Interpolator getInterpolator(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (float) Easing.this.get(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    void setEndState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i3, this.mId);
    }

    void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator it = this.mMotionPaths.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths motionPaths = (MotionPaths) it.next();
            Easing easing2 = motionPaths.mKeyFrameEasing;
            if (easing2 != null) {
                float f6 = motionPaths.time;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) easing.get(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    void endTrigger(boolean z) {
        if (!SplitContent.BUTTON_VALUE.equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i].conditionallyFire(z ? -100.0f : 100.0f, this.mView);
            i++;
        }
    }

    boolean interpolate(View view, float f, long j, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z;
        int i;
        double d;
        float f2;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i2 = this.mQuantizeMotionSteps;
        if (i2 != Key.UNSET) {
            float f3 = 1.0f / i2;
            float floor = ((float) Math.floor(adjustedPosition / f3)) * f3;
            float f4 = (adjustedPosition % f3) / f3;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f4 = (f4 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else {
                f2 = ((double) f4) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (f2 * f3) + floor;
        }
        float f5 = adjustedPosition;
        HashMap hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).setProperty(view, f5);
            }
        }
        HashMap hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z2 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z2 |= viewTimeCycle.setProperty(view, f5, j, keyCache);
                }
            }
            z = z2;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d2 = f5;
            curveFitArr[0].getPos(d2, this.mInterpolateData);
            this.mSpline[0].getSlope(d2, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                d = d2;
            } else {
                d = d2;
                this.mStartMotionPath.setView(f5, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (SplineSet splineSet : hashMap3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) splineSet).setPathRotate(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                i = 1;
                z |= pathRotate.setPathRotate(view, keyCache, f5, j, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i3 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i3].getPos(d, this.mValuesBuff);
                CustomSupport.setInterpolatedValue((ConstraintAttribute) this.mStartMotionPath.attributes.get(this.mAttributeNames[i3 - 1]), view, this.mValuesBuff);
                i3++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i4 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i4 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i4].conditionallyFire(f5, view);
                    i4++;
                }
            }
        } else {
            i = 1;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f6 = motionPaths.x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f7 = f6 + ((motionPaths2.x - f6) * f5);
            float f8 = motionPaths.y;
            float f9 = f8 + ((motionPaths2.y - f8) * f5);
            float f10 = motionPaths.width;
            float f11 = motionPaths2.width;
            float f12 = motionPaths.height;
            float f13 = motionPaths2.height;
            float f14 = f7 + 0.5f;
            int i5 = (int) f14;
            float f15 = f9 + 0.5f;
            int i6 = (int) f15;
            int i7 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i8 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f11 != f10 || f13 != f12 || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f5, dArr4[0], dArr4[i]);
                } else {
                    viewOscillator.setProperty(view, f5);
                }
            }
        }
        return z;
    }

    void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f5 = motionPaths.x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f6 = f5 - motionPaths2.x;
        float f7 = motionPaths.y - motionPaths2.y;
        float f8 = (motionPaths.width - motionPaths2.width) + f6;
        float f9 = (motionPaths.height - motionPaths2.height) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : (SplineSet) hashMap.get("translationX");
        HashMap hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : (SplineSet) hashMap2.get("translationY");
        HashMap hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : (SplineSet) hashMap3.get("rotation");
        HashMap hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : (SplineSet) hashMap4.get("scaleX");
        HashMap hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : (SplineSet) hashMap5.get("scaleY");
        HashMap hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap6 == null ? null : (ViewOscillator) hashMap6.get("translationX");
        HashMap hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap7 == null ? null : (ViewOscillator) hashMap7.get("translationY");
        HashMap hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap8 == null ? null : (ViewOscillator) hashMap8.get("rotation");
        HashMap hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap9 == null ? null : (ViewOscillator) hashMap9.get("scaleX");
        HashMap hashMap10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap10 != null ? (ViewOscillator) hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f5 = motionPaths.x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f6 = f5 - motionPaths2.x;
            ViewOscillator viewOscillator6 = viewOscillator5;
            float f7 = motionPaths.y - motionPaths2.y;
            ViewOscillator viewOscillator7 = viewOscillator4;
            float f8 = (motionPaths.width - motionPaths2.width) + f6;
            float f9 = (motionPaths.height - motionPaths2.height) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator7, viewOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    public int getDrawPath() {
        int i = this.mStartMotionPath.mDrawPath;
        Iterator it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((MotionPaths) it.next()).mDrawPath);
        }
        return Math.max(i, this.mEndMotionPath.mDrawPath);
    }
}
