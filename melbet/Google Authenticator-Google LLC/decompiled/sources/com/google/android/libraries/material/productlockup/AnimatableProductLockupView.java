package com.google.android.libraries.material.productlockup;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.dne;
import defpackage.dnh;
import defpackage.dni;
import defpackage.kee;
import defpackage.mu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AnimatableProductLockupView extends ProductLockupView {
    public final dne a;

    public AnimatableProductLockupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dne dneVar = new dne(context, this, this.b, c());
        this.a = dneVar;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(233L);
        duration.setStartDelay(600L);
        byte[] bArr = null;
        duration.addUpdateListener(new mu(this, 4, bArr));
        dneVar.k = duration;
        dneVar.f = true;
        dneVar.o = new kee(this, bArr);
        dneVar.g = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnh.a, i, R.style.Widget_GoogleMaterial_AnimatableProductLockupView);
        dneVar.d = obtainStyledAttributes.getInteger(1, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            dni a = dneVar.a(obtainStyledAttributes.getResourceId(0, 0), 1, 0);
            dneVar.h = true;
            dneVar.c.setImageDrawable(a);
        }
        obtainStyledAttributes.recycle();
    }

    private final int c() {
        int i = this.e;
        if (i != 0) {
            return getContext().getColor(b(i));
        }
        return 0;
    }

    @Override // com.google.android.libraries.material.productlockup.ProductLockupView
    public final void a(int i) {
        super.a(i);
        dne dneVar = this.a;
        if (dneVar != null) {
            dneVar.i = c();
            dneVar.g = true;
        }
    }

    public AnimatableProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public AnimatableProductLockupView(Context context) {
        this(context, null);
    }
}
