package q2;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.BinderC3994u8;
import com.google.android.gms.internal.ads.C2833Vo;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import k2.AbstractC4632c;
import k2.AbstractC4641l;
import k2.C4637h;
import l2.InterfaceC4689d;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final BinderC3317hd f39944a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f39945b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.v f39946c;

    /* renamed from: d, reason: collision with root package name */
    public final C2833Vo f39947d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4877a f39948e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC4632c f39949f;

    /* renamed from: g, reason: collision with root package name */
    public C4637h[] f39950g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4689d f39951h;
    public K i;

    /* renamed from: j, reason: collision with root package name */
    public k2.w f39952j;

    /* renamed from: k, reason: collision with root package name */
    public String f39953k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC4641l f39954l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39955m;

    /* renamed from: n, reason: collision with root package name */
    public k2.p f39956n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f39957o;

    public G0(AbstractC4641l abstractC4641l) {
        f1 f1Var = f1.f40041a;
        this.f39944a = new BinderC3317hd();
        this.f39946c = new k2.v();
        this.f39947d = new C2833Vo(this);
        this.f39957o = new AtomicLong();
        this.f39954l = abstractC4641l;
        this.f39945b = f1Var;
        this.i = null;
        new AtomicBoolean(false);
    }

    public static g1 a(Context context, C4637h[] c4637hArr) {
        for (C4637h c4637h : c4637hArr) {
            if (c4637h.equals(C4637h.f38710o)) {
                return new g1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        g1 g1Var = new g1(context, c4637hArr);
        g1Var.f40049C = false;
        return g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c7, B:37:0x00cb, B:38:0x00d2, B:40:0x00d3, B:42:0x00d9, B:44:0x00e5, B:45:0x00ec, B:48:0x00fe, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bd), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c7, B:37:0x00cb, B:38:0x00d2, B:40:0x00d3, B:42:0x00d9, B:44:0x00e5, B:45:0x00ec, B:48:0x00fe, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bd), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c7, B:37:0x00cb, B:38:0x00d2, B:40:0x00d3, B:42:0x00d9, B:44:0x00e5, B:45:0x00ec, B:48:0x00fe, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bd), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(F0 f02) {
        InterfaceC4877a interfaceC4877a;
        InterfaceC4689d interfaceC4689d;
        k2.w wVar;
        K k6;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            K k9 = this.i;
            AbstractC4641l abstractC4641l = this.f39954l;
            if (k9 == null) {
                if (this.f39950g != null) {
                    if (this.f39953k == null) {
                    }
                    Context context = abstractC4641l.getContext();
                    K k10 = (K) new C4889g(C4907p.f40108g.f40110b, context, a(context, this.f39950g), this.f39953k, this.f39944a).d(context, false);
                    this.i = k10;
                    k10.r0(new b1(this.f39947d));
                    interfaceC4877a = this.f39948e;
                    if (interfaceC4877a != null) {
                        this.i.X2(new BinderC4909q(interfaceC4877a));
                    }
                    interfaceC4689d = this.f39951h;
                    if (interfaceC4689d != null) {
                        this.i.w1(new BinderC3994u8(interfaceC4689d));
                    }
                    wVar = this.f39952j;
                    if (wVar != null) {
                        this.i.x0(new a1(wVar));
                    }
                    this.i.p3(new V0(this.f39956n));
                    this.i.u2(this.f39955m);
                    k6 = this.i;
                    if (k6 != null) {
                        try {
                            V2.a d2 = k6.d();
                            if (d2 != null) {
                                if (((Boolean) AbstractC2598Ia.f25571f.r()).booleanValue()) {
                                    if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                                        u2.d.f41224b.post(new h3.l(this, d2, 9, false));
                                    }
                                }
                                abstractC4641l.addView((View) V2.b.A0(d2));
                            }
                        } catch (RemoteException e6) {
                            u2.i.i("#007 Could not call remote method.", e6);
                        }
                    }
                }
                if (k9 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context2 = abstractC4641l.getContext();
                K k102 = (K) new C4889g(C4907p.f40108g.f40110b, context2, a(context2, this.f39950g), this.f39953k, this.f39944a).d(context2, false);
                this.i = k102;
                k102.r0(new b1(this.f39947d));
                interfaceC4877a = this.f39948e;
                if (interfaceC4877a != null) {
                }
                interfaceC4689d = this.f39951h;
                if (interfaceC4689d != null) {
                }
                wVar = this.f39952j;
                if (wVar != null) {
                }
                this.i.p3(new V0(this.f39956n));
                this.i.u2(this.f39955m);
                k6 = this.i;
                if (k6 != null) {
                }
            }
            f02.f39943n = currentTimeMillis;
            K k11 = this.i;
            if (k11 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f39957o;
            if (atomicLong.get() != 0) {
                k11.P0(atomicLong.get());
            }
            f1 f1Var = this.f39945b;
            Context context3 = abstractC4641l.getContext();
            f1Var.getClass();
            k11.f0(f1.a(context3, f02));
        } catch (RemoteException e9) {
            u2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void c(InterfaceC4877a interfaceC4877a) {
        try {
            this.f39948e = interfaceC4877a;
            K k6 = this.i;
            if (k6 != null) {
                k6.X2(interfaceC4877a != null ? new BinderC4909q(interfaceC4877a) : null);
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public final void d(C4637h... c4637hArr) {
        AbstractC4641l abstractC4641l = this.f39954l;
        this.f39950g = c4637hArr;
        try {
            K k6 = this.i;
            if (k6 != null) {
                k6.D1(a(abstractC4641l.getContext(), this.f39950g));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        abstractC4641l.requestLayout();
    }

    public final void e(InterfaceC4689d interfaceC4689d) {
        try {
            this.f39951h = interfaceC4689d;
            K k6 = this.i;
            if (k6 != null) {
                k6.w1(interfaceC4689d != null ? new BinderC3994u8(interfaceC4689d) : null);
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}
