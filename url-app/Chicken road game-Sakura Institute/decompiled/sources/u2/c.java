package u2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.android.installreferrer.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8974a = new ThreadLocal();

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
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139  */
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
        float f9;
        int attributeCount;
        int i7;
        char c4;
        int alpha;
        int i8;
        int[] iArr;
        int i9;
        int b9;
        float f10;
        int i10;
        float cbrt;
        int i11;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z8 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = r2.a.f7930a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i12, i12);
                int resourceId = obtainAttributes.getResourceId(i12, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f8974a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z8);
                    int i14 = typedValue.type;
                    if (i14 < 28 || i14 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i12, -65281);
                        }
                        f9 = !obtainAttributes.hasValue(z8) ? obtainAttributes.getFloat(z8, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c6 = z8;
                        float f11 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i7 = i12;
                        int i15 = i7;
                        while (i7 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i7);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i16 = i15 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i7, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i15] = attributeNameResource;
                                i15 = i16;
                            }
                            i7++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i15);
                        float f12 = 100.0f;
                        c4 = (f11 >= 0.0f || f11 > 100.0f) ? (char) 0 : c6;
                        if (f9 == 1.0f || c4 != 0) {
                            alpha = (int) ((Color.alpha(color) * f9) + 0.5f);
                            if (alpha >= 0) {
                                i8 = 0;
                            } else {
                                i8 = 255;
                                if (alpha <= 255) {
                                    i8 = alpha;
                                }
                            }
                            if (c4 == 0) {
                                a a3 = a.a(color);
                                float f13 = a3.f8964a;
                                float f14 = a3.f8965b;
                                e eVar = e.f8975k;
                                if (f14 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i9 = depth2;
                                    b9 = b.b(f11);
                                } else {
                                    float min = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                                    float f15 = 0.0f;
                                    float f16 = f14;
                                    char c9 = c6;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f15 - f14) >= 0.4f) {
                                            float f17 = 1000.0f;
                                            float f18 = f12;
                                            float f19 = 0.0f;
                                            float f20 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f19 - f18) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i9 = depth2;
                                                    f10 = f12;
                                                    break;
                                                }
                                                f10 = f12;
                                                float f21 = ((f18 - f19) / 2.0f) + f19;
                                                iArr = trimStateSet;
                                                int c10 = a.b(f21, f16, min).c(e.f8975k);
                                                float c11 = b.c(Color.red(c10));
                                                float c12 = b.c(Color.green(c10));
                                                float c13 = b.c(Color.blue(c10));
                                                float[] fArr = b.f8973d[c6];
                                                float f22 = ((c13 * fArr[2]) + ((c12 * fArr[c6]) + (c11 * fArr[0]))) / f10;
                                                if (f22 <= 0.008856452f) {
                                                    cbrt = f22 * 903.2963f;
                                                    i10 = c10;
                                                } else {
                                                    i10 = c10;
                                                    cbrt = (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f11 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a9 = a.a(i10);
                                                    a b10 = a.b(a9.f8966c, a9.f8965b, min);
                                                    float f23 = a9.f8967d - b10.f8967d;
                                                    float f24 = a9.f8968e - b10.f8968e;
                                                    float f25 = a9.f8969f - b10.f8969f;
                                                    i9 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f20 = pow;
                                                        f17 = abs;
                                                        aVar2 = a9;
                                                    }
                                                } else {
                                                    i9 = depth2;
                                                }
                                                if (f17 == 0.0f && f20 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f11) {
                                                    f19 = f21;
                                                } else {
                                                    f18 = f21;
                                                }
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i9;
                                            }
                                            a aVar3 = aVar2;
                                            if (c9 == 0) {
                                                if (aVar3 == null) {
                                                    f14 = f16;
                                                } else {
                                                    aVar = aVar3;
                                                    f15 = f16;
                                                }
                                                f16 = ((f14 - f15) / 2.0f) + f15;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i9;
                                            } else {
                                                if (aVar3 != null) {
                                                    b9 = aVar3.c(eVar);
                                                    break;
                                                }
                                                f16 = ((f14 - f15) / 2.0f) + f15;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i9;
                                                c9 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i9 = depth2;
                                            b9 = aVar == null ? b.b(f11) : aVar.c(eVar);
                                        }
                                    }
                                }
                                color = b9;
                            } else {
                                iArr = trimStateSet;
                                i9 = depth2;
                            }
                            color = (16777215 & color) | (i8 << 24);
                        } else {
                            iArr = trimStateSet;
                            i9 = depth2;
                        }
                        i11 = i13 + 1;
                        if (i11 > iArr3.length) {
                            int[] iArr6 = new int[i13 <= 4 ? 8 : i13 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i13);
                            iArr3 = iArr6;
                        }
                        iArr3[i13] = color;
                        if (i11 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i13 > 4 ? i13 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i13);
                            iArr2 = r12;
                        }
                        iArr2[i13] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i13 = i11;
                        z8 = c6;
                        depth2 = i9;
                        i12 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i12, -65281);
                if (!obtainAttributes.hasValue(z8)) {
                }
                char c62 = z8;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i7 = i12;
                int i152 = i7;
                while (i7 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i152);
                float f122 = 100.0f;
                if (f11 >= 0.0f) {
                }
                if (f9 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f9) + 0.5f);
                if (alpha >= 0) {
                }
                if (c4 == 0) {
                }
                color = (16777215 & color) | (i8 << 24);
                i11 = i13 + 1;
                if (i11 > iArr3.length) {
                }
                iArr3[i13] = color;
                if (i11 > iArr2.length) {
                }
                iArr2[i13] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i13 = i11;
                z8 = c62;
                depth2 = i9;
                i12 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z8 = z8;
                depth2 = depth2;
                i12 = 0;
            }
        }
        int[] iArr7 = new int[i13];
        int[][] iArr8 = new int[i13][];
        System.arraycopy(iArr3, 0, iArr7, 0, i13);
        System.arraycopy(iArr2, 0, iArr8, 0, i13);
        return new ColorStateList(iArr8, iArr7);
    }
}
