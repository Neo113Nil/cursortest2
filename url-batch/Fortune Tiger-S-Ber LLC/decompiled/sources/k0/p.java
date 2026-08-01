package k0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: f, reason: collision with root package name */
    public final ScrollFeedbackProvider f2765f;

    public p(NestedScrollView nestedScrollView) {
        this.f2765f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // k0.q
    public final void onScrollLimit(int i4, int i5, int i6, boolean z3) {
        this.f2765f.onScrollLimit(i4, i5, i6, z3);
    }

    @Override // k0.q
    public final void onScrollProgress(int i4, int i5, int i6, int i7) {
        this.f2765f.onScrollProgress(i4, i5, i6, i7);
    }
}
