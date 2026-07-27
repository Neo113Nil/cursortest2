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
import com.chicken.road.kedro.laqer.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4092a = new ThreadLocal();

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
        float f4;
        int attributeCount;
        int i2;
        boolean z4;
        int alpha;
        int i4;
        int[] iArr;
        int i5;
        boolean z5;
        int b4;
        float f5;
        float f6;
        float f7;
        float cbrt;
        float f8;
        int i6;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z6 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z6 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = R0.a.f3942a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i7, i7);
                int resourceId = obtainAttributes.getResourceId(i7, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f4092a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z6);
                    int i9 = typedValue.type;
                    if (i9 < 28 || i9 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i7, -65281);
                        }
                        f4 = !obtainAttributes.hasValue(z6) ? obtainAttributes.getFloat(z6, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f9 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i10 = i7;
                        for (i2 = i10; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i2);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i11 = i10 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i10] = attributeNameResource;
                                i10 = i11;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i10);
                        float f10 = 0.0f;
                        float f11 = 100.0f;
                        z4 = f9 < 0.0f && f9 <= 100.0f;
                        if (f4 == 1.0f || z4) {
                            alpha = (int) ((Color.alpha(color) * f4) + 0.5f);
                            if (alpha >= 0) {
                                i4 = 0;
                            } else {
                                i4 = 255;
                                if (alpha <= 255) {
                                    i4 = alpha;
                                }
                            }
                            if (z4) {
                                iArr = trimStateSet;
                                i5 = depth2;
                                z5 = true;
                            } else {
                                a a4 = a.a(color);
                                f fVar = f.f4095k;
                                float f12 = a4.f4083b;
                                if (f12 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i5 = depth2;
                                    z5 = true;
                                    b4 = b.b(f9);
                                } else {
                                    float f13 = a4.f4082a;
                                    float min = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                                    float f14 = 0.0f;
                                    float f15 = f12;
                                    a aVar = null;
                                    boolean z7 = true;
                                    while (true) {
                                        if (Math.abs(f14 - f12) >= 0.4f) {
                                            float f16 = 1000.0f;
                                            float f17 = f10;
                                            float f18 = f11;
                                            float f19 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f17 - f18) <= 0.01f) {
                                                    i5 = depth2;
                                                    f5 = min;
                                                    f6 = f11;
                                                    z5 = true;
                                                    float f20 = f10;
                                                    iArr = trimStateSet;
                                                    f7 = f20;
                                                    break;
                                                }
                                                float f21 = ((f18 - f17) / 2.0f) + f17;
                                                int c4 = a.b(f21, f15, min).c(f.f4095k);
                                                float c5 = b.c(Color.red(c4));
                                                float c6 = b.c(Color.green(c4));
                                                float c7 = b.c(Color.blue(c4));
                                                z5 = true;
                                                float[] fArr = b.f4091d[1];
                                                f6 = 100.0f;
                                                float f22 = ((c7 * fArr[2]) + ((c6 * fArr[1]) + (c5 * fArr[0]))) / 100.0f;
                                                if (f22 <= 0.008856452f) {
                                                    cbrt = f22 * 903.2963f;
                                                    i5 = depth2;
                                                } else {
                                                    i5 = depth2;
                                                    cbrt = (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f9 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a5 = a.a(c4);
                                                    a b5 = a.b(a5.f4084c, a5.f4083b, min);
                                                    f8 = f21;
                                                    float f23 = a5.f4085d - b5.f4085d;
                                                    f5 = min;
                                                    float f24 = a5.f4086e - b5.f4086e;
                                                    float f25 = a5.f4087f - b5.f4087f;
                                                    double sqrt = Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f19 = pow;
                                                        aVar2 = a5;
                                                        f16 = abs;
                                                    }
                                                } else {
                                                    f8 = f21;
                                                    f5 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f7 = 0.0f;
                                                if (f16 == 0.0f && f19 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f9) {
                                                    f17 = f8;
                                                } else {
                                                    f18 = f8;
                                                }
                                                f11 = 100.0f;
                                                depth2 = i5;
                                                min = f5;
                                                int[] iArr6 = iArr;
                                                f10 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z7) {
                                                if (aVar3 == null) {
                                                    f12 = f15;
                                                } else {
                                                    aVar = aVar3;
                                                    f14 = f15;
                                                }
                                                f15 = ((f12 - f14) / 2.0f) + f14;
                                                f11 = f6;
                                                depth2 = i5;
                                                min = f5;
                                            } else {
                                                if (aVar3 != null) {
                                                    b4 = aVar3.c(fVar);
                                                    break;
                                                }
                                                f15 = ((f12 - f14) / 2.0f) + f14;
                                                f11 = f6;
                                                depth2 = i5;
                                                min = f5;
                                                z7 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f10 = f7;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            i5 = depth2;
                                            z5 = true;
                                            b4 = aVar == null ? b.b(f9) : aVar.c(fVar);
                                        }
                                    }
                                }
                                color = b4;
                            }
                            color = (16777215 & color) | (i4 << 24);
                        } else {
                            iArr = trimStateSet;
                            i5 = depth2;
                            z5 = true;
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
                        z6 = z5;
                        depth2 = i5;
                        i7 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i7, -65281);
                if (!obtainAttributes.hasValue(z6)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i102 = i7;
                while (i2 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i102);
                float f102 = 0.0f;
                float f112 = 100.0f;
                if (f9 < 0.0f) {
                }
                if (f4 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f4) + 0.5f);
                if (alpha >= 0) {
                }
                if (z4) {
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
                z6 = z5;
                depth2 = i5;
                i7 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z6 = z6;
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
