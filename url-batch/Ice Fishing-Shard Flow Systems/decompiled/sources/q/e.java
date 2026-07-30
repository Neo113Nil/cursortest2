package q;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7278e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7279i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7280l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f7282n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f7283o;

    public e(f fVar, int i2, int i5, int i7, int i8, int i9, Bundle bundle) {
        this.f7283o = fVar;
        this.f7277d = i2;
        this.f7278e = i5;
        this.f7279i = i7;
        this.f7280l = i8;
        this.f7281m = i9;
        this.f7282n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7283o.f7285f.onActivityLayout(this.f7277d, this.f7278e, this.f7279i, this.f7280l, this.f7281m, this.f7282n);
    }
}
