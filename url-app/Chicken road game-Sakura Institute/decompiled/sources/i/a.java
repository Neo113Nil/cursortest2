package i;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public int f4713f;

    /* renamed from: g, reason: collision with root package name */
    public int f4714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4716i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4717j;

    public a(int i7) {
        this.f4713f = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4714g < this.f4713f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e9;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4714g;
        switch (this.f4716i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e9 = ((e) this.f4717j).e(i7);
                break;
            case 1:
                e9 = ((e) this.f4717j).h(i7);
                break;
            default:
                e9 = ((f) this.f4717j).f4738g[i7];
                break;
        }
        this.f4714g++;
        this.f4715h = true;
        return e9;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4715h) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f4714g - 1;
        this.f4714g = i7;
        switch (this.f4716i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((e) this.f4717j).f(i7);
                break;
            case 1:
                ((e) this.f4717j).f(i7);
                break;
            default:
                ((f) this.f4717j).a(i7);
                break;
        }
        this.f4713f--;
        this.f4715h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f4739h);
        this.f4716i = 2;
        this.f4717j = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i7) {
        this(eVar.f4744h);
        this.f4716i = i7;
        switch (i7) {
            case 1:
                this.f4717j = eVar;
                this(eVar.f4744h);
                break;
            default:
                this.f4717j = eVar;
                break;
        }
    }
}
