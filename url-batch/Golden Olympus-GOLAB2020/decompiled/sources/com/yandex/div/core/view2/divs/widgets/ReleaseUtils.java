package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ReleaseUtils {

    @NotNull
    public static final ReleaseUtils INSTANCE = new ReleaseUtils();

    private ReleaseUtils() {
    }

    public final void releaseAndRemoveChildren$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        releaseChildren$div_release(viewGroup, divView);
        viewGroup.removeAllViews();
    }

    public final void releaseChildren$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Iterator it = AbstractC1293g0.b(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(divView.getReleaseViewVisitor$div_release(), (View) it.next());
        }
    }

    public final void releaseMedia$div_release(@NotNull ViewGroup viewGroup, @NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Iterator it = AbstractC1293g0.b(viewGroup).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(divView.getMediaReleaseViewVisitor$div_release(), (View) it.next());
        }
    }
}
