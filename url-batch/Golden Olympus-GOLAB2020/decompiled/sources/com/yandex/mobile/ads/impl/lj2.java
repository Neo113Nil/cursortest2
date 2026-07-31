package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.j21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface lj2 {

    public static final class a implements lj2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f28622a = new a();

        private a() {
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1546046495;
        }

        @NotNull
        public final String toString() {
            return "Loaded";
        }
    }

    public static final class b implements lj2 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final j21.a f28623a;

        public b(@Nullable j21.a aVar) {
            this.f28623a = aVar;
        }

        @Nullable
        public final j21.a a() {
            return this.f28623a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f28623a, ((b) obj).f28623a);
        }

        public final int hashCode() {
            j21.a aVar = this.f28623a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Loading(preloadingListener=" + this.f28623a + ")";
        }
    }

    public static final class c implements lj2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f28624a = new c();

        private c() {
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 109971728;
        }

        @NotNull
        public final String toString() {
            return "NotPreloading";
        }
    }
}
