package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1589x0 implements InterfaceC1583w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rn f20265a;

    @Metadata
    /* renamed from: com.ironsource.x0$a */
    public static final class a implements oo {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mi f20266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitListener f20267b;

        a(mi miVar, InitListener initListener) {
            this.f20266a = miVar;
            this.f20267b = initListener;
        }

        @Override // com.ironsource.oo
        public void onFail(@NotNull gh error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f20267b.onInitFailed(wb.f20181a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.oo
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sb = new StringBuilder();
            sb.append("controllerURL = ");
            InterfaceC1577v0 e4 = this.f20266a.e();
            sb.append(e4 != null ? e4.c() : null);
            ironLog.verbose(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("controllerConfig = ");
            InterfaceC1577v0 e5 = this.f20266a.e();
            sb2.append(e5 != null ? e5.a() : null);
            ironLog.verbose(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("debugMode = ");
            InterfaceC1577v0 e6 = this.f20266a.e();
            sb3.append(e6 != null ? Integer.valueOf(e6.b()) : null);
            ironLog.verbose(sb3.toString());
            ironLog.verbose("applicationKey = " + this.f20266a.d());
            ironLog.verbose("userId = " + this.f20266a.h());
            this.f20267b.onInitSuccess();
        }
    }

    public C1589x0(@NotNull rn networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f20265a = networkInitApi;
    }

    @Override // com.ironsource.InterfaceC1583w0
    public void a(@NotNull Context context, @NotNull mi initConfig, @NotNull InitListener initListener) {
        JSONObject a4;
        String c4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        rn rnVar = this.f20265a;
        InterfaceC1577v0 e4 = initConfig.e();
        rnVar.a(e4 != null ? e4.b() : 0);
        InterfaceC1577v0 e5 = initConfig.e();
        if (e5 != null && (c4 = e5.c()) != null) {
            this.f20265a.b(c4);
        }
        InterfaceC1577v0 e6 = initConfig.e();
        if (e6 != null && (a4 = e6.a()) != null) {
            rn rnVar2 = this.f20265a;
            String jSONObject = a4.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            rnVar2.a(jSONObject);
        }
        Map<String, String> a5 = new pn().a();
        this.f20265a.a(new a(initConfig, initListener));
        this.f20265a.a(context, initConfig.d(), initConfig.h(), a5);
    }
}
