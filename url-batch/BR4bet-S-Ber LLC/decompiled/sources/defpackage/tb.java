package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tb implements AutoCloseable, gf {
    public final ye f;

    public tb(ye yeVar) {
        yeVar.getClass();
        this.f = yeVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ur urVar = (ur) this.f.h(ej.l);
        if (urVar != null) {
            urVar.a(new qr(urVar.b(), null, urVar));
        }
    }
}
