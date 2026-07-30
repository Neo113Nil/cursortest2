package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3770f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final y1 f3771g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3772h;

    /* renamed from: i, reason: collision with root package name */
    public int f3773i;

    /* renamed from: j, reason: collision with root package name */
    public int f3774j;

    public k0(y1 y1Var, int i7, int i8) {
        this.f3771g = y1Var;
        this.f3772h = i8;
        this.f3773i = i7;
        this.f3774j = y1Var.f3980l;
        if (y1Var.f3979k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3770f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f3773i < this.f3772h;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3770f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = this.f3771g;
                int i7 = y1Var.f3980l;
                int i8 = this.f3774j;
                if (i7 != i8) {
                    throw new ConcurrentModificationException();
                }
                int i9 = this.f3773i;
                this.f3773i = d.j(y1Var.f3974f, i9) + i9;
                return new z1(y1Var, i9, i8);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3770f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k0(y1 y1Var, int i7, l0 l0Var, d dVar) {
        this.f3771g = y1Var;
        this.f3772h = i7;
        this.f3773i = y1Var.f3980l;
    }
}
