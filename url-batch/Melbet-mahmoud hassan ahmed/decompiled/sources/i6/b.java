package i6;

import java.util.NoSuchElementException;
import w5.v;

/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: f, reason: collision with root package name */
    private final int f17042f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17043g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17044h;

    /* renamed from: i, reason: collision with root package name */
    private int f17045i;

    public b(int i7, int i8, int i9) {
        this.f17042f = i9;
        this.f17043g = i8;
        boolean z6 = true;
        if (i9 <= 0 ? i7 < i8 : i7 > i8) {
            z6 = false;
        }
        this.f17044h = z6;
        this.f17045i = z6 ? i7 : i8;
    }

    @Override // w5.v
    public int a() {
        int i7 = this.f17045i;
        if (i7 != this.f17043g) {
            this.f17045i = this.f17042f + i7;
        } else {
            if (!this.f17044h) {
                throw new NoSuchElementException();
            }
            this.f17044h = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17044h;
    }
}
