package i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666a implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f6902d;

    /* renamed from: e, reason: collision with root package name */
    public int f6903e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6905j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6906k;

    public C0666a(int i2) {
        this.f6902d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6903e < this.f6902d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f6903e;
        switch (this.f6905j) {
            case 0:
                f4 = ((C0670e) this.f6906k).f(i2);
                break;
            case 1:
                f4 = ((C0670e) this.f6906k).i(i2);
                break;
            default:
                f4 = ((C0671f) this.f6906k).f6917e[i2];
                break;
        }
        this.f6903e++;
        this.f6904i = true;
        return f4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6904i) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", "message");
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f6903e - 1;
        this.f6903e = i2;
        switch (this.f6905j) {
            case 0:
                ((C0670e) this.f6906k).g(i2);
                break;
            case 1:
                ((C0670e) this.f6906k).g(i2);
                break;
            default:
                ((C0671f) this.f6906k).e(i2);
                break;
        }
        this.f6902d--;
        this.f6904i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0666a(C0671f c0671f) {
        this(c0671f.f6918i);
        this.f6905j = 2;
        this.f6906k = c0671f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0666a(C0670e c0670e, int i2) {
        this(c0670e.f6895i);
        this.f6905j = i2;
        switch (i2) {
            case 1:
                this.f6906k = c0670e;
                this(c0670e.f6895i);
                break;
            default:
                this.f6906k = c0670e;
                break;
        }
    }
}
