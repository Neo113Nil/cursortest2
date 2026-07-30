package i5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4948f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f4949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Iterable f4950h;

    public l(l5.f fVar) {
        this.f4950h = fVar;
        this.f4949g = fVar.f6025g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4948f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.f4949g >= 0) {
                }
                break;
            default:
                if (this.f4949g < ((l5.f) this.f4950h).f6026h) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4948f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f4949g;
                h hVar = new h();
                Math.pow(2.0d, i7);
                this.f4949g--;
                return hVar;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                t5.c[] cVarArr = ((l5.f) this.f4950h).f6024f;
                int i8 = this.f4949g;
                t5.c cVar = cVarArr[i8];
                this.f4949g = i8 + 1;
                return cVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4948f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public l(m mVar) {
        this.f4950h = mVar;
        this.f4949g = mVar.f4952g - 1;
    }

    private final void a() {
    }
}
