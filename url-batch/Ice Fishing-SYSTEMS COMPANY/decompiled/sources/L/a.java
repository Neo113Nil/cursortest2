package L;

import N2.C;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC3149eQ;
import com.google.android.gms.internal.ads.AbstractC3548lu;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2728Pl;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3266gg;
import com.google.android.gms.internal.ads.C3365iO;
import com.google.android.gms.internal.ads.C3709ot;
import com.google.android.gms.internal.ads.C3851ra;
import com.google.android.gms.internal.ads.C3932t0;
import com.google.android.gms.internal.ads.C3965tg;
import com.google.android.gms.internal.ads.C4101w7;
import com.google.android.gms.internal.ads.D6;
import com.google.android.gms.internal.ads.Ez;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.MO;
import com.google.android.gms.internal.ads.OO;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2553Fg;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC3696og;
import com.google.android.gms.internal.ads.UN;
import com.google.android.gms.internal.ads.VN;
import com.google.android.material.datepicker.k;
import g1.C4523c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import t0.AbstractC5019C;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1668n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1669u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1670v;

    public /* synthetic */ a(C3365iO c3365iO, int i, boolean z8) {
        this.f1668n = 10;
        this.f1670v = c3365iO;
        this.f1669u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D6 d62;
        switch (this.f1668n) {
            case 0:
                F.b bVar = (F.b) ((C4523c) this.f1670v).f37856u;
                if (bVar != null) {
                    bVar.g(this.f1669u);
                    break;
                }
                break;
            case 1:
                ((C) this.f1670v).f(this.f1669u);
                break;
            case 2:
                ((SystemForegroundService) this.f1670v).f5508x.cancel(this.f1669u);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f1670v;
                int size = arrayList.size();
                if (this.f1669u != 1) {
                    for (int i = 0; i < size; i++) {
                        ((androidx.emoji2.text.h) arrayList.get(i)).getClass();
                    }
                    break;
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        ((androidx.emoji2.text.h) arrayList.get(i4)).a();
                    }
                    break;
                }
            case 4:
                int i9 = this.f1669u;
                C4101w7 c4101w7 = (C4101w7) this.f1670v;
                if (i9 > 0) {
                    try {
                        Thread.sleep(i9 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = c4101w7.f34929a;
                    d62 = PA.h(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    d62 = null;
                }
                C4101w7 c4101w72 = (C4101w7) this.f1670v;
                c4101w72.f34936h = d62;
                int i10 = this.f1669u;
                if (i10 < 4) {
                    if (d62 == null || !d62.a0() || d62.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !d62.z0() || !d62.A0().A() || d62.A0().B() == -2) {
                        int i11 = i10 + 1;
                        if (c4101w72.f34939l) {
                            Future<?> submit = c4101w72.f34930b.submit(new a(c4101w72, i11));
                            if (i11 == 0) {
                                c4101w72.i = submit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                C3165eo c3165eo = ((C3851ra) this.f1670v).f34043v;
                if (c3165eo != null) {
                    C2593Hm a9 = c3165eo.a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "cct_nav");
                    a9.r("cct_navs", String.valueOf(this.f1669u));
                    a9.s();
                    break;
                }
                break;
            case 6:
                ((C3266gg) this.f1670v).f31033b.onAudioFocusChange(this.f1669u);
                break;
            case 7:
                C3965tg c3965tg = ((TextureViewSurfaceTextureListenerC3696og) this.f1670v).J;
                if (c3965tg != null) {
                    c3965tg.onWindowVisibilityChanged(this.f1669u);
                    break;
                }
                break;
            case 8:
                C3965tg c3965tg2 = ((TextureViewSurfaceTextureListenerC2553Fg) this.f1670v).f24991z;
                if (c3965tg2 != null) {
                    c3965tg2.onWindowVisibilityChanged(this.f1669u);
                    break;
                }
                break;
            case 9:
                ((Ez) this.f1670v).b(this.f1669u + 1);
                break;
            case 10:
                C3365iO c3365iO = (C3365iO) this.f1670v;
                int i12 = ((AbstractC3149eQ) c3365iO.f31364n[this.f1669u].f594e).f30422u;
                OO oo = c3365iO.f31353O;
                oo.s(oo.z(), 1033, new MO(6));
                break;
            case 11:
                C3932t0 c3932t0 = (C3932t0) this.f1670v;
                c3932t0.getClass();
                String str = AbstractC3548lu.f32613a;
                VN vn = c3932t0.f34333b;
                int i13 = this.f1669u;
                UN un = new UN(i13);
                C2728Pl c2728Pl = vn.f28243n.f30030U;
                PA.T(Looper.myLooper() == ((C3709ot) c2728Pl.f27031c).f33230a.getLooper());
                c2728Pl.f27029a++;
                MD md = new MD(24, c2728Pl, un);
                C3709ot c3709ot = (C3709ot) c2728Pl.f27030b;
                if (c3709ot.f33230a.getLooper().getThread().isAlive()) {
                    c3709ot.e(md);
                }
                c2728Pl.m(Integer.valueOf(i13));
                break;
            default:
                RecyclerView recyclerView = ((k) this.f1670v).f36128G0;
                if (!recyclerView.f5347N) {
                    AbstractC5019C abstractC5019C = recyclerView.f5330E;
                    if (abstractC5019C == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    } else {
                        abstractC5019C.x0(recyclerView, this.f1669u);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i, int i4) {
        this.f1668n = i4;
        this.f1670v = obj;
        this.f1669u = i;
    }

    public a(C4101w7 c4101w7, int i) {
        this.f1668n = 4;
        this.f1669u = i;
        Objects.requireNonNull(c4101w7);
        this.f1670v = c4101w7;
    }

    public a(List list, int i, Throwable th) {
        this.f1668n = 3;
        S0.f.f(list, "initCallbacks cannot be null");
        this.f1670v = new ArrayList(list);
        this.f1669u = i;
    }
}
