package com.google.android.gms.internal.measurement;

import java.util.function.Consumer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class pf implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2679a;

    public /* synthetic */ pf(int i3) {
        this.f2679a = i3;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f2679a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                b1.j jVar = qf.f2716u;
                throw null;
            default:
                throw n0.l.e(obj);
        }
    }
}
