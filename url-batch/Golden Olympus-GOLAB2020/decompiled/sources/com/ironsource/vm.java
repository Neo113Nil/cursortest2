package com.ironsource;

import android.app.Activity;
import com.ironsource.b9;
import com.ironsource.sdk.controller.C1561e;
import com.ironsource.sdk.controller.InterfaceC1562f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sh;
import com.ironsource.wm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vm implements wm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1561e f20099b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ji f20100c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1434b3 f20101d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20102e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private wm.a f20103f;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f20104a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f20105b = "nativeAd.load";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f20106c = "nativeAd.loadReport";

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f20107d = "nativeAd.register";

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f20108e = "nativeAd.click";

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f20109f = "nativeAd.privacyClick";

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f20110g = "nativeAd.visibilityChanged";

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f20111h = "nativeAd.destroy";

        private a() {
        }
    }

    public vm(@NotNull String id, @NotNull C1561e controllerManager, @NotNull ji imageLoader, @NotNull InterfaceC1434b3 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f20098a = id;
        this.f20099b = controllerManager;
        this.f20100c = imageLoader;
        this.f20101d = adViewManagement;
        this.f20102e = vm.class.getSimpleName();
        controllerManager.a(id, c());
    }

    @Override // com.ironsource.wm
    @Nullable
    public wm.a a() {
        return this.f20103f;
    }

    @Override // com.ironsource.wm
    public void b() {
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, a.f20109f, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.wm
    public void destroy() {
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, a.f20111h, new JSONObject()), (l.a) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vm(String str, C1561e c1561e, ji jiVar, InterfaceC1434b3 interfaceC1434b3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c1561e, jiVar, interfaceC1434b3);
        jiVar = (i4 & 4) != 0 ? new ii(null, 1, null) : jiVar;
        if ((i4 & 8) != 0) {
            interfaceC1434b3 = ch.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC1434b3, "getInstance()");
        }
    }

    private final void a(Activity activity, InterfaceC1562f.a aVar) {
        if (aVar.d() == null) {
            wm.a a4 = a();
            if (a4 != null) {
                a4.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            sh.b a5 = new sh.a(this.f20100c, this.f20101d).a(activity, aVar.d());
            a(a5, a5.a().h());
            return;
        }
        String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
        wm.a a6 = a();
        if (a6 != null) {
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            a6.a(reason);
        }
    }

    private final void b(InterfaceC1562f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f20102e, "failed to handle show on native ad: missing params");
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            wm.a a4 = a();
            if (a4 != null) {
                a4.a();
                return;
            }
            return;
        }
        String optString = aVar.d().optString("reason", "unexpected error");
        Logger.i(this.f20102e, "failed to handle show on native ad: " + optString);
    }

    private final l.b c() {
        return new l.b() { // from class: com.ironsource.D4
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(pm pmVar) {
                vm.a(vm.this, pmVar);
            }
        };
    }

    private final JSONObject d() {
        JSONObject put = new JSONObject().put(InterfaceC1562f.b.f19242g, a.f20108e).put("sdkCallback", b9.g.f15392U);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(vm this$0, InterfaceC1562f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.wm
    public void a(@NotNull final Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f20099b.a(activity);
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, a.f20105b, loadParams), new l.a() { // from class: com.ironsource.C4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(InterfaceC1562f.a aVar) {
                vm.a(vm.this, activity, aVar);
            }
        });
    }

    private final void a(pm pmVar) {
        if (pmVar.f() == null) {
            Logger.i(this.f20102e, "failed to handle click on native ad: missing params");
            return;
        }
        if (pmVar.f().optBoolean("success", false)) {
            wm.a a4 = a();
            if (a4 != null) {
                a4.c();
                return;
            }
            return;
        }
        String optString = pmVar.f().optString("reason", "unexpected error");
        Logger.i(this.f20102e, "failed to handle click on native ad: " + optString);
    }

    private final void a(InterfaceC1562f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f20102e, "failed to handle click on native ad: missing params");
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            wm.a a4 = a();
            if (a4 != null) {
                a4.c();
                return;
            }
            return;
        }
        String optString = aVar.d().optString("reason", "unexpected error");
        Logger.i(this.f20102e, "failed to handle click on native ad: " + optString);
    }

    private final void a(sh.b bVar, final sh shVar) {
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, "nativeAd.loadReport." + this.f20098a, bVar.b()), new l.a() { // from class: com.ironsource.B4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(InterfaceC1562f.a aVar) {
                vm.a(vm.this, shVar, aVar);
            }
        });
    }

    private final void a(sh shVar, InterfaceC1562f.a aVar) {
        if (aVar.d() == null) {
            wm.a a4 = a();
            if (a4 != null) {
                a4.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            wm.a a5 = a();
            if (a5 != null) {
                a5.a(shVar);
                return;
            }
            return;
        }
        String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
        wm.a a6 = a();
        if (a6 != null) {
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            a6.a(reason);
        }
    }

    @Override // com.ironsource.wm
    public void a(@NotNull uv viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, a.f20110g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.A4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(InterfaceC1562f.a aVar) {
                vm.b(vm.this, aVar);
            }
        });
    }

    @Override // com.ironsource.wm
    public void a(@NotNull vh viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", d());
        String str = this.f20098a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.f20099b.a(new InterfaceC1562f.c(str, a.f20107d, params), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vm this$0, Activity activity, InterfaceC1562f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vm this$0, pm msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.f20108e)) {
            this$0.a(msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vm this$0, InterfaceC1562f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vm this$0, sh adData, InterfaceC1562f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    @Override // com.ironsource.wm
    public void a(@Nullable wm.a aVar) {
        this.f20103f = aVar;
    }

    @Override // com.ironsource.wm
    public void a(@NotNull JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.f20099b.a(new InterfaceC1562f.c(this.f20098a, a.f20108e, clickParams), new l.a() { // from class: com.ironsource.Z3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(InterfaceC1562f.a aVar) {
                vm.a(vm.this, aVar);
            }
        });
    }
}
