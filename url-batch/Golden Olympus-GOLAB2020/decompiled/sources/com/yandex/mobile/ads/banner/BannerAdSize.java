package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.gb0;
import com.yandex.mobile.ads.impl.j22;
import com.yandex.mobile.ads.impl.ms;
import com.yandex.mobile.ads.impl.vy1;
import com.yandex.mobile.ads.impl.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdSize extends zk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f22377a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vy1 f22378b;

    @Metadata
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerAdSize fixedSize(@NotNull Context context, int i4, int i5) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BannerAdSize(new gb0(i4, i5, vy1.a.f33822c));
        }

        @NotNull
        public final BannerAdSize inlineSize(@NotNull Context context, int i4, int i5) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BannerAdSize(new gb0(i4, i5, vy1.a.f33823d));
        }

        @NotNull
        public final BannerAdSize stickySize(@NotNull Context context, int i4) {
            Intrinsics.checkNotNullParameter(context, "context");
            ms coreBannerAdSize = j22.a(context, i4);
            Intrinsics.checkNotNullParameter(coreBannerAdSize, "coreBannerAdSize");
            return new BannerAdSize(coreBannerAdSize.a());
        }

        private a() {
        }
    }

    public BannerAdSize(@NotNull vy1 sizeInfo) {
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.f22378b = sizeInfo;
    }

    @NotNull
    public static final BannerAdSize fixedSize(@NotNull Context context, int i4, int i5) {
        return f22377a.fixedSize(context, i4, i5);
    }

    @NotNull
    public static final BannerAdSize inlineSize(@NotNull Context context, int i4, int i5) {
        return f22377a.inlineSize(context, i4, i5);
    }

    @NotNull
    public static final BannerAdSize stickySize(@NotNull Context context, int i4) {
        return f22377a.stickySize(context, i4);
    }

    @NotNull
    protected final vy1 a() {
        return this.f22378b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(BannerAdSize.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f22378b, ((BannerAdSize) obj).f22378b);
    }

    public final int getHeight() {
        return this.f22378b.getHeight();
    }

    public final int getHeightInPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f22378b.b(context);
    }

    public final int getWidth() {
        return this.f22378b.getWidth();
    }

    public final int getWidthInPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f22378b.d(context);
    }

    public int hashCode() {
        return this.f22378b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f22378b.toString();
    }

    public final int getHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f22378b.a(context);
    }

    public final int getWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f22378b.c(context);
    }
}
