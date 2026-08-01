package l6;

import a2.r;
import android.content.Context;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5882a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f5883b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f5884c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5885d;

    public b(Context context, c0 c0Var, c0 c0Var2, String str) {
        if (context == null) {
            r.j("Null applicationContext");
            throw null;
        }
        this.f5882a = context;
        if (c0Var == null) {
            r.j("Null wallClock");
            throw null;
        }
        this.f5883b = c0Var;
        if (c0Var2 == null) {
            r.j("Null monotonicClock");
            throw null;
        }
        this.f5884c = c0Var2;
        if (str != null) {
            this.f5885d = str;
        } else {
            r.j("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f5882a.equals(bVar.f5882a) && this.f5883b.equals(bVar.f5883b) && this.f5884c.equals(bVar.f5884c) && this.f5885d.equals(bVar.f5885d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f5882a.hashCode() ^ 1000003) * 1000003) ^ this.f5883b.hashCode()) * 1000003) ^ this.f5884c.hashCode()) * 1000003) ^ this.f5885d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f5882a);
        sb2.append(", wallClock=");
        sb2.append(this.f5883b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f5884c);
        sb2.append(", backendName=");
        return v4.a.o(sb2, this.f5885d, "}");
    }
}
