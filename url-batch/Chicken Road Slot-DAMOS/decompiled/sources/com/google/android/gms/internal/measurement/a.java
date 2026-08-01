package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2124e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f2123d = i3;
        this.f2124e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f2123d) {
            case 0:
                return new ca(((w5) this.f2124e).f2931c);
            case 1:
                return new ca(((w5) this.f2124e).f2932d);
            default:
                l5 l5Var = (l5) this.f2124e;
                synchronized (((re) l5Var.f2500i).g) {
                    l5Var.f2499e = null;
                }
                return null;
        }
    }
}
