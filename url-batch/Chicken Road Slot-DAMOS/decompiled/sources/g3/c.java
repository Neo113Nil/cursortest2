package g3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.appsflyer.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4240a = new ThreadLocal();

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
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
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
        float f3;
        int attributeCount;
        int i3;
        char c10;
        int alpha;
        int i10;
        int[] iArr;
        int i11;
        int b10;
        float f10;
        int i12;
        float cbrt;
        int i13;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = d3.a.f3610a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i14, i14);
                int resourceId = obtainAttributes.getResourceId(i14, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f4240a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z10);
                    int i16 = typedValue.type;
                    if (i16 < 28 || i16 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i14, -65281);
                        }
                        f3 = !obtainAttributes.hasValue(z10) ? obtainAttributes.getFloat(z10, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c11 = z10;
                        float f11 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i3 = i14;
                        int i17 = i3;
                        while (i3 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i18 = i17 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i17] = attributeNameResource;
                                i17 = i18;
                            }
                            i3++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i17);
                        float f12 = 100.0f;
                        c10 = (f11 >= 0.0f || f11 > 100.0f) ? (char) 0 : c11;
                        if (f3 == 1.0f || c10 != 0) {
                            alpha = (int) ((Color.alpha(color) * f3) + 0.5f);
                            if (alpha >= 0) {
                                i10 = 0;
                            } else {
                                i10 = 255;
                                if (alpha <= 255) {
                                    i10 = alpha;
                                }
                            }
                            if (c10 == 0) {
                                a a9 = a.a(color);
                                float f13 = a9.f4230a;
                                float f14 = a9.f4231b;
                                l lVar = l.f4262k;
                                if (f14 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i11 = depth2;
                                    b10 = b.b(f11);
                                } else {
                                    float min = f13 < 0.0f ? 0.0f : Math.min(360.0f, f13);
                                    float f15 = 0.0f;
                                    float f16 = f14;
                                    char c12 = c11;
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
                                                    i11 = depth2;
                                                    f10 = f12;
                                                    break;
                                                }
                                                f10 = f12;
                                                float f21 = ((f18 - f19) / 2.0f) + f19;
                                                iArr = trimStateSet;
                                                int c13 = a.b(f21, f16, min).c(l.f4262k);
                                                float c14 = b.c(Color.red(c13));
                                                float c15 = b.c(Color.green(c13));
                                                float c16 = b.c(Color.blue(c13));
                                                float[] fArr = b.f4239d[c11];
                                                float f22 = ((c16 * fArr[2]) + ((c15 * fArr[c11]) + (c14 * fArr[0]))) / f10;
                                                if (f22 <= 0.008856452f) {
                                                    cbrt = f22 * 903.2963f;
                                                    i12 = c13;
                                                } else {
                                                    i12 = c13;
                                                    cbrt = (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f11 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(i12);
                                                    a b11 = a.b(a10.f4232c, a10.f4231b, min);
                                                    float f23 = a10.f4233d - b11.f4233d;
                                                    float f24 = a10.f4234e - b11.f4234e;
                                                    float f25 = a10.f4235f - b11.f4235f;
                                                    i11 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f20 = pow;
                                                        f17 = abs;
                                                        aVar2 = a10;
                                                    }
                                                } else {
                                                    i11 = depth2;
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
                                                depth2 = i11;
                                            }
                                            a aVar3 = aVar2;
                                            if (c12 == 0) {
                                                if (aVar3 == null) {
                                                    f14 = f16;
                                                } else {
                                                    aVar = aVar3;
                                                    f15 = f16;
                                                }
                                                f16 = ((f14 - f15) / 2.0f) + f15;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                            } else {
                                                if (aVar3 != null) {
                                                    b10 = aVar3.c(lVar);
                                                    break;
                                                }
                                                f16 = ((f14 - f15) / 2.0f) + f15;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i11;
                                                c12 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i11 = depth2;
                                            b10 = aVar == null ? b.b(f11) : aVar.c(lVar);
                                        }
                                    }
                                }
                                color = b10;
                            } else {
                                iArr = trimStateSet;
                                i11 = depth2;
                            }
                            color = (16777215 & color) | (i10 << 24);
                        } else {
                            iArr = trimStateSet;
                            i11 = depth2;
                        }
                        i13 = i15 + 1;
                        if (i13 > iArr3.length) {
                            int[] iArr6 = new int[i15 <= 4 ? 8 : i15 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i15);
                            iArr3 = iArr6;
                        }
                        iArr3[i15] = color;
                        if (i13 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i15 > 4 ? i15 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i15);
                            iArr2 = r12;
                        }
                        iArr2[i15] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i15 = i13;
                        z10 = c11;
                        depth2 = i11;
                        i14 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i14, -65281);
                if (!obtainAttributes.hasValue(z10)) {
                }
                char c112 = z10;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i3 = i14;
                int i172 = i3;
                while (i3 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i172);
                float f122 = 100.0f;
                if (f11 >= 0.0f) {
                }
                if (f3 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f3) + 0.5f);
                if (alpha >= 0) {
                }
                if (c10 == 0) {
                }
                color = (16777215 & color) | (i10 << 24);
                i13 = i15 + 1;
                if (i13 > iArr3.length) {
                }
                iArr3[i15] = color;
                if (i13 > iArr2.length) {
                }
                iArr2[i15] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i15 = i13;
                z10 = c112;
                depth2 = i11;
                i14 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z10 = z10;
                depth2 = depth2;
                i14 = 0;
            }
        }
        int[] iArr7 = new int[i15];
        int[][] iArr8 = new int[i15][];
        System.arraycopy(iArr3, 0, iArr7, 0, i15);
        System.arraycopy(iArr2, 0, iArr8, 0, i15);
        return new ColorStateList(iArr8, iArr7);
    }
}
