package h3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3130a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
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
        float f6;
        int attributeCount;
        int i;
        char c8;
        int[] iArr;
        AttributeSet attributeSet;
        int i8;
        int b8;
        float f8;
        int i9;
        float cbrt;
        int i10;
        TypedValue typedValue;
        ?? r02 = resources;
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
        boolean z3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == z3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = e3.a.f2484a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(asAttributeSet, iArr4) : theme2.obtainStyledAttributes(asAttributeSet, iArr4, i11, i11);
                int resourceId = obtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3130a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i11, -65281);
                        }
                        f6 = !obtainAttributes.hasValue(z3) ? obtainAttributes.getFloat(z3, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c9 = z3;
                        float f9 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = asAttributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i11;
                        int i14 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = asAttributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i15 = i14 + 1;
                                if (!asAttributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i14] = attributeNameResource;
                                i14 = i15;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i14);
                        float f10 = 100.0f;
                        c8 = (f9 >= 0.0f || f9 > 100.0f) ? (char) 0 : c9;
                        if (f6 == 1.0f || c8 != 0) {
                            int p7 = h0.a.p((int) ((Color.alpha(color) * f6) + 0.5f), 0, 255);
                            if (c8 == 0) {
                                a a8 = a.a(color);
                                float f11 = a8.f3120a;
                                float f12 = a8.f3121b;
                                l lVar = l.f3153k;
                                if (f12 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
                                    iArr = trimStateSet;
                                    attributeSet = asAttributeSet;
                                    i8 = depth2;
                                    b8 = b.b(f9);
                                } else {
                                    float min = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                                    float f13 = 0.0f;
                                    float f14 = f12;
                                    char c10 = c9;
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
                                                    i8 = depth2;
                                                    f8 = f10;
                                                    break;
                                                }
                                                f8 = f10;
                                                float f19 = ((f16 - f17) / 2.0f) + f17;
                                                iArr = trimStateSet;
                                                int c11 = a.b(f19, f14, min).c(l.f3153k);
                                                float c12 = b.c(Color.red(c11));
                                                float c13 = b.c(Color.green(c11));
                                                float c14 = b.c(Color.blue(c11));
                                                float[] fArr = b.f3129d[c9];
                                                float f20 = ((c14 * fArr[2]) + ((c13 * fArr[c9]) + (c12 * fArr[0]))) / f8;
                                                if (f20 <= 0.008856452f) {
                                                    cbrt = f20 * 903.2963f;
                                                    i9 = c11;
                                                } else {
                                                    i9 = c11;
                                                    cbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f9 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a9 = a.a(i9);
                                                    attributeSet = asAttributeSet;
                                                    a b9 = a.b(a9.f3122c, a9.f3121b, min);
                                                    float f21 = a9.f3123d - b9.f3123d;
                                                    float f22 = a9.f3124e - b9.f3124e;
                                                    float f23 = a9.f3125f - b9.f3125f;
                                                    i8 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f18 = pow;
                                                        f15 = abs;
                                                        aVar2 = a9;
                                                    }
                                                } else {
                                                    attributeSet = asAttributeSet;
                                                    i8 = depth2;
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
                                                depth2 = i8;
                                            }
                                            a aVar3 = aVar2;
                                            if (c10 == 0) {
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
                                                depth2 = i8;
                                            } else {
                                                if (aVar3 != null) {
                                                    b8 = aVar3.c(lVar);
                                                    break;
                                                }
                                                f14 = ((f12 - f13) / 2.0f) + f13;
                                                f10 = f8;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i8;
                                                c10 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            attributeSet = asAttributeSet;
                                            i8 = depth2;
                                            b8 = aVar == null ? b.b(f9) : aVar.c(lVar);
                                        }
                                    }
                                }
                                color = b8;
                            } else {
                                iArr = trimStateSet;
                                attributeSet = asAttributeSet;
                                i8 = depth2;
                            }
                            color = (16777215 & color) | (p7 << 24);
                        } else {
                            iArr = trimStateSet;
                            attributeSet = asAttributeSet;
                            i8 = depth2;
                        }
                        i10 = i12 + 1;
                        if (i10 > iArr3.length) {
                            int[] iArr6 = new int[i12 <= 4 ? 8 : i12 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i12);
                            iArr3 = iArr6;
                        }
                        iArr3[i12] = color;
                        if (i10 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i12);
                            iArr2 = r12;
                        }
                        iArr2[i12] = iArr;
                        iArr2 = iArr2;
                        theme2 = theme;
                        i12 = i10;
                        z3 = c9;
                        asAttributeSet = attributeSet;
                        depth2 = i8;
                        i11 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i11, -65281);
                if (!obtainAttributes.hasValue(z3)) {
                }
                char c92 = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = asAttributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i11;
                int i142 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i142);
                float f102 = 100.0f;
                if (f9 >= 0.0f) {
                }
                if (f6 == 1.0f) {
                }
                int p72 = h0.a.p((int) ((Color.alpha(color) * f6) + 0.5f), 0, 255);
                if (c8 == 0) {
                }
                color = (16777215 & color) | (p72 << 24);
                i10 = i12 + 1;
                if (i10 > iArr3.length) {
                }
                iArr3[i12] = color;
                if (i10 > iArr2.length) {
                }
                iArr2[i12] = iArr;
                iArr2 = iArr2;
                theme2 = theme;
                i12 = i10;
                z3 = c92;
                asAttributeSet = attributeSet;
                depth2 = i8;
                i11 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                theme2 = theme;
                z3 = z3;
                asAttributeSet = asAttributeSet;
                depth2 = depth2;
                i11 = 0;
            }
        }
        int[] iArr7 = new int[i12];
        int[][] iArr8 = new int[i12][];
        System.arraycopy(iArr3, 0, iArr7, 0, i12);
        System.arraycopy(iArr2, 0, iArr8, 0, i12);
        return new ColorStateList(iArr8, iArr7);
    }
}
