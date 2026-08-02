package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ksl;
import defpackage.ksp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardFrameLayout extends FrameLayout {
    public View a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardFrameLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public final void a(int i, int i2) {
        View view = this.a;
        if (view == null) {
            ksp.a("responsiveContent");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i3 = -2;
        layoutParams.width = i + (-1) != 0 ? 0 : -2;
        view.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (i2 == 0 && i == 2) {
            i3 = -1;
        }
        layoutParams2.height = i3;
        setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ CardFrameLayout(Context context, AttributeSet attributeSet, int i, ksl kslVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
