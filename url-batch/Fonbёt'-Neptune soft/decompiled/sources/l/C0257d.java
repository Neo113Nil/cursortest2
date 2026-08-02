package l;

import java.util.Iterator;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257d extends i1.a implements Iterator {

    /* renamed from: i, reason: collision with root package name */
    public C0256c f3120i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3121j = true;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0254a f3122k;

    public C0257d(C0254a c0254a) {
        this.f3122k = c0254a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3121j) {
            return this.f3122k.f3108e != null;
        }
        C0256c c0256c = this.f3120i;
        return (c0256c == null || c0256c.f3118g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3121j) {
            this.f3121j = false;
            this.f3120i = this.f3122k.f3108e;
        } else {
            C0256c c0256c = this.f3120i;
            this.f3120i = c0256c != null ? c0256c.f3118g : null;
        }
        return this.f3120i;
    }
}
