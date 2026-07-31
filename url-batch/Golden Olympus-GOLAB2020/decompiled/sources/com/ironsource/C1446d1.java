package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1446d1 implements InterfaceC1453e1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f15812b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f15813c = "ext_";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f15814a = new HashMap();

    @Metadata
    /* renamed from: com.ironsource.d1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ironsource.InterfaceC1453e1
    public void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15814a.put(key, value);
    }

    @Override // com.ironsource.InterfaceC1453e1
    public void b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15814a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC1453e1
    @NotNull
    public Map<String, String> get() {
        return this.f15814a;
    }

    @Override // com.ironsource.InterfaceC1453e1
    public void a(@NotNull HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f15814a.putAll(params);
    }
}
