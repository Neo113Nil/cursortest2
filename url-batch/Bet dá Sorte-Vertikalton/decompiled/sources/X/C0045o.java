package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045o extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0047q f1027e;

    public C0045o(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f1027e = abstractComponentCallbacksC0047q;
    }

    @Override // u1.l
    public final View V(int i) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1027e;
        View view = abstractComponentCallbacksC0047q.f1041E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " does not have a view");
    }

    @Override // u1.l
    public final boolean Y() {
        return this.f1027e.f1041E != null;
    }
}
