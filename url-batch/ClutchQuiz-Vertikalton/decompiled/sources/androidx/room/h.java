package androidx.room;

import i0.InterfaceC0146e;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h extends y {
    public abstract void bind(InterfaceC0146e interfaceC0146e, Object obj);

    public final int handle(Object obj) {
        InterfaceC0146e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.w();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        g1.f.e(iterable, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i += acquire.w();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        g1.f.e(objArr, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            int i = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i += acquire.w();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
