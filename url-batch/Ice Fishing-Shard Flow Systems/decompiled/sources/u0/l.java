package u0;

import v0.AbstractC0967k;
import v0.C0958b;
import v0.F;
import v0.H;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final v0.y f8056a;

    static {
        v0.y yVar = new v0.y();
        C0958b c0958b = F.f8175z;
        if (c0958b.a()) {
            yVar.f8209a = AbstractC0967k.a();
            yVar.f8210b = null;
        } else {
            if (!c0958b.b()) {
                throw F.a();
            }
            yVar.f8209a = null;
            yVar.f8210b = H.f8177a.getTracingController();
        }
        f8056a = yVar;
    }
}
