package k0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5296h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5297i;

    public d(Object[] objArr, int i7, int i8) {
        super(i7, i8);
        this.f5297i = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5296h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5297i;
                int i7 = this.f5292f;
                this.f5292f = i7 + 1;
                return objArr[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f5292f++;
                return this.f5297i;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5296h) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5297i;
                int i7 = this.f5292f - 1;
                this.f5292f = i7;
                return objArr[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f5292f--;
                return this.f5297i;
        }
    }

    public d(int i7, Object obj) {
        super(i7, 1);
        this.f5297i = obj;
    }
}
