package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.u7;
import com.startapp.sdk.internal.ub;
import com.startapp.sdk.internal.v1;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class c implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f132a;
    public final Ad b;
    public final AdPreferences c;
    public AdEventListener d;
    public final AdPreferences.Placement e;
    public String f;
    public final pa g;
    public final pa h;
    public final pa i;
    public final pa j;

    public c(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4) {
        this.f132a = context;
        this.b = ad;
        this.c = adPreferences == null ? new AdPreferences() : adPreferences;
        this.d = adEventListener;
        this.e = placement;
        this.g = paVar;
        this.h = paVar2;
        this.i = paVar3;
        this.j = paVar4;
    }

    @Override // com.startapp.sdk.internal.v1
    public final void a() {
        try {
            ((Executor) this.h.a()).execute(new Runnable() { // from class: com.startapp.sdk.adsbase.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.d();
                }
            });
        } catch (Throwable th) {
            a(false);
            n8.a(th);
        }
    }

    public abstract boolean a(Object obj);

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(boolean z) {
        if (!(this instanceof u7)) {
            this.b.setState(z ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        }
        if (z) {
            return;
        }
        this.b.setErrorMessage(this.f);
        Context context = this.f132a;
        AdEventListener adEventListener = this.d;
        this.d = null;
        a0.a(context, adEventListener, this.b, false);
    }

    public final /* synthetic */ void d() {
        a(b());
    }

    public abstract Object e();

    public final boolean b() {
        try {
            return a(e());
        } catch (Throwable th) {
            n8.a(th);
            return false;
        }
    }

    public final void a(final boolean z) {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.startapp.sdk.adsbase.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b(z);
                }
            });
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
    
        if (r0.equals(r6.second) != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:35:0x002d, B:37:0x0033, B:41:0x003c, B:44:0x004f, B:48:0x0054, B:50:0x006a, B:52:0x0048, B:56:0x0041, B:58:0x0076, B:60:0x007c), top: B:34:0x002d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0048 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:35:0x002d, B:37:0x0033, B:41:0x003c, B:44:0x004f, B:48:0x0054, B:50:0x006a, B:52:0x0048, B:56:0x0041, B:58:0x0076, B:60:0x007c), top: B:34:0x002d, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.startapp.sdk.adsbase.model.a a(com.startapp.sdk.adsbase.model.a aVar) {
        Pair a2;
        Pair pair;
        Context context = this.f132a;
        boolean a3 = MetaData.A().R().a(context);
        boolean a0 = MetaData.A().a0();
        boolean j0 = MetaData.A().j0();
        synchronized (g.class) {
            SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
            Pair pair2 = new Pair(simpleTokenUtils$TokenType, "");
            if (a3) {
                try {
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = g.h;
                    if (simpleTokenUtils$TokenType2 == SimpleTokenUtils$TokenType.UNDEFINED) {
                        boolean z = g.f;
                        if (g.g && !z) {
                            a2 = g.b(context);
                            if (!j0) {
                                z = !g.g;
                            }
                            g.g = z;
                            if (!a0) {
                                String string = ((af) com.startapp.sdk.components.a.a(context).G.a()).getString("shared_prefs_simple_token", "");
                                if (string == null) {
                                }
                            }
                            pair2 = a2;
                        }
                        a2 = g.a(context);
                        if (!j0) {
                        }
                        g.g = z;
                        if (!a0) {
                        }
                        pair2 = a2;
                    } else {
                        pair2 = simpleTokenUtils$TokenType2 == simpleTokenUtils$TokenType ? g.a(context) : g.b(context);
                    }
                } catch (Throwable th) {
                    n8.a(th);
                }
            }
            pair = new Pair(((SimpleTokenUtils$TokenType) pair2.first).toString(), (String) pair2.second);
        }
        try {
            aVar.a(this.f132a, this.c, this.e, pair);
            if (!AdsCommonMetaData.k().J() && e0.a(this.f132a)) {
                aVar.w0 = true;
            }
            try {
                aVar.a(this.f132a, this.c);
            } catch (Throwable th2) {
                n8.a(th2);
            }
            try {
                double a4 = ((ub) this.j.a()).a();
                if (a4 >= 0.0d) {
                    Locale locale = Locale.ENGLISH;
                    long round = Math.round(a4 * 100.0d);
                    StringBuilder sb = new StringBuilder();
                    sb.append(round);
                    aVar.T0 = sb.toString();
                }
            } catch (Throwable th3) {
                n8.a(th3);
            }
            return aVar;
        } catch (Throwable th4) {
            n8.a(th4);
            g.h = SimpleTokenUtils$TokenType.a((String) pair.first);
            return null;
        }
    }

    public com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a a2 = a(new com.startapp.sdk.adsbase.model.a());
        if (a2 != null) {
            a2.g(this.f132a);
        }
        return a2;
    }
}
