package com.yandex.div.core.view2.state;

import androidx.core.view.M;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC3204l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivStateTransitionHolder {
    private boolean cleanScheduled;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final List<AbstractC3204l> transitions;

    public DivStateTransitionHolder(@NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        this.div2View = div2View;
        this.transitions = new ArrayList();
    }

    private void scheduleClean() {
        if (this.cleanScheduled) {
            return;
        }
        final Div2View div2View = this.div2View;
        M.a(div2View, new Runnable() { // from class: com.yandex.div.core.view2.state.DivStateTransitionHolder$scheduleClean$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.clear();
            }
        });
        this.cleanScheduled = true;
    }

    public void append(@NotNull AbstractC3204l transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.transitions.add(transition);
        scheduleClean();
    }

    public void clear() {
        this.transitions.clear();
    }
}
