package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cu2 extends nj {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu2(int i) {
        super(9);
        this.n = i;
    }

    @Override // defpackage.nj
    public final int h(char c, StringBuilder sb) {
        switch (this.n) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c >= '!' && c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c >= ':' && c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) (c - '`'));
                            return 2;
                        }
                        if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + h((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        iv1.G(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // defpackage.nj, defpackage.ih0
    public void k(jh0 jh0Var) {
        switch (this.n) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (jh0Var.b()) {
                        char a = jh0Var.a();
                        jh0Var.d++;
                        h(a, sb);
                        if (sb.length() % 3 == 0) {
                            nj.v(jh0Var, sb);
                            if (iv1.M(jh0Var.a, jh0Var.d, 3) != 3) {
                                jh0Var.e = 0;
                            }
                        }
                    }
                }
                p(jh0Var, sb);
                break;
            default:
                super.k(jh0Var);
                break;
        }
    }

    @Override // defpackage.nj
    public final int o() {
        switch (this.n) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // defpackage.nj
    public void p(jh0 jh0Var, StringBuilder sb) {
        switch (this.n) {
            case 1:
                StringBuilder sb2 = jh0Var.c;
                jh0Var.c(sb2.length());
                int length = jh0Var.f.b - sb2.length();
                jh0Var.d -= sb.length();
                String str = jh0Var.a;
                if ((str.length() - jh0Var.g) - jh0Var.d > 1 || length > 1 || (str.length() - jh0Var.g) - jh0Var.d != length) {
                    jh0Var.d((char) 254);
                }
                if (jh0Var.e < 0) {
                    jh0Var.e = 0;
                    break;
                }
                break;
            default:
                super.p(jh0Var, sb);
                break;
        }
    }
}
