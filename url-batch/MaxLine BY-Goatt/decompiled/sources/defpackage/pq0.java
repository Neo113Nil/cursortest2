package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pq0 implements Comparable {
    public final int m;
    public final int n;
    public final String o;
    public final String p;

    public pq0(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.m = i;
        this.n = i2;
        this.o = str;
        this.p = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        pq0 pq0Var = (pq0) obj;
        pq0Var.getClass();
        int i = this.m - pq0Var.m;
        return i == 0 ? this.n - pq0Var.n : i;
    }
}
