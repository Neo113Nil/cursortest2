package com.ironsource;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ai {

    @Metadata
    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull List<? extends b> list);
    }

    @Metadata
    public interface b {
        int b();

        @NotNull
        String c();
    }

    boolean a();

    boolean b(@NotNull b bVar);
}
