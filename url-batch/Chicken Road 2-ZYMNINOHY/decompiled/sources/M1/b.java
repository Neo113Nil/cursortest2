package M1;

import E.AbstractC0005f;
import a2.i;
import android.content.Context;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1739a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1740b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1741c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1742d;

    public b(Context context, i iVar, i iVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f1739a = context;
        if (iVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f1740b = iVar;
        if (iVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f1741c = iVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1742d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1739a.equals(((b) cVar).f1739a)) {
                b bVar = (b) cVar;
                if (this.f1740b.equals(bVar.f1740b) && this.f1741c.equals(bVar.f1741c) && this.f1742d.equals(bVar.f1742d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1739a.hashCode() ^ 1000003) * 1000003) ^ this.f1740b.hashCode()) * 1000003) ^ this.f1741c.hashCode()) * 1000003) ^ this.f1742d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1739a);
        sb.append(", wallClock=");
        sb.append(this.f1740b);
        sb.append(", monotonicClock=");
        sb.append(this.f1741c);
        sb.append(", backendName=");
        return AbstractC0005f.q(sb, this.f1742d, "}");
    }
}
