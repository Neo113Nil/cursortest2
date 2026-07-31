package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface c2 {

    public static final class a implements c2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f43895a;

        public a(@NotNull ArrayList bankApps) {
            Intrinsics.checkNotNullParameter(bankApps, "bankApps");
            this.f43895a = bankApps;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43895a, ((a) obj).f43895a);
        }

        public final int hashCode() {
            return this.f43895a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Content(bankApps=" + this.f43895a + ')';
        }
    }

    public static final class b implements c2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f43896a = new b();
    }

    public static final class c implements c2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f43897a = new c();
    }
}
