package ee;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements Comparable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final g f3971i = new g(0, -31557014167219200L);

    /* renamed from: r, reason: collision with root package name */
    public static final g f3972r = new g(999999999, 31556889864403199L);

    /* renamed from: d, reason: collision with root package name */
    public final long f3973d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3974e;

    public g(int i3, long j) {
        this.f3973d = j;
        this.f3974e = i3;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            a1.e("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        int c10 = Intrinsics.c(this.f3973d, gVar.f3973d);
        return c10 != 0 ? c10 : Intrinsics.b(this.f3974e, gVar.f3974e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3973d == gVar.f3973d && this.f3974e == gVar.f3974e;
    }

    public final int hashCode() {
        return (this.f3974e * 51) + Long.hashCode(this.f3973d);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.f3973d;
        long j10 = j3 / com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY;
        long j11 = 0;
        if ((j3 ^ com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY) < 0 && j10 * com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY != j3) {
            j10--;
        }
        long j12 = j3 % com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY;
        int i3 = (int) (j12 + (com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY & (((j12 ^ com.onesignal.session.internal.session.impl.a.SECONDS_IN_A_DAY) & ((-j12) | j12)) >> 63)));
        long j13 = (j10 + 719528) - 60;
        if (j13 < 0) {
            long j14 = 146097;
            long j15 = ((j13 + 1) / j14) - 1;
            j = 0;
            j11 = 400 * j15;
            j13 += (-j15) * j14;
        } else {
            j = 0;
        }
        long j16 = 400;
        long j17 = ((j16 * j13) + 591) / 146097;
        long j18 = 365;
        long j19 = 4;
        long j20 = 100;
        long j21 = j13 - ((j17 / j16) + (((j17 / j19) + (j18 * j17)) - (j17 / j20)));
        if (j21 < j) {
            j17--;
            j21 = j13 - ((j17 / j16) + (((j17 / j19) + (j18 * j17)) - (j17 / j20)));
        }
        int i10 = (int) j21;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j17 + j11 + (i11 / 10));
        int i15 = i3 / 3600;
        int i16 = i3 - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + 10000);
                sb3.deleteCharAt(0).getClass();
            } else {
                sb3.append(i14 - 10000);
                sb3.deleteCharAt(1).getClass();
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        i.d(sb2, sb2, i12);
        sb2.append('-');
        i.d(sb2, sb2, i13);
        sb2.append('T');
        i.d(sb2, sb2, i15);
        sb2.append(':');
        i.d(sb2, sb2, i17);
        sb2.append(':');
        i.d(sb2, sb2, i18);
        int i20 = this.f3974e;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = i.f3975a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            valueOf.getClass();
            sb2.append(valueOf.substring(1));
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
