package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.Y0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4428a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4429b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f4430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4431d;

    public C0209d(Y0 y02) {
        this.f4431d = y02;
        this.f4430c = y02.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4428a) {
            case 0:
                if (this.f4429b < this.f4430c) {
                }
                break;
            default:
                if (this.f4429b < this.f4430c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4428a) {
            case 0:
                int i2 = this.f4429b;
                if (i2 >= this.f4430c) {
                    throw new NoSuchElementException();
                }
                this.f4429b = i2 + 1;
                return Byte.valueOf(((C0212g) this.f4431d).g(i2));
            default:
                int i3 = this.f4429b;
                if (i3 >= this.f4430c) {
                    throw new NoSuchElementException();
                }
                this.f4429b = i3 + 1;
                return Byte.valueOf(((Y0) this.f4431d).c(i3));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4428a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0209d(C0212g c0212g) {
        this.f4431d = c0212g;
        this.f4430c = c0212g.size();
    }
}
