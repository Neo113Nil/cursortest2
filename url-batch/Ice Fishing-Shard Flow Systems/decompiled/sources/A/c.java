package A;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import x.AbstractC0993a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        float f7;
        int attributeCount;
        int i2;
        char c7;
        int alpha;
        int i5;
        int[] iArr;
        AttributeSet attributeSet;
        int i7;
        int b7;
        float f8;
        int i8;
        float cbrt;
        int i9;
        TypedValue typedValue;
        ?? r0 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z7 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == z7 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC0993a.f8287a;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(asAttributeSet, iArr4) : theme2.obtainStyledAttributes(asAttributeSet, iArr4, i10, i10);
                int resourceId = obtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f13a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z7);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i10, -65281);
                        }
                        f7 = !obtainAttributes.hasValue(z7) ? obtainAttributes.getFloat(z7, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c8 = z7;
                        float f9 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = asAttributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i2 = i10;
                        int i13 = i2;
                        while (i2 < attributeCount) {
                            int attributeNameResource = asAttributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i14 = i13 + 1;
                                if (!asAttributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i13] = attributeNameResource;
                                i13 = i14;
                            }
                            i2++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i13);
                        float f10 = 100.0f;
                        c7 = (f9 >= 0.0f || f9 > 100.0f) ? (char) 0 : c8;
                        if (f7 == 1.0f || c7 != 0) {
                            alpha = (int) ((Color.alpha(color) * f7) + 0.5f);
                            if (alpha >= 0) {
                                i5 = 0;
                            } else {
                                i5 = 255;
                                if (alpha <= 255) {
                                    i5 = alpha;
                                }
                            }
                            if (c7 == 0) {
                                a a7 = a.a(color);
                                float f11 = a7.f0a;
                                float f12 = a7.f1b;
                                n nVar = n.f38k;
                                if (f12 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
                                    iArr = trimStateSet;
                                    attributeSet = asAttributeSet;
                                    i7 = depth2;
                                    b7 = b.b(f9);
                                } else {
                                    float min = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                                    float f13 = 0.0f;
                                    float f14 = f12;
                                    char c9 = c8;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f13 - f12) >= 0.4f) {
                                            float f15 = 1000.0f;
                                            float f16 = f10;
                                            float f17 = 0.0f;
                                            float f18 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f17 - f16) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    attributeSet = asAttributeSet;
                                                    i7 = depth2;
                                                    f8 = f10;
                                                    break;
                                                }
                                                f8 = f10;
                                                float f19 = ((f16 - f17) / 2.0f) + f17;
                                                iArr = trimStateSet;
                                                int c10 = a.b(f19, f14, min).c(n.f38k);
                                                float c11 = b.c(Color.red(c10));
                                                float c12 = b.c(Color.green(c10));
                                                float c13 = b.c(Color.blue(c10));
                                                float[] fArr = b.f9d[c8];
                                                float f20 = ((c13 * fArr[2]) + ((c12 * fArr[c8]) + (c11 * fArr[0]))) / f8;
                                                if (f20 <= 0.008856452f) {
                                                    cbrt = f20 * 903.2963f;
                                                    i8 = c10;
                                                } else {
                                                    i8 = c10;
                                                    cbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f9 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a8 = a.a(i8);
                                                    attributeSet = asAttributeSet;
                                                    a b8 = a.b(a8.f2c, a8.f1b, min);
                                                    float f21 = a8.f3d - b8.f3d;
                                                    float f22 = a8.f4e - b8.f4e;
                                                    float f23 = a8.f5f - b8.f5f;
                                                    i7 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f18 = pow;
                                                        f15 = abs;
                                                        aVar2 = a8;
                                                    }
                                                } else {
                                                    attributeSet = asAttributeSet;
                                                    i7 = depth2;
                                                }
                                                if (f15 == 0.0f && f18 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f9) {
                                                    f17 = f19;
                                                } else {
                                                    f16 = f19;
                                                }
                                                f10 = f8;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                            }
                                            a aVar3 = aVar2;
                                            if (c9 == 0) {
                                                if (aVar3 == null) {
                                                    f12 = f14;
                                                } else {
                                                    aVar = aVar3;
                                                    f13 = f14;
                                                }
                                                f14 = ((f12 - f13) / 2.0f) + f13;
                                                f10 = f8;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                            } else {
                                                if (aVar3 != null) {
                                                    b7 = aVar3.c(nVar);
                                                    break;
                                                }
                                                f14 = ((f12 - f13) / 2.0f) + f13;
                                                f10 = f8;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                                c9 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            attributeSet = asAttributeSet;
                                            i7 = depth2;
                                            b7 = aVar == null ? b.b(f9) : aVar.c(nVar);
                                        }
                                    }
                                }
                                color = b7;
                            } else {
                                iArr = trimStateSet;
                                attributeSet = asAttributeSet;
                                i7 = depth2;
                            }
                            color = (16777215 & color) | (i5 << 24);
                        } else {
                            iArr = trimStateSet;
                            attributeSet = asAttributeSet;
                            i7 = depth2;
                        }
                        i9 = i11 + 1;
                        if (i9 > iArr3.length) {
                            int[] iArr6 = new int[i11 <= 4 ? 8 : i11 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i11);
                            iArr3 = iArr6;
                        }
                        iArr3[i11] = color;
                        if (i9 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i11);
                            iArr2 = r12;
                        }
                        iArr2[i11] = iArr;
                        iArr2 = iArr2;
                        theme2 = theme;
                        i11 = i9;
                        z7 = c8;
                        asAttributeSet = attributeSet;
                        depth2 = i7;
                        i10 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i10, -65281);
                if (!obtainAttributes.hasValue(z7)) {
                }
                char c82 = z7;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = asAttributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i2 = i10;
                int i132 = i2;
                while (i2 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i132);
                float f102 = 100.0f;
                if (f9 >= 0.0f) {
                }
                if (f7 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f7) + 0.5f);
                if (alpha >= 0) {
                }
                if (c7 == 0) {
                }
                color = (16777215 & color) | (i5 << 24);
                i9 = i11 + 1;
                if (i9 > iArr3.length) {
                }
                iArr3[i11] = color;
                if (i9 > iArr2.length) {
                }
                iArr2[i11] = iArr;
                iArr2 = iArr2;
                theme2 = theme;
                i11 = i9;
                z7 = c82;
                asAttributeSet = attributeSet;
                depth2 = i7;
                i10 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                theme2 = theme;
                z7 = z7;
                asAttributeSet = asAttributeSet;
                depth2 = depth2;
                i10 = 0;
            }
        }
        int[] iArr7 = new int[i11];
        int[][] iArr8 = new int[i11][];
        System.arraycopy(iArr3, 0, iArr7, 0, i11);
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        return new ColorStateList(iArr8, iArr7);
    }
}
