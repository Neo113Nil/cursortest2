package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ob2 implements fy1 {
    public final pd0 rtx2ld2ELZv4;

    public ob2(pd0 pd0Var) {
        pd0Var.getClass();
        this.rtx2ld2ELZv4 = pd0Var;
    }

    @Override // defpackage.fy1
    public final boolean S9EYkSpbGuxq() {
        return this.rtx2ld2ELZv4.S9EYkSpbGuxq();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c3, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00cf, code lost:
    
        r4 = defpackage.vb2.rtx2ld2ELZv4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cc, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hy1 amuv7NJvPxHu(String str) {
        vb2 vb2Var;
        int i;
        str.getClass();
        pd0 pd0Var = this.rtx2ld2ELZv4;
        ih0 ih0Var = null;
        if (!pd0Var.isOpen()) {
            sj0.zf8DYfih6EZu("connection is closed", 21);
            throw null;
        }
        ac2.Companion.getClass();
        String upperCase = ia2.GlTbNTgfSMqy(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (cs0.gPXPFXrUH4XX(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = ia2.rxipThha848g(upperCase, '*', i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = ia2.rxipThha848g(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new xb2(pd0Var, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!ia2.jJwa0q7P5wHq(upperCase, "EXCLUSIVE", false)) {
                        if (!ia2.jJwa0q7P5wHq(upperCase, "IMMEDIATE", false)) {
                            vb2Var = vb2.x50lh2ztY7Y5;
                            break;
                        } else {
                            vb2Var = vb2.dgRBjINgWbAK;
                            break;
                        }
                    } else {
                        vb2Var = vb2.wdg6QnbFHrFF;
                        break;
                    }
                }
                vb2Var = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !ia2.jJwa0q7P5wHq(upperCase, " TO ", false)) {
                    vb2Var = vb2.OPXfSBeufaJ8;
                    break;
                }
                vb2Var = null;
                break;
            default:
                vb2Var = null;
                break;
        }
        if (vb2Var != null) {
            return new xb2(pd0Var, str, vb2Var);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (ia2.jJwa0q7P5wHq(ia2.cJeY36nTk9tz(lowerCase, "journal_mode", ""), "=", false)) {
                ih0Var = ih0.ZbWwgt3aGe7A;
            }
        }
        if (ih0Var != null) {
            return new xb2(pd0Var, str, new zb2(pd0Var, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new xb2(pd0Var, str) : new zb2(pd0Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.rtx2ld2ELZv4.close();
    }
}
