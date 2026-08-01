package n0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: f, reason: collision with root package name */
    public final ScrollFeedbackProvider f2834f;

    public t(NestedScrollView nestedScrollView) {
        this.f2834f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // n0.u
    public final void onScrollLimit(int i, int i4, int i5, boolean z4) {
        this.f2834f.onScrollLimit(i, i4, i5, z4);
    }

    @Override // n0.u
    public final void onScrollProgress(int i, int i4, int i5, int i6) {
        this.f2834f.onScrollProgress(i, i4, i5, i6);
    }
}
