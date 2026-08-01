package A0;

import K.Q;
import T0.e;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f7a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f9c;

    public d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f9c = swipeDismissBehavior;
        this.f7a = view;
        this.f8b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        SwipeDismissBehavior swipeDismissBehavior = this.f9c;
        T.e eVar2 = swipeDismissBehavior.f2139a;
        View view = this.f7a;
        if (eVar2 != null && eVar2.f()) {
            WeakHashMap weakHashMap = Q.f578a;
            view.postOnAnimation(this);
        } else {
            if (!this.f8b || (eVar = swipeDismissBehavior.f2140b) == null) {
                return;
            }
            eVar.a(view);
        }
    }
}
