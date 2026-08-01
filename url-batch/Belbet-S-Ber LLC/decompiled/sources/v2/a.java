package v2;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f3730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3731g;
    public final /* synthetic */ f2.a h;
    public final /* synthetic */ ExpandableBehavior i;

    public a(ExpandableBehavior expandableBehavior, View view, int i, f2.a aVar) {
        this.i = expandableBehavior;
        this.f3730f = view;
        this.f3731g = i;
        this.h = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f3730f;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.i;
        if (expandableBehavior.f1272a == this.f3731g) {
            Object obj = this.h;
            expandableBehavior.r((View) obj, view, ((FloatingActionButton) obj).f1149t.f1436f, false);
        }
        return false;
    }
}
