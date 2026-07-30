package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gn3 extends md3 implements bh3 {
    public final /* synthetic */ AtomicReference g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn3(jo3 jo3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.g = atomicReference;
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(ip3.CREATOR);
        od3.d(parcel);
        x(createTypedArrayList);
        return true;
    }

    @Override // defpackage.bh3
    public final void x(List list) {
        AtomicReference atomicReference = this.g;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
