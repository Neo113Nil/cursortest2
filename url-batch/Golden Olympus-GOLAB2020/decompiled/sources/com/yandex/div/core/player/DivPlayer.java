package com.yandex.div.core.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivPlayer {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata
    public interface Observer {
    }

    default void addObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    default void pause() {
    }

    default void play() {
    }

    default void release() {
    }

    default void seek(long j4) {
    }

    default void setMuted(boolean z4) {
    }
}
