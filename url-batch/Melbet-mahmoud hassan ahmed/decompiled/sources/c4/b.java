package c4;

import java.util.HashSet;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final t2 f1930a;

    /* renamed from: b, reason: collision with root package name */
    private final a1 f1931b;

    /* renamed from: c, reason: collision with root package name */
    private int f1932c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f1933d = 0;

    b(t2 t2Var, a1 a1Var) {
        this.f1930a = t2Var;
        this.f1931b = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final s2 a() {
        m mVar;
        String str;
        y1 y1Var;
        k kVar;
        int[] iArr = r2.f2095a;
        a1 a1Var = this.f1931b;
        switch (iArr[a1Var.f1921a - 1]) {
            case 1:
                this.f1932c = 1;
                this.f1933d = 0;
                String str2 = a1Var.f1922b;
                d0 d0Var = str2 == null ? null : new d0(a1Var.f1923c, str2);
                mVar = this.f1930a.f2111c;
                mVar.c(new HashSet(this.f1931b.f1925e));
                for (z0 z0Var : this.f1931b.f1926f) {
                    int i7 = r2.f2096b[z0Var.f2164a - 1];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            str = "write";
                        } else if (i7 == 3) {
                            str = "clear";
                        }
                        if (str == null) {
                            y1Var = this.f1930a.f2109a;
                            String str3 = z0Var.f2165b;
                            kVar = this.f1930a.f2110b;
                            y1Var.b(str, str3, kVar);
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                }
                return new s2(this.f1932c, this.f1933d, d0Var, null);
            case 2:
                this.f1932c = 2;
                this.f1933d = 0;
                String str22 = a1Var.f1922b;
                if (str22 == null) {
                }
                mVar = this.f1930a.f2111c;
                mVar.c(new HashSet(this.f1931b.f1925e));
                while (r0.hasNext()) {
                }
                return new s2(this.f1932c, this.f1933d, d0Var, null);
            case 3:
                this.f1932c = 3;
                this.f1933d = 2;
                String str222 = a1Var.f1922b;
                if (str222 == null) {
                }
                mVar = this.f1930a.f2111c;
                mVar.c(new HashSet(this.f1931b.f1925e));
                while (r0.hasNext()) {
                }
                return new s2(this.f1932c, this.f1933d, d0Var, null);
            case 4:
                this.f1932c = 3;
                this.f1933d = 1;
                String str2222 = a1Var.f1922b;
                if (str2222 == null) {
                }
                mVar = this.f1930a.f2111c;
                mVar.c(new HashSet(this.f1931b.f1925e));
                while (r0.hasNext()) {
                }
                return new s2(this.f1932c, this.f1933d, d0Var, null);
            case 5:
                this.f1932c = 3;
                this.f1933d = 0;
                String str22222 = a1Var.f1922b;
                if (str22222 == null) {
                }
                mVar = this.f1930a.f2111c;
                mVar.c(new HashSet(this.f1931b.f1925e));
                while (r0.hasNext()) {
                }
                return new s2(this.f1932c, this.f1933d, d0Var, null);
            case 6:
                String valueOf = String.valueOf(this.f1931b.f1924d);
                throw new e2(1, valueOf.length() != 0 ? "Invalid response from server: ".concat(valueOf) : new String("Invalid response from server: "));
            case w0.f2149o /* 7 */:
                String valueOf2 = String.valueOf(this.f1931b.f1924d);
                throw new e2(3, valueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(valueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new e2(1, "Invalid response from server.");
        }
    }
}
