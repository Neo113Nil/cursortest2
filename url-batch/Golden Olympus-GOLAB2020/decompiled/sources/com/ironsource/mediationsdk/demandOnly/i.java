package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.demandOnly.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface i {

    @Metadata
    public interface a {
        void a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str);

        void a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str, @Nullable String str2);

        void a(@Nullable String str);
    }

    @Metadata
    public interface b {
        void a(@NotNull h.d dVar);

        void a(@Nullable String str);

        boolean b(@Nullable String str);
    }

    @Metadata
    public interface c {
        void a(@NotNull h.d dVar);

        boolean a(@Nullable String str);

        void b(@Nullable String str);
    }
}
