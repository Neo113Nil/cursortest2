package b6;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f1303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1305f;

    public e0(e2 e2Var, m0.z0 z0Var, m0.z0 z0Var2) {
        this.f1303d = e2Var;
        this.f1304e = z0Var;
        this.f1305f = z0Var2;
    }

    @Override // p6.a
    public final Object b() {
        e2 e2Var = this.f1303d;
        this.f1304e.setValue(e2Var.f1309a);
        List list = e2Var.f1311c;
        t6.d dVar = t6.e.f6924d;
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        int size = list.size();
        dVar.getClass();
        this.f1305f.setValue((String) list.get(t6.e.f6925e.a().nextInt(size)));
        return c6.m.f1757a;
    }
}
