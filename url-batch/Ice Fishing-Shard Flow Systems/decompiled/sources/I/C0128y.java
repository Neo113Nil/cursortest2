package I;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: I.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128y implements InterfaceC0129z {

    /* renamed from: d, reason: collision with root package name */
    public final ScrollFeedbackProvider f1247d;

    public C0128y(NestedScrollView nestedScrollView) {
        this.f1247d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // I.InterfaceC0129z
    public final void onScrollLimit(int i2, int i5, int i7, boolean z7) {
        this.f1247d.onScrollLimit(i2, i5, i7, z7);
    }

    @Override // I.InterfaceC0129z
    public final void onScrollProgress(int i2, int i5, int i7, int i8) {
        this.f1247d.onScrollProgress(i2, i5, i7, i8);
    }
}
