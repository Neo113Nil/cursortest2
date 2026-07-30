package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pb {
    public final String a;
    public final String b;

    public pb(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            l.b("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return this.a.equals(pbVar.a) && this.b.equals(pbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
