package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hid {
    public final Object a;
    int b;
    final /* synthetic */ hik c;

    public hid(hik hikVar, int i) {
        this.c = hikVar;
        this.a = hikVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (j$.util.Objects.equals(r4.a, r2.a[r0]) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        int i = this.b;
        if (i != -1) {
            hik hikVar = this.c;
            if (i < hikVar.c) {
            }
        }
        this.b = this.c.d(this.a);
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return this.c.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hid) {
            hid hidVar = (hid) obj;
            if (a() == hidVar.a() && Objects.equals(this.a, hidVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }

    public hid() {
        throw null;
    }
}
