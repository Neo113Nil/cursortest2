package l2;

import O2.w;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import h3.l;
import k2.AbstractC4641l;
import k2.C4637h;
import k2.v;
import q2.G0;
import q2.K;
import q2.a1;
import q2.r;
import u2.AbstractC5108b;
import u2.i;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4688c extends AbstractC4641l {
    public C4688c(Context context) {
        super(context);
        w.i(context, "Context cannot be null");
    }

    public final void c(C4687b c4687b) {
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(getContext());
        if (((Boolean) AbstractC2598Ia.f25571f.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new l(this, c4687b, 5, false));
                return;
            }
        }
        this.f38724n.b(c4687b.f38704a);
    }

    public C4637h[] getAdSizes() {
        return this.f38724n.f39950g;
    }

    public InterfaceC4689d getAppEventListener() {
        return this.f38724n.f39951h;
    }

    public v getVideoController() {
        return this.f38724n.f39946c;
    }

    public k2.w getVideoOptions() {
        return this.f38724n.f39952j;
    }

    public void setAdSizes(C4637h... c4637hArr) {
        if (c4637hArr == null || c4637hArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f38724n.d(c4637hArr);
    }

    public void setAppEventListener(InterfaceC4689d interfaceC4689d) {
        this.f38724n.e(interfaceC4689d);
    }

    public void setManualImpressionsEnabled(boolean z8) {
        G0 g02 = this.f38724n;
        g02.f39955m = z8;
        try {
            K k6 = g02.i;
            if (k6 != null) {
                k6.u2(z8);
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }

    public void setVideoOptions(k2.w wVar) {
        G0 g02 = this.f38724n;
        g02.f39952j = wVar;
        try {
            K k6 = g02.i;
            if (k6 != null) {
                k6.x0(wVar == null ? null : new a1(wVar));
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }
}
