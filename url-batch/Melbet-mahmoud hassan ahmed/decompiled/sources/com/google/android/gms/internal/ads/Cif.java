package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class Cif {

    /* renamed from: a, reason: collision with root package name */
    public static final Cif f6634a = new ff();

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract gf d(int i7, gf gfVar, boolean z6);

    public abstract hf e(int i7, hf hfVar, boolean z6, long j7);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((c() - 1) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(int i7, gf gfVar, hf hfVar, int i8) {
        d(i7, gfVar, false);
        g(0, hfVar, false);
        int i9 = 1;
        if (i7 != 0) {
            return i7 + 1;
        }
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException();
                }
            }
            i9 = 0;
        } else if (c() - 1 == 0) {
            i9 = -1;
        }
        if (i9 == -1) {
            return -1;
        }
        g(i9, hfVar, false);
        return 0;
    }

    public final hf g(int i7, hf hfVar, boolean z6) {
        return e(i7, hfVar, false, 0L);
    }

    public final boolean h() {
        return c() == 0;
    }
}
