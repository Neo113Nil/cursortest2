package B2;

import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C4088vv;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f149n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f150u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f151v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f152w;

    public /* synthetic */ C(Object obj, boolean z8, boolean z9, int i) {
        this.f149n = i;
        this.f152w = obj;
        this.f150u = z8;
        this.f151v = z9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f149n) {
            case 0:
                ((E) this.f152w).d(this.f150u, this.f151v);
                break;
            default:
                ((C2593Hm) ((C4088vv) this.f152w).f34899v).m(this.f150u, this.f151v);
                break;
        }
    }
}
