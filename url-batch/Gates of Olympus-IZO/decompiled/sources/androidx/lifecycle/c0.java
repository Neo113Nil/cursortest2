package androidx.lifecycle;

import android.view.View;
import com.gates.olympus.miruv.R;
import h1.C0438i;

/* loaded from: classes.dex */
public final class c0 extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f4012f = new c0(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f4013g = new c0(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f4014h = new c0(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f4015i = new c0(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i3, int i4) {
        super(i3);
        this.f4016e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f4016e) {
            case 0:
                View view = (View) obj;
                Z1.i.f(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                Z1.i.f(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0236v) {
                    return (InterfaceC0236v) tag;
                }
                return null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                View view3 = (View) obj;
                Z1.i.f(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                Z1.i.f(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof b0) {
                    return (b0) tag2;
                }
                return null;
        }
    }
}
