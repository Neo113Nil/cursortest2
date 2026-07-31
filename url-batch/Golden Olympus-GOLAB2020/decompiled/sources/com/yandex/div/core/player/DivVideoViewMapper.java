package com.yandex.div.core.player;

import O1.Ef;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivVideoViewMapper {

    @NotNull
    private final WeakHashMap<DivVideoView, Ef> currentViews = new WeakHashMap<>();

    public final void addView(@NotNull DivVideoView view, @NotNull Ef div) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        this.currentViews.put(view, div);
    }

    @Nullable
    public final DivPlayer getPlayer(@NotNull Ef div) {
        Intrinsics.checkNotNullParameter(div, "div");
        Set<Map.Entry<DivVideoView, Ef>> entrySet = this.currentViews.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "currentViews.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getValue(), div) || Intrinsics.areEqual(((Ef) entry.getValue()).getId(), div.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) obj2).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) CollectionsKt.firstOrNull((List) arrayList2);
    }
}
