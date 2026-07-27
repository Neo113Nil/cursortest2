package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5462a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f5462a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((T) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
