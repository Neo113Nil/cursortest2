package com.yandex.div.core.player;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivPlayerPreloader {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerPreloader STUB = new DivPlayerPreloader() { // from class: com.yandex.div.core.player.DivPlayerPreloader$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerPreloader
        @NotNull
        public DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> src) {
            Intrinsics.checkNotNullParameter(src, "src");
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> list);
}
