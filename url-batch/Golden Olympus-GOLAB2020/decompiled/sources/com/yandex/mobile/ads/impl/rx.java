package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface rx {

    public static final class a implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f31460a = new a();

        private a() {
        }
    }

    public static final class b implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f31461a;

        public b(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f31461a = id;
        }

        @NotNull
        public final String a() {
            return this.f31461a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f31461a, ((b) obj).f31461a);
        }

        public final int hashCode() {
            return this.f31461a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OnAdUnitClick(id=" + this.f31461a + ")";
        }
    }

    public static final class c implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f31462a = new c();

        private c() {
        }
    }

    public static final class d implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f31463a = new d();

        private d() {
        }
    }

    public static final class e implements rx {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31464a;

        public e(boolean z4) {
            this.f31464a = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f31464a == ((e) obj).f31464a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f31464a);
        }

        @NotNull
        public final String toString() {
            return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f31464a + ")";
        }
    }

    public static final class f implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final wx.g f31465a;

        public f(@NotNull wx.g uiUnit) {
            Intrinsics.checkNotNullParameter(uiUnit, "uiUnit");
            this.f31465a = uiUnit;
        }

        @NotNull
        public final wx.g a() {
            return this.f31465a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f31465a, ((f) obj).f31465a);
        }

        public final int hashCode() {
            return this.f31465a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OnMediationNetworkClick(uiUnit=" + this.f31465a + ")";
        }
    }

    public static final class g implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f31466a = new g();

        private g() {
        }
    }

    public static final class h implements rx {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f31467a;

        public h(@NotNull String waring) {
            Intrinsics.checkNotNullParameter(waring, "waring");
            this.f31467a = waring;
        }

        @NotNull
        public final String a() {
            return this.f31467a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f31467a, ((h) obj).f31467a);
        }

        public final int hashCode() {
            return this.f31467a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OnWarningButtonClick(waring=" + this.f31467a + ")";
        }
    }
}
