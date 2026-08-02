package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import defpackage.dyk;
import defpackage.kr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HeaderAvatarsRecyclerView extends BentoRecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        kr krVar = this.l;
        if (krVar != null) {
            dyk dykVar = krVar instanceof dyk ? (dyk) krVar : null;
            if (dykVar == null) {
                throw new IllegalArgumentException("Only HeaderAvatarsAdapter can be used as an adapter for HeaderAvatarsRecyclerView.");
            }
            Context context = getContext();
            context.getClass();
            int min = Math.min(size / context.getResources().getDimensionPixelSize(R.dimen.bento_header_account_avatar_size), 3);
            if (min != dykVar.a) {
                dykVar.a = min;
                dykVar.e.a = min;
                super.onMeasure(0, i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
