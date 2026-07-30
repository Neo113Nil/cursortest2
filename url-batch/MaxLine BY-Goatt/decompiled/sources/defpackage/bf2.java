package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bf2 implements cf2 {
    public final ScrollFeedbackProvider m;

    public bf2(NestedScrollView nestedScrollView) {
        this.m = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.cf2
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.m.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.cf2
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.m.onScrollProgress(i, i2, i3, i4);
    }
}
