package q0;

import a.g0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.h0;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3137b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f0.c f3138c;
    public f0.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3139e;

    public f(ViewGroup viewGroup) {
        View view;
        f0.c cVar = f0.c.f1414e;
        this.f3138c = cVar;
        this.d = cVar;
        Drawable background = viewGroup.getBackground();
        this.f3139e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        d dVar = new d(this, viewGroup.getContext(), viewGroup);
        this.f3136a = dVar;
        dVar.setVisibility(8);
        dVar.setWillNotDraw(true);
        g0 g0Var = new g0(5, this);
        WeakHashMap weakHashMap = p0.f2816a;
        h0.c(dVar, g0Var);
        p0.o(dVar, new e(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(dVar, 0);
        } else {
            view.addOnAttachStateChangeListener(new y(viewGroup, dVar));
        }
    }
}
