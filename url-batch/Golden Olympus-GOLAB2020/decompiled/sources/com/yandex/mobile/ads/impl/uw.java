package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class uw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33426a;

    public static final class a extends uw {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f33427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String unitId) {
            super("Ad Units", 0);
            Intrinsics.checkNotNullParameter(unitId, "unitId");
            this.f33427b = unitId;
        }

        @NotNull
        public final String b() {
            return this.f33427b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f33427b, ((a) obj).f33427b);
        }

        public final int hashCode() {
            return this.f33427b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AdUnit(unitId=" + this.f33427b + ")";
        }
    }

    public static final class b extends uw {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final wx.g f33428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull wx.g adapter) {
            super(adapter.f(), 0);
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f33428b = adapter;
        }

        @NotNull
        public final wx.g b() {
            return this.f33428b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f33428b, ((b) obj).f33428b);
        }

        public final int hashCode() {
            return this.f33428b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AdUnitMediationAdapter(adapter=" + this.f33428b + ")";
        }
    }

    public static final class c extends uw {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f33429b = new c();

        private c() {
            super("Ad Units", 0);
        }
    }

    public static final class d extends uw {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f33430b = new d();

        private d() {
            super("Debug Panel", 0);
        }
    }

    public static final class e extends uw {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f33431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String network) {
            super(network, 0);
            Intrinsics.checkNotNullParameter(network, "network");
            this.f33431b = network;
        }

        @NotNull
        public final String b() {
            return this.f33431b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f33431b, ((e) obj).f33431b);
        }

        public final int hashCode() {
            return this.f33431b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "MediationNetwork(network=" + this.f33431b + ")";
        }
    }

    private uw(String str) {
        this.f33426a = str;
    }

    @NotNull
    public final String a() {
        return this.f33426a;
    }

    public /* synthetic */ uw(String str, int i4) {
        this(str);
    }
}
