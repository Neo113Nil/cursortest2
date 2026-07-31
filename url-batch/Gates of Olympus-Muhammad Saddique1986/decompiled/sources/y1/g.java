package y1;

import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0424c;
import f2.j;
import f2.k;

/* loaded from: classes.dex */
public final class g extends k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final g f10393f = new g(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final g f10394g = new g(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i4) {
        super(i3);
        this.f10395e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f10395e) {
            case 0:
                View view = (View) obj;
                j.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                j.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
