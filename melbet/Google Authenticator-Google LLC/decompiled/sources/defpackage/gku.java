package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gku extends agd {
    public final afr a;
    public final frv b;
    public final jpw c;
    public final jrn d;
    public final Object e = new Object();
    public volatile Object f;
    public final ikj g;

    public gku(afr afrVar, ikj ikjVar, frv frvVar, jpw jpwVar, jrn jrnVar) {
        this.a = afrVar;
        this.g = ikjVar;
        this.b = frvVar;
        this.c = jpwVar;
        this.d = jrnVar;
    }

    @Override // defpackage.agd
    public final void c() {
        jqg c;
        synchronized (this.e) {
            c = this.f != null ? ((gkt) imq.a(this.f, gkt.class)).c() : null;
        }
        if (c != null) {
            c.a();
        }
    }
}
