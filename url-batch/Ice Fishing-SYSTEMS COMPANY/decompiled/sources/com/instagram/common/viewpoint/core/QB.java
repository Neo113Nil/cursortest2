package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC1326Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC1370Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC1370Xx viewOnSystemUiVisibilityChangeListenerC1370Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC1370Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
