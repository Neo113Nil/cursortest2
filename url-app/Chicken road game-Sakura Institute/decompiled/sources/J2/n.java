package J2;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public String f3412d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3413e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f3414i;

    public n(o oVar) {
        this.f3414i = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3412d == null && !this.f3413e) {
            String readLine = ((BufferedReader) this.f3414i.f3416b).readLine();
            this.f3412d = readLine;
            if (readLine == null) {
                this.f3413e = true;
            }
        }
        return this.f3412d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f3412d;
        this.f3412d = null;
        Intrinsics.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
