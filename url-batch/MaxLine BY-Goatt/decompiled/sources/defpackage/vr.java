package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vr extends h1 {
    public final /* synthetic */ wr m;

    public vr(wr wrVar) {
        this.m = wrVar;
    }

    @Override // defpackage.h1
    public final String pendingToString() {
        ur urVar = (ur) this.m.m.get();
        if (urVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + urVar.a + "]";
    }
}
