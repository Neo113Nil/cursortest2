package o3;

import a.a0;
import a.g0;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3028a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3029b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3030c;

    public d(a0 a0Var, g0 g0Var) {
        this.f3029b = a0Var;
        this.f3030c = g0Var;
    }

    @Override // o3.e
    public final Iterator iterator() {
        switch (this.f3028a) {
            case 0:
                return new c(this);
            default:
                return new p3.b(this);
        }
    }

    public d(CharSequence charSequence, g0 g0Var) {
        i3.d.e(charSequence, "input");
        this.f3029b = charSequence;
        this.f3030c = g0Var;
    }
}
