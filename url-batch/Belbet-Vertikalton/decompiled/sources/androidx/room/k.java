package androidx.room;

import java.util.Iterator;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public abstract class k extends B {
    public abstract void bind(InterfaceC0203e interfaceC0203e, Object obj);

    public final int handle(Object obj) {
        InterfaceC0203e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.A();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        j1.h.e(iterable, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i += acquire.A();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        j1.h.e(objArr, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            int i = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i += acquire.A();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
