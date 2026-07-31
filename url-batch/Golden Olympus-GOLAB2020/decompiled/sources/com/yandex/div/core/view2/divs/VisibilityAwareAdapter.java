package com.yandex.div.core.view2.divs;

import O1.Vf;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.E;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.E> extends RecyclerView.h implements ExpressionSubscriber {

    @NotNull
    private final List<IndexedValue<DivItemBuilderResult>> _visibleItems;

    @NotNull
    private final List<DivItemBuilderResult> items;

    @NotNull
    private final List<Disposable> subscriptions;

    @NotNull
    private final Map<DivItemBuilderResult, Boolean> visibilityMap;

    @NotNull
    private final List<DivItemBuilderResult> visibleItems;

    public VisibilityAwareAdapter(@NotNull List<DivItemBuilderResult> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = CollectionsKt.toMutableList((Collection) items);
        this._visibleItems = new ArrayList();
        this.visibleItems = new AbstractC3213c(this) { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$visibleItems$1
            final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

            {
                this.this$0 = this;
            }

            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractC3211a
            public int getSize() {
                List list;
                list = ((VisibilityAwareAdapter) this.this$0)._visibleItems;
                return list.size();
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            @NotNull
            public DivItemBuilderResult get(int i4) {
                List list;
                list = ((VisibilityAwareAdapter) this.this$0)._visibleItems;
                return (DivItemBuilderResult) ((IndexedValue) list.get(i4)).b();
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.visibilityMap = new LinkedHashMap();
        this.subscriptions = new ArrayList();
        initVisibleItems();
        subscribeOnElements();
    }

    private final Iterable<IndexedValue<DivItemBuilderResult>> getIndexedItems() {
        return CollectionsKt.withIndex(this.items);
    }

    private final Vf getVisibility(DivItemBuilderResult divItemBuilderResult) {
        return (Vf) divItemBuilderResult.getDiv().b().getVisibility().evaluate(divItemBuilderResult.getExpressionResolver());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initVisibleItems() {
        for (IndexedValue<DivItemBuilderResult> indexedValue : getIndexedItems()) {
            boolean z4 = getVisibility((DivItemBuilderResult) indexedValue.b()) != Vf.GONE;
            this.visibilityMap.put(indexedValue.b(), Boolean.valueOf(z4));
            if (z4) {
                this._visibleItems.add(indexedValue);
            }
        }
    }

    public static /* synthetic */ void updateItemVisibility$default(VisibilityAwareAdapter visibilityAwareAdapter, int i4, Vf vf, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItemVisibility");
        }
        if ((i5 & 2) != 0) {
            vf = visibilityAwareAdapter.getVisibility(visibilityAwareAdapter.items.get(i4));
        }
        visibilityAwareAdapter.updateItemVisibility(i4, vf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.visibleItems.size();
    }

    @NotNull
    public final List<DivItemBuilderResult> getItems() {
        return this.items;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @NotNull
    public final List<DivItemBuilderResult> getVisibleItems() {
        return this.visibleItems;
    }

    protected void notifyRawItemInserted(int i4) {
        notifyItemInserted(i4);
    }

    protected void notifyRawItemRemoved(int i4) {
        notifyItemRemoved(i4);
    }

    public final void subscribeOnElements() {
        closeAllSubscription();
        for (IndexedValue<DivItemBuilderResult> indexedValue : getIndexedItems()) {
            addSubscription(((DivItemBuilderResult) indexedValue.b()).getDiv().b().getVisibility().observe(((DivItemBuilderResult) indexedValue.b()).getExpressionResolver(), new VisibilityAwareAdapter$subscribeOnElements$1$subscription$1(this, indexedValue)));
        }
    }

    protected final void updateItemVisibility(int i4, @NotNull Vf newVisibility) {
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        DivItemBuilderResult divItemBuilderResult = this.items.get(i4);
        Boolean bool = this.visibilityMap.get(divItemBuilderResult);
        int i5 = 0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        boolean z4 = newVisibility != Vf.GONE;
        int i6 = -1;
        if (!booleanValue && z4) {
            Iterator<IndexedValue<DivItemBuilderResult>> it = this._visibleItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (it.next().a() > i4) {
                    break;
                } else {
                    i5++;
                }
            }
            Integer valueOf = Integer.valueOf(i5);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : this._visibleItems.size();
            this._visibleItems.add(intValue, new IndexedValue<>(i4, divItemBuilderResult));
            notifyRawItemInserted(intValue);
        } else if (booleanValue && !z4) {
            Iterator<IndexedValue<DivItemBuilderResult>> it2 = this._visibleItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(it2.next().b(), divItemBuilderResult)) {
                    i6 = i5;
                    break;
                }
                i5++;
            }
            this._visibleItems.remove(i6);
            notifyRawItemRemoved(i6);
        }
        this.visibilityMap.put(divItemBuilderResult, Boolean.valueOf(z4));
    }
}
