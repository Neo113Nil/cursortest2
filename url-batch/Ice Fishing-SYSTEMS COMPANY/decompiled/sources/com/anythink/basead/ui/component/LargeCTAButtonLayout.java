package com.anythink.basead.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public class LargeCTAButtonLayout extends CTAButtonLayout {
    public LargeCTAButtonLayout(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.component.CTAButtonLayout
    public final int a(w wVar, x xVar, boolean z8) {
        return 2;
    }

    public LargeCTAButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LargeCTAButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
