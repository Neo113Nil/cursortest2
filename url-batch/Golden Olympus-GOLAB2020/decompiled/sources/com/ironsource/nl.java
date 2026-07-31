package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.ol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class nl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pl f18362a;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private nl f18363a = new nl(null);

        @NotNull
        public final a a(@NotNull rl listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f18363a.a(listener);
            return this;
        }

        @NotNull
        public final a b(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.f18363a.b(placementName);
            return this;
        }

        @NotNull
        public final a a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f18363a.a(adUnitId);
            return this;
        }

        @NotNull
        public final nl a() {
            return this.f18363a;
        }
    }

    private nl() {
        this.f18362a = new pl(mf.f18026a.a(), this);
    }

    public final void a() {
        this.f18362a.f();
    }

    @Nullable
    public final String b() {
        return this.f18362a.h();
    }

    @Nullable
    public final String c() {
        return this.f18362a.i();
    }

    @Nullable
    public final String d() {
        return this.f18362a.j();
    }

    @Nullable
    public final ol.a e() {
        return this.f18362a.k();
    }

    @Nullable
    public final AdapterNativeAdViewBinder f() {
        return this.f18362a.l();
    }

    @Nullable
    public final String g() {
        return this.f18362a.m();
    }

    public final void h() {
        this.f18362a.n();
    }

    public /* synthetic */ nl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f18362a.b(str);
    }

    public final void a(@Nullable rl rlVar) {
        this.f18362a.a(rlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f18362a.a(str);
    }
}
