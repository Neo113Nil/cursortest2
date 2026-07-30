package androidx.room;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar) {
        super(uVar);
        r6.k.f(uVar, "database");
    }

    public abstract void bind(y3.e eVar, Object obj);

    public final int handle(Object obj) {
        y3.e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.l();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        r6.k.f(iterable, "entities");
        y3.e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i7 += acquire.l();
            }
            return i7;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        r6.k.f(objArr, "entities");
        y3.e acquire = acquire();
        try {
            int i7 = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i7 += acquire.l();
            }
            return i7;
        } finally {
            release(acquire);
        }
    }
}
