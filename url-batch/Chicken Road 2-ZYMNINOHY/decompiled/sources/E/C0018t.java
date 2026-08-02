package E;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: E.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t implements InterfaceC0019u {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f442a;

    public C0018t(NestedScrollView nestedScrollView) {
        this.f442a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // E.InterfaceC0019u
    public final void onScrollLimit(int i4, int i5, int i6, boolean z) {
        this.f442a.onScrollLimit(i4, i5, i6, z);
    }

    @Override // E.InterfaceC0019u
    public final void onScrollProgress(int i4, int i5, int i6, int i7) {
        this.f442a.onScrollProgress(i4, i5, i6, i7);
    }
}
