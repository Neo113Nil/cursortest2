package S;

import a.AbstractC0132a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f985a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f986b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f987c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f988d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f989e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f990f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f991g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f992h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f993i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f994j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f995k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a0, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03af, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03b1, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03bd, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03bf, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03c3, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x039c, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x039e, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i3;
        int i4;
        String str2;
        Keyframe ofFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i5 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i6 = 1;
            if (next == 1) {
                break;
            }
            int i7 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray h2 = AbstractC0291b.h(resources2, theme2, attributeSet, f992h);
                    a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !AbstractC0291b.e(xmlResourceParser2, "ordering") ? 0 : h2.getInt(0, 0));
                    h2.recycle();
                    valueAnimator = animatorSet2;
                } else {
                    String str3 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i5 || eventType == i6) {
                            break;
                        }
                        if (eventType != i7) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str3)) {
                                TypedArray h3 = AbstractC0291b.h(resources2, theme2, asAttributeSet, f993i);
                                String c2 = AbstractC0291b.c(h3, xmlResourceParser2, "propertyName", i5);
                                int i8 = !AbstractC0291b.e(xmlResourceParser2, "valueType") ? 4 : h3.getInt(i7, 4);
                                int i9 = i8;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = asAttributeSet;
                                    if (next2 == i5 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = f994j;
                                        i4 = i9;
                                        str2 = str3;
                                        if (i4 == 4) {
                                            TypedArray h4 = AbstractC0291b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue peekValue = !AbstractC0291b.e(xmlResourceParser2, "value") ? null : h4.peekValue(0);
                                            int i10 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                            h4.recycle();
                                            i4 = i10;
                                        }
                                        TypedArray h5 = AbstractC0291b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f2 = AbstractC0291b.e(xmlResourceParser2, "fraction") ? h5.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue peekValue2 = !AbstractC0291b.e(xmlResourceParser2, "value") ? null : h5.peekValue(0);
                                        boolean z3 = peekValue2 != null;
                                        int i11 = i4 == 4 ? (z3 && c(peekValue2.type)) ? 3 : 0 : i4;
                                        if (!z3) {
                                            ofFloat = i11 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i11 == 0) {
                                            ofFloat = Keyframe.ofFloat(f2, !AbstractC0291b.e(xmlResourceParser2, "value") ? 0.0f : h5.getFloat(0, 0.0f));
                                        } else if (i11 == 1 || i11 == 3) {
                                            ofFloat = Keyframe.ofInt(f2, !AbstractC0291b.e(xmlResourceParser2, "value") ? 0 : h5.getInt(0, 0));
                                        } else {
                                            ofFloat = null;
                                        }
                                        int resourceId = !AbstractC0291b.e(xmlResourceParser2, "interpolator") ? 0 : h5.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            ofFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        h5.recycle();
                                        if (ofFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(ofFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i4 = i9;
                                        str2 = str3;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str3 = str2;
                                    asAttributeSet = attributeSet2;
                                    i9 = i4;
                                    i5 = 3;
                                }
                                int i12 = i9;
                                str = str3;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    propertyValuesHolder = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Keyframe keyframe3 = keyframeArr[i13];
                                        if (keyframe3.getFraction() < 0.0f) {
                                            if (i13 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i14 = size - 1;
                                                if (i13 == i14) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i15 = i13;
                                                    for (int i16 = i13 + 1; i16 < i14 && keyframeArr[i16].getFraction() < 0.0f; i16++) {
                                                        i15 = i16;
                                                    }
                                                    float fraction3 = (keyframeArr[i15 + 1].getFraction() - keyframeArr[i13 - 1].getFraction()) / ((i15 - i13) + 2);
                                                    int i17 = i13;
                                                    while (i17 <= i15) {
                                                        keyframeArr[i17].setFraction(keyframeArr[i17 - 1].getFraction() + fraction3);
                                                        i17++;
                                                        size = size;
                                                    }
                                                    i3 = size;
                                                    i13++;
                                                    size = i3;
                                                }
                                            }
                                        }
                                        i3 = size;
                                        i13++;
                                        size = i3;
                                    }
                                    propertyValuesHolder = PropertyValuesHolder.ofKeyframe(c2, keyframeArr);
                                    if (i12 == 3) {
                                        propertyValuesHolder.setEvaluator(g.f1007a);
                                    }
                                }
                                if (propertyValuesHolder == null) {
                                    propertyValuesHolder = b(h3, i8, 0, 1, c2);
                                }
                                if (propertyValuesHolder != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolder);
                                }
                                h3.recycle();
                            } else {
                                attributeSet2 = asAttributeSet;
                                str = str3;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            str3 = str;
                            asAttributeSet = attributeSet2;
                            i5 = 3;
                            i6 = 1;
                            i7 = 2;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i18 = 0; i18 < size2; i18++) {
                            propertyValuesHolderArr[i18] = (PropertyValuesHolder) arrayList2.get(i18);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                        valueAnimator.setValues(propertyValuesHolderArr);
                    }
                    z2 = true;
                }
                if (animatorSet != null && !z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z2 = peekValue != null;
        int i5 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z3 = peekValue2 != null;
        int i6 = z3 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && c(i5)) || (z3 && c(i6))) ? 3 : 0;
        }
        boolean z4 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 != 2) {
            g gVar = i2 == 3 ? g.f1007a : null;
            if (z4) {
                if (z2) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z3) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z2) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z3) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolder == null || gVar == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(gVar);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        t.d[] p2 = AbstractC0132a.p(string);
        t.d[] p3 = AbstractC0132a.p(string2);
        if (p2 == null && p3 == null) {
            return null;
        }
        if (p2 == null) {
            if (p3 != null) {
                return PropertyValuesHolder.ofObject(str, new f(), p3);
            }
            return null;
        }
        f fVar = new f();
        if (p3 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, fVar, p2);
        } else {
            if (!AbstractC0132a.f(p2, p3)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, fVar, p2, p3);
        }
        return ofObject;
    }

    public static boolean c(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        int i2;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator2;
        int i3 = 1;
        TypedArray h2 = AbstractC0291b.h(resources, theme, attributeSet, f991g);
        TypedArray h3 = AbstractC0291b.h(resources, theme, attributeSet, f995k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0291b.e(xmlResourceParser, "duration") ? h2.getInt(1, 300) : 300;
        long j3 = !AbstractC0291b.e(xmlResourceParser, "startOffset") ? 0 : h2.getInt(2, 0);
        int i4 = !AbstractC0291b.e(xmlResourceParser, "valueType") ? 4 : h2.getInt(7, 4);
        if (AbstractC0291b.e(xmlResourceParser, "valueFrom") && AbstractC0291b.e(xmlResourceParser, "valueTo")) {
            if (i4 == 4) {
                TypedValue peekValue = h2.peekValue(5);
                boolean z2 = peekValue != null;
                int i5 = z2 ? peekValue.type : 0;
                TypedValue peekValue2 = h2.peekValue(6);
                boolean z3 = peekValue2 != null;
                i4 = ((z2 && c(i5)) || (z3 && c(z3 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b2 = b(h2, i4, 5, 6, "");
            if (b2 != null) {
                valueAnimator3.setValues(b2);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!AbstractC0291b.e(xmlResourceParser, "repeatCount") ? 0 : h2.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC0291b.e(xmlResourceParser, "repeatMode") ? 1 : h2.getInt(4, 1));
        if (h3 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String c2 = AbstractC0291b.c(h3, xmlResourceParser, "pathData", 1);
            if (c2 == null) {
                valueAnimator = valueAnimator3;
                typedArray = h2;
                i2 = 0;
                objectAnimator2.setPropertyName(AbstractC0291b.c(h3, xmlResourceParser, "propertyName", 0));
                if (AbstractC0291b.e(xmlResourceParser, "interpolator")) {
                    typedArray2 = typedArray;
                    resourceId = 0;
                } else {
                    typedArray2 = typedArray;
                    resourceId = typedArray2.getResourceId(i2, i2);
                }
                if (resourceId <= 0) {
                    valueAnimator2 = valueAnimator;
                    valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                } else {
                    valueAnimator2 = valueAnimator;
                }
                typedArray2.recycle();
                if (h3 != null) {
                    h3.recycle();
                }
                return valueAnimator2;
            }
            String c3 = AbstractC0291b.c(h3, xmlResourceParser, "propertyXName", 2);
            String c4 = AbstractC0291b.c(h3, xmlResourceParser, "propertyYName", 3);
            if (c3 == null && c4 == null) {
                throw new InflateException(h3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            Path path = new Path();
            try {
                t.d.b(AbstractC0132a.p(c2), path);
                PathMeasure pathMeasure = new PathMeasure(path, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                while (true) {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                    i3 = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(path, false);
                int min = Math.min(100, ((int) (f2 / 0.5f)) + i3);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = h2;
                int i6 = 0;
                int i7 = 0;
                float f4 = 0.0f;
                while (true) {
                    if (i7 >= min) {
                        break;
                    }
                    int i8 = min;
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                    fArr[i7] = fArr3[0];
                    fArr2[i7] = fArr3[1];
                    f4 += f3;
                    int i9 = i6 + 1;
                    if (i9 < arrayList.size() && f4 > ((Float) arrayList.get(i9)).floatValue()) {
                        pathMeasure2.nextContour();
                        i6 = i9;
                    }
                    i7++;
                    min = i8;
                }
                PropertyValuesHolder ofFloat = c3 != null ? PropertyValuesHolder.ofFloat(c3, fArr) : null;
                PropertyValuesHolder ofFloat2 = c4 != null ? PropertyValuesHolder.ofFloat(c4, fArr2) : null;
                if (ofFloat == null) {
                    objectAnimator2.setValues(ofFloat2);
                } else if (ofFloat2 == null) {
                    objectAnimator2.setValues(ofFloat);
                } else {
                    objectAnimator2.setValues(ofFloat, ofFloat2);
                }
            } catch (RuntimeException e2) {
                throw new RuntimeException("Error in parsing ".concat(c2), e2);
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = h2;
        }
        i2 = 0;
        if (AbstractC0291b.e(xmlResourceParser, "interpolator")) {
        }
        if (resourceId <= 0) {
        }
        typedArray2.recycle();
        if (h3 != null) {
        }
        return valueAnimator2;
    }
}
