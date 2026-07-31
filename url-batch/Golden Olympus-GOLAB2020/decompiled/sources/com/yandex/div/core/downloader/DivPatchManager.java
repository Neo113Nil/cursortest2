package com.yandex.div.core.downloader;

import O1.Z;
import V1.a;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivPatchManager {

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final a divViewCreator;

    public DivPatchManager(@NotNull DivPatchCache divPatchCache, @NotNull a divViewCreator) {
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        this.divPatchCache = divPatchCache;
        this.divViewCreator = divViewCreator;
    }

    @Nullable
    public List<View> buildViewsForId(@NotNull BindingContext context, @NotNull String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        List<Z> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id);
        if (patchDivListById == null) {
            return null;
        }
        List<Z> list = patchDivListById;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Div2Builder) this.divViewCreator.get()).buildView((Z) it.next(), context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    @Nullable
    public Map<Z, View> createViewsForId(@NotNull BindingContext context, @NotNull String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        List<Z> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id);
        if (patchDivListById == null) {
            return null;
        }
        List<Z> list = patchDivListById;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, ((Div2Builder) this.divViewCreator.get()).createView((Z) obj, context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }
}
