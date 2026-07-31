package K2;

import a1.C0243b;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import m.C0628m;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3329a;

    /* renamed from: b, reason: collision with root package name */
    public int f3330b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3331c;

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r4.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(Resources resources, int i3, Resources.Theme theme) {
        int next;
        int i4;
        int color;
        float f3;
        float f4;
        float f5;
        float f6;
        Object radialGradient;
        int i5;
        TypedArray obtainStyledAttributes;
        int i6 = 2;
        XmlResourceParser xml = resources.getXml(i3);
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
                return new m(W0.c.b(resources, xml, asAttributeSet, theme).getDefaultColor(), i6, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = T0.a.f4336b;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f7 = !W0.b.a(xml, "startX") ? 0.0f : obtainAttributes.getFloat(8, 0.0f);
        float f8 = !W0.b.a(xml, "startY") ? 0.0f : obtainAttributes.getFloat(9, 0.0f);
        float f9 = !W0.b.a(xml, "endX") ? 0.0f : obtainAttributes.getFloat(10, 0.0f);
        float f10 = !W0.b.a(xml, "endY") ? 0.0f : obtainAttributes.getFloat(11, 0.0f);
        float f11 = !W0.b.a(xml, "centerX") ? 0.0f : obtainAttributes.getFloat(3, 0.0f);
        float f12 = !W0.b.a(xml, "centerY") ? 0.0f : obtainAttributes.getFloat(4, 0.0f);
        int i7 = !W0.b.a(xml, "type") ? 0 : obtainAttributes.getInt(2, 0);
        int color2 = !W0.b.a(xml, "startColor") ? 0 : obtainAttributes.getColor(0, 0);
        boolean a3 = W0.b.a(xml, "centerColor");
        int color3 = !W0.b.a(xml, "centerColor") ? 0 : obtainAttributes.getColor(7, 0);
        if (W0.b.a(xml, "endColor")) {
            i4 = 0;
            color = obtainAttributes.getColor(1, 0);
        } else {
            i4 = 0;
            color = 0;
        }
        if (W0.b.a(xml, "tileMode")) {
            i4 = obtainAttributes.getInt(6, i4);
        }
        if (W0.b.a(xml, "gradientRadius")) {
            f3 = f12;
            f4 = obtainAttributes.getFloat(5, 0.0f);
        } else {
            f3 = f12;
            f4 = 0.0f;
        }
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        float f13 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f14 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = T0.a.f4337c;
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
                float f15 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f15));
            }
            f10 = f5;
            f9 = f6;
        }
        W0.e eVar = arrayList2.size() > 0 ? new W0.e(arrayList2, arrayList) : null;
        if (eVar == null) {
            eVar = a3 ? new W0.e(color2, color3, color) : new W0.e(color2, color);
        }
        if (i7 == 1) {
            float f16 = f3;
            if (f13 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f14, f16, f13, eVar.f4596b, eVar.f4595a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i7 != 2) {
            radialGradient = new LinearGradient(f7, f8, f6, f5, eVar.f4596b, eVar.f4595a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f14, f3, eVar.f4596b, eVar.f4595a);
        }
        return new m(0, 2, radialGradient);
    }

    public void a(long j3) {
        if (b(j3)) {
            return;
        }
        int i3 = this.f3330b;
        long[] jArr = (long[]) this.f3331c;
        if (i3 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i3 + 1, jArr.length * 2));
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f3331c = copyOf;
        }
        ((long[]) this.f3331c)[i3] = j3;
        if (i3 >= this.f3330b) {
            this.f3330b = i3 + 1;
        }
    }

    public boolean b(long j3) {
        int i3 = this.f3330b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((long[]) this.f3331c)[i4] == j3) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f3330b < ((ArrayList) this.f3331c).size();
    }

    public void e(int i3) {
        int i4 = this.f3330b;
        if (i3 < i4) {
            int i5 = i4 - 1;
            while (i3 < i5) {
                long[] jArr = (long[]) this.f3331c;
                int i6 = i3 + 1;
                jArr[i3] = jArr[i6];
                i3 = i6;
            }
            this.f3330b--;
        }
    }

    public String toString() {
        switch (this.f3329a) {
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i3 = this.f3330b;
                sb.append(i3 != 1 ? i3 != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((C0628m) this.f3331c);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i3, int i4, Object obj) {
        this.f3329a = i4;
        this.f3331c = obj;
        this.f3330b = i3;
    }

    public m(ArrayList arrayList) {
        this.f3329a = 0;
        this.f3331c = arrayList;
    }

    public m(int i3, C0243b[] c0243bArr) {
        this.f3329a = 3;
        this.f3330b = i3;
        this.f3331c = c0243bArr;
    }
}
