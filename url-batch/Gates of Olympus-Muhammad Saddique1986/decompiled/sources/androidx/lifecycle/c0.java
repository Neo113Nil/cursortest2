package androidx.lifecycle;

import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class c0 extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f5213f = new c0(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f5214g = new c0(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f5215h = new c0(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f5216i = new c0(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i3, int i4) {
        super(i3);
        this.f5217e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f5217e) {
            case 0:
                View view = (View) obj;
                f2.j.f(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                f2.j.f(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0292v) {
                    return (InterfaceC0292v) tag;
                }
                return null;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                View view3 = (View) obj;
                f2.j.f(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                f2.j.f(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof b0) {
                    return (b0) tag2;
                }
                return null;
        }
    }
}
