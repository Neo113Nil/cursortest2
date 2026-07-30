package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5265a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f5265a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((S) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}
