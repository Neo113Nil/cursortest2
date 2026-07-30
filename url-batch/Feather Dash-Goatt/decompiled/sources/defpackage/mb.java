package defpackage;

import com.appsflyer.internal.l;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mb {
    public final String a;
    public final ArrayList b;

    public mb(String str, ArrayList arrayList) {
        if (str == null) {
            l.b("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj;
        return this.a.equals(mbVar.a) && this.b.equals(mbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
