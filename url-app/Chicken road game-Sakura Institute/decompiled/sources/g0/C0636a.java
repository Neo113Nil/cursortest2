package g0;

import A.AbstractC0017m;
import G1.y;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f6669a;

    /* renamed from: b, reason: collision with root package name */
    public int f6670b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final C1294c f6671c;

    public C0636a(XmlResourceParser xmlResourceParser) {
        this.f6669a = xmlResourceParser;
        C1294c c1294c = new C1294c();
        c1294c.f11388d = new float[64];
        this.f6671c = c1294c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(TypedArray typedArray, Resources.Theme theme, String str, int i2) {
        y yVar;
        if (U0.b.a(this.f6669a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 < 28 || i4 > 31) {
                try {
                    yVar = y.c(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
                } catch (Exception e4) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                    yVar = null;
                }
            } else {
                yVar = new y(typedValue.data, (Object) null);
            }
            c(typedArray.getChangingConfigurations());
            return yVar;
        }
        yVar = new y(0, (Object) null);
        c(typedArray.getChangingConfigurations());
        return yVar;
    }

    public final float b(TypedArray typedArray, String str, int i2, float f4) {
        if (U0.b.a(this.f6669a, str)) {
            f4 = typedArray.getFloat(i2, f4);
        }
        c(typedArray.getChangingConfigurations());
        return f4;
    }

    public final void c(int i2) {
        this.f6670b = i2 | this.f6670b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0636a)) {
            return false;
        }
        C0636a c0636a = (C0636a) obj;
        return Intrinsics.a(this.f6669a, c0636a.f6669a) && this.f6670b == c0636a.f6670b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6670b) + (this.f6669a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f6669a);
        sb.append(", config=");
        return AbstractC0017m.l(sb, this.f6670b, ')');
    }
}
