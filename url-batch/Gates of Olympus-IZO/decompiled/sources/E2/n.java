package E2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import h1.C0438i;
import java.util.ArrayList;
import java.util.Arrays;
import m.C0603m;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f842a;

    /* renamed from: b, reason: collision with root package name */
    public int f843b;

    /* renamed from: c, reason: collision with root package name */
    public Object f844c;

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r4.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n c(Resources resources, int i3, Resources.Theme theme) {
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
                return new n(obj, U0.c.b(resources, xml, asAttributeSet, theme).getDefaultColor(), i6);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = R0.a.f3166b;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f7 = !U0.b.a(xml, "startX") ? 0.0f : obtainAttributes.getFloat(8, 0.0f);
        float f8 = !U0.b.a(xml, "startY") ? 0.0f : obtainAttributes.getFloat(9, 0.0f);
        float f9 = !U0.b.a(xml, "endX") ? 0.0f : obtainAttributes.getFloat(10, 0.0f);
        float f10 = !U0.b.a(xml, "endY") ? 0.0f : obtainAttributes.getFloat(11, 0.0f);
        float f11 = !U0.b.a(xml, "centerX") ? 0.0f : obtainAttributes.getFloat(3, 0.0f);
        float f12 = !U0.b.a(xml, "centerY") ? 0.0f : obtainAttributes.getFloat(4, 0.0f);
        int i7 = !U0.b.a(xml, "type") ? 0 : obtainAttributes.getInt(2, 0);
        int color2 = !U0.b.a(xml, "startColor") ? 0 : obtainAttributes.getColor(0, 0);
        boolean a3 = U0.b.a(xml, "centerColor");
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
                int[] iArr2 = R0.a.f3167c;
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
        U0.e eVar = arrayList2.size() > 0 ? new U0.e(arrayList2, arrayList) : null;
        if (eVar == null) {
            eVar = a3 ? new U0.e(color2, color3, color) : new U0.e(color2, color);
        }
        if (i7 == 1) {
            float f16 = f3;
            if (f13 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f14, f16, f13, eVar.f3328b, eVar.f3327a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i7 != 2) {
            radialGradient = new LinearGradient(f7, f8, f6, f5, eVar.f3328b, eVar.f3327a, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f14, f3, eVar.f3328b, eVar.f3327a);
        }
        return new n(radialGradient, 0, 2);
    }

    public void a(long j3) {
        if (b(j3)) {
            return;
        }
        int i3 = this.f843b;
        long[] jArr = (long[]) this.f844c;
        if (i3 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i3 + 1, jArr.length * 2));
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f844c = copyOf;
        }
        ((long[]) this.f844c)[i3] = j3;
        if (i3 >= this.f843b) {
            this.f843b = i3 + 1;
        }
    }

    public boolean b(long j3) {
        int i3 = this.f843b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((long[]) this.f844c)[i4] == j3) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f843b < ((ArrayList) this.f844c).size();
    }

    public void e(int i3) {
        int i4 = this.f843b;
        if (i3 < i4) {
            int i5 = i4 - 1;
            while (i3 < i5) {
                long[] jArr = (long[]) this.f844c;
                int i6 = i3 + 1;
                jArr[i3] = jArr[i6];
                i3 = i6;
            }
            this.f843b--;
        }
    }

    public String toString() {
        switch (this.f842a) {
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i3 = this.f843b;
                sb.append(i3 != 1 ? i3 != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((C0603m) this.f844c);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(int i3, Object obj, int i4) {
        this.f842a = i4;
        this.f843b = i3;
        this.f844c = obj;
    }

    public /* synthetic */ n(Object obj, int i3, int i4) {
        this.f842a = i4;
        this.f844c = obj;
        this.f843b = i3;
    }

    public n(ArrayList arrayList) {
        this.f842a = 0;
        this.f844c = arrayList;
    }
}
