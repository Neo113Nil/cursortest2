package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f1338a;

    CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.f1338a = bVarArr;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        i iVar = new i();
        for (b bVar : this.f1338a) {
            bVar.a(eVar, aVar, false, iVar);
        }
        for (b bVar2 : this.f1338a) {
            bVar2.a(eVar, aVar, true, iVar);
        }
    }
}
