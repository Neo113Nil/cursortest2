package f6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends f implements Iterator, s6.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3410j;

    public d(g gVar, int i7) {
        this.f3410j = i7;
        k.f(gVar, "map");
        this.f3416i = gVar;
        this.f3414g = -1;
        this.f3415h = gVar.f3425m;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3410j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b();
                int i7 = this.f3413f;
                g gVar = (g) this.f3416i;
                if (i7 >= gVar.f3423k) {
                    throw new NoSuchElementException();
                }
                this.f3413f = i7 + 1;
                this.f3414g = i7;
                e eVar = new e(gVar, i7);
                c();
                return eVar;
            case 1:
                b();
                int i8 = this.f3413f;
                g gVar2 = (g) this.f3416i;
                if (i8 >= gVar2.f3423k) {
                    throw new NoSuchElementException();
                }
                this.f3413f = i8 + 1;
                this.f3414g = i8;
                Object obj = gVar2.f3418f[i8];
                c();
                return obj;
            default:
                b();
                int i9 = this.f3413f;
                g gVar3 = (g) this.f3416i;
                if (i9 >= gVar3.f3423k) {
                    throw new NoSuchElementException();
                }
                this.f3413f = i9 + 1;
                this.f3414g = i9;
                Object[] objArr = gVar3.f3419g;
                k.c(objArr);
                Object obj2 = objArr[this.f3414g];
                c();
                return obj2;
        }
    }
}
