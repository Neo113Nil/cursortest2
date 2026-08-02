package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ut {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        float f2;
        char c;
        int[] iArr;
        int i2;
        int[] iArr2;
        float f3;
        float f4;
        float f5;
        int i3;
        int i4;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr3 = new int[20][];
        int[] iArr4 = new int[20];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr5 = ud.a;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr5) : theme2.obtainStyledAttributes(attributeSet2, iArr5, i5, i5);
                int resourceId = obtainAttributes.getResourceId(i5, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = b;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i5, -65281);
                        }
                        float f6 = 1.0f;
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f7 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr6 = new int[attributeCount];
                        char c2 = z;
                        int i7 = i5;
                        i = i7;
                        while (i < attributeCount) {
                            float f8 = f6;
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i8 = i7 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr6[i7] = attributeNameResource;
                                i7 = i8;
                            }
                            i++;
                            f6 = f8;
                        }
                        f2 = f6;
                        int[] trimStateSet = StateSet.trimStateSet(iArr6, i7);
                        float f9 = 100.0f;
                        c = (f7 >= 0.0f || f7 > 100.0f) ? (char) 0 : c2;
                        if (f == f2) {
                            if (c == 0) {
                                iArr = trimStateSet;
                                i2 = depth2;
                                iArr2 = iArr4;
                                i3 = i6 + 1;
                                if (i3 > iArr2.length) {
                                    int[] iArr7 = new int[pi.I(i6)];
                                    i4 = 0;
                                    System.arraycopy(iArr2, 0, iArr7, 0, i6);
                                    iArr4 = iArr7;
                                } else {
                                    i4 = 0;
                                    iArr4 = iArr2;
                                }
                                iArr4[i6] = color;
                                if (i3 > iArr3.length) {
                                    ?? r1 = (Object[]) Array.newInstance(iArr3.getClass().getComponentType(), pi.I(i6));
                                    System.arraycopy(iArr3, i4, r1, i4, i6);
                                    iArr3 = r1;
                                }
                                iArr3[i6] = iArr;
                                iArr3 = iArr3;
                                attributeSet2 = attributeSet;
                                theme2 = theme;
                                i6 = i3;
                                z = c2;
                                depth2 = i2;
                                i5 = 0;
                                r0 = resources;
                            } else {
                                c = c2;
                            }
                        }
                        int j = pj.j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                        if (c == 0) {
                            ur b2 = ur.b(color);
                            float f10 = b2.a;
                            float f11 = b2.b;
                            double d = f11;
                            uz uzVar = uz.a;
                            if (d >= 1.0d) {
                                iArr2 = iArr4;
                                if (Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                } else {
                                    float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
                                    float f12 = f11;
                                    char c3 = c2;
                                    float f13 = 0.0f;
                                    ur urVar = null;
                                    while (true) {
                                        if (Math.abs(f13 - f11) >= 0.4f) {
                                            float f14 = 1000.0f;
                                            float f15 = f9;
                                            float f16 = 0.0f;
                                            float f17 = 1000.0f;
                                            ur urVar2 = null;
                                            while (true) {
                                                if (Math.abs(f16 - f15) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i2 = depth2;
                                                    f3 = min;
                                                    f4 = f9;
                                                    break;
                                                }
                                                f4 = f9;
                                                float f18 = f16 + ((f15 - f16) / 2.0f);
                                                iArr = trimStateSet;
                                                int a2 = ur.c(f18, f12, min).a(uzVar);
                                                int i9 = us.e;
                                                float a3 = us.a(Color.red(a2));
                                                float a4 = us.a(Color.green(a2));
                                                float a5 = us.a(Color.blue(a2));
                                                float[] fArr = us.d[c2];
                                                float f19 = (((a3 * fArr[0]) + (a4 * fArr[c2])) + (a5 * fArr[2])) / f4;
                                                float cbrt = f19 <= 0.008856452f ? f19 * 903.2963f : (((float) Math.cbrt(f19)) * 116.0f) - 16.0f;
                                                float abs = Math.abs(f7 - cbrt);
                                                if (abs < 0.2f) {
                                                    f5 = cbrt;
                                                    ur b3 = ur.b(a2);
                                                    ur c4 = ur.c(b3.c, b3.b, min);
                                                    float f20 = b3.d;
                                                    float f21 = c4.d;
                                                    float f22 = b3.e;
                                                    float f23 = c4.e;
                                                    float f24 = b3.f - c4.f;
                                                    float f25 = f22 - f23;
                                                    float f26 = f20 - f21;
                                                    double sqrt = Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24));
                                                    i2 = depth2;
                                                    f3 = min;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= f2) {
                                                        urVar2 = b3;
                                                        f17 = pow;
                                                        f14 = abs;
                                                    }
                                                } else {
                                                    f5 = cbrt;
                                                    i2 = depth2;
                                                    f3 = min;
                                                }
                                                if (f14 == 0.0f && f17 == 0.0f) {
                                                    break;
                                                }
                                                if (f5 >= f7) {
                                                    f15 = f18;
                                                }
                                                if (f5 < f7) {
                                                    f16 = f18;
                                                }
                                                trimStateSet = iArr;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                            }
                                            ur urVar3 = urVar2;
                                            if (c3 == 0) {
                                                if (urVar3 != null) {
                                                    urVar = urVar3;
                                                }
                                                if (urVar3 != null) {
                                                    f13 = f12;
                                                }
                                                if (urVar3 == null) {
                                                    f11 = f12;
                                                }
                                                f12 = f13 + ((f11 - f13) / 2.0f);
                                                trimStateSet = iArr;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                            } else {
                                                if (urVar3 != null) {
                                                    color = urVar3.a(uzVar);
                                                    break;
                                                }
                                                f12 = f13 + ((f11 - f13) / 2.0f);
                                                trimStateSet = iArr;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            color = urVar == null ? us.b(f7) : urVar.a(uzVar);
                                        }
                                    }
                                }
                            } else {
                                iArr = trimStateSet;
                                i2 = depth2;
                                iArr2 = iArr4;
                            }
                            color = us.b(f7);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                            iArr2 = iArr4;
                        }
                        color = (16777215 & color) | (j << 24);
                        i3 = i6 + 1;
                        if (i3 > iArr2.length) {
                        }
                        iArr4[i6] = color;
                        if (i3 > iArr3.length) {
                        }
                        iArr3[i6] = iArr;
                        iArr3 = iArr3;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i6 = i3;
                        z = c2;
                        depth2 = i2;
                        i5 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i5, -65281);
                float f62 = 1.0f;
                if (!obtainAttributes.hasValue(z)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr62 = new int[attributeCount];
                char c22 = z;
                int i72 = i5;
                i = i72;
                while (i < attributeCount) {
                }
                f2 = f62;
                int[] trimStateSet2 = StateSet.trimStateSet(iArr62, i72);
                float f92 = 100.0f;
                if (f7 >= 0.0f) {
                }
                if (f == f2) {
                }
                int j2 = pj.j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                if (c == 0) {
                }
                color = (16777215 & color) | (j2 << 24);
                i3 = i6 + 1;
                if (i3 > iArr2.length) {
                }
                iArr4[i6] = color;
                if (i3 > iArr3.length) {
                }
                iArr3[i6] = iArr;
                iArr3 = iArr3;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i6 = i3;
                z = c22;
                depth2 = i2;
                i5 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                iArr4 = iArr4;
                z = z;
                depth2 = depth2;
                i5 = 0;
            }
        }
        int[] iArr8 = new int[i6];
        int[][] iArr9 = new int[i6][];
        System.arraycopy(iArr4, 0, iArr8, 0, i6);
        System.arraycopy(iArr3, 0, iArr9, 0, i6);
        return new ColorStateList(iArr9, iArr8);
    }
}
