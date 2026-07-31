package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class oi0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f30057a;

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f30058a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30059b;

        public d(int i4, int i5) {
            this.f30058a = i4;
            this.f30059b = i5;
        }

        public final int a() {
            return this.f30059b;
        }

        public final int b() {
            return this.f30058a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f30058a == dVar.f30058a && this.f30059b == dVar.f30059b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30059b) + (Integer.hashCode(this.f30058a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Size(width=" + this.f30058a + ", height=" + this.f30059b + ")";
        }
    }

    public oi0(float f4) {
        this.f30057a = a(f4);
    }

    protected final float a() {
        return this.f30057a;
    }

    protected abstract float a(float f4);

    @NotNull
    public abstract d a(@NotNull Context context, int i4, int i5, int i6);

    public static final class b extends oi0 {
        public b(float f4) {
            super(f4);
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        @NotNull
        public final d a(@NotNull Context context, int i4, int i5, int i6) {
            Intrinsics.checkNotNullParameter(context, "context");
            int c4 = AbstractC3185a.c(i4 * a());
            return new d(c4, AbstractC3185a.c(i6 * (c4 / i5)));
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        protected final float a(float f4) {
            return kotlin.ranges.g.j(f4, 0.01f, 1.0f);
        }
    }

    public static final class a extends oi0 {
        public a(float f4) {
            super(f4);
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        @NotNull
        public final d a(@NotNull Context context, int i4, int i5, int i6) {
            Intrinsics.checkNotNullParameter(context, "context");
            int g4 = kotlin.ranges.g.g(lh2.a(context, a()), i4);
            return new d(g4, AbstractC3185a.c(i6 * (g4 / i5)));
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        protected final float a(float f4) {
            return kotlin.ranges.g.c(f4, 10.0f);
        }
    }

    public static final class c extends oi0 {
        public c(float f4) {
            super(f4);
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        @NotNull
        public final d a(@NotNull Context context, int i4, int i5, int i6) {
            Intrinsics.checkNotNullParameter(context, "context");
            int a4 = lh2.a(context, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
            int c4 = AbstractC3185a.c(i4 * a());
            if (i5 > c4) {
                i6 = AbstractC3185a.c(i6 / (i5 / c4));
                i5 = c4;
            }
            if (i6 > a4) {
                i5 = AbstractC3185a.c(i5 / (i6 / a4));
            } else {
                a4 = i6;
            }
            return new d(i5, a4);
        }

        @Override // com.yandex.mobile.ads.impl.oi0
        protected final float a(float f4) {
            return kotlin.ranges.g.j(f4, 0.01f, 1.0f);
        }
    }
}
