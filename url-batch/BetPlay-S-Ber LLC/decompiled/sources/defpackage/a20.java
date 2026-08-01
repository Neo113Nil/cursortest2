package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a20 implements b20 {
    public final ScrollFeedbackProvider f;

    public a20(NestedScrollView nestedScrollView) {
        this.f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.b20
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.b20
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f.onScrollProgress(i, i2, i3, i4);
    }
}
