package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yl extends bg1 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final ur1 g;

    public yl(long j, Integer num, long j2, byte[] bArr, String str, long j3, ur1 ur1Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = ur1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bg1) {
            bg1 bg1Var = (bg1) obj;
            yl ylVar = (yl) bg1Var;
            if (this.a == ylVar.a) {
                Integer num = ylVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == ylVar.c) {
                        if (Arrays.equals(this.d, bg1Var instanceof yl ? ((yl) bg1Var).d : ylVar.d)) {
                            String str = ylVar.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == ylVar.f) {
                                    ur1 ur1Var = ylVar.g;
                                    ur1 ur1Var2 = this.g;
                                    if (ur1Var2 != null ? ur1Var2.equals(ur1Var) : ur1Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        ur1 ur1Var = this.g;
        return i2 ^ (ur1Var != null ? ur1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
