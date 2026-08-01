package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements Callable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y6 f3008e = new y6(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y6 f3009i = new y6(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3010d;

    public /* synthetic */ y6(int i3) {
        this.f3010d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3010d) {
            case 0:
                qb qbVar = new qb("internal.platform", 4);
                qbVar.f2254e.put("getVersion", new qb("getVersion", 3));
                return qbVar;
            default:
                return null;
        }
    }
}
