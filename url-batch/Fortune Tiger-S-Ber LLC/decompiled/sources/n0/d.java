package n0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import j2.z;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.b0;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f2942a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2943b = new ArrayList();
    public c0.c c;

    /* renamed from: d, reason: collision with root package name */
    public c0.c f2944d;

    /* renamed from: e, reason: collision with root package name */
    public int f2945e;

    public d(ViewGroup viewGroup) {
        c0.c cVar = c0.c.f977e;
        this.c = cVar;
        this.f2944d = cVar;
        Drawable background = viewGroup.getBackground();
        this.f2945e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b bVar = new b(this, viewGroup.getContext(), viewGroup);
        this.f2942a = bVar;
        bVar.setWillNotDraw(true);
        z zVar = new z(this);
        WeakHashMap weakHashMap = j0.f2752a;
        b0.j(bVar, zVar);
        j0.o(bVar, new c(this));
        viewGroup.addView(bVar, 0);
    }
}
