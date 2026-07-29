package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, m> f1375a = new HashMap<>();

    final void a(String str, m mVar) {
        m mVar2 = this.f1375a.get(str);
        if (mVar2 != null) {
            mVar2.onCleared();
        }
        this.f1375a.put(str, mVar);
    }

    final m a(String str) {
        return this.f1375a.get(str);
    }

    public final void a() {
        Iterator<m> it = this.f1375a.values().iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
        this.f1375a.clear();
    }
}
