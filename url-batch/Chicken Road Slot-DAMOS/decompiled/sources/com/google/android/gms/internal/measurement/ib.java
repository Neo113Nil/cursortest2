package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements f8.z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ib f2402b = new ib(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ib f2403c = new ib(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2404a;

    public /* synthetic */ ib(int i3) {
        this.f2404a = i3;
    }

    @Override // f8.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f2404a) {
            case 0:
                a7.e eVar = (a7.e) obj;
                throw new hb(eVar.f316d.f2119d, eVar.getMessage(), eVar);
            case 1:
                throw null;
            default:
                return f8.l0.d("");
        }
    }
}
