package G;

import java.util.LinkedHashMap;
import n2.InterfaceC0700f;
import q.i;
import q.j;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final long f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1516b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final d f1517c;

    public e(j jVar, long j3) {
        this.f1515a = j3;
        this.f1517c = new d(jVar.f6817a, 0, this);
    }

    @Override // q.i
    public final InterfaceC0700f a() {
        return this.f1517c;
    }
}
