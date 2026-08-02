package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.C0336n0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4622a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4623b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f4624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4625d;

    public C0171d(C0336n0 c0336n0) {
        this.f4625d = c0336n0;
        this.f4624c = c0336n0.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4622a) {
            case 0:
                if (this.f4623b < this.f4624c) {
                }
                break;
            default:
                if (this.f4623b < this.f4624c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4622a) {
            case 0:
                int i4 = this.f4623b;
                if (i4 >= this.f4624c) {
                    throw new NoSuchElementException();
                }
                this.f4623b = i4 + 1;
                return Byte.valueOf(((C0174g) this.f4625d).g(i4));
            default:
                int i5 = this.f4623b;
                if (i5 >= this.f4624c) {
                    throw new NoSuchElementException();
                }
                this.f4623b = i5 + 1;
                return Byte.valueOf(((C0336n0) this.f4625d).c(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4622a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0171d(C0174g c0174g) {
        this.f4625d = c0174g;
        this.f4624c = c0174g.size();
    }
}
