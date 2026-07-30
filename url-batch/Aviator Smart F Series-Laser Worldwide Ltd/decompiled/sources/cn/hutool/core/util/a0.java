package cn.hutool.core.util;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.lang.UUID;

/* loaded from: classes.dex */
public class a0 {
    @Deprecated
    public static Snowflake createSnowflake(long j8, long j9) {
        return new Snowflake(j8, j9);
    }

    public static String fastSimpleUUID() {
        return UUID.fastUUID().toString(true);
    }

    public static String fastUUID() {
        return UUID.fastUUID().toString();
    }

    public static long getDataCenterId(long j8) {
        byte[] bArr;
        cn.hutool.core.lang.q.isTrue(j8 > 0, "maxDatacenterId must be > 0", new Object[0]);
        if (j8 == Long.MAX_VALUE) {
            j8--;
        }
        try {
            bArr = cn.hutool.core.net.j.getLocalHardwareAddress();
        } catch (UtilException unused) {
            bArr = null;
        }
        if (bArr != null) {
            return (((bArr[bArr.length - 2] & 255) | ((bArr[bArr.length - 1] << 8) & 65280)) >> 6) % (j8 + 1);
        }
        return 1L;
    }

    public static Snowflake getSnowflake(long j8, long j9) {
        return (Snowflake) cn.hutool.core.lang.v0.get(Snowflake.class, Long.valueOf(j8), Long.valueOf(j9));
    }

    public static long getSnowflakeNextId() {
        return getSnowflake().nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return getSnowflake().nextIdStr();
    }

    public static long getWorkerId(long j8, long j9) {
        StringBuilder sb = new StringBuilder();
        sb.append(j8);
        try {
            sb.append(z0.getPid());
        } catch (UtilException unused) {
        }
        return (sb.toString().hashCode() & 65535) % (j9 + 1);
    }

    public static String nanoId() {
        return o.a.randomNanoId();
    }

    public static String objectId() {
        return cn.hutool.core.lang.e0.next();
    }

    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    public static String simpleUUID() {
        return UUID.randomUUID().toString(true);
    }

    public static Snowflake getSnowflake(long j8) {
        return (Snowflake) cn.hutool.core.lang.v0.get(Snowflake.class, Long.valueOf(j8));
    }

    public static String nanoId(int i8) {
        return o.a.randomNanoId(i8);
    }

    public static Snowflake getSnowflake() {
        return (Snowflake) cn.hutool.core.lang.v0.get(Snowflake.class, new Object[0]);
    }
}
