package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e2 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f9370a = new e2();

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f9371b = new h1("kotlin.uuid.Uuid", re.d.f8245o);

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        fe.b bVar = (fe.b) obj;
        bVar.getClass();
        oVar.n(bVar.toString());
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        String str = (String) lVar.e();
        int length = str.length();
        int i3 = 0;
        if (length == 32) {
            long j = 0;
            while (i3 < 16) {
                long j3 = j << 4;
                char charAt = str.charAt(i3);
                if ((charAt >>> '\b') == 0) {
                    long j10 = kotlin.text.d.f5618b[charAt];
                    if (j10 >= 0) {
                        j = j3 | j10;
                        i3++;
                    }
                }
                a.a.d0(i3, str, "a hexadecimal digit");
                throw null;
            }
            long j11 = 0;
            for (int i10 = 16; i10 < 32; i10++) {
                long j12 = j11 << 4;
                char charAt2 = str.charAt(i10);
                if ((charAt2 >>> '\b') == 0) {
                    long j13 = kotlin.text.d.f5618b[charAt2];
                    if (j13 >= 0) {
                        j11 = j12 | j13;
                    }
                }
                a.a.d0(i10, str, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j11 != 0) {
                return new fe.b(j, j11);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb2.append(str.length() <= 64 ? str : str.substring(0, 64).concat("..."));
                sb2.append("\" of length ");
                sb2.append(str.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long j14 = 0;
            while (i3 < 8) {
                long j15 = j14 << 4;
                char charAt3 = str.charAt(i3);
                if ((charAt3 >>> '\b') == 0) {
                    long j16 = kotlin.text.d.f5618b[charAt3];
                    if (j16 >= 0) {
                        j14 = j15 | j16;
                        i3++;
                    }
                }
                a.a.d0(i3, str, "a hexadecimal digit");
                throw null;
            }
            if (str.charAt(8) != '-') {
                a.a.d0(8, str, "'-' (hyphen)");
                throw null;
            }
            long j17 = 0;
            for (int i11 = 9; i11 < 13; i11++) {
                long j18 = j17 << 4;
                char charAt4 = str.charAt(i11);
                if ((charAt4 >>> '\b') == 0) {
                    long j19 = kotlin.text.d.f5618b[charAt4];
                    if (j19 >= 0) {
                        j17 = j18 | j19;
                    }
                }
                a.a.d0(i11, str, "a hexadecimal digit");
                throw null;
            }
            if (str.charAt(13) != '-') {
                a.a.d0(13, str, "'-' (hyphen)");
                throw null;
            }
            long j20 = 0;
            for (int i12 = 14; i12 < 18; i12++) {
                long j21 = j20 << 4;
                char charAt5 = str.charAt(i12);
                if ((charAt5 >>> '\b') == 0) {
                    long j22 = kotlin.text.d.f5618b[charAt5];
                    if (j22 >= 0) {
                        j20 = j21 | j22;
                    }
                }
                a.a.d0(i12, str, "a hexadecimal digit");
                throw null;
            }
            if (str.charAt(18) != '-') {
                a.a.d0(18, str, "'-' (hyphen)");
                throw null;
            }
            long j23 = 0;
            for (int i13 = 19; i13 < 23; i13++) {
                long j24 = j23 << 4;
                char charAt6 = str.charAt(i13);
                if ((charAt6 >>> '\b') == 0) {
                    long j25 = kotlin.text.d.f5618b[charAt6];
                    if (j25 >= 0) {
                        j23 = j24 | j25;
                    }
                }
                a.a.d0(i13, str, "a hexadecimal digit");
                throw null;
            }
            if (str.charAt(23) != '-') {
                a.a.d0(23, str, "'-' (hyphen)");
                throw null;
            }
            long j26 = 0;
            for (int i14 = 24; i14 < 36; i14++) {
                long j27 = j26 << 4;
                char charAt7 = str.charAt(i14);
                if ((charAt7 >>> '\b') == 0) {
                    long j28 = kotlin.text.d.f5618b[charAt7];
                    if (j28 >= 0) {
                        j26 = j27 | j28;
                    }
                }
                a.a.d0(i14, str, "a hexadecimal digit");
                throw null;
            }
            long j29 = (j14 << 32) | (j17 << 16) | j20;
            long j30 = (j23 << 48) | j26;
            if (j29 != 0 || j30 != 0) {
                return new fe.b(j29, j30);
            }
        }
        return fe.b.f4215i;
    }

    @Override // pe.a
    public final re.e d() {
        return f9371b;
    }
}
