package n0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: f, reason: collision with root package name */
    public final ScrollFeedbackProvider f2773f;

    public q(NestedScrollView nestedScrollView) {
        this.f2773f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // n0.r
    public final void onScrollLimit(int i, int i4, int i5, boolean z3) {
        this.f2773f.onScrollLimit(i, i4, i5, z3);
    }

    @Override // n0.r
    public final void onScrollProgress(int i, int i4, int i5, int i6) {
        this.f2773f.onScrollProgress(i, i4, i5, i6);
    }
}
