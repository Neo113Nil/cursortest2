package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import defpackage.fho;
import defpackage.fhq;
import defpackage.kv;
import defpackage.le;
import defpackage.lm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardStackRecyclerView extends BentoRecyclerView {

    /* compiled from: PG */
    public final class LayoutManagerWithoutAccessibilityIndication extends LinearLayoutManager {
        public LayoutManagerWithoutAccessibilityIndication() {
            super(1);
        }

        @Override // defpackage.ky
        public final int b(le leVar, lm lmVar) {
            leVar.getClass();
            lmVar.getClass();
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context) {
        super(context);
        context.getClass();
        fho fhoVar = new fho(getContext());
        fhoVar.d(fhq.d(getContext(), R.attr.colorSurfaceContainer, 0));
        fhoVar.b = false;
        fhoVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        av(fhoVar);
        getContext().getClass();
        Y(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        kv kvVar = this.C;
        kvVar = true != (kvVar instanceof kv) ? null : kvVar;
        if (kvVar != null) {
            kvVar.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        fho fhoVar = new fho(getContext());
        fhoVar.d(fhq.d(getContext(), R.attr.colorSurfaceContainer, 0));
        fhoVar.b = false;
        fhoVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        av(fhoVar);
        getContext().getClass();
        Y(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        kv kvVar = this.C;
        kvVar = true != (kvVar instanceof kv) ? null : kvVar;
        if (kvVar != null) {
            kvVar.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        fho fhoVar = new fho(getContext());
        fhoVar.d(fhq.d(getContext(), R.attr.colorSurfaceContainer, 0));
        fhoVar.b = false;
        fhoVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        av(fhoVar);
        getContext().getClass();
        Y(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        kv kvVar = this.C;
        kvVar = true != (kvVar instanceof kv) ? null : kvVar;
        if (kvVar != null) {
            kvVar.j();
        }
    }
}
