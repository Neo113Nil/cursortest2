package j$.time.format;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class k implements g {
    public static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final k e = new k("+HH:MM:ss", "Z");
    public final String a;
    public final int b;
    public final int c;

    static {
        new k("+HH:MM:ss", "0");
    }

    public k(String str, String str2) {
        for (int i = 0; i < 22; i++) {
            if (d[i].equals(str)) {
                this.b = i;
                this.c = i % 11;
                this.a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    public static void a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.g
    public final boolean f(q qVar, StringBuilder sb) {
        Long a = qVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z = false;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int i = (int) longValue;
        if (longValue != i) {
            throw new ArithmeticException();
        }
        String str = this.a;
        if (i == 0) {
            sb.append(str);
            return true;
        }
        int abs = Math.abs((i / 3600) % 100);
        int abs2 = Math.abs((i / 60) % 60);
        int abs3 = Math.abs(i % 60);
        int length = sb.length();
        sb.append(i < 0 ? "-" : "+");
        if (this.b >= 11 && abs < 10) {
            sb.append((char) (abs + 48));
        } else {
            a(false, abs, sb);
        }
        int i2 = this.c;
        if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && abs3 > 0) || (i2 >= 1 && abs2 > 0))) {
            a(i2 > 0 && i2 % 2 == 0, abs2, sb);
            abs += abs2;
            if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                if (i2 > 0 && i2 % 2 == 0) {
                    z = true;
                }
                a(z, abs3, sb);
                abs += abs3;
            }
        }
        if (abs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}
