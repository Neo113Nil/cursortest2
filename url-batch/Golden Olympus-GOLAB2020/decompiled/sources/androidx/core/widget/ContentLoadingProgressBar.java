package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    long f11992a;

    /* renamed from: b, reason: collision with root package name */
    boolean f11993b;

    /* renamed from: c, reason: collision with root package name */
    boolean f11994c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11995d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f11996e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f11997f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11992a = -1L;
        this.f11993b = false;
        this.f11994c = false;
        this.f11995d = false;
        this.f11996e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.b(ContentLoadingProgressBar.this);
            }
        };
        this.f11997f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.a(ContentLoadingProgressBar.this);
            }
        };
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f11994c = false;
        if (contentLoadingProgressBar.f11995d) {
            return;
        }
        contentLoadingProgressBar.f11992a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f11993b = false;
        contentLoadingProgressBar.f11992a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    private void c() {
        removeCallbacks(this.f11996e);
        removeCallbacks(this.f11997f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
