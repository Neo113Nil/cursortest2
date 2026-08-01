package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f750a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f750a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((u0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
