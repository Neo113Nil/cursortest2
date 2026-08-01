package B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0318a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f31a = new ThreadLocal();

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
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
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
        float f2;
        int attributeCount;
        int i;
        boolean z2;
        int[] iArr;
        int i2;
        boolean z3;
        int d;
        float f3;
        float f4;
        float f5;
        float cbrt;
        float f6;
        int i3;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC0318a.f4159a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i4, i4);
                int resourceId = obtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f31a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i4, -65281);
                        }
                        f2 = !obtainAttributes.hasValue(z4) ? obtainAttributes.getFloat(z4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f7 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i7 = i4;
                        for (i = i7; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i8 = i7 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i7] = attributeNameResource;
                                i7 = i8;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i7);
                        float f8 = RecyclerView.f1559A0;
                        float f9 = 100.0f;
                        z2 = f7 < RecyclerView.f1559A0 && f7 <= 100.0f;
                        if (f2 == 1.0f || z2) {
                            int f10 = z1.l.f((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                            if (z2) {
                                iArr = trimStateSet;
                                i2 = depth2;
                                z3 = true;
                            } else {
                                a a2 = a.a(color);
                                s sVar = s.f61k;
                                float f11 = a2.f21b;
                                if (f11 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                    z3 = true;
                                    d = b.d(f7);
                                } else {
                                    float f12 = a2.f20a;
                                    float min = f12 < RecyclerView.f1559A0 ? 0.0f : Math.min(360.0f, f12);
                                    float f13 = 0.0f;
                                    float f14 = f11;
                                    a aVar = null;
                                    boolean z5 = true;
                                    while (true) {
                                        if (Math.abs(f13 - f11) >= 0.4f) {
                                            float f15 = 1000.0f;
                                            float f16 = f8;
                                            float f17 = f9;
                                            float f18 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f16 - f17) <= 0.01f) {
                                                    i2 = depth2;
                                                    f3 = min;
                                                    f4 = f9;
                                                    z3 = true;
                                                    float f19 = f8;
                                                    iArr = trimStateSet;
                                                    f5 = f19;
                                                    break;
                                                }
                                                float f20 = ((f17 - f16) / 2.0f) + f16;
                                                int c2 = a.b(f20, f14, min).c(s.f61k);
                                                float e2 = b.e(Color.red(c2));
                                                float e3 = b.e(Color.green(c2));
                                                float e4 = b.e(Color.blue(c2));
                                                z3 = true;
                                                float[] fArr = b.d[1];
                                                f4 = 100.0f;
                                                float f21 = ((e4 * fArr[2]) + ((e3 * fArr[1]) + (e2 * fArr[0]))) / 100.0f;
                                                if (f21 <= 0.008856452f) {
                                                    cbrt = f21 * 903.2963f;
                                                    i2 = depth2;
                                                } else {
                                                    i2 = depth2;
                                                    cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f7 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a3 = a.a(c2);
                                                    a b2 = a.b(a3.f22c, a3.f21b, min);
                                                    f6 = f20;
                                                    float f22 = a3.d - b2.d;
                                                    f3 = min;
                                                    float f23 = a3.f23e - b2.f23e;
                                                    float f24 = a3.f24f - b2.f24f;
                                                    double sqrt = Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f18 = pow;
                                                        aVar2 = a3;
                                                        f15 = abs;
                                                    }
                                                } else {
                                                    f6 = f20;
                                                    f3 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f5 = RecyclerView.f1559A0;
                                                if (f15 == RecyclerView.f1559A0 && f18 == RecyclerView.f1559A0) {
                                                    break;
                                                }
                                                if (cbrt < f7) {
                                                    f16 = f6;
                                                } else {
                                                    f17 = f6;
                                                }
                                                f9 = 100.0f;
                                                depth2 = i2;
                                                min = f3;
                                                int[] iArr6 = iArr;
                                                f8 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z5) {
                                                if (aVar3 == null) {
                                                    f11 = f14;
                                                } else {
                                                    aVar = aVar3;
                                                    f13 = f14;
                                                }
                                                f14 = ((f11 - f13) / 2.0f) + f13;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                            } else {
                                                if (aVar3 != null) {
                                                    d = aVar3.c(sVar);
                                                    break;
                                                }
                                                f14 = ((f11 - f13) / 2.0f) + f13;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                                z5 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f8 = f5;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            z3 = true;
                                            d = aVar == null ? b.d(f7) : aVar.c(sVar);
                                        }
                                    }
                                }
                                color = d;
                            }
                            color = (16777215 & color) | (f10 << 24);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                            z3 = true;
                        }
                        i3 = i5 + 1;
                        if (i3 > iArr3.length) {
                            int[] iArr8 = new int[i5 <= 4 ? 8 : i5 * 2];
                            System.arraycopy(iArr3, 0, iArr8, 0, i5);
                            iArr3 = iArr8;
                        }
                        iArr3[i5] = color;
                        if (i3 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i5);
                            iArr2 = r12;
                        }
                        iArr2[i5] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i5 = i3;
                        z4 = z3;
                        depth2 = i2;
                        i4 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i4, -65281);
                if (!obtainAttributes.hasValue(z4)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i72 = i4;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i72);
                float f82 = RecyclerView.f1559A0;
                float f92 = 100.0f;
                if (f7 < RecyclerView.f1559A0) {
                }
                if (f2 == 1.0f) {
                }
                int f102 = z1.l.f((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                if (z2) {
                }
                color = (16777215 & color) | (f102 << 24);
                i3 = i5 + 1;
                if (i3 > iArr3.length) {
                }
                iArr3[i5] = color;
                if (i3 > iArr2.length) {
                }
                iArr2[i5] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i5 = i3;
                z4 = z3;
                depth2 = i2;
                i4 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z4 = z4;
                depth2 = depth2;
                i4 = 0;
            }
        }
        int[] iArr9 = new int[i5];
        int[][] iArr10 = new int[i5][];
        System.arraycopy(iArr3, 0, iArr9, 0, i5);
        System.arraycopy(iArr2, 0, iArr10, 0, i5);
        return new ColorStateList(iArr10, iArr9);
    }
}
