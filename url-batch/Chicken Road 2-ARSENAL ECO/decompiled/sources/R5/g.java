package R5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k5.C0483m;
import k5.o;
import k5.q;
import k5.t;
import l5.AbstractC0500d;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public class g implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2167f;

    /* renamed from: g, reason: collision with root package name */
    public int f2168g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2169h;

    public /* synthetic */ g(int i7, Object obj) {
        this.f2167f = i7;
        this.f2169h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2167f) {
            case 0:
                if (this.f2168g > 0) {
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (this.f2168g < ((byte[]) this.f2169h).length) {
                }
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                if (this.f2168g < ((int[]) this.f2169h).length) {
                }
                break;
            case 3:
                if (this.f2168g < ((long[]) this.f2169h).length) {
                }
                break;
            case 4:
                if (this.f2168g < ((short[]) this.f2169h).length) {
                }
                break;
            case 5:
                if (this.f2168g < ((Object[]) this.f2169h).length) {
                }
                break;
            default:
                if (this.f2168g < ((AbstractC0500d) this.f2169h).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2167f) {
            case 0:
                e eVar = (e) this.f2169h;
                int d7 = eVar.d();
                int i7 = this.f2168g;
                this.f2168g = i7 - 1;
                return eVar.h(d7 - i7);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i8 = this.f2168g;
                byte[] bArr = (byte[]) this.f2169h;
                if (i8 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2168g));
                }
                this.f2168g = i8 + 1;
                return new C0483m(bArr[i8]);
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int i9 = this.f2168g;
                int[] iArr = (int[]) this.f2169h;
                if (i9 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2168g));
                }
                this.f2168g = i9 + 1;
                return new o(iArr[i9]);
            case 3:
                int i10 = this.f2168g;
                long[] jArr = (long[]) this.f2169h;
                if (i10 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2168g));
                }
                this.f2168g = i10 + 1;
                return new q(jArr[i10]);
            case 4:
                int i11 = this.f2168g;
                short[] sArr = (short[]) this.f2169h;
                if (i11 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2168g));
                }
                this.f2168g = i11 + 1;
                return new t(sArr[i11]);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f2169h;
                    int i12 = this.f2168g;
                    this.f2168g = i12 + 1;
                    return objArr[i12];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f2168g--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0500d abstractC0500d = (AbstractC0500d) this.f2169h;
                int i13 = this.f2168g;
                this.f2168g = i13 + 1;
                return abstractC0500d.get(i13);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2167f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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

    public g(Object[] array) {
        this.f2167f = 5;
        kotlin.jvm.internal.i.e(array, "array");
        this.f2169h = array;
    }

    public g(e eVar) {
        this.f2167f = 0;
        this.f2169h = eVar;
        this.f2168g = eVar.d();
    }
}
