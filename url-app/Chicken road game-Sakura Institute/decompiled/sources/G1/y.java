package G1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f3164a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3165b;

    public /* synthetic */ y(int i2, Object obj) {
        this.f3165b = obj;
        this.f3164a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y c(Resources resources, int i2, Resources.Theme theme) {
        int next;
        int i4;
        int color;
        float f4;
        float f5;
        float f6;
        float f7;
        Object radialGradient;
        int i5;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new y(U0.c.b(resources, xml, asAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = R0.a.f3943b;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f8 = !U0.b.a(xml, "startX") ? 0.0f : obtainAttributes.getFloat(8, 0.0f);
        float f9 = !U0.b.a(xml, "startY") ? 0.0f : obtainAttributes.getFloat(9, 0.0f);
        float f10 = !U0.b.a(xml, "endX") ? 0.0f : obtainAttributes.getFloat(10, 0.0f);
        float f11 = !U0.b.a(xml, "endY") ? 0.0f : obtainAttributes.getFloat(11, 0.0f);
        float f12 = !U0.b.a(xml, "centerX") ? 0.0f : obtainAttributes.getFloat(3, 0.0f);
        float f13 = !U0.b.a(xml, "centerY") ? 0.0f : obtainAttributes.getFloat(4, 0.0f);
        int i6 = !U0.b.a(xml, "type") ? 0 : obtainAttributes.getInt(2, 0);
        int color2 = !U0.b.a(xml, "startColor") ? 0 : obtainAttributes.getColor(0, 0);
        boolean a4 = U0.b.a(xml, "centerColor");
        int color3 = !U0.b.a(xml, "centerColor") ? 0 : obtainAttributes.getColor(7, 0);
        if (U0.b.a(xml, "endColor")) {
            i4 = 0;
            color = obtainAttributes.getColor(1, 0);
        } else {
            i4 = 0;
            color = 0;
        }
        if (U0.b.a(xml, "tileMode")) {
            i4 = obtainAttributes.getInt(6, i4);
        }
        if (U0.b.a(xml, "gradientRadius")) {
            f4 = f13;
            f5 = obtainAttributes.getFloat(5, 0.0f);
        } else {
            f4 = f13;
            f5 = 0.0f;
        }
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        float f14 = f5;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f12;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f6 = f11;
            if (next2 == 1) {
                f7 = f10;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f10;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = R0.a.f3944c;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i5 = 0;
                } else {
                    i5 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i5);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = obtainStyledAttributes.getColor(0, 0);
                float f16 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f16));
            }
            f11 = f6;
            f10 = f7;
        }
        U0.e eVar = arrayList2.size() > 0 ? new U0.e(arrayList2, arrayList) : null;
        if (eVar == null) {
            eVar = a4 ? new U0.e(color2, color3, color) : new U0.e(color2, color);
        }
        if (i6 == 1) {
            float f17 = f4;
            if (f14 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f15, f17, f14, eVar.f4094b, eVar.f4093a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != 2) {
            radialGradient = new LinearGradient(f8, f9, f7, f6, eVar.f4094b, eVar.f4093a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f15, f4, eVar.f4094b, eVar.f4093a);
        }
        return new y(0, radialGradient);
    }

    public void a(long j4) {
        if (b(j4)) {
            return;
        }
        int i2 = this.f3164a;
        long[] jArr = (long[]) this.f3165b;
        if (i2 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i2 + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f3165b = copyOf;
        }
        ((long[]) this.f3165b)[i2] = j4;
        if (i2 >= this.f3164a) {
            this.f3164a = i2 + 1;
        }
    }

    public boolean b(long j4) {
        int i2 = this.f3164a;
        for (int i4 = 0; i4 < i2; i4++) {
            if (((long[]) this.f3165b)[i4] == j4) {
                return true;
            }
        }
        return false;
    }

    public void d(int i2, String str, String str2) {
        if (AbstractC0784j.d(i2) >= AbstractC0784j.d(this.f3164a)) {
            HashSet hashSet = (HashSet) this.f3165b;
            if (hashSet == null || AbstractC0784j.d(i2) > 0 || hashSet.contains(str)) {
                int d4 = AbstractC0784j.d(i2);
                if (d4 == 0) {
                    Log.d(str, str2);
                    return;
                }
                if (d4 == 1) {
                    Log.i(str, str2);
                } else if (d4 == 2) {
                    Log.w(str, str2);
                } else {
                    if (d4 != 3) {
                        throw new RuntimeException("Should not reach here!");
                    }
                    Log.e(str, str2);
                }
            }
        }
    }

    public void e(int i2) {
        int i4 = this.f3164a;
        if (i2 < i4) {
            int i5 = i4 - 1;
            while (i2 < i5) {
                long[] jArr = (long[]) this.f3165b;
                int i6 = i2 + 1;
                jArr[i2] = jArr[i6];
                i2 = i6;
            }
            this.f3164a--;
        }
    }

    public y(E1.b bVar, int i2) {
        H1.o.d(bVar);
        this.f3165b = bVar;
        this.f3164a = i2;
    }

    public y(int i2, Y0.c[] cVarArr) {
        this.f3164a = i2;
        this.f3165b = cVarArr;
    }
}
