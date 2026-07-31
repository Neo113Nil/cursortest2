package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5208a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f5208a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
