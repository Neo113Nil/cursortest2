package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ur {
    public Object a;
    public wr b;
    public j92 c;
    public boolean d;

    public final void finalize() {
        j92 j92Var;
        wr wrVar = this.b;
        if (wrVar != null) {
            vr vrVar = wrVar.n;
            if (!vrVar.isDone()) {
                vrVar.setException(new a1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (j92Var = this.c) == null) {
            return;
        }
        j92Var.set(null);
    }
}
