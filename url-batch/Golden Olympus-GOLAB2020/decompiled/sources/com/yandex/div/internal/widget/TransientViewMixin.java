package com.yandex.div.internal.widget;

import android.view.View;
import androidx.core.view.AbstractC1295h0;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class TransientViewMixin implements TransientView {
    private int transitionCount;

    private final void invalidateView(View view) {
        view.invalidate();
        Sequence p4 = k.p(AbstractC1295h0.a(view), TransientViewMixin$invalidateView$$inlined$filterIsInstance$1.INSTANCE);
        Intrinsics.checkNotNull(p4, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = p4.iterator();
        while (it.hasNext()) {
            ((DivBorderSupports) it.next()).invalidateBorder();
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.transitionCount != 0;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i4 = this.transitionCount;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.transitionCount = i5;
            if (i5 == 0) {
                invalidateView(view);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i4 = this.transitionCount + 1;
        this.transitionCount = i4;
        if (i4 == 1) {
            invalidateView(view);
        }
    }
}
