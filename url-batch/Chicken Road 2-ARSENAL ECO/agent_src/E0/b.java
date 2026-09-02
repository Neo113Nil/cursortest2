package E0;

import N.p;
import android.content.Context;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f588a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.a f589b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.a f590c;

    /* renamed from: d, reason: collision with root package name */
    public final String f591d;

    public b(Context context, M0.a aVar, M0.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f588a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f589b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f590c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f591d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f588a.equals(((b) cVar).f588a)) {
                b bVar = (b) cVar;
                if (this.f589b.equals(bVar.f589b) && this.f590c.equals(bVar.f590c) && this.f591d.equals(bVar.f591d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f588a.hashCode() ^ 1000003) * 1000003) ^ this.f589b.hashCode()) * 1000003) ^ this.f590c.hashCode()) * 1000003) ^ this.f591d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f588a);
        sb.append(", wallClock=");
        sb.append(this.f589b);
        sb.append(", monotonicClock=");
        sb.append(this.f590c);
        sb.append(", backendName=");
        return p.b(sb, this.f591d, "}");
    }
}
