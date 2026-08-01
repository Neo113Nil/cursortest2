package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.gdmhkmf.belbet.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1319a = new ThreadLocal();

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
        float f5;
        int attributeCount;
        int i;
        char c5;
        int[] iArr;
        int i4;
        int d;
        float f6;
        int i5;
        float cbrt;
        int i6;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = b0.a.f819a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i7, i7);
                int resourceId = obtainAttributes.getResourceId(i7, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f1319a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z4);
                    int i9 = typedValue.type;
                    if (i9 < 28 || i9 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i7, -65281);
                        }
                        f5 = !obtainAttributes.hasValue(z4) ? obtainAttributes.getFloat(z4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c6 = z4;
                        float f7 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i7;
                        int i10 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i11 = i10 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i10] = attributeNameResource;
                                i10 = i11;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i10);
                        float f8 = 100.0f;
                        c5 = (f7 >= 0.0f || f7 > 100.0f) ? (char) 0 : c6;
                        if (f5 == 1.0f || c5 != 0) {
                            int i12 = b4.l.i((int) ((Color.alpha(color) * f5) + 0.5f), 0, 255);
                            if (c5 == 0) {
                                a a5 = a.a(color);
                                float f9 = a5.f1308a;
                                float f10 = a5.f1309b;
                                n nVar = n.f1342k;
                                if (f10 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i4 = depth2;
                                    d = b.d(f7);
                                } else {
                                    float min = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
                                    float f11 = 0.0f;
                                    float f12 = f10;
                                    char c7 = c6;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f11 - f10) >= 0.4f) {
                                            float f13 = 1000.0f;
                                            float f14 = f8;
                                            float f15 = 0.0f;
                                            float f16 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f15 - f14) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i4 = depth2;
                                                    f6 = f8;
                                                    break;
                                                }
                                                f6 = f8;
                                                float f17 = ((f14 - f15) / 2.0f) + f15;
                                                iArr = trimStateSet;
                                                int c8 = a.b(f17, f12, min).c(n.f1342k);
                                                float e4 = b.e(Color.red(c8));
                                                float e5 = b.e(Color.green(c8));
                                                float e6 = b.e(Color.blue(c8));
                                                float[] fArr = b.d[c6];
                                                float f18 = ((e6 * fArr[2]) + ((e5 * fArr[c6]) + (e4 * fArr[0]))) / f6;
                                                if (f18 <= 0.008856452f) {
                                                    cbrt = f18 * 903.2963f;
                                                    i5 = c8;
                                                } else {
                                                    i5 = c8;
                                                    cbrt = (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f7 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a6 = a.a(i5);
                                                    a b2 = a.b(a6.f1310c, a6.f1309b, min);
                                                    float f19 = a6.d - b2.d;
                                                    float f20 = a6.f1311e - b2.f1311e;
                                                    float f21 = a6.f1312f - b2.f1312f;
                                                    i4 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f16 = pow;
                                                        f13 = abs;
                                                        aVar2 = a6;
                                                    }
                                                } else {
                                                    i4 = depth2;
                                                }
                                                if (f13 == 0.0f && f16 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f7) {
                                                    f15 = f17;
                                                } else {
                                                    f14 = f17;
                                                }
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                            }
                                            a aVar3 = aVar2;
                                            if (c7 == 0) {
                                                if (aVar3 == null) {
                                                    f10 = f12;
                                                } else {
                                                    aVar = aVar3;
                                                    f11 = f12;
                                                }
                                                f12 = ((f10 - f11) / 2.0f) + f11;
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(nVar);
                                                    break;
                                                }
                                                f12 = ((f10 - f11) / 2.0f) + f11;
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                                c7 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i4 = depth2;
                                            d = aVar == null ? b.d(f7) : aVar.c(nVar);
                                        }
                                    }
                                }
                                color = d;
                            } else {
                                iArr = trimStateSet;
                                i4 = depth2;
                            }
                            color = (16777215 & color) | (i12 << 24);
                        } else {
                            iArr = trimStateSet;
                            i4 = depth2;
                        }
                        i6 = i8 + 1;
                        if (i6 > iArr3.length) {
                            int[] iArr6 = new int[i8 <= 4 ? 8 : i8 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i8);
                            iArr3 = iArr6;
                        }
                        iArr3[i8] = color;
                        if (i6 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i8 > 4 ? i8 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i8);
                            iArr2 = r12;
                        }
                        iArr2[i8] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i8 = i6;
                        z4 = c6;
                        depth2 = i4;
                        i7 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i7, -65281);
                if (!obtainAttributes.hasValue(z4)) {
                }
                char c62 = z4;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i7;
                int i102 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i102);
                float f82 = 100.0f;
                if (f7 >= 0.0f) {
                }
                if (f5 == 1.0f) {
                }
                int i122 = b4.l.i((int) ((Color.alpha(color) * f5) + 0.5f), 0, 255);
                if (c5 == 0) {
                }
                color = (16777215 & color) | (i122 << 24);
                i6 = i8 + 1;
                if (i6 > iArr3.length) {
                }
                iArr3[i8] = color;
                if (i6 > iArr2.length) {
                }
                iArr2[i8] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i8 = i6;
                z4 = c62;
                depth2 = i4;
                i7 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z4 = z4;
                depth2 = depth2;
                i7 = 0;
            }
        }
        int[] iArr7 = new int[i8];
        int[][] iArr8 = new int[i8][];
        System.arraycopy(iArr3, 0, iArr7, 0, i8);
        System.arraycopy(iArr2, 0, iArr8, 0, i8);
        return new ColorStateList(iArr8, iArr7);
    }
}
