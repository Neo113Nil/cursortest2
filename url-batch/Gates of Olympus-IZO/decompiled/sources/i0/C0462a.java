package i0;

import A2.g;
import E2.n;
import H2.AbstractC0080b;
import Z1.i;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f5097a;

    /* renamed from: b, reason: collision with root package name */
    public int f5098b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final g f5099c;

    public C0462a(XmlResourceParser xmlResourceParser) {
        this.f5097a = xmlResourceParser;
        g gVar = new g(23, false);
        gVar.f83b = new float[64];
        this.f5099c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(TypedArray typedArray, Resources.Theme theme, String str, int i3) {
        n nVar;
        if (U0.b.a(this.f5097a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i4 = typedValue.type;
            if (i4 < 28 || i4 > 31) {
                try {
                    nVar = n.c(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
                } catch (Exception e3) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                    nVar = null;
                }
            } else {
                nVar = new n((Object) null, typedValue.data, 2);
            }
            c(typedArray.getChangingConfigurations());
            return nVar;
        }
        nVar = new n((Object) null, 0, 2);
        c(typedArray.getChangingConfigurations());
        return nVar;
    }

    public final float b(TypedArray typedArray, String str, int i3, float f3) {
        if (U0.b.a(this.f5097a, str)) {
            f3 = typedArray.getFloat(i3, f3);
        }
        c(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void c(int i3) {
        this.f5098b = i3 | this.f5098b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0462a)) {
            return false;
        }
        C0462a c0462a = (C0462a) obj;
        return i.a(this.f5097a, c0462a.f5097a) && this.f5098b == c0462a.f5098b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5098b) + (this.f5097a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f5097a);
        sb.append(", config=");
        return AbstractC0080b.k(sb, this.f5098b, ')');
    }
}
