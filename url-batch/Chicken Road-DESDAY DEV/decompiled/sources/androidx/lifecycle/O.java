package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1408a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1408a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((M) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
