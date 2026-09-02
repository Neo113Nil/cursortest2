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
import com.oriondriftchasers.arordrft.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1137a = new ThreadLocal();

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
        float f2;
        int attributeCount;
        int i;
        char c4;
        int[] iArr;
        int i4;
        int d;
        float f4;
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
        boolean z3 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z3 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = b0.a.f718a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i7, i7);
                int resourceId = obtainAttributes.getResourceId(i7, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f1137a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i9 = typedValue.type;
                    if (i9 < 28 || i9 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i7, -65281);
                        }
                        f2 = !obtainAttributes.hasValue(z3) ? obtainAttributes.getFloat(z3, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c5 = z3;
                        float f5 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
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
                        float f6 = 100.0f;
                        c4 = (f5 >= 0.0f || f5 > 100.0f) ? (char) 0 : c5;
                        if (f2 == 1.0f || c4 != 0) {
                            int n4 = h.a.n((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                            if (c4 == 0) {
                                a a2 = a.a(color);
                                float f7 = a2.f1126a;
                                float f8 = a2.f1127b;
                                n nVar = n.f1161k;
                                if (f8 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i4 = depth2;
                                    d = b.d(f5);
                                } else {
                                    float min = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
                                    float f9 = 0.0f;
                                    float f10 = f8;
                                    char c6 = c5;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f9 - f8) >= 0.4f) {
                                            float f11 = 1000.0f;
                                            float f12 = f6;
                                            float f13 = 0.0f;
                                            float f14 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f13 - f12) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i4 = depth2;
                                                    f4 = f6;
                                                    break;
                                                }
                                                f4 = f6;
                                                float f15 = ((f12 - f13) / 2.0f) + f13;
                                                iArr = trimStateSet;
                                                int c7 = a.b(f15, f10, min).c(n.f1161k);
                                                float e4 = b.e(Color.red(c7));
                                                float e5 = b.e(Color.green(c7));
                                                float e6 = b.e(Color.blue(c7));
                                                float[] fArr = b.d[c5];
                                                float f16 = ((e6 * fArr[2]) + ((e5 * fArr[c5]) + (e4 * fArr[0]))) / f4;
                                                if (f16 <= 0.008856452f) {
                                                    cbrt = f16 * 903.2963f;
                                                    i5 = c7;
                                                } else {
                                                    i5 = c7;
                                                    cbrt = (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f5 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a4 = a.a(i5);
                                                    a b4 = a.b(a4.f1128c, a4.f1127b, min);
                                                    float f17 = a4.d - b4.d;
                                                    float f18 = a4.f1129e - b4.f1129e;
                                                    float f19 = a4.f1130f - b4.f1130f;
                                                    i4 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f14 = pow;
                                                        f11 = abs;
                                                        aVar2 = a4;
                                                    }
                                                } else {
                                                    i4 = depth2;
                                                }
                                                if (f11 == 0.0f && f14 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f5) {
                                                    f13 = f15;
                                                } else {
                                                    f12 = f15;
                                                }
                                                f6 = f4;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                            }
                                            a aVar3 = aVar2;
                                            if (c6 == 0) {
                                                if (aVar3 == null) {
                                                    f8 = f10;
                                                } else {
                                                    aVar = aVar3;
                                                    f9 = f10;
                                                }
                                                f10 = ((f8 - f9) / 2.0f) + f9;
                                                f6 = f4;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(nVar);
                                                    break;
                                                }
                                                f10 = ((f8 - f9) / 2.0f) + f9;
                                                f6 = f4;
                                                trimStateSet = iArr;
                                                depth2 = i4;
                                                c6 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i4 = depth2;
                                            d = aVar == null ? b.d(f5) : aVar.c(nVar);
                                        }
                                    }
                                }
                                color = d;
                            } else {
                                iArr = trimStateSet;
                                i4 = depth2;
                            }
                            color = (16777215 & color) | (n4 << 24);
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
                        z3 = c5;
                        depth2 = i4;
                        i7 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i7, -65281);
                if (!obtainAttributes.hasValue(z3)) {
                }
                char c52 = z3;
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
                float f62 = 100.0f;
                if (f5 >= 0.0f) {
                }
                if (f2 == 1.0f) {
                }
                int n42 = h.a.n((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                if (c4 == 0) {
                }
                color = (16777215 & color) | (n42 << 24);
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
                z3 = c52;
                depth2 = i4;
                i7 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z3 = z3;
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
