package de;

import java.util.Iterator;
import kotlin.collections.i0;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Iterator, xd.a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f3705e;

    /* renamed from: r, reason: collision with root package name */
    public Object f3707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Sequence f3708s;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3704d = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f3706i = -1;

    public c(d dVar) {
        this.f3708s = dVar;
        this.f3705e = new p((o) dVar.f3710b);
    }

    public void a() {
        Object next;
        d dVar = (d) this.f3708s;
        do {
            Iterator it = this.f3705e;
            if (!it.hasNext()) {
                this.f3706i = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((a1.f) dVar.f3711c).invoke(next)).booleanValue());
        this.f3707r = next;
        this.f3706i = 1;
    }

    public void b() {
        Iterator it = this.f3705e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((o) this.f3708s).f3725c.invoke(next)).booleanValue()) {
                this.f3706i = 1;
                this.f3707r = next;
                return;
            }
        }
        this.f3706i = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3704d) {
            case 0:
                if (this.f3706i == -1) {
                    a();
                }
                if (this.f3706i == 1) {
                }
                break;
            default:
                if (this.f3706i == -1) {
                    b();
                }
                if (this.f3706i == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3704d) {
            case 0:
                if (this.f3706i == -1) {
                    a();
                }
                if (this.f3706i == 0) {
                    i0.c();
                    break;
                } else {
                    Object obj = this.f3707r;
                    this.f3707r = null;
                    this.f3706i = -1;
                    break;
                }
            default:
                if (this.f3706i == -1) {
                    b();
                }
                if (this.f3706i == 0) {
                    i0.c();
                    break;
                } else {
                    Object obj2 = this.f3707r;
                    this.f3707r = null;
                    this.f3706i = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3704d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(o oVar) {
        this.f3708s = oVar;
        this.f3705e = oVar.f3724b.iterator();
    }
}
