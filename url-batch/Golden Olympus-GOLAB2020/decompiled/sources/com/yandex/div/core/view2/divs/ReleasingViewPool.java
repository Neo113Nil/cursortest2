package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ReleasingViewPool extends RecyclerView.v {

    @NotNull
    private final ReleaseViewVisitor releaseViewVisitor;

    @NotNull
    private final Set<RecyclerView.E> viewsSet;

    public ReleasingViewPool(@NotNull ReleaseViewVisitor releaseViewVisitor) {
        Intrinsics.checkNotNullParameter(releaseViewVisitor, "releaseViewVisitor");
        this.releaseViewVisitor = releaseViewVisitor;
        this.viewsSet = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void clear() {
        super.clear();
        for (RecyclerView.E e4 : this.viewsSet) {
            ReleaseViewVisitor releaseViewVisitor = this.releaseViewVisitor;
            View view = e4.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
            DivViewVisitorKt.visitViewTree(releaseViewVisitor, view);
        }
        this.viewsSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    @Nullable
    public RecyclerView.E getRecycledView(int i4) {
        RecyclerView.E recycledView = super.getRecycledView(i4);
        if (recycledView == null) {
            return null;
        }
        this.viewsSet.remove(recycledView);
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void putRecycledView(@Nullable RecyclerView.E e4) {
        super.putRecycledView(e4);
        if (e4 != null) {
            this.viewsSet.add(e4);
        }
    }
}
