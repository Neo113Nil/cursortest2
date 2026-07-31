package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2085m7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1993ia f28920a = new C1993ia();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bj1 f28921b = new bj1();

    @NotNull
    public final jp1 a(@Nullable C1918f7 c1918f7) {
        jp1 jp1Var = new jp1((Map) null, 3);
        if (c1918f7 != null) {
            Map<String, String> h4 = c1918f7.h();
            this.f28920a.getClass();
            jp1 jp1Var2 = new jp1(new HashMap(), 2);
            if (h4 != null) {
                Object obj = (String) h4.get("adapter_network_name");
                Object obj2 = (String) h4.get("adapter_version");
                Object obj3 = (String) h4.get("adapter_network_sdk_version");
                jp1Var2.a(obj, "adapter_network_name");
                jp1Var2.a(obj2, "adapter_version");
                jp1Var2.a(obj3, "adapter_network_sdk_version");
            }
            Map<String, Object> b4 = jp1Var2.b();
            this.f28921b.getClass();
            jp1 jp1Var3 = new jp1(new HashMap(), 2);
            if (h4 != null) {
                Object obj4 = (String) h4.get("plugin_type");
                Object obj5 = (String) h4.get("plugin_version");
                jp1Var3.a(obj4, "plugin_type");
                jp1Var3.a(obj5, "plugin_version");
            }
            Map<String, Object> b5 = jp1Var3.b();
            String j4 = c1918f7.j();
            jp1Var.a((Map<String, ? extends Object>) b4);
            jp1Var.a((Map<String, ? extends Object>) b5);
            jp1Var.a(j4, "preload_type");
        }
        String g4 = c1918f7 != null ? c1918f7.g() : null;
        boolean z4 = g4 == null || g4.length() == 0;
        jp1Var.b(Boolean.valueOf(!z4), "open_bidding");
        if (!z4) {
            jp1Var.a("openbidding", "integration_type");
        }
        return jp1Var;
    }
}
