package s7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d3 extends q5 implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f8592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(l3 l3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f8592d = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(x3.CREATOR);
        r5.d(parcel);
        t(createTypedArrayList);
        return true;
    }

    @Override // s7.j0
    public final void t(List list) {
        AtomicReference atomicReference = this.f8592d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
