package q3;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: d, reason: collision with root package name */
    public final ScrollFeedbackProvider f6153d;

    public s(NestedScrollView nestedScrollView) {
        this.f6153d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // q3.t
    public final void onScrollLimit(int i, int i8, int i9, boolean z3) {
        this.f6153d.onScrollLimit(i, i8, i9, z3);
    }

    @Override // q3.t
    public final void onScrollProgress(int i, int i8, int i9, int i10) {
        this.f6153d.onScrollProgress(i, i8, i9, i10);
    }
}
