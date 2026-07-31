package com.yandex.div.core.view2.divs;

import O1.InterfaceC0752c3;
import O1.Vf;
import O1.Z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.n;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivCollectionAdapter<VH extends DivCollectionViewHolder> extends VisibilityAwareAdapter<VH> {

    @Metadata
    private static final class DiffUtilCallback extends h.b {

        @NotNull
        private final List<DivItemBuilderResult> newItems;

        @NotNull
        private final List<DivItemBuilderResult> oldItems;

        public DiffUtilCallback(@NotNull List<DivItemBuilderResult> oldItems, @NotNull List<DivItemBuilderResult> newItems) {
            Intrinsics.checkNotNullParameter(oldItems, "oldItems");
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.oldItems = oldItems;
            this.newItems = newItems;
        }

        private final void suppressMissingVariableException(DivItemBuilderResult divItemBuilderResult, boolean z4) {
            ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            if (asImpl == null) {
                return;
            }
            asImpl.setSuppressMissingVariableException(z4);
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areContentsTheSame(int i4, int i5) {
            return areContentsTheSame((DivItemBuilderResult) CollectionsKt.getOrNull(this.oldItems, i4), (DivItemBuilderResult) CollectionsKt.getOrNull(this.newItems, i5));
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areItemsTheSame(int i4, int i5) {
            Z div;
            InterfaceC0752c3 b4;
            Expression n4;
            Z div2;
            InterfaceC0752c3 b5;
            Expression n5;
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) CollectionsKt.getOrNull(this.oldItems, i4);
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) CollectionsKt.getOrNull(this.newItems, i5);
            String str = null;
            String str2 = (divItemBuilderResult == null || (div2 = divItemBuilderResult.getDiv()) == null || (b5 = div2.b()) == null || (n5 = b5.n()) == null) ? null : (String) n5.evaluate(divItemBuilderResult.getExpressionResolver());
            if (divItemBuilderResult2 != null && (div = divItemBuilderResult2.getDiv()) != null && (b4 = div.b()) != null && (n4 = b4.n()) != null) {
                str = (String) n4.evaluate(divItemBuilderResult2.getExpressionResolver());
            }
            return (str2 == null && str == null) ? areContentsTheSame(divItemBuilderResult, divItemBuilderResult2) : Intrinsics.areEqual(str2, str);
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getOldListSize() {
            return this.oldItems.size();
        }

        private final boolean areContentsTheSame(DivItemBuilderResult divItemBuilderResult, DivItemBuilderResult divItemBuilderResult2) {
            if (divItemBuilderResult == null || divItemBuilderResult2 == null) {
                return Intrinsics.areEqual(divItemBuilderResult, divItemBuilderResult2);
            }
            suppressMissingVariableException(divItemBuilderResult, true);
            suppressMissingVariableException(divItemBuilderResult2, true);
            boolean a4 = divItemBuilderResult.getDiv().a(divItemBuilderResult2.getDiv(), divItemBuilderResult.getExpressionResolver(), divItemBuilderResult2.getExpressionResolver());
            suppressMissingVariableException(divItemBuilderResult, false);
            suppressMissingVariableException(divItemBuilderResult2, false);
            return a4;
        }
    }

    @Metadata
    private final class UpdateCallBack implements n {

        @NotNull
        private final List<DivItemBuilderResult> newItems;
        final /* synthetic */ DivCollectionAdapter<VH> this$0;

        public UpdateCallBack(@NotNull DivCollectionAdapter divCollectionAdapter, List<DivItemBuilderResult> newItems) {
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.this$0 = divCollectionAdapter;
            this.newItems = newItems;
        }

        @Override // androidx.recyclerview.widget.n
        public void onChanged(int i4, int i5, @Nullable Object obj) {
        }

        @Override // androidx.recyclerview.widget.n
        public void onInserted(int i4, int i5) {
            int size = i4 + i5 > this.newItems.size() ? this.newItems.size() - i5 : i4;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i4 + i6;
                this.this$0.getItems().add(i7, this.newItems.get(size + i6));
                VisibilityAwareAdapter.updateItemVisibility$default(this.this$0, i7, null, 2, null);
            }
        }

        @Override // androidx.recyclerview.widget.n
        public void onMoved(int i4, int i5) {
            onRemoved(i4, 1);
            onInserted(i5, 1);
        }

        @Override // androidx.recyclerview.widget.n
        public void onRemoved(int i4, int i5) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.this$0.updateItemVisibility(i4, Vf.GONE);
                this.this$0.getItems().remove(i4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCollectionAdapter(@NotNull List<DivItemBuilderResult> items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
    }

    public final boolean applyPatch(@Nullable RecyclerView recyclerView, @NotNull DivPatchCache divPatchCache, @NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        divPatchCache.getPatch(bindingContext.getDivView().getDataTag());
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) CollectionsKt.getOrNull(getVisibleItems(), i4);
        if (divItemBuilderResult == null) {
            return 0;
        }
        Expression n4 = divItemBuilderResult.getDiv().b().n();
        String str = n4 != null ? (String) n4.evaluate(divItemBuilderResult.getExpressionResolver()) : null;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setItems(@NotNull List<DivItemBuilderResult> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        DiffUtilCallback diffUtilCallback = new DiffUtilCallback(getItems(), newItems);
        h.b(diffUtilCallback).b(new UpdateCallBack(this, newItems));
        subscribeOnElements();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((RecyclerView.E) holder);
        holder.updateState();
    }
}
