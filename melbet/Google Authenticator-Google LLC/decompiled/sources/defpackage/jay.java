package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.ApiVersion;
import org.chromium.net.Proxy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jay {
    public jay(Executor executor, Proxy.HttpConnectCallback httpConnectCallback) {
        if (g() < 49) {
            throw new AssertionError(String.format("This should not have been created: the Cronet API being used has an ApiLevel of %s, but ProxyCallback was added in ApiLevel %s", Integer.valueOf(g()), 49));
        }
        executor.getClass();
        httpConnectCallback.getClass();
    }

    public static void a(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static int c(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static void d(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(762);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i6);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void e(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, boolean z3, boolean z4, boolean z5, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, long j2, int i28) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(703);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeBoolean(z);
        newBuilder.writeBoolean(z2);
        newBuilder.writeInt(i6);
        newBuilder.writeBoolean(z3);
        newBuilder.writeBoolean(z4);
        newBuilder.writeBoolean(z5);
        newBuilder.writeInt(0);
        newBuilder.writeString(str);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeInt(i16);
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i20);
        newBuilder.writeInt(i21);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.writeInt(i25);
        newBuilder.writeInt(i26);
        newBuilder.writeInt(i27);
        newBuilder.writeLong(j2);
        newBuilder.writeInt(i28);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void f(long j, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(704);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeLong(j2);
        newBuilder.writeInt(-1);
        newBuilder.writeInt(i6);
        newBuilder.writeBoolean(false);
        newBuilder.writeBoolean(false);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.writeInt(0);
        newBuilder.writeInt(0);
        newBuilder.writeInt(0);
        newBuilder.writeInt(0);
        newBuilder.writeInt(i15);
        newBuilder.writeString("151.0.7922.29");
        newBuilder.writeInt(i16);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static int g() {
        return Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 49;
    }

    public static void h(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }
}
