package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.Y0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2283a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2284b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f2285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2286d;

    public C0137d(Y0 y02) {
        this.f2286d = y02;
        this.f2285c = y02.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2283a) {
            case 0:
                if (this.f2284b < this.f2285c) {
                }
                break;
            default:
                if (this.f2284b < this.f2285c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2283a) {
            case 0:
                int i3 = this.f2284b;
                if (i3 >= this.f2285c) {
                    throw new NoSuchElementException();
                }
                this.f2284b = i3 + 1;
                return Byte.valueOf(((C0140g) this.f2286d).g(i3));
            default:
                int i4 = this.f2284b;
                if (i4 >= this.f2285c) {
                    throw new NoSuchElementException();
                }
                this.f2284b = i4 + 1;
                return Byte.valueOf(((Y0) this.f2286d).c(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2283a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0137d(C0140g c0140g) {
        this.f2286d = c0140g;
        this.f2285c = c0140g.size();
    }
}
