package d2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o2.C0924c;

/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6082d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f6083e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterable f6084i;

    public l(g2.e eVar) {
        this.f6084i = eVar;
        this.f6083e = eVar.f6696e;
    }

    private final void a() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6082d) {
            case 0:
                if (this.f6083e >= 0) {
                }
                break;
            default:
                if (this.f6083e < ((g2.e) this.f6084i).f6697i) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6082d) {
            case 0:
                long j4 = ((m) this.f6084i).f6085d;
                int i2 = this.f6083e;
                h hVar = new h();
                Math.pow(2.0d, i2);
                this.f6083e--;
                return hVar;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                C0924c[] c0924cArr = ((g2.e) this.f6084i).f6695d;
                int i4 = this.f6083e;
                C0924c c0924c = c0924cArr[i4];
                this.f6083e = i4 + 1;
                return c0924c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6082d) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public l(m mVar) {
        this.f6084i = mVar;
        this.f6083e = mVar.f6086e - 1;
    }
}
