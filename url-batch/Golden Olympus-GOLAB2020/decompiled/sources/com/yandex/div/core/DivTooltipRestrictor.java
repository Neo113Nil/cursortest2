package com.yandex.div.core;

import O1.Se;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes2.dex */
public interface DivTooltipRestrictor {
    public static final DivTooltipRestrictor STUB = new DivTooltipRestrictor() { // from class: m1.h
        @Override // com.yandex.div.core.DivTooltipRestrictor
        public final boolean canShowTooltip(Div2View div2View, View view, Se se, boolean z4) {
            return DivTooltipRestrictor.a(div2View, view, se, z4);
        }
    };

    public interface DivTooltipShownCallback {
    }

    static /* synthetic */ boolean a(Div2View div2View, View view, Se se, boolean z4) {
        return true;
    }

    boolean canShowTooltip(@NonNull Div2View div2View, @NonNull View view, @NonNull Se se, boolean z4);

    default DivTooltipShownCallback getTooltipShownCallback() {
        return null;
    }
}
