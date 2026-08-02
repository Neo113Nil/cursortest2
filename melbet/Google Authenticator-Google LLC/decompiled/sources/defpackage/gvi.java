package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvi {
    public final hel a;
    public final hel b;
    public final UUID c;
    public final long d;

    public gvi(hel helVar, hel helVar2, UUID uuid, long j) {
        this.a = helVar;
        this.b = helVar2;
        this.c = uuid;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gvi) {
            gvi gviVar = (gvi) obj;
            if (hnu.H(this.a, gviVar.a) && hnu.H(this.b, gviVar.b) && this.c.equals(gviVar.c) && this.d == gviVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }

    public gvi() {
        throw null;
    }
}
