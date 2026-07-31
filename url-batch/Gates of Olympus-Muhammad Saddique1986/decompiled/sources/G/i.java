package G;

import java.util.LinkedHashMap;
import t2.InterfaceC1053f;

/* loaded from: classes.dex */
public final class i implements q.j {

    /* renamed from: a, reason: collision with root package name */
    public final long f2003a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2004b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final h f2005c;

    public i(q.k kVar, long j3) {
        this.f2003a = j3;
        this.f2005c = new h(kVar.f7843a, 0, this);
    }

    @Override // q.j
    public final InterfaceC1053f a() {
        return this.f2005c;
    }
}
