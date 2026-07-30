package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fp2 implements KSerializer {
    public static final fp2 PxuCJdSBwIXG = new fp2();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.uuid.Uuid", cq1.cpQdD2nAriOS);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        dp2 dp2Var = ep2.Companion;
        String e6tOsSdd2EFb = decoder.e6tOsSdd2EFb();
        dp2Var.getClass();
        e6tOsSdd2EFb.getClass();
        int length = e6tOsSdd2EFb.length();
        ep2 ep2Var = ep2.wdg6QnbFHrFF;
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char charAt = e6tOsSdd2EFb.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = nj0.lS5Rgt96tfkO[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                ni0.JHNfcAUfKc4G(i, e6tOsSdd2EFb, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char charAt2 = e6tOsSdd2EFb.charAt(i2);
                if ((charAt2 >>> '\b') == 0) {
                    long j6 = nj0.lS5Rgt96tfkO[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                ni0.JHNfcAUfKc4G(i2, e6tOsSdd2EFb, "a hexadecimal digit");
                throw null;
            }
            ep2.Companion.getClass();
            return (j == 0 && j4 == 0) ? ep2Var : new ep2(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(e6tOsSdd2EFb.length() <= 64 ? e6tOsSdd2EFb : e6tOsSdd2EFb.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(e6tOsSdd2EFb.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char charAt3 = e6tOsSdd2EFb.charAt(i);
            if ((charAt3 >>> '\b') == 0) {
                long j9 = nj0.lS5Rgt96tfkO[charAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            ni0.JHNfcAUfKc4G(i, e6tOsSdd2EFb, "a hexadecimal digit");
            throw null;
        }
        if (e6tOsSdd2EFb.charAt(8) != '-') {
            ni0.JHNfcAUfKc4G(8, e6tOsSdd2EFb, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char charAt4 = e6tOsSdd2EFb.charAt(i3);
            if ((charAt4 >>> '\b') == 0) {
                long j12 = nj0.lS5Rgt96tfkO[charAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            ni0.JHNfcAUfKc4G(i3, e6tOsSdd2EFb, "a hexadecimal digit");
            throw null;
        }
        if (e6tOsSdd2EFb.charAt(13) != '-') {
            ni0.JHNfcAUfKc4G(13, e6tOsSdd2EFb, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char charAt5 = e6tOsSdd2EFb.charAt(i4);
            if ((charAt5 >>> '\b') == 0) {
                long j15 = nj0.lS5Rgt96tfkO[charAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            ni0.JHNfcAUfKc4G(i4, e6tOsSdd2EFb, "a hexadecimal digit");
            throw null;
        }
        if (e6tOsSdd2EFb.charAt(18) != '-') {
            ni0.JHNfcAUfKc4G(18, e6tOsSdd2EFb, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char charAt6 = e6tOsSdd2EFb.charAt(i5);
            if ((charAt6 >>> '\b') == 0) {
                long j18 = nj0.lS5Rgt96tfkO[charAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            ni0.JHNfcAUfKc4G(i5, e6tOsSdd2EFb, "a hexadecimal digit");
            throw null;
        }
        if (e6tOsSdd2EFb.charAt(23) != '-') {
            ni0.JHNfcAUfKc4G(23, e6tOsSdd2EFb, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char charAt7 = e6tOsSdd2EFb.charAt(i6);
            if ((charAt7 >>> '\b') == 0) {
                long j21 = nj0.lS5Rgt96tfkO[charAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            ni0.JHNfcAUfKc4G(i6, e6tOsSdd2EFb, "a hexadecimal digit");
            throw null;
        }
        long j22 = (j7 << 32) | (j10 << 16) | j13;
        long j23 = (j16 << 48) | j19;
        ep2.Companion.getClass();
        return (j22 == 0 && j23 == 0) ? ep2Var : new ep2(j22, j23);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ep2 ep2Var = (ep2) obj;
        ep2Var.getClass();
        encoder.gPXPFXrUH4XX(ep2Var.toString());
    }
}
