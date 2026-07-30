package d6;

import com.android.installreferrer.api.InstallReferrerClient;
import i.h0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class q implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2628f;

    /* renamed from: g, reason: collision with root package name */
    public int f2629g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2630h;

    public /* synthetic */ q(int i7, Object obj) {
        this.f2628f = i7;
        this.f2630h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2628f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.f2629g < ((byte[]) this.f2630h).length) {
                }
                break;
            case 1:
                if (this.f2629g < ((int[]) this.f2630h).length) {
                }
                break;
            case 2:
                if (this.f2629g < ((long[]) this.f2630h).length) {
                }
                break;
            case 3:
                if (this.f2629g < ((short[]) this.f2630h).length) {
                }
                break;
            case 4:
                if (this.f2629g < ((e6.d) this.f2630h).a()) {
                }
                break;
            case 5:
                if (this.f2629g < ((h0) this.f2630h).e()) {
                }
                break;
            default:
                if (this.f2629g < ((Object[]) this.f2630h).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2628f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f2629g;
                byte[] bArr = (byte[]) this.f2630h;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2629g));
                }
                this.f2629g = i7 + 1;
                return new p(bArr[i7]);
            case 1:
                int i8 = this.f2629g;
                int[] iArr = (int[]) this.f2630h;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2629g));
                }
                this.f2629g = i8 + 1;
                return new s(iArr[i8]);
            case 2:
                int i9 = this.f2629g;
                long[] jArr = (long[]) this.f2630h;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2629g));
                }
                this.f2629g = i9 + 1;
                return new u(jArr[i9]);
            case 3:
                int i10 = this.f2629g;
                short[] sArr = (short[]) this.f2630h;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2629g));
                }
                this.f2629g = i10 + 1;
                return new x(sArr[i10]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                e6.d dVar = (e6.d) this.f2630h;
                int i11 = this.f2629g;
                this.f2629g = i11 + 1;
                return dVar.get(i11);
            case 5:
                h0 h0Var = (h0) this.f2630h;
                int i12 = this.f2629g;
                this.f2629g = i12 + 1;
                return h0Var.f(i12);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2630h;
                    int i13 = this.f2629g;
                    this.f2629g = i13 + 1;
                    return objArr[i13];
                } catch (ArrayIndexOutOfBoundsException e9) {
                    this.f2629g--;
                    throw new NoSuchElementException(e9.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2628f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(Object[] objArr) {
        this.f2628f = 6;
        r6.k.f(objArr, "array");
        this.f2630h = objArr;
    }
}
