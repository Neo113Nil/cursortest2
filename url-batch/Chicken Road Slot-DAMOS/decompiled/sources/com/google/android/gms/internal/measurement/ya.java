package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ya {

    /* renamed from: a, reason: collision with root package name */
    public static final s.e f3012a = new s.e(0);

    public static synchronized void a() {
        synchronized (ya.class) {
            s.e eVar = f3012a;
            Iterator it = ((s.d) eVar.values()).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            eVar.clear();
        }
    }
}
