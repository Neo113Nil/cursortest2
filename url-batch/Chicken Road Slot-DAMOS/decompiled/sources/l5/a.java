package l5;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements i5.a {

    /* renamed from: d, reason: collision with root package name */
    public final k5.d f5861d;

    public a(k5.d dVar) {
        dVar.getClass();
        this.f5861d = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bd, code lost:
    
        if (r3.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c9, code lost:
    
        r4 = l5.c.f5863d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c6, code lost:
    
        if (r3.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // i5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i5.c K(String str) {
        c cVar;
        int i3;
        str.getClass();
        k5.d dVar = this.f5861d;
        b bVar = null;
        if (!dVar.isOpen()) {
            g8.b.L(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.y(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i10 = -1;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (i11 < length) {
                char charAt = upperCase.charAt(i11);
                if (Intrinsics.b(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i12 = i11 + 1;
                            if (upperCase.charAt(i12) == '*') {
                                do {
                                    i12 = StringsKt.q(upperCase, '*', i12 + 1, 4);
                                    if (i12 >= 0) {
                                        i3 = i12 + 1;
                                        if (i3 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i3) != '/');
                                i11 = i12 + 2;
                            }
                        }
                        i10 = i11;
                        break;
                    }
                    if (upperCase.charAt(i11 + 1) == '-') {
                        i11 = StringsKt.q(upperCase, '\n', i11 + 2, 4);
                        if (i11 < 0) {
                            break;
                        }
                    } else {
                        i10 = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        String substring = (i10 < 0 || i10 > upperCase.length()) ? null : upperCase.substring(i10, Math.min(i10 + 3, upperCase.length()));
        if (substring == null) {
            return new d(dVar, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!StringsKt.n(upperCase, "EXCLUSIVE")) {
                        if (!StringsKt.n(upperCase, "IMMEDIATE")) {
                            cVar = c.f5867s;
                            break;
                        } else {
                            cVar = c.f5866r;
                            break;
                        }
                    } else {
                        cVar = c.f5865i;
                        break;
                    }
                }
                cVar = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !StringsKt.n(upperCase, " TO ")) {
                    cVar = c.f5864e;
                    break;
                }
                cVar = null;
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            return new d(dVar, str, cVar);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.n(StringsKt.w(lowerCase, "journal_mode", ""), "=")) {
                bVar = b.f5862a;
            }
        }
        if (bVar != null) {
            return new d(dVar, str, new e(dVar, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new d(dVar, str) : new e(dVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f5861d.close();
    }

    @Override // i5.a
    public final boolean t() {
        return this.f5861d.t();
    }
}
