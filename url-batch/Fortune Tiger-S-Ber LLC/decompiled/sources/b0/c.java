package b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.gglhk.bofio.fortunetiger.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f697a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f4;
        int attributeCount;
        int i4;
        char c;
        int[] iArr;
        int i5;
        int d4;
        float f5;
        int i6;
        float cbrt;
        int i7;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z3 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z3 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = y.a.f3607a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i8, i8);
                int resourceId = obtainAttributes.getResourceId(i8, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f697a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i10 = typedValue.type;
                    if (i10 < 28 || i10 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i8, -65281);
                        }
                        f4 = !obtainAttributes.hasValue(z3) ? obtainAttributes.getFloat(z3, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c4 = z3;
                        float f6 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i4 = i8;
                        int i11 = i4;
                        while (i4 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i12 = i11 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i11] = attributeNameResource;
                                i11 = i12;
                            }
                            i4++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i11);
                        float f7 = 100.0f;
                        c = (f6 >= 0.0f || f6 > 100.0f) ? (char) 0 : c4;
                        if (f4 == 1.0f || c != 0) {
                            int k4 = k3.d.k((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                            if (c == 0) {
                                a a4 = a.a(color);
                                float f8 = a4.f687a;
                                float f9 = a4.f688b;
                                n nVar = n.f718k;
                                if (f9 < 1.0d || Math.round(f6) <= 0.0d || Math.round(f6) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i5 = depth2;
                                    d4 = b.d(f6);
                                } else {
                                    float min = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
                                    float f10 = 0.0f;
                                    float f11 = f9;
                                    char c5 = c4;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f10 - f9) >= 0.4f) {
                                            float f12 = 1000.0f;
                                            float f13 = f7;
                                            float f14 = 0.0f;
                                            float f15 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f14 - f13) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i5 = depth2;
                                                    f5 = f7;
                                                    break;
                                                }
                                                f5 = f7;
                                                float f16 = ((f13 - f14) / 2.0f) + f14;
                                                iArr = trimStateSet;
                                                int c6 = a.b(f16, f11, min).c(n.f718k);
                                                float e4 = b.e(Color.red(c6));
                                                float e5 = b.e(Color.green(c6));
                                                float e6 = b.e(Color.blue(c6));
                                                float[] fArr = b.f694d[c4];
                                                float f17 = ((e6 * fArr[2]) + ((e5 * fArr[c4]) + (e4 * fArr[0]))) / f5;
                                                if (f17 <= 0.008856452f) {
                                                    cbrt = f17 * 903.2963f;
                                                    i6 = c6;
                                                } else {
                                                    i6 = c6;
                                                    cbrt = (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f6 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a5 = a.a(i6);
                                                    a b2 = a.b(a5.c, a5.f688b, min);
                                                    float f18 = a5.f689d - b2.f689d;
                                                    float f19 = a5.f690e - b2.f690e;
                                                    float f20 = a5.f691f - b2.f691f;
                                                    i5 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f15 = pow;
                                                        f12 = abs;
                                                        aVar2 = a5;
                                                    }
                                                } else {
                                                    i5 = depth2;
                                                }
                                                if (f12 == 0.0f && f15 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f6) {
                                                    f14 = f16;
                                                } else {
                                                    f13 = f16;
                                                }
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i5;
                                            }
                                            a aVar3 = aVar2;
                                            if (c5 == 0) {
                                                if (aVar3 == null) {
                                                    f9 = f11;
                                                } else {
                                                    aVar = aVar3;
                                                    f10 = f11;
                                                }
                                                f11 = ((f9 - f10) / 2.0f) + f10;
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i5;
                                            } else {
                                                if (aVar3 != null) {
                                                    d4 = aVar3.c(nVar);
                                                    break;
                                                }
                                                f11 = ((f9 - f10) / 2.0f) + f10;
                                                f7 = f5;
                                                trimStateSet = iArr;
                                                depth2 = i5;
                                                c5 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i5 = depth2;
                                            d4 = aVar == null ? b.d(f6) : aVar.c(nVar);
                                        }
                                    }
                                }
                                color = d4;
                            } else {
                                iArr = trimStateSet;
                                i5 = depth2;
                            }
                            color = (16777215 & color) | (k4 << 24);
                        } else {
                            iArr = trimStateSet;
                            i5 = depth2;
                        }
                        i7 = i9 + 1;
                        if (i7 > iArr3.length) {
                            int[] iArr6 = new int[i9 <= 4 ? 8 : i9 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i9);
                            iArr3 = iArr6;
                        }
                        iArr3[i9] = color;
                        if (i7 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i9 > 4 ? i9 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i9);
                            iArr2 = r12;
                        }
                        iArr2[i9] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i9 = i7;
                        z3 = c4;
                        depth2 = i5;
                        i8 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i8, -65281);
                if (!obtainAttributes.hasValue(z3)) {
                }
                char c42 = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i4 = i8;
                int i112 = i4;
                while (i4 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i112);
                float f72 = 100.0f;
                if (f6 >= 0.0f) {
                }
                if (f4 == 1.0f) {
                }
                int k42 = k3.d.k((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                if (c == 0) {
                }
                color = (16777215 & color) | (k42 << 24);
                i7 = i9 + 1;
                if (i7 > iArr3.length) {
                }
                iArr3[i9] = color;
                if (i7 > iArr2.length) {
                }
                iArr2[i9] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i9 = i7;
                z3 = c42;
                depth2 = i5;
                i8 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z3 = z3;
                depth2 = depth2;
                i8 = 0;
            }
        }
        int[] iArr7 = new int[i9];
        int[][] iArr8 = new int[i9][];
        System.arraycopy(iArr3, 0, iArr7, 0, i9);
        System.arraycopy(iArr2, 0, iArr8, 0, i9);
        return new ColorStateList(iArr8, iArr7);
    }
}
