package com.google.android.libraries.material.speeddial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import defpackage.dnr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrimView extends View {
    public ScrimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnr.c, i, R.style.InternalScrimViewStyle);
        setBackgroundColor(obtainStyledAttributes.getColor(1, context.getColor(R.color.mtrl_default_background_scrim)));
        setElevation(obtainStyledAttributes.getDimension(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public ScrimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimView(Context context) {
        this(context, null);
    }
}
