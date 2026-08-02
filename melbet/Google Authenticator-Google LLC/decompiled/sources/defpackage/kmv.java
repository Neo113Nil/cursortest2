package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmv implements kmw {
    private final URI a;

    public kmv(URI uri) {
        uri.getClass();
        this.a = uri;
    }

    @Override // defpackage.kmw
    public final kaq a(kan kanVar, kal kalVar) {
        return kanVar.b(this.a, kalVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmv) {
            return this.a.equals(((kmv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
