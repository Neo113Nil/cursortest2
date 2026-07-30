package cn.hutool.core.lang;

import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e0 {
    private static final AtomicInteger NEXT_INC = new AtomicInteger(cn.hutool.core.util.i0.randomInt());
    private static final int MACHINE = getMachinePiece() | getProcessPiece();

    private static int getMachinePiece() {
        int randomInt;
        try {
            StringBuilder sb = new StringBuilder();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                sb.append(networkInterfaces.nextElement().toString());
            }
            randomInt = sb.toString().hashCode();
        } catch (Throwable unused) {
            randomInt = cn.hutool.core.util.i0.randomInt();
        }
        return randomInt << 16;
    }

    private static int getProcessPiece() {
        int randomInt;
        try {
            randomInt = cn.hutool.core.util.z0.getPid();
        } catch (Throwable unused) {
            randomInt = cn.hutool.core.util.i0.randomInt();
        }
        ClassLoader classLoader = cn.hutool.core.util.o.getClassLoader();
        return (Integer.toHexString(randomInt) + Integer.toHexString(classLoader != null ? System.identityHashCode(classLoader) : 0)).hashCode() & 65535;
    }

    public static boolean isValid(String str) {
        String removeAll;
        int length;
        if (str == null || (length = (removeAll = cn.hutool.core.text.l.removeAll(str, "-")).length()) != 24) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = removeAll.charAt(i8);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static String next() {
        return next(false);
    }

    public static byte[] nextBytes() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[12]);
        wrap.putInt((int) cn.hutool.core.date.z.currentSeconds());
        wrap.putInt(MACHINE);
        wrap.putInt(NEXT_INC.getAndIncrement());
        return wrap.array();
    }

    public static String next(boolean z7) {
        byte[] nextBytes = nextBytes();
        StringBuilder sb = new StringBuilder(z7 ? 26 : 24);
        for (int i8 = 0; i8 < nextBytes.length; i8++) {
            if (z7 && i8 % 4 == 0 && i8 != 0) {
                sb.append("-");
            }
            int i9 = nextBytes[i8] & 255;
            if (i9 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i9));
        }
        return sb.toString();
    }
}
