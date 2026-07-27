package G1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final y.t f3099b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3100c;

    public a(y.t tVar, String str) {
        H1.i iVar = H1.i.f3271a;
        this.f3099b = tVar;
        this.f3100c = str;
        this.f3098a = Arrays.hashCode(new Object[]{tVar, iVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (H1.o.f(this.f3099b, aVar.f3099b)) {
            H1.i iVar = H1.i.f3271a;
            if (H1.o.f(iVar, iVar) && H1.o.f(this.f3100c, aVar.f3100c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3098a;
    }
}
