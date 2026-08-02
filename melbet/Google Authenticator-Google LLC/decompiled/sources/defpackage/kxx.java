package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxx extends lcy implements Runnable {
    public final long b;

    public kxx(long j, kqj kqjVar) {
        super(kqjVar.bU(), kqjVar);
        this.b = j;
    }

    @Override // defpackage.kum, defpackage.kxb
    public final String c() {
        return super.c() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        if (r1 == null) goto L46;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        long j;
        kqn kqnVar = ((kum) this).a;
        kvu g = ixh.g(kqnVar);
        kvl kvlVar = (kvl) kqnVar.get(kvl.b);
        String str2 = kvlVar != null ? kvlVar.a : null;
        long j2 = this.b;
        kvv kvvVar = g instanceof kvv ? (kvv) g : null;
        if (kvvVar != null) {
            int i = kue.a;
            kug kugVar = kug.c;
            kugVar.getClass();
            kug kugVar2 = kug.a;
            long d = ksy.d(4611686018426999999L, kugVar2, kugVar);
            if ((-d) <= j2 && j2 <= d) {
                ksy.d(j2, kugVar, kugVar2);
                int i2 = kuf.a;
            } else if (kugVar.compareTo(kugVar) >= 0) {
                Long.signum(j2);
                long abs = Math.abs(j2);
                int ordinal = kugVar.ordinal();
                if (ordinal == 2) {
                    j = 1;
                } else if (ordinal == 3) {
                    j = 1000;
                } else if (ordinal == 4) {
                    j = 60000;
                } else if (ordinal == 5) {
                    j = 3600000;
                } else {
                    if (ordinal != 6) {
                        Objects.toString(kugVar);
                        throw new IllegalStateException("Wrong unit for millisMultiplier: ".concat(kugVar.toString()));
                    }
                    j = 86400000;
                }
                if (abs != 0 && abs != 1 && j != 1) {
                    Long.numberOfLeadingZeros(abs);
                    Long.numberOfLeadingZeros(j);
                }
                int i3 = kuf.a;
            } else {
                kugVar.getClass();
                TimeUnit timeUnit = kugVar.h;
                ksl.j(timeUnit.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L);
                int i4 = kuf.a;
            }
            str = kvvVar.a();
        }
        str = "Timed out waiting for " + j2 + " ms";
        if (str2 != null) {
            if (str.length() > 0) {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                String substring = str.substring(1);
                substring.getClass();
                str = lowerCase + substring;
            }
            str = "Coroutine \"" + str2 + "\" " + str;
        }
        K(new kxw(str, this));
    }
}
