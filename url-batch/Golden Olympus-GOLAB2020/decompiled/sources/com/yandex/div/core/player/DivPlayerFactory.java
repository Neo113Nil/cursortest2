package com.yandex.div.core.player;

import O1.Lf;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivPlayerFactory {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(@NotNull List<DivVideoSource> src, @NotNull DivPlayerPlaybackConfig config) {
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(config, "config");
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
            };
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @NotNull
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                @Nullable
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return super.getAttachedPlayer();
                }

                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setScale(@NotNull Lf lf) {
                    super.setScale(lf);
                }

                @Override // com.yandex.div.core.player.DivPlayerView, com.yandex.div.core.player.DivVideoAttachable
                public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z4) {
                    super.setVisibleOnScreen(z4);
                }
            };
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DivPlayer makePlayer(@NotNull List<DivVideoSource> list, @NotNull DivPlayerPlaybackConfig divPlayerPlaybackConfig);

    @NotNull
    DivPlayerView makePlayerView(@NotNull Context context);

    @NotNull
    default DivPlayerPreloader makePreloader() {
        return DivPlayerPreloader.STUB;
    }
}
