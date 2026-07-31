package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class u90 {

    public static final class a extends u90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1866d3 f32890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C1866d3 adFetchRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            this.f32890a = adFetchRequestError;
        }

        @NotNull
        public final C1866d3 a() {
            return this.f32890a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f32890a, ((a) obj).f32890a);
        }

        public final int hashCode() {
            return this.f32890a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failed(adFetchRequestError=" + this.f32890a + ")";
        }
    }

    public static final class b extends u90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f32891a = new b();

        private b() {
            super(0);
        }
    }

    public static final class c extends u90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f32892a = new c();

        private c() {
            super(0);
        }
    }

    public static final class d extends u90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f32893a = new d();

        private d() {
            super(0);
        }
    }

    private u90() {
    }

    public /* synthetic */ u90(int i4) {
        this();
    }
}
