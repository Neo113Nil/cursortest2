package s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.neptunesoft.languesbacdz.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0280a;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3404a = new ThreadLocal();

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
    /* JADX WARN: Removed duplicated region for block: B:160:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f2;
        int attributeCount;
        int i2;
        boolean z2;
        int alpha;
        int i3;
        int i4;
        int f3;
        float f4;
        float cbrt;
        float f5;
        int i5;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC0280a.f3366a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i6, i6);
                int resourceId = obtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3404a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r4);
                    int i8 = typedValue.type;
                    if (i8 < 28 || i8 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i6, -65281);
                        }
                        f2 = !obtainAttributes.hasValue(r4) ? obtainAttributes.getFloat(r4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f6 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr4 = new int[attributeCount];
                        int i9 = 0;
                        for (i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i2);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i10 = i9 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr4[i9] = attributeNameResource;
                                i9 = i10;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr4, i9);
                        z2 = f6 < 0.0f && f6 <= 100.0f;
                        if (f2 == 1.0f || z2) {
                            alpha = (int) ((Color.alpha(color) * f2) + 0.5f);
                            if (alpha >= 0) {
                                i3 = 0;
                            } else {
                                i3 = 255;
                                if (alpha <= 255) {
                                    i3 = alpha;
                                }
                            }
                            if (z2) {
                                i4 = depth2;
                            } else {
                                C0290a a2 = C0290a.a(color);
                                C0303n c0303n = C0303n.f3424k;
                                float f7 = a2.f3395b;
                                if (f7 < 1.0d || Math.round(f6) <= 0.0d || Math.round(f6) >= 100.0d) {
                                    i4 = depth2;
                                    f3 = AbstractC0291b.f(f6);
                                } else {
                                    float f8 = a2.f3394a;
                                    float min = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
                                    float f9 = f7;
                                    C0290a c0290a = null;
                                    boolean z3 = true;
                                    float f10 = 0.0f;
                                    while (true) {
                                        if (Math.abs(f10 - f7) >= 0.4f) {
                                            float f11 = 1000.0f;
                                            float f12 = 1000.0f;
                                            float f13 = 0.0f;
                                            float f14 = 100.0f;
                                            C0290a c0290a2 = null;
                                            while (true) {
                                                if (Math.abs(f13 - f14) <= 0.01f) {
                                                    i4 = depth2;
                                                    f4 = min;
                                                    break;
                                                }
                                                float f15 = ((f14 - f13) / 2.0f) + f13;
                                                int c2 = C0290a.b(f15, f9, min).c(C0303n.f3424k);
                                                float g2 = AbstractC0291b.g(Color.red(c2));
                                                float g3 = AbstractC0291b.g(Color.green(c2));
                                                float g4 = AbstractC0291b.g(Color.blue(c2));
                                                float[] fArr = AbstractC0291b.f3403d[1];
                                                float f16 = ((g4 * fArr[2]) + ((g3 * fArr[1]) + (g2 * fArr[0]))) / 100.0f;
                                                if (f16 <= 0.008856452f) {
                                                    cbrt = f16 * 903.2963f;
                                                    i4 = depth2;
                                                } else {
                                                    i4 = depth2;
                                                    cbrt = (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f6 - cbrt);
                                                if (abs < 0.2f) {
                                                    C0290a a3 = C0290a.a(c2);
                                                    C0290a b2 = C0290a.b(a3.f3396c, a3.f3395b, min);
                                                    f5 = f15;
                                                    float f17 = a3.f3397d - b2.f3397d;
                                                    f4 = min;
                                                    float f18 = a3.f3398e - b2.f3398e;
                                                    float f19 = a3.f3399f - b2.f3399f;
                                                    float pow = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        c0290a2 = a3;
                                                        f12 = pow;
                                                        f11 = abs;
                                                    }
                                                } else {
                                                    f5 = f15;
                                                    f4 = min;
                                                }
                                                if (f11 == 0.0f && f12 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f6) {
                                                    f13 = f5;
                                                } else {
                                                    f14 = f5;
                                                }
                                                depth2 = i4;
                                                min = f4;
                                            }
                                            C0290a c0290a3 = c0290a2;
                                            if (!z3) {
                                                if (c0290a3 == null) {
                                                    f7 = f9;
                                                } else {
                                                    c0290a = c0290a3;
                                                    f10 = f9;
                                                }
                                                f9 = ((f7 - f10) / 2.0f) + f10;
                                                depth2 = i4;
                                                min = f4;
                                            } else {
                                                if (c0290a3 != null) {
                                                    f3 = c0290a3.c(c0303n);
                                                    break;
                                                }
                                                f9 = ((f7 - f10) / 2.0f) + f10;
                                                depth2 = i4;
                                                min = f4;
                                                z3 = false;
                                            }
                                        } else {
                                            i4 = depth2;
                                            f3 = c0290a == null ? AbstractC0291b.f(f6) : c0290a.c(c0303n);
                                        }
                                    }
                                }
                                color = f3;
                            }
                            color = (16777215 & color) | (i3 << 24);
                        } else {
                            i4 = depth2;
                        }
                        i5 = i7 + 1;
                        if (i5 > iArr2.length) {
                            int[] iArr5 = new int[i7 <= 4 ? 8 : i7 * 2];
                            System.arraycopy(iArr2, 0, iArr5, 0, i7);
                            iArr2 = iArr5;
                        }
                        iArr2[i7] = color;
                        if (i5 > iArr.length) {
                            ?? r2 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i7 > 4 ? i7 * 2 : 8);
                            System.arraycopy(iArr, 0, r2, 0, i7);
                            iArr = r2;
                        }
                        iArr[i7] = trimStateSet;
                        iArr = iArr;
                        r02 = resources;
                        theme2 = theme;
                        i7 = i5;
                        depth2 = i4;
                        r4 = 1;
                        i6 = 0;
                        attributeSet2 = attributeSet;
                    }
                }
                color = obtainAttributes.getColor(i6, -65281);
                if (!obtainAttributes.hasValue(r4)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr42 = new int[attributeCount];
                int i92 = 0;
                while (i2 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i92);
                if (f6 < 0.0f) {
                }
                if (f2 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f2) + 0.5f);
                if (alpha >= 0) {
                }
                if (z2) {
                }
                color = (16777215 & color) | (i3 << 24);
                i5 = i7 + 1;
                if (i5 > iArr2.length) {
                }
                iArr2[i7] = color;
                if (i5 > iArr.length) {
                }
                iArr[i7] = trimStateSet2;
                iArr = iArr;
                r02 = resources;
                theme2 = theme;
                i7 = i5;
                depth2 = i4;
                r4 = 1;
                i6 = 0;
                attributeSet2 = attributeSet;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                depth2 = depth2;
                r4 = 1;
                i6 = 0;
            }
        }
        int[] iArr6 = new int[i7];
        int[][] iArr7 = new int[i7][];
        System.arraycopy(iArr2, 0, iArr6, 0, i7);
        System.arraycopy(iArr, 0, iArr7, 0, i7);
        return new ColorStateList(iArr7, iArr6);
    }
}
