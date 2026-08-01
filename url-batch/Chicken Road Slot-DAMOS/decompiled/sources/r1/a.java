package r1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.bf;
import kotlin.jvm.internal.Intrinsics;
import l.d;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f8137a;

    /* renamed from: b, reason: collision with root package name */
    public int f8138b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final d f8139c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f8137a = xmlResourceParser;
        d dVar = new d(17, false);
        dVar.f5643e = new float[64];
        this.f8139c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bf a(TypedArray typedArray, Resources.Theme theme, String str, int i3) {
        bf bfVar;
        if (g3.b.a(this.f8137a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i10 = typedValue.type;
            if (i10 < 28 || i10 > 31) {
                try {
                    bfVar = bf.c(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
                } catch (Exception e2) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                    bfVar = null;
                }
            } else {
                bfVar = new bf(typedValue.data, null);
            }
            c(typedArray.getChangingConfigurations());
            return bfVar;
        }
        bfVar = new bf(0, null);
        c(typedArray.getChangingConfigurations());
        return bfVar;
    }

    public final float b(TypedArray typedArray, String str, int i3, float f3) {
        if (g3.b.a(this.f8137a, str)) {
            f3 = typedArray.getFloat(i3, f3);
        }
        c(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void c(int i3) {
        this.f8138b = i3 | this.f8138b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f8137a, aVar.f8137a) && this.f8138b == aVar.f8138b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8138b) + (this.f8137a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f8137a);
        sb2.append(", config=");
        return v4.a.m(sb2, this.f8138b, ')');
    }
}
