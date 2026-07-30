package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g72 extends t01 {
    public final String m;
    public final long n;
    public final p62 o;

    public g72(String str, long j, p62 p62Var) {
        this.m = str;
        this.n = j;
        this.o = p62Var;
    }

    @Override // defpackage.t01
    public final long b() {
        return this.n;
    }

    @Override // defpackage.t01
    public final zj1 f() {
        String str = this.m;
        if (str != null) {
            Pattern pattern = zj1.b;
            try {
                return ap.z(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.t01
    public final pq n() {
        return this.o;
    }
}
