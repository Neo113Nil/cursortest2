package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vg0 implements v11 {
    public final boolean m;

    public vg0(boolean z) {
        this.m = z;
    }

    @Override // defpackage.v11
    public final boolean b() {
        return this.m;
    }

    @Override // defpackage.v11
    public final ms1 d() {
        return null;
    }

    public final String toString() {
        return in1.m(new StringBuilder("Empty{"), this.m ? "Active" : "New", '}');
    }
}
