package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1475a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1475a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((P) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
