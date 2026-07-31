package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, u> f933a = new HashMap<>();

    public final void a() {
        Iterator<u> it = this.f933a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f933a.clear();
    }

    final u b(String str) {
        return this.f933a.get(str);
    }

    final void c(String str, u uVar) {
        u put = this.f933a.put(str, uVar);
        if (put != null) {
            put.c();
        }
    }
}
