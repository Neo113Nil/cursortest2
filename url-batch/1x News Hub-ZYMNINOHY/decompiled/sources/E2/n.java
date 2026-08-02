package E2;

import b2.C0195i;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f456b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f455a = i3;
        this.f456b = obj;
    }

    @Override // l2.a
    public final Object invoke() {
        h hVar;
        switch (this.f455a) {
            case 0:
                p pVar = (p) this.f456b;
                if (pVar.f471n && (hVar = pVar.f463e) != null) {
                    hVar.a();
                }
                return C0195i.f2555a;
            default:
                return y6.a((ib) this.f456b);
        }
    }
}
