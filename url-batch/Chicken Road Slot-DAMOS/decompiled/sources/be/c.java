package be;

import kotlin.collections.i0;
import kotlin.collections.m0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends m0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f1469d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1470e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1471i;

    /* renamed from: r, reason: collision with root package name */
    public int f1472r;

    public c(int i3, int i10, int i11) {
        this.f1469d = i11;
        this.f1470e = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i3 >= i10 : i3 <= i10) {
            z10 = true;
        }
        this.f1471i = z10;
        this.f1472r = z10 ? i3 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1471i;
    }

    @Override // kotlin.collections.m0
    public final int nextInt() {
        int i3 = this.f1472r;
        if (i3 != this.f1470e) {
            this.f1472r = this.f1469d + i3;
            return i3;
        }
        if (this.f1471i) {
            this.f1471i = false;
            return i3;
        }
        i0.c();
        return 0;
    }
}
