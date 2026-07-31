package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivGalleryAdapter extends DivCollectionAdapter<DivGalleryViewHolder> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final WeakHashMap<DivItemBuilderResult, Long> ids;
    private long lastItemId;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGalleryAdapter(@NotNull List<DivItemBuilderResult> items, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath path) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(path, "path");
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = viewCreator;
        this.path = path;
        this.ids = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i4) {
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i4);
        Long l4 = this.ids.get(divItemBuilderResult);
        if (l4 != null) {
            return l4.longValue();
        }
        long j4 = this.lastItemId;
        this.lastItemId = 1 + j4;
        this.ids.put(divItemBuilderResult, Long.valueOf(j4));
        return j4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull DivGalleryViewHolder holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i4);
        holder.bind(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), divItemBuilderResult.getDiv(), i4, getItems().indexOf(divItemBuilderResult));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public DivGalleryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DivGalleryViewHolder(this.bindingContext, new DivGalleryItemLayout(this.bindingContext.getDivView().getContext$div_release()), this.divBinder, this.viewCreator, this.path);
    }
}
