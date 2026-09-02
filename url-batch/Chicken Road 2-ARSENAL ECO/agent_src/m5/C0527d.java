package m5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.InterfaceC0766a;

/* renamed from: m5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527d implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final C0529f f5460f;

    /* renamed from: g, reason: collision with root package name */
    public int f5461g;

    /* renamed from: h, reason: collision with root package name */
    public int f5462h;

    /* renamed from: i, reason: collision with root package name */
    public int f5463i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5464j;

    public C0527d(C0529f map, int i7) {
        this.f5464j = i7;
        kotlin.jvm.internal.i.e(map, "map");
        this.f5460f = map;
        this.f5462h = -1;
        this.f5463i = map.f5476m;
        b();
    }

    public final void a() {
        if (this.f5460f.f5476m != this.f5463i) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i7 = this.f5461g;
            C0529f c0529f = this.f5460f;
            if (i7 >= c0529f.f5474k || c0529f.f5471h[i7] >= 0) {
                return;
            } else {
                this.f5461g = i7 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5461g < this.f5460f.f5474k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5464j) {
            case 0:
                a();
                int i7 = this.f5461g;
                C0529f c0529f = this.f5460f;
                if (i7 >= c0529f.f5474k) {
                    throw new NoSuchElementException();
                }
                this.f5461g = i7 + 1;
                this.f5462h = i7;
                C0528e c0528e = new C0528e(c0529f, i7);
                b();
                return c0528e;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a();
                int i8 = this.f5461g;
                C0529f c0529f2 = this.f5460f;
                if (i8 >= c0529f2.f5474k) {
                    throw new NoSuchElementException();
                }
                this.f5461g = i8 + 1;
                this.f5462h = i8;
                Object obj = c0529f2.f5469f[i8];
                b();
                return obj;
            default:
                a();
                int i9 = this.f5461g;
                C0529f c0529f3 = this.f5460f;
                if (i9 >= c0529f3.f5474k) {
                    throw new NoSuchElementException();
                }
                this.f5461g = i9 + 1;
                this.f5462h = i9;
                Object[] objArr = c0529f3.f5470g;
                kotlin.jvm.internal.i.b(objArr);
                Object obj2 = objArr[this.f5462h];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f5462h == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C0529f c0529f = this.f5460f;
        c0529f.c();
        c0529f.l(this.f5462h);
        this.f5462h = -1;
        this.f5463i = c0529f.f5476m;
    }
}
