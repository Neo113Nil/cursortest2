package Z;

import android.view.View;

/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045o extends z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0047q f1162a;

    public C0045o(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f1162a = abstractComponentCallbacksC0047q;
    }

    @Override // z1.l
    public final View c0(int i) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1162a;
        View view = abstractComponentCallbacksC0047q.f1176E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " does not have a view");
    }

    @Override // z1.l
    public final boolean f0() {
        return this.f1162a.f1176E != null;
    }
}
