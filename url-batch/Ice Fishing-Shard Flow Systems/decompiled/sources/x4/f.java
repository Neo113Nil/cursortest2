package x4;

import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f8357a;

    /* renamed from: b, reason: collision with root package name */
    public C1010e f8358b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f8359c;

    /* renamed from: d, reason: collision with root package name */
    public Map f8360d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d4.c.y(this.f8357a, fVar.f8357a) && d4.c.y(this.f8358b, fVar.f8358b) && d4.c.y(this.f8359c, fVar.f8359c) && d4.c.y(this.f8360d, fVar.f8360d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return d4.c.z(new Object[]{f.class, this.f8357a, this.f8358b, this.f8359c, this.f8360d});
    }
}
