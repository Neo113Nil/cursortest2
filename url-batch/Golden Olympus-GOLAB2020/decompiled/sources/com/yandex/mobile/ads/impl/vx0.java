package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.yandex.mobile.ads.impl.ew1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class vx0 implements u70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f33820a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw1 f33821b;

    public /* synthetic */ vx0(C2286v2 c2286v2) {
        this(c2286v2, new zw1());
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @NotNull
    public Map<String, Object> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1918f7 a4 = this.f33820a.a();
        if (a4 != null) {
            Map<String, String> h4 = a4.h();
            if (h4 != null) {
                linkedHashMap.putAll(h4);
            }
            String b4 = a4.b();
            if (b4 != null) {
                linkedHashMap.put(IronSourceSegment.AGE, b4);
            }
            List<String> d4 = a4.d();
            if (d4 != null) {
                linkedHashMap.put("context_tags", d4);
            }
            String e4 = a4.e();
            if (e4 != null) {
                linkedHashMap.put("gender", e4);
            }
            int i4 = ew1.f25476l;
            Boolean e5 = ew1.a.a().e();
            if (e5 != null) {
                linkedHashMap.put("age_restricted_user", e5);
            }
            du1 a5 = ew1.a.a().a(context);
            Boolean q02 = a5 != null ? a5.q0() : null;
            if (q02 != null) {
                linkedHashMap.put("user_consent", q02);
            }
        }
        C1851cc a6 = this.f33820a.e().a();
        boolean b5 = this.f33821b.b(context);
        if (a6 != null) {
            boolean b6 = a6.b();
            String a7 = a6.a();
            if (!b5 && !b6 && a7 != null) {
                linkedHashMap.put("google_aid", a7);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.f33820a.j().c()));
        linkedHashMap.put(HianalyticsBaseData.SDK_VERSION, "7.15.0");
        return linkedHashMap;
    }

    public vx0(@NotNull C2286v2 adConfiguration, @NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f33820a = adConfiguration;
        this.f33821b = sensitiveModeChecker;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    @NotNull
    public final Map<String, String> a(@NotNull xy0 mediationNetwork) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        return mediationNetwork.i();
    }

    @NotNull
    protected final C2286v2 a() {
        return this.f33820a;
    }
}
