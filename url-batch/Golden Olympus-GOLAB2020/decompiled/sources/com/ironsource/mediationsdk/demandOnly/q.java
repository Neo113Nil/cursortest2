package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface q {

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17542a;

        public a(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f17542a = adFormat;
        }

        @Nullable
        public final IronSourceError a(@NotNull h loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.f17542a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.l.f17632f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b4 = bVar.b();
            if ((b4 == null || b4.length() == 0) && loadParams.d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17543a;

        public b(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f17543a = adFormat;
        }

        @Nullable
        public final IronSourceError a(@NotNull h.d loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.e() == null) {
                return new IronSourceError(1060, this.f17543a + " was initialized and loaded without Activity");
            }
            if (loadParams.c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String b4 = loadParams.b();
            if ((b4 == null || b4.length() == 0) && loadParams.d()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Nullable
    IronSourceError a();
}
