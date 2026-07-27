package T2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class f implements Iterator, N2.a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f4042e;

    /* renamed from: j, reason: collision with root package name */
    public Object f4044j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Sequence f4045k;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4041d = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f4043i = -1;

    public f(g gVar) {
        this.f4045k = gVar;
        this.f4042e = new t(gVar.f4046a);
    }

    public void b() {
        Object next;
        boolean booleanValue;
        do {
            Iterator it = this.f4042e;
            if (!it.hasNext()) {
                this.f4043i = 0;
                return;
            }
            next = it.next();
            g gVar = (g) this.f4045k;
            booleanValue = ((Boolean) gVar.f4047b.invoke(next)).booleanValue();
            gVar.getClass();
        } while (booleanValue);
        this.f4044j = next;
        this.f4043i = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    public void c() {
        Iterator it = this.f4042e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((s) this.f4045k).f4056c.invoke(next)).booleanValue()) {
                this.f4043i = 1;
                this.f4044j = next;
                return;
            }
        }
        this.f4043i = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4041d) {
            case 0:
                if (this.f4043i == -1) {
                    b();
                }
                if (this.f4043i == 1) {
                }
                break;
            default:
                if (this.f4043i == -1) {
                    c();
                }
                if (this.f4043i == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4041d) {
            case 0:
                if (this.f4043i == -1) {
                    b();
                }
                if (this.f4043i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f4044j;
                this.f4044j = null;
                this.f4043i = -1;
                return obj;
            default:
                if (this.f4043i == -1) {
                    c();
                }
                if (this.f4043i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f4044j;
                this.f4044j = null;
                this.f4043i = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4041d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(s sVar) {
        this.f4045k = sVar;
        this.f4042e = ((Sequence) sVar.f4055b).iterator();
    }
}
