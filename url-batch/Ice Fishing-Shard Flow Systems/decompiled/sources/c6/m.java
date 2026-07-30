package c6;

import f6.InterfaceC0406a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public String f4276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4277e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f4278i;

    public m(n nVar) {
        this.f4278i = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4276d == null && !this.f4277e) {
            String readLine = ((BufferedReader) this.f4278i.f4280b).readLine();
            this.f4276d = readLine;
            if (readLine == null) {
                this.f4277e = true;
            }
        }
        return this.f4276d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f4276d;
        this.f4276d = null;
        Intrinsics.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
