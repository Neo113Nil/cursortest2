package g1;

import a0.m;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import b6.c;
import l.i;
import org.xmlpull.v1.XmlPullParser;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f3989a;

    /* renamed from: b, reason: collision with root package name */
    public int f3990b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final c f3991c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f3989a = xmlResourceParser;
        c cVar = new c(10, false);
        cVar.f1394g = new float[64];
        this.f3991c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i a(TypedArray typedArray, Resources.Theme theme, String str, int i7) {
        i iVar;
        if (u2.b.a(this.f3989a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i8 = typedValue.type;
            if (i8 < 28 || i8 > 31) {
                try {
                    iVar = i.d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
                } catch (Exception e9) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e9);
                    iVar = null;
                }
            } else {
                iVar = new i(typedValue.data, 6, null);
            }
            c(typedArray.getChangingConfigurations());
            return iVar;
        }
        iVar = new i(0, 6, null);
        c(typedArray.getChangingConfigurations());
        return iVar;
    }

    public final float b(TypedArray typedArray, String str, int i7, float f9) {
        if (u2.b.a(this.f3989a, str)) {
            f9 = typedArray.getFloat(i7, f9);
        }
        c(typedArray.getChangingConfigurations());
        return f9;
    }

    public final void c(int i7) {
        this.f3990b = i7 | this.f3990b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f3989a, aVar.f3989a) && this.f3990b == aVar.f3990b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3990b) + (this.f3989a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f3989a);
        sb.append(", config=");
        return m.l(sb, this.f3990b, ')');
    }
}
