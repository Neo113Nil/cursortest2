package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xu implements xw {
    private final ScrollFeedbackProvider a;

    public xu(View view) {
        ScrollFeedbackProvider createProvider;
        createProvider = ScrollFeedbackProvider.createProvider(view);
        this.a = createProvider;
    }

    @Override // defpackage.xw
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.xw
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
