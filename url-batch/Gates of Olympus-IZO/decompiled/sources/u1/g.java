package u1;

import Z1.i;
import Z1.j;
import android.view.View;
import com.gates.olympus.miruv.R;

/* loaded from: classes.dex */
public final class g extends j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final g f8518f = new g(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final g f8519g = new g(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i4) {
        super(i3);
        this.f8520e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8520e) {
            case 0:
                View view = (View) obj;
                i.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                i.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
