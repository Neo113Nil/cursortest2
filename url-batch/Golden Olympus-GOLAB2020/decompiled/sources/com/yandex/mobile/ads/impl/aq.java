package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class aq {

    public static final class a extends aq {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f23401a;

        public a(@Nullable String str) {
            super(0);
            this.f23401a = str;
        }

        @Nullable
        public final String a() {
            return this.f23401a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f23401a, ((a) obj).f23401a);
        }

        public final int hashCode() {
            String str = this.f23401a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AdditionalConsent(value=" + this.f23401a + ")";
        }
    }

    public static final class b extends aq {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f23402a;

        public b(boolean z4) {
            super(0);
            this.f23402a = z4;
        }

        public final boolean a() {
            return this.f23402a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f23402a == ((b) obj).f23402a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f23402a);
        }

        @NotNull
        public final String toString() {
            return "CmpPresent(value=" + this.f23402a + ")";
        }
    }

    public static final class c extends aq {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f23403a;

        public c(@Nullable String str) {
            super(0);
            this.f23403a = str;
        }

        @Nullable
        public final String a() {
            return this.f23403a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f23403a, ((c) obj).f23403a);
        }

        public final int hashCode() {
            String str = this.f23403a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ConsentString(value=" + this.f23403a + ")";
        }
    }

    public static final class d extends aq {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f23404a;

        public d(@Nullable String str) {
            super(0);
            this.f23404a = str;
        }

        @Nullable
        public final String a() {
            return this.f23404a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f23404a, ((d) obj).f23404a);
        }

        public final int hashCode() {
            String str = this.f23404a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Gdpr(value=" + this.f23404a + ")";
        }
    }

    public static final class e extends aq {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f23405a;

        public e(@Nullable String str) {
            super(0);
            this.f23405a = str;
        }

        @Nullable
        public final String a() {
            return this.f23405a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f23405a, ((e) obj).f23405a);
        }

        public final int hashCode() {
            String str = this.f23405a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return "PurposeConsents(value=" + this.f23405a + ")";
        }
    }

    public static final class f extends aq {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f23406a;

        public f(@Nullable String str) {
            super(0);
            this.f23406a = str;
        }

        @Nullable
        public final String a() {
            return this.f23406a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f23406a, ((f) obj).f23406a);
        }

        public final int hashCode() {
            String str = this.f23406a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return "VendorConsents(value=" + this.f23406a + ")";
        }
    }

    private aq() {
    }

    public /* synthetic */ aq(int i4) {
        this();
    }
}
