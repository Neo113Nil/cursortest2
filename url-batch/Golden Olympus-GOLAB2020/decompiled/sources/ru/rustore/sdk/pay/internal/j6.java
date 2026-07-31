package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class j6 extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f44362a;

    public j6(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44362a = context.getResources().getDimensionPixelOffset(R.dimen.sdk_pay_spacer_xs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
        int e4 = cVar != null ? cVar.e() : 0;
        int i4 = this.f44362a;
        outRect.bottom = i4;
        if (e4 == 0) {
            outRect.right = i4 / 2;
        } else {
            outRect.left = i4 / 2;
        }
    }
}
