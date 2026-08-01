package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p40 implements q40 {
    public final ScrollFeedbackProvider f;

    public p40(NestedScrollView nestedScrollView) {
        this.f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.q40
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.q40
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f.onScrollProgress(i, i2, i3, i4);
    }
}
