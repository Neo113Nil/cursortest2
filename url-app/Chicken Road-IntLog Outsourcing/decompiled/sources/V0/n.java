package V0;

import java.util.Set;

/* loaded from: classes.dex */
public final class n implements S0.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final i f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3219c;

    public n(Set set, i iVar, o oVar) {
        this.f3217a = set;
        this.f3218b = iVar;
        this.f3219c = oVar;
    }

    public final B.d a(String str, S0.c cVar, S0.e eVar) {
        Set set = this.f3217a;
        if (set.contains(cVar)) {
            return new B.d(this.f3218b, str, cVar, eVar, this.f3219c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
