package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ana implements AutoCloseable {
    public final amj a;

    public ana(amj amjVar) {
        this.a = amjVar;
    }

    public final amh a(String str) {
        String str2;
        int i;
        int i2;
        str.getClass();
        amj amjVar = this.a;
        if (!amjVar.h()) {
            yi.h(21, "connection is closed");
            throw new koh();
        }
        String obj = ksp.j(str).toString();
        obj.getClass();
        int length = obj.length() - 2;
        int i3 = -1;
        if (length >= 0) {
            int i4 = 0;
            loop0: while (i4 < length) {
                char charAt = obj.charAt(i4);
                if (ksp.c(charAt) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i5 = i4 + 1;
                            if (obj.charAt(i5) == '*') {
                                do {
                                    i5 = obj.indexOf(42, i5 + 1);
                                    if (i5 >= 0) {
                                        i2 = i5 + 1;
                                        if (i2 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (obj.charAt(i2) != '/');
                                i4 = i5 + 2;
                            }
                        }
                        i3 = i4;
                        break;
                    }
                    if (obj.charAt(i4 + 1) != '-') {
                        i3 = i4;
                        break;
                    }
                    i4 = obj.indexOf(10, i4 + 2);
                    if (i4 < 0) {
                        break;
                    }
                }
                i4++;
            }
        }
        anb anbVar = null;
        if (i3 < 0 || i3 > obj.length()) {
            str2 = null;
        } else {
            str2 = obj.substring(i3, Math.min(i3 + 3, obj.length()));
            str2.getClass();
        }
        if (str2 == null) {
            return new and(amjVar, str);
        }
        if (ksp.g("END", str2, true) || ksp.g("COM", str2, true)) {
            i = 1;
        } else if (ksp.g("ROL", str2, true)) {
            if (!ksp.m(obj, " TO ", true)) {
                i = 2;
            }
            i = 0;
        } else {
            if (ksp.g("BEG", str2, true)) {
                i = ksp.m(obj, "EXCLUSIVE", true) ? 3 : ksp.m(obj, "IMMEDIATE", true) ? 4 : 5;
            }
            i = 0;
        }
        if (i != 0) {
            return new ang(amjVar, str, i);
        }
        if (ksp.g("PRA", str2, true)) {
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (ksp.m(ksp.k(lowerCase, "journal_mode", ""), "=", false)) {
                anbVar = anb.d;
            }
        }
        return anbVar instanceof anb ? new anc(amjVar, str, new anf(amjVar, str)) : (ksp.g("SEL", str2, true) || ksp.g("PRA", str2, true) || ksp.g("WIT", str2, true)) ? new anf(amjVar, str) : new and(amjVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
