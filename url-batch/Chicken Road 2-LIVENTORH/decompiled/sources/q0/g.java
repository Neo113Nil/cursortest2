package q0;

import a.e0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.d0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f3066a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3067b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f0.c f3068c;
    public f0.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3069e;

    public g(ViewGroup viewGroup) {
        f0.c cVar = f0.c.f1265e;
        this.f3068c = cVar;
        this.d = cVar;
        Drawable background = viewGroup.getBackground();
        this.f3069e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f3066a = eVar;
        eVar.setWillNotDraw(true);
        e0 e0Var = new e0(4, this);
        WeakHashMap weakHashMap = l0.f2757a;
        d0.j(eVar, e0Var);
        l0.o(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
