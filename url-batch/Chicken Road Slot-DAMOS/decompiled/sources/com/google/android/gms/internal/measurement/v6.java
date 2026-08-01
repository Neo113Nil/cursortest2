package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v6 extends q5 implements h6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f8.j0 f2871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(q6 q6Var, f8.j0 j0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f2871d = j0Var;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 2) {
            return false;
        }
        b();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void b() {
        this.f2871d.run();
    }
}
