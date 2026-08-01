package sd;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public String f9190d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9191e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ de.j f9192i;

    public m(de.j jVar) {
        this.f9192i = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9190d == null && !this.f9191e) {
            String readLine = ((BufferedReader) this.f9192i.f3720b).readLine();
            this.f9190d = readLine;
            if (readLine == null) {
                this.f9191e = true;
            }
        }
        return this.f9190d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        String str = this.f9190d;
        this.f9190d = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
