package s7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e3 extends q5 implements l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f8676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f8677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(l3 l3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f8676d = atomicReference;
        this.f8677e = l3Var;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        c4 c4Var = (c4) r5.a(parcel, c4.CREATOR);
        r5.d(parcel);
        e(c4Var);
        return true;
    }

    @Override // s7.l0
    public final void e(c4 c4Var) {
        AtomicReference atomicReference = this.f8676d;
        synchronized (atomicReference) {
            v0 v0Var = ((q1) this.f8677e.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.B.b(Integer.valueOf(c4Var.f8565d.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c4Var);
            atomicReference.notifyAll();
        }
    }
}
