package U0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.gates.olympus.miruv.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3326a = new ThreadLocal();

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
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f3;
        int attributeCount;
        int i3;
        boolean z3;
        int alpha;
        int i4;
        int[] iArr;
        int i5;
        boolean z4;
        int b2;
        float f4;
        float f5;
        float f6;
        float cbrt;
        float f7;
        int i6;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z5 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z5 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = R0.a.f3165a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i7, i7);
                int resourceId = obtainAttributes.getResourceId(i7, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3326a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z5);
                    int i9 = typedValue.type;
                    if (i9 < 28 || i9 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i7, -65281);
                        }
                        f3 = !obtainAttributes.hasValue(z5) ? obtainAttributes.getFloat(z5, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f8 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i10 = i7;
                        for (i3 = i10; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i11 = i10 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i10] = attributeNameResource;
                                i10 = i11;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i10);
                        float f9 = 0.0f;
                        float f10 = 100.0f;
                        z3 = f8 < 0.0f && f8 <= 100.0f;
                        if (f3 == 1.0f || z3) {
                            alpha = (int) ((Color.alpha(color) * f3) + 0.5f);
                            if (alpha >= 0) {
                                i4 = 0;
                            } else {
                                i4 = 255;
                                if (alpha <= 255) {
                                    i4 = alpha;
                                }
                            }
                            if (z3) {
                                iArr = trimStateSet;
                                i5 = depth2;
                                z4 = true;
                            } else {
                                a a3 = a.a(color);
                                f fVar = f.f3329k;
                                float f11 = a3.f3317b;
                                if (f11 < 1.0d || Math.round(f8) <= 0.0d || Math.round(f8) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i5 = depth2;
                                    z4 = true;
                                    b2 = b.b(f8);
                                } else {
                                    float f12 = a3.f3316a;
                                    float min = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                                    float f13 = 0.0f;
                                    float f14 = f11;
                                    a aVar = null;
                                    boolean z6 = true;
                                    while (true) {
                                        if (Math.abs(f13 - f11) >= 0.4f) {
                                            float f15 = 1000.0f;
                                            float f16 = f9;
                                            float f17 = f10;
                                            float f18 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f16 - f17) <= 0.01f) {
                                                    i5 = depth2;
                                                    f4 = min;
                                                    f5 = f10;
                                                    z4 = true;
                                                    float f19 = f9;
                                                    iArr = trimStateSet;
                                                    f6 = f19;
                                                    break;
                                                }
                                                float f20 = ((f17 - f16) / 2.0f) + f16;
                                                int c3 = a.b(f20, f14, min).c(f.f3329k);
                                                float c4 = b.c(Color.red(c3));
                                                float c5 = b.c(Color.green(c3));
                                                float c6 = b.c(Color.blue(c3));
                                                z4 = true;
                                                float[] fArr = b.f3325d[1];
                                                f5 = 100.0f;
                                                float f21 = ((c6 * fArr[2]) + ((c5 * fArr[1]) + (c4 * fArr[0]))) / 100.0f;
                                                if (f21 <= 0.008856452f) {
                                                    cbrt = f21 * 903.2963f;
                                                    i5 = depth2;
                                                } else {
                                                    i5 = depth2;
                                                    cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f8 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a4 = a.a(c3);
                                                    a b3 = a.b(a4.f3318c, a4.f3317b, min);
                                                    f7 = f20;
                                                    float f22 = a4.f3319d - b3.f3319d;
                                                    f4 = min;
                                                    float f23 = a4.f3320e - b3.f3320e;
                                                    float f24 = a4.f3321f - b3.f3321f;
                                                    double sqrt = Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f18 = pow;
                                                        aVar2 = a4;
                                                        f15 = abs;
                                                    }
                                                } else {
                                                    f7 = f20;
                                                    f4 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f6 = 0.0f;
                                                if (f15 == 0.0f && f18 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f8) {
                                                    f16 = f7;
                                                } else {
                                                    f17 = f7;
                                                }
                                                f10 = 100.0f;
                                                depth2 = i5;
                                                min = f4;
                                                int[] iArr6 = iArr;
                                                f9 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z6) {
                                                if (aVar3 == null) {
                                                    f11 = f14;
                                                } else {
                                                    aVar = aVar3;
                                                    f13 = f14;
                                                }
                                                f14 = ((f11 - f13) / 2.0f) + f13;
                                                f10 = f5;
                                                depth2 = i5;
                                                min = f4;
                                            } else {
                                                if (aVar3 != null) {
                                                    b2 = aVar3.c(fVar);
                                                    break;
                                                }
                                                f14 = ((f11 - f13) / 2.0f) + f13;
                                                f10 = f5;
                                                depth2 = i5;
                                                min = f4;
                                                z6 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f9 = f6;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            i5 = depth2;
                                            z4 = true;
                                            b2 = aVar == null ? b.b(f8) : aVar.c(fVar);
                                        }
                                    }
                                }
                                color = b2;
                            }
                            color = (16777215 & color) | (i4 << 24);
                        } else {
                            iArr = trimStateSet;
                            i5 = depth2;
                            z4 = true;
                        }
                        i6 = i8 + 1;
                        if (i6 > iArr3.length) {
                            int[] iArr8 = new int[i8 <= 4 ? 8 : i8 * 2];
                            System.arraycopy(iArr3, 0, iArr8, 0, i8);
                            iArr3 = iArr8;
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
                        z5 = z4;
                        depth2 = i5;
                        i7 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i7, -65281);
                if (!obtainAttributes.hasValue(z5)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i102 = i7;
                while (i3 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i102);
                float f92 = 0.0f;
                float f102 = 100.0f;
                if (f8 < 0.0f) {
                }
                if (f3 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f3) + 0.5f);
                if (alpha >= 0) {
                }
                if (z3) {
                }
                color = (16777215 & color) | (i4 << 24);
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
                z5 = z4;
                depth2 = i5;
                i7 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z5 = z5;
                depth2 = depth2;
                i7 = 0;
            }
        }
        int[] iArr9 = new int[i8];
        int[][] iArr10 = new int[i8][];
        System.arraycopy(iArr3, 0, iArr9, 0, i8);
        System.arraycopy(iArr2, 0, iArr10, 0, i8);
        return new ColorStateList(iArr10, iArr9);
    }
}
