package o3;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: d, reason: collision with root package name */
    public final ScrollFeedbackProvider f7416d;

    public l(NestedScrollView nestedScrollView) {
        this.f7416d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // o3.m
    public final void onScrollLimit(int i3, int i10, int i11, boolean z10) {
        this.f7416d.onScrollLimit(i3, i10, i11, z10);
    }

    @Override // o3.m
    public final void onScrollProgress(int i3, int i10, int i11, int i12) {
        this.f7416d.onScrollProgress(i3, i10, i11, i12);
    }
}
