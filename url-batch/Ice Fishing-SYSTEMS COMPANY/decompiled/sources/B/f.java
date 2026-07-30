package B;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f57n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f58u;

    public f(K1.d dVar) {
        this.f58u = new WeakReference(dVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f57n) {
            case 0:
                ((CoordinatorLayout) this.f58u).p(0);
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                K1.d dVar = (K1.d) ((WeakReference) this.f58u).get();
                if (dVar != null) {
                    ArrayList arrayList = dVar.f1563b;
                    if (!arrayList.isEmpty()) {
                        ImageView imageView = dVar.f1562a;
                        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int a9 = dVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        int a10 = dVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (a9 > 0 || a9 == Integer.MIN_VALUE) {
                            if (a10 > 0 || a10 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((J1.f) ((K1.b) it.next())).l(a9, a10);
                                }
                                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(dVar.f1564c);
                                }
                                dVar.f1564c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    public f(CoordinatorLayout coordinatorLayout) {
        this.f58u = coordinatorLayout;
    }
}
