package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vt extends ut {
    public final int m;
    public final int n;
    public boolean o;
    public int p;

    public vt(char c, char c2, int i) {
        this.m = i;
        this.n = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.c(c, c2) >= 0 : Intrinsics.c(c, c2) <= 0) {
            z = true;
        }
        this.o = z;
        this.p = z ? c : c2;
    }

    @Override // defpackage.ut
    public final char a() {
        int i = this.p;
        if (i != this.n) {
            this.p = this.m + i;
        } else {
            if (!this.o) {
                b71.f();
                return (char) 0;
            }
            this.o = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o;
    }
}
