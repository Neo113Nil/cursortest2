package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuk {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(kuk.class, Object.class, "a");
    public volatile Object a;
    private final ksy c;

    public kuk(Object obj, ksy ksyVar) {
        this.c = ksyVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != kul.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != kul.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != kul.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean b2 = a.b(b, this, obj, obj2);
        if (!b2 || this.c == kul.a) {
            return b2;
        }
        Objects.toString(obj);
        Objects.toString(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
