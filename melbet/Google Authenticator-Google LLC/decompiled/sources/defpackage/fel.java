package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fel implements fej {
    private final Object a;

    public fel(fen fenVar) {
        this.a = fenVar;
        if (fenVar.e) {
            return;
        }
        hvi submit = fenVar.c.submit(new avc(fenVar, 13));
        submit.c(new evb(fenVar, submit, 4), huf.a);
        fenVar.e = true;
    }

    public static final int a(String str) {
        return str == null ? fek.a[0] : fek.a[Math.abs(str.hashCode()) % 21];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence b(kee keeVar) {
        String str;
        if (keeVar != null) {
            int i = 0;
            while (true) {
                String[] strArr = (String[]) keeVar.a;
                if (i >= strArr.length) {
                    break;
                }
                String str2 = strArr[i];
                if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                    str2 = null;
                } else if (str2.length() > 2) {
                    fen fenVar = (fen) ((fel) this.a).a;
                    hoq.H(fenVar.e);
                    Object obj = (qy) fenVar.d.get();
                    if (obj == null) {
                        str = null;
                    } else {
                        int length = str2.length();
                        str = null;
                        for (int i2 = 0; i2 < length && obj != null; i2++) {
                            fem femVar = (fem) ((qy) obj).get(Character.valueOf(str2.charAt(i2)));
                            if (femVar == null) {
                                break;
                            }
                            Object obj2 = femVar.a;
                            if (obj2 != 0) {
                                str = obj2;
                            }
                            obj = femVar.b;
                        }
                    }
                    str2 = str == null ? new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString() : str;
                }
                if (str2 != null) {
                    return str2;
                }
                i++;
            }
        }
        return null;
    }

    public fel(fej fejVar) {
        this.a = fejVar;
    }
}
