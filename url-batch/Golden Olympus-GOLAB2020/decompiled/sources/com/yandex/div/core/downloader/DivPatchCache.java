package com.yandex.div.core.downloader;

import O1.Z;
import android.support.v4.media.session.b;
import androidx.collection.a;
import com.yandex.div.DivDataTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivPatchCache {

    @NotNull
    private final a patches = new a();

    @Nullable
    public DivPatchMap getPatch(@NotNull DivDataTag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        b.a(this.patches.get(tag));
        return null;
    }

    @Nullable
    public List<Z> getPatchDivListById(@NotNull DivDataTag tag, @NotNull String id) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(id, "id");
        b.a(this.patches.get(tag));
        return null;
    }
}
