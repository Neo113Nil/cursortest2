package s7;

import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8786e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8787i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f8789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f8790t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f8791u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f8792v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q2 f8793w;

    public k2(q2 q2Var, String str, String str2, long j, long j3, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f8785d = str;
        this.f8786e = str2;
        this.f8787i = j;
        this.f8788r = j3;
        this.f8789s = bundle;
        this.f8790t = z10;
        this.f8791u = z11;
        this.f8792v = z12;
        this.f8793w = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8793w.B(this.f8785d, this.f8786e, this.f8787i, this.f8788r, this.f8789s, this.f8790t, this.f8791u, this.f8792v);
    }
}
