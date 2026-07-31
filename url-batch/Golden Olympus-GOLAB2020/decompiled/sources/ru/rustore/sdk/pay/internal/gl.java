package ru.rustore.sdk.pay.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface gl {

    public static final class a implements gl {

        /* renamed from: a, reason: collision with root package name */
        public final int f44185a;

        public a(int i4) {
            this.f44185a = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f44185a == ((a) obj).f44185a;
        }

        @Override // ru.rustore.sdk.pay.internal.gl
        public final int getCount() {
            return this.f44185a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f44185a);
        }

        @NotNull
        public final String toString() {
            return "Day(count=" + this.f44185a + ')';
        }
    }

    public static final class b implements gl {

        /* renamed from: a, reason: collision with root package name */
        public final int f44186a;

        public b(int i4) {
            this.f44186a = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44186a == ((b) obj).f44186a;
        }

        @Override // ru.rustore.sdk.pay.internal.gl
        public final int getCount() {
            return this.f44186a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f44186a);
        }

        @NotNull
        public final String toString() {
            return "Month(count=" + this.f44186a + ')';
        }
    }

    public static final class c implements gl {

        /* renamed from: a, reason: collision with root package name */
        public final int f44187a;

        public c(int i4) {
            this.f44187a = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f44187a == ((c) obj).f44187a;
        }

        @Override // ru.rustore.sdk.pay.internal.gl
        public final int getCount() {
            return this.f44187a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f44187a);
        }

        @NotNull
        public final String toString() {
            return "Year(count=" + this.f44187a + ')';
        }
    }

    int getCount();
}
