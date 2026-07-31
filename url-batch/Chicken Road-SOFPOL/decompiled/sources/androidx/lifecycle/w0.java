package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f877a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f877a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((r0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
