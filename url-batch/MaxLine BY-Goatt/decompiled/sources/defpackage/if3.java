package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class if3 extends md3 implements me3 {
    public final /* synthetic */ pn3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if3(ef3 ef3Var, pn3 pn3Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.g = pn3Var;
    }

    @Override // defpackage.me3
    public final void a() {
        this.g.run();
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }
}
