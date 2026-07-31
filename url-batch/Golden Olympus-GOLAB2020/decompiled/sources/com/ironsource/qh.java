package com.ironsource;

import android.app.Activity;
import com.ironsource.b9;
import com.ironsource.fh;
import com.ironsource.fr;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.C1561e;
import com.ironsource.uh;
import com.ironsource.vh;
import com.ironsource.wm;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class qh implements uh {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f18849j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18850a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wm f18851b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih f18852c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private sh f18853d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f18854e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private String f18855f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f18856g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private uh.a f18857h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private vh f18858i;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final qh a() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            C1561e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new qh(uuid, new vm(uuid, controllerManager, null, null, 12, null), new jh());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    public static final class b implements wm.a {
        b() {
        }

        @Override // com.ironsource.wm.a
        public void a() {
            uh.a a4 = qh.this.a();
            if (a4 != null) {
                a4.onNativeAdShown();
            }
        }

        @Override // com.ironsource.wm.a
        public void c() {
            uh.a a4 = qh.this.a();
            if (a4 != null) {
                a4.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.wm.a
        public void a(@NotNull sh adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            qh.this.f18853d = adData;
            ih ihVar = qh.this.f18852c;
            fr.a loadAdSuccess = fr.f16284l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> a4 = qh.this.c().a();
            Intrinsics.checkNotNullExpressionValue(a4, "baseEventParams().data");
            ihVar.a(loadAdSuccess, a4);
            uh.a a5 = qh.this.a();
            if (a5 != null) {
                a5.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.wm.a
        public void a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            hh a4 = qh.this.c().a(cc.f15708A, reason);
            ih ihVar = qh.this.f18852c;
            fr.a loadAdFailed = fr.f16279g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> a5 = a4.a();
            Intrinsics.checkNotNullExpressionValue(a5, "eventParams.data");
            ihVar.a(loadAdFailed, a5);
            uh.a a6 = qh.this.a();
            if (a6 != null) {
                a6.onNativeAdLoadFailed(reason);
            }
        }
    }

    @Metadata
    public static final class c implements vh.a {

        @Metadata
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18861a;

            static {
                int[] iArr = new int[vh.b.values().length];
                try {
                    iArr[vh.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f18861a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.vh.a
        public void a(@NotNull uv viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            qh.this.f18851b.a(viewVisibilityParams);
        }

        @Override // com.ironsource.vh.a
        public void a(@NotNull vh.b viewName) {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.f18861a[viewName.ordinal()] == 1) {
                qh.this.f18851b.b();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            wm wmVar = qh.this.f18851b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            wmVar.a(clickParams);
        }
    }

    public qh(@NotNull String id, @NotNull wm controller, @NotNull ih eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f18850a = id;
        this.f18851b = controller;
        this.f18852c = eventTracker;
        controller.a(e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hh c() {
        hh a4 = new hh().a(cc.f15752x, this.f18855f).a(cc.f15750v, this.f18854e).a(cc.f15751w, fh.e.NativeAd.toString()).a(cc.f15716I, Long.valueOf(i()));
        Intrinsics.checkNotNullExpressionValue(a4, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a4;
    }

    @NotNull
    public static final qh d() {
        return f18849j.a();
    }

    private final b e() {
        return new b();
    }

    private final c f() {
        return new c();
    }

    private final long i() {
        Long l4 = this.f18856g;
        if (l4 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l4.longValue();
    }

    @Override // com.ironsource.uh
    @Nullable
    public sh b() {
        return this.f18853d;
    }

    @Override // com.ironsource.uh
    public void destroy() {
        vh vhVar = this.f18858i;
        if (vhVar != null) {
            vhVar.a((vh.a) null);
        }
        this.f18851b.destroy();
    }

    @Nullable
    public final String g() {
        return this.f18854e;
    }

    @Nullable
    public final String h() {
        return this.f18855f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ qh(String str, wm wmVar, ih ihVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wmVar, ihVar);
        if ((i4 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    @Override // com.ironsource.uh
    @Nullable
    public uh.a a() {
        return this.f18857h;
    }

    @Override // com.ironsource.uh
    public void a(@NotNull Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f18856g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f18854e = loadParams.optString("demandSourceName");
        this.f18855f = loadParams.optString("inAppBidding");
        ih ihVar = this.f18852c;
        fr.a loadAd = fr.f16278f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> a4 = c().a();
        Intrinsics.checkNotNullExpressionValue(a4, "baseEventParams().data");
        ihVar.a(loadAd, a4);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(b9.h.f15515y0, String.valueOf(this.f18856g));
        this.f18851b.a(activity, jSONObject);
    }

    @Override // com.ironsource.uh
    public void a(@Nullable uh.a aVar) {
        this.f18857h = aVar;
    }

    @Override // com.ironsource.uh
    public void a(@NotNull vh viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a4 = c().a();
        Intrinsics.checkNotNullExpressionValue(a4, "baseEventParams().data");
        linkedHashMap.putAll(a4);
        String jSONObject = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(cc.f15753y, jSONObject);
        ih ihVar = this.f18852c;
        fr.a registerAd = fr.f16286n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        ihVar.a(registerAd, linkedHashMap);
        this.f18858i = viewHolder;
        viewHolder.a(f());
        this.f18851b.a(viewHolder);
    }
}
