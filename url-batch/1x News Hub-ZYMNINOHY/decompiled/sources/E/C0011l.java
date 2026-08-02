package E;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: E.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l implements InterfaceC0012m {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f293a;

    public C0011l(NestedScrollView nestedScrollView) {
        this.f293a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // E.InterfaceC0012m
    public final void a(int i3, int i4, int i5, boolean z) {
        this.f293a.onScrollLimit(i3, i4, i5, z);
    }

    @Override // E.InterfaceC0012m
    public final void b(int i3, int i4, int i5, int i6) {
        this.f293a.onScrollProgress(i3, i4, i5, i6);
    }
}
