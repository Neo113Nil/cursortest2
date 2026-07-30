package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3894a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f3894a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((W) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}
