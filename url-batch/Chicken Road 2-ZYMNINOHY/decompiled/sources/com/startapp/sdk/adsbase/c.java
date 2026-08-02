package com.startapp.sdk.adsbase;

import R1.n;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c0.p;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.mc;
import com.startapp.sdk.internal.sf;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class c implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6382a;

    /* renamed from: b, reason: collision with root package name */
    public final Ad f6383b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences f6384c;

    /* renamed from: d, reason: collision with root package name */
    public AdEventListener f6385d;

    /* renamed from: e, reason: collision with root package name */
    public final AdPreferences.Placement f6386e;

    /* renamed from: f, reason: collision with root package name */
    public String f6387f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f6388g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f6389h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f6390i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f6391j;

    public c(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4) {
        this.f6382a = context;
        this.f6383b = ad;
        this.f6384c = adPreferences == null ? new AdPreferences() : adPreferences;
        this.f6385d = adEventListener;
        this.f6386e = placement;
        this.f6388g = ibVar;
        this.f6389h = ibVar2;
        this.f6390i = ibVar3;
        this.f6391j = ibVar4;
    }

    @Override // com.startapp.sdk.internal.a2
    public final void a() {
        try {
            ((Executor) this.f6389h.a()).execute(new n(15, this));
        } catch (Throwable th) {
            a(false);
            d9.a(th);
        }
    }

    public abstract boolean a(Object obj);

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(boolean z) {
        d(z);
        if (z) {
            return;
        }
        Ad ad = this.f6383b;
        if (ad != null) {
            ad.setErrorMessage(this.f6387f);
        }
        Context context = this.f6382a;
        AdEventListener adEventListener = this.f6385d;
        this.f6385d = null;
        a0.a(context, adEventListener, this.f6383b, false);
    }

    public final /* synthetic */ void d() {
        a(b());
    }

    public abstract Object e();

    public final boolean b() {
        try {
            return a(e());
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public void d(boolean z) {
        Ad ad = this.f6383b;
        if (ad != null) {
            ad.setState(z ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        }
    }

    public final void a(boolean z) {
        try {
            new Handler(Looper.getMainLooper()).post(new p(this, z, 1));
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0072, code lost:
    
        if (r0.equals(r6.second) != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:35:0x002d, B:37:0x0033, B:41:0x003c, B:44:0x0051, B:48:0x0056, B:50:0x006c, B:52:0x004a, B:56:0x0043, B:58:0x0078, B:60:0x007e), top: B:34:0x002d, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:35:0x002d, B:37:0x0033, B:41:0x003c, B:44:0x0051, B:48:0x0056, B:50:0x006c, B:52:0x004a, B:56:0x0043, B:58:0x0078, B:60:0x007e), top: B:34:0x002d, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.startapp.sdk.adsbase.model.a a(com.startapp.sdk.adsbase.model.a aVar) {
        Pair a3;
        Pair pair;
        Context context = this.f6382a;
        boolean a4 = MetaData.E().W().a(context);
        boolean g02 = MetaData.E().g0();
        boolean p02 = MetaData.E().p0();
        synchronized (g.class) {
            try {
                SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                Pair pair2 = new Pair(simpleTokenUtils$TokenType, "");
                if (a4) {
                    try {
                        SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = g.f6425h;
                        if (simpleTokenUtils$TokenType2 == SimpleTokenUtils$TokenType.UNDEFINED) {
                            boolean z = g.f6423f;
                            if (g.f6424g && !z) {
                                a3 = g.b(context);
                                if (!p02) {
                                    z = !g.f6424g;
                                }
                                g.f6424g = z;
                                if (!g02) {
                                    String string = ((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).getString("shared_prefs_simple_token", "");
                                    if (string == null) {
                                    }
                                }
                                pair2 = a3;
                            }
                            a3 = g.a(context);
                            if (!p02) {
                            }
                            g.f6424g = z;
                            if (!g02) {
                            }
                            pair2 = a3;
                        } else {
                            pair2 = simpleTokenUtils$TokenType2 == simpleTokenUtils$TokenType ? g.a(context) : g.b(context);
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                }
                pair = new Pair(((SimpleTokenUtils$TokenType) pair2.first).toString(), (String) pair2.second);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            aVar.a(this.f6382a, this.f6384c, this.f6386e, pair);
            if (!AdsCommonMetaData.k().J() && g0.a(this.f6382a)) {
                aVar.f6482w0 = true;
            }
            try {
                aVar.a(this.f6382a, this.f6384c);
            } catch (Throwable th3) {
                d9.a(th3);
            }
            try {
                double a5 = ((mc) this.f6391j.a()).a();
                if (a5 >= 0.0d) {
                    Locale locale = Locale.ENGLISH;
                    long round = Math.round(a5 * 100.0d);
                    StringBuilder sb = new StringBuilder();
                    sb.append(round);
                    aVar.f6472T0 = sb.toString();
                }
            } catch (Throwable th4) {
                d9.a(th4);
            }
            return aVar;
        } catch (Throwable th5) {
            d9.a(th5);
            g.f6425h = SimpleTokenUtils$TokenType.a((String) pair.first);
            return null;
        }
    }

    public com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a a3 = a(new com.startapp.sdk.adsbase.model.a());
        if (a3 != null) {
            a3.g(this.f6382a);
        }
        return a3;
    }
}
