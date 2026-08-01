package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class xa {

    /* renamed from: a, reason: collision with root package name */
    public static final v5 f2981a;

    static {
        Object obj;
        ((i) d.f2209a).getClass();
        AtomicReference atomicReference = m.f2511f;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            o oVar = (o) atomicReference.get();
            obj = new q("Phlogger", oVar.f2593a, oVar.f2594b, oVar.f2595c);
        } else {
            int i3 = 7;
            while (true) {
                if (i3 >= 0) {
                    char charAt = "Phlogger".charAt(i3);
                    if (charAt != '$') {
                        if (charAt == '.') {
                            break;
                        } else {
                            i3--;
                        }
                    } else {
                        str = "Phlogger".replace('$', '.');
                        break;
                    }
                } else {
                    break;
                }
            }
            m mVar = new m(str);
            if (m.f2508c || m.f2509d) {
                mVar.f2513b = new p(str);
            } else if (m.f2510e) {
                o oVar2 = q.f2685h;
                mVar.f2513b = new q(str, Level.OFF, oVar2.f2594b, oVar2.f2595c);
            } else {
                mVar.f2513b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = k.f2433a;
            concurrentLinkedQueue.offer(mVar);
            obj = mVar;
            if (atomicReference.get() != null) {
                while (true) {
                    m mVar2 = (m) concurrentLinkedQueue.poll();
                    if (mVar2 == null) {
                        break;
                    }
                    o oVar3 = (o) atomicReference.get();
                    mVar2.f2513b = new q((String) mVar2.f3003a, oVar3.f2593a, oVar3.f2594b, oVar3.f2595c);
                }
                m.m();
                obj = mVar;
            }
        }
        f2981a = new v5(2, obj);
    }
}
