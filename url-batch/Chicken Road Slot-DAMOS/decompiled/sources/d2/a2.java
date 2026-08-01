package d2;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.appsflyer.R;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a2 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3335e;

    public /* synthetic */ a2(int i3, Object obj) {
        this.f3334d = i3;
        this.f3335e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3334d) {
            case 2:
                b7.h hVar = (b7.h) this.f3335e;
                Context context = view.getContext();
                if (!hVar.f1292a) {
                    context.getApplicationContext().registerComponentCallbacks((k1.d) hVar.f1296e);
                    hVar.f1292a = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i3 = this.f3334d;
        boolean z10 = false;
        Object obj = this.f3335e;
        switch (i3) {
            case 0:
                a aVar = (a) obj;
                Iterator it = de.k.c(aVar.getParent(), o3.h0.f7396v).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    aVar.f();
                    break;
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((ge.r1) obj).a(null);
                break;
            case 2:
                b7.h hVar = (b7.h) obj;
                Context context = view.getContext();
                if (hVar.f1292a) {
                    context.getApplicationContext().unregisterComponentCallbacks((k1.d) hVar.f1296e);
                    hVar.f1292a = false;
                    break;
                }
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                l.f fVar = (l.f) obj;
                ViewTreeObserver viewTreeObserver = fVar.L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.L = view.getViewTreeObserver();
                    }
                    fVar.L.removeGlobalOnLayoutListener(fVar.f5654w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                l.r rVar = (l.r) obj;
                ViewTreeObserver viewTreeObserver2 = rVar.C;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rVar.C = view.getViewTreeObserver();
                    }
                    rVar.C.removeGlobalOnLayoutListener(rVar.f5725w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
