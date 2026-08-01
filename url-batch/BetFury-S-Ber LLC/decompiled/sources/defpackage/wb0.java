package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wb0 implements xb0 {
    public final ScrollFeedbackProvider f;

    public wb0(NestedScrollView nestedScrollView) {
        this.f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.xb0
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.xb0
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f.onScrollProgress(i, i2, i3, i4);
    }
}
