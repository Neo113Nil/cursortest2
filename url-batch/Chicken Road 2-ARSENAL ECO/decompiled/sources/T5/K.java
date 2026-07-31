package T5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0205v f2396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(C0205v c0205v, int i7) {
        super(0);
        this.f2395f = i7;
        this.f2396g = c0205v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k5.e] */
    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        int i7 = this.f2395f;
        C0205v c0205v = this.f2396g;
        switch (i7) {
            case 0:
                return Integer.valueOf(J.c(c0205v, (R5.e[]) c0205v.f2471g.getValue()));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                C0206w c0206w = c0205v.f2466b;
                return c0206w != null ? new Q5.a[]{(Q5.a) c0206w.f2475b} : J.f2394b;
            default:
                return J.b(c0205v.f2466b != null ? new ArrayList(0) : null);
        }
    }
}
