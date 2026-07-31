package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* loaded from: classes.dex */
public final class ru0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.eu0, java.lang.Object] */
    public static final eu0 a(final Context context, final vv0 vv0Var, final String str, final boolean z6, final boolean z7, final gb gbVar, final m20 m20Var, final po0 po0Var, b20 b20Var, final y2.l lVar, final y2.a aVar, final ar arVar, final rr2 rr2Var, final ur2 ur2Var) {
        m10.c(context);
        try {
            final b20 b20Var2 = null;
            c53 c53Var = new c53(context, vv0Var, str, z6, z7, gbVar, m20Var, po0Var, b20Var2, lVar, aVar, arVar, rr2Var, ur2Var) { // from class: com.google.android.gms.internal.ads.nu0

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Context f9326f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ vv0 f9327g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f9328h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f9329i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f9330j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ gb f9331k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ m20 f9332l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ po0 f9333m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ y2.l f9334n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ y2.a f9335o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ ar f9336p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ rr2 f9337q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ur2 f9338r;

                {
                    this.f9334n = lVar;
                    this.f9335o = aVar;
                    this.f9336p = arVar;
                    this.f9337q = rr2Var;
                    this.f9338r = ur2Var;
                }

                @Override // com.google.android.gms.internal.ads.c53
                public final Object zza() {
                    Context context2 = this.f9326f;
                    vv0 vv0Var2 = this.f9327g;
                    String str2 = this.f9328h;
                    boolean z8 = this.f9329i;
                    boolean z9 = this.f9330j;
                    gb gbVar2 = this.f9331k;
                    m20 m20Var2 = this.f9332l;
                    po0 po0Var2 = this.f9333m;
                    y2.l lVar2 = this.f9334n;
                    y2.a aVar2 = this.f9335o;
                    ar arVar2 = this.f9336p;
                    rr2 rr2Var2 = this.f9337q;
                    ur2 ur2Var2 = this.f9338r;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i7 = yu0.f14801f0;
                        uu0 uu0Var = new uu0(new yu0(new uv0(context2), vv0Var2, str2, z8, z9, gbVar2, m20Var2, po0Var2, null, lVar2, aVar2, arVar2, rr2Var2, ur2Var2));
                        uu0Var.setWebViewClient(y2.t.r().n(uu0Var, arVar2, z9));
                        uu0Var.setWebChromeClient(new du0(uu0Var));
                        return uu0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c53Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new qu0("Webview initialization failed.", th);
        }
    }
}
