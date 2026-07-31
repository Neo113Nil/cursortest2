package b;

import android.content.res.Resources;
import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0424c;

/* renamed from: b.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303G extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0303G f5274f = new C0303G(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0303G f5275g = new C0303G(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0303G f5276h = new C0303G(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0303G(int i3, int i4) {
        super(i3);
        this.f5277e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f5277e) {
            case 0:
                Resources resources = (Resources) obj;
                f2.j.f(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                f2.j.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                f2.j.f(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof InterfaceC0302F) {
                    return (InterfaceC0302F) tag;
                }
                return null;
        }
    }
}
