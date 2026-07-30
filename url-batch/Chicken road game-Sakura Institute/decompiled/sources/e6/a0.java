package e6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2806f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f2807g;

    /* renamed from: h, reason: collision with root package name */
    public int f2808h;

    public a0(Iterator it) {
        r6.k.f(it, "iterator");
        this.f2807g = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2806f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f2807g.hasNext();
        }
        while (true) {
            int i7 = this.f2808h;
            it = this.f2807g;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f2808h--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2806f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f2808h;
                this.f2808h = i7 + 1;
                if (i7 >= 0) {
                    return new y(i7, this.f2807g.next());
                }
                m.Z();
                throw null;
        }
        while (true) {
            int i8 = this.f2808h;
            it = this.f2807g;
            if (i8 > 0 && it.hasNext()) {
                it.next();
                this.f2808h--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2806f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a0(y6.b bVar) {
        this.f2807g = bVar.f9903a.iterator();
        this.f2808h = bVar.f9904b;
    }
}
