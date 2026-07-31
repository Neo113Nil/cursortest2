package b;

import android.content.res.Resources;
import android.view.View;
import com.gates.olympus.miruv.R;

/* loaded from: classes.dex */
public final class H extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final H f4139f = new H(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final H f4140g = new H(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final H f4141h = new H(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i3, int i4) {
        super(i3);
        this.f4142e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f4142e) {
            case 0:
                Resources resources = (Resources) obj;
                Z1.i.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                Z1.i.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                Z1.i.f(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof G) {
                    return (G) tag;
                }
                return null;
        }
    }
}
