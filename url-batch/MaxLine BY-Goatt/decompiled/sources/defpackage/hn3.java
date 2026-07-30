package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hn3 extends md3 implements eh3 {
    public final /* synthetic */ AtomicReference g;
    public final /* synthetic */ jo3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn3(jo3 jo3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.g = atomicReference;
        this.h = jo3Var;
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        tp3 tp3Var = (tp3) od3.a(parcel, tp3.CREATOR);
        od3.d(parcel);
        s(tp3Var);
        return true;
    }

    @Override // defpackage.eh3
    public final void s(tp3 tp3Var) {
        AtomicReference atomicReference = this.g;
        synchronized (atomicReference) {
            vh3 vh3Var = ((pj3) this.h.m).r;
            pj3.m(vh3Var);
            vh3Var.z.c(Integer.valueOf(tp3Var.m.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(tp3Var);
            atomicReference.notifyAll();
        }
    }
}
