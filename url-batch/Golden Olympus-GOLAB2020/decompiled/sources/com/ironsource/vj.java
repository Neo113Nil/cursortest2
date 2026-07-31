package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC1577v0;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.ms;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final vj f20077a = new vj();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ui f20078b = new ui();

    @Metadata
    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    @Metadata
    public static final class b implements rr {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ib f20080b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InitListener f20081c;

        b(Context context, ib ibVar, InitListener initListener) {
            this.f20079a = context;
            this.f20080b = ibVar;
            this.f20081c = initListener;
        }

        @Override // com.ironsource.rr
        public void a(@NotNull lr sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            vj.f20077a.a(this.f20079a, sdkConfig.d(), this.f20080b, this.f20081c);
        }

        @Override // com.ironsource.rr
        public void a(@NotNull nr error) {
            Intrinsics.checkNotNullParameter(error, "error");
            vj.f20077a.a(this.f20081c, this.f20080b, error);
        }
    }

    private vj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, ms msVar, ib ibVar, InitListener initListener) {
        String u4 = com.ironsource.mediationsdk.p.m().u();
        mi f4 = msVar.f();
        Intrinsics.checkNotNullExpressionValue(f4, "serverResponse.initialConfiguration");
        NetworkSettings b4 = msVar.k().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(b4, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = b4.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        f4.a(new InterfaceC1577v0.a(interstitialSettings));
        f4.a(ConfigFile.getConfigFile().getPluginType());
        f4.b(u4);
        new C1589x0(new sn()).a(context, f4, new a());
        a(msVar, ibVar, initListener);
    }

    public final void a(@NotNull final Context context, @NotNull final InitRequest initRequest, @NotNull final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f20078b.a(new Runnable() { // from class: com.ironsource.P3
            @Override // java.lang.Runnable
            public final void run() {
                vj.a(InitRequest.this, context, initializationListener);
            }
        });
    }

    private final void a(ms msVar, ib ibVar, final InitListener initListener) {
        C1491j4 d4;
        C1428a4 b4 = msVar.c().b();
        new om().a((b4 == null || (d4 = b4.d()) == null) ? null : d4.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.m().u();
        ln a4 = ln.f17101e.a();
        a4.a(msVar.k());
        a4.a(msVar.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        a4.a(sessionId);
        a4.g();
        long a5 = ib.a(ibVar);
        ui uiVar = f20078b;
        ms.a h4 = msVar.h();
        Intrinsics.checkNotNullExpressionValue(h4, "serverResponse.origin");
        uiVar.a(a5, h4);
        uiVar.b(new Runnable() { // from class: com.ironsource.Q3
            @Override // java.lang.Runnable
            public final void run() {
                vj.a(InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nr error, InitListener initListener) {
        Intrinsics.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f20078b.a(error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, ib ibVar, final nr nrVar) {
        long a4 = ib.a(ibVar);
        ui uiVar = f20078b;
        uiVar.a(nrVar, a4);
        uiVar.b(new Runnable() { // from class: com.ironsource.R3
            @Override // java.lang.Runnable
            public final void run() {
                vj.a(nr.this, initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        ib ibVar = new ib();
        zr.f20581a.c(context, new sr(initRequest.getAppKey(), null, AbstractC3219i.N0(f20078b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, ibVar, initializationListener));
    }
}
