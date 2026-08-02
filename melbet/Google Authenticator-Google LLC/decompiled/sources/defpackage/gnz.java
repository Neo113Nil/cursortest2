package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnz {
    public final String a;
    public final Uri b;
    public final hel c;

    public gnz(String str, Uri uri, hel helVar) {
        this.a = str;
        this.b = uri;
        this.c = helVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnz) {
            gnz gnzVar = (gnz) obj;
            if (this.a.equals(gnzVar.a) && this.b.equals(gnzVar.b) && hnu.H(this.c, gnzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        hel helVar = this.c;
        return "HelpOptions{helpCenterContext=" + this.a + ", fallbackSupportUri=" + String.valueOf(this.b) + ", overflowMenuItems=" + String.valueOf(helVar) + "}";
    }

    public gnz() {
        throw null;
    }
}
