package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: d, reason: collision with root package name */
    public static final al f2854d = new al(new zk[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f2855a;

    /* renamed from: b, reason: collision with root package name */
    private final zk[] f2856b;

    /* renamed from: c, reason: collision with root package name */
    private int f2857c;

    public al(zk... zkVarArr) {
        this.f2856b = zkVarArr;
        this.f2855a = zkVarArr.length;
    }

    public final int a(zk zkVar) {
        for (int i7 = 0; i7 < this.f2855a; i7++) {
            if (this.f2856b[i7] == zkVar) {
                return i7;
            }
        }
        return -1;
    }

    public final zk b(int i7) {
        return this.f2856b[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && al.class == obj.getClass()) {
            al alVar = (al) obj;
            if (this.f2855a == alVar.f2855a && Arrays.equals(this.f2856b, alVar.f2856b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f2857c;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f2856b);
        this.f2857c = hashCode;
        return hashCode;
    }
}
