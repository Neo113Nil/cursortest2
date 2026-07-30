package g4;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPMessageInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g;
import com.crrepa.g1.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f16660a = 11;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16661b = 20;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16662c = 92;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16663d = 230;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16664e = 180;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16665f = 38;

    /* renamed from: g, reason: collision with root package name */
    private static final char f16666g = 8230;

    /* renamed from: h, reason: collision with root package name */
    private static final String f16667h = ":";

    /* renamed from: i, reason: collision with root package name */
    private static final int f16668i = 64;

    private a() {
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split(":");
        return 1 >= split.length || split[0].getBytes(StandardCharsets.UTF_8).length < 64;
    }

    private static int b(CRPMessageInfo cRPMessageInfo) {
        int maxByteLength = cRPMessageInfo.getMaxByteLength();
        if (cRPMessageInfo.getType() == 0) {
            return 38;
        }
        if (maxByteLength > 0) {
            return maxByteLength - 10;
        }
        if (cRPMessageInfo.isHs()) {
            return 180;
        }
        if (cRPMessageInfo.isSmallScreen()) {
            return 92;
        }
        return f16663d;
    }

    public static byte[] a() {
        return g.a(65, new byte[]{-1});
    }

    public static String b(String str, int i8) {
        boolean z7 = false;
        while (i8 < str.getBytes(StandardCharsets.UTF_8).length) {
            str = str.substring(0, str.length() - 1);
            z7 = true;
        }
        return z7 ? (String) TextUtils.concat(str, String.valueOf(f16666g)) : str;
    }

    public static byte[] a(CRPMessageInfo cRPMessageInfo) {
        if (cRPMessageInfo == null) {
            return null;
        }
        String message = cRPMessageInfo.getMessage();
        BleLog.d("msg: " + message);
        int type = cRPMessageInfo.getType();
        if (!a(message) || type < 0) {
            return null;
        }
        String a8 = com.crrepa.g1.g.a().a(message);
        BleLog.d("msg1: " + a8);
        int b8 = b(cRPMessageInfo);
        BleLog.d("messageLength: " + b8);
        byte[] bytes = b(a8, b8).getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = (byte) (b.a(type, cRPMessageInfo.getVersionCode()) & 255);
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return g.a(65, bArr);
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{11});
    }

    public static byte[] a(String str, int i8) {
        byte[] a8 = a(com.crrepa.g1.g.a().a(str), Math.max(20, i8), StandardCharsets.UTF_8);
        if (c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 1];
        bArr[0] = 0;
        System.arraycopy(a8, 0, bArr, 1, a8.length);
        return g.a(65, bArr);
    }

    public static byte[] a(String str, int i8, Charset charset) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i8 < str.length()) {
            str = str.substring(0, i8);
        }
        while (i8 < str.getBytes(charset).length) {
            str = str.substring(0, str.length() - 1);
        }
        return str.getBytes(charset);
    }
}
