package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface sx {

    public static final class a implements sx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f32065a = new a();

        private a() {
        }
    }

    public static final class b implements sx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f32066a = new b();

        private b() {
        }
    }

    public static final class c implements sx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32067a;

        public c(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f32067a = text;
        }

        @NotNull
        public final String a() {
            return this.f32067a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f32067a, ((c) obj).f32067a);
        }

        public final int hashCode() {
            return this.f32067a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Message(text=" + this.f32067a + ")";
        }
    }

    public static final class d implements sx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f32068a;

        public d(@NotNull Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f32068a = reportUri;
        }

        @NotNull
        public final Uri a() {
            return this.f32068a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f32068a, ((d) obj).f32068a);
        }

        public final int hashCode() {
            return this.f32068a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShareReport(reportUri=" + this.f32068a + ")";
        }
    }

    public static final class e implements sx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32069a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f32070b;

        public e(@NotNull String message) {
            Intrinsics.checkNotNullParameter("Warning", b9.h.f15436D0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f32069a = "Warning";
            this.f32070b = message;
        }

        @NotNull
        public final String a() {
            return this.f32070b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f32069a, eVar.f32069a) && Intrinsics.areEqual(this.f32070b, eVar.f32070b);
        }

        public final int hashCode() {
            return this.f32070b.hashCode() + (this.f32069a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Warning(title=" + this.f32069a + ", message=" + this.f32070b + ")";
        }
    }
}
