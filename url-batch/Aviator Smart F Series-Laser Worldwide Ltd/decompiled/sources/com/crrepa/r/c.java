package com.crrepa.r;

import android.util.Log;
import com.crrepa.ble.util.BleLog;
import com.google.common.primitives.UnsignedBytes;
import com.moyoung.dafit.module.common.utils.n;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap<String, Object> f13721i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static boolean f13722j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final List<byte[]> f13723k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private static int f13724l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f13725m = 4;

    /* renamed from: n, reason: collision with root package name */
    private static final int f13726n = 2;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f13727a;

    /* renamed from: d, reason: collision with root package name */
    private com.crrepa.r.a f13730d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13731e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13732f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13734h;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13728b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f13729c = 0;

    /* renamed from: g, reason: collision with root package name */
    private final List<byte[]> f13733g = new ArrayList();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13735a;

        static {
            int[] iArr = new int[com.crrepa.r.a.values().length];
            f13735a = iArr;
            try {
                iArr[com.crrepa.r.a.FRAME_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13735a[com.crrepa.r.a.FRAME_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13735a[com.crrepa.r.a.FRAME_EXECUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13735a[com.crrepa.r.a.NO_FRAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || bArr[0] != -81) {
            this.f13734h = false;
            return;
        }
        this.f13734h = true;
        this.f13727a = bArr;
        a(e());
        x();
    }

    private static byte a(com.crrepa.r.a aVar, boolean z7, boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append("0000");
        int i8 = a.f13735a[aVar.ordinal()];
        sb.append(i8 != 1 ? i8 != 2 ? i8 != 3 ? n.TWO_INTEGERS_PATTERN : "10" : "11" : "01");
        if (z7) {
            sb.append("1");
        } else {
            sb.append("0");
        }
        if (z8) {
            sb.append("1");
        } else {
            sb.append("0");
        }
        return Byte.parseByte(sb.toString(), 2);
    }

    public static List<byte[]> b(byte[] bArr, int i8) {
        int ceil = (int) Math.ceil(bArr.length / i8);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (i9 < ceil) {
            int i11 = i10 + i8;
            arrayList.add(Arrays.copyOfRange(bArr, i10, Math.min(i11, bArr.length)));
            i9++;
            i10 = i11;
        }
        return arrayList;
    }

    private byte e() {
        return this.f13727a[1];
    }

    private static byte p() {
        return (byte) -81;
    }

    private byte[] t() {
        byte[] g8 = g();
        int i8 = this.f13731e ? 3 : 2;
        int length = g8.length - i8;
        byte[] bArr = new byte[length];
        System.arraycopy(g8, i8, bArr, 0, length);
        return bArr;
    }

    private void x() {
        if (w()) {
            byte[] g8 = g();
            byte[] copyOfRange = this.f13731e ? Arrays.copyOfRange(g8, 2, g8.length) : Arrays.copyOfRange(g8, 1, g8.length);
            List<byte[]> list = f13723k;
            list.add(copyOfRange);
            f13724l += copyOfRange.length;
            int i8 = a.f13735a[this.f13730d.ordinal()];
            if (i8 == 1) {
                HashMap<String, Object> hashMap = f13721i;
                hashMap.put("SOF", e.a(o()));
                hashMap.put("CTRL", e.b(e()));
                hashMap.put("CTRL_FID", v() ? "1" : "0");
                hashMap.put("CTRL_SN", Integer.toBinaryString(j()).toString());
                hashMap.put("CTRL_Crc", this.f13732f ? "1" : "0");
                hashMap.put("MODULE_ID", e.a(m()));
                hashMap.put("CMD_ID", e.a(d()));
                hashMap.put("MCT_ID", e.a(m()) + e.a(d()) + r());
                hashMap.put("TYPE", r());
                return;
            }
            if (i8 != 2) {
                return;
            }
            int i9 = f13724l;
            byte[] bArr = new byte[i9];
            int i10 = 0;
            for (byte[] bArr2 : list) {
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                i10 += bArr2.length;
            }
            HashMap<String, Object> hashMap2 = f13721i;
            hashMap2.put("PAYLOAD", e.b(bArr, i9));
            hashMap2.put("PAYLOAD_LENGTH", String.valueOf(f13724l));
            if (i9 < 3) {
                Log.d("obtainingFramedParam", "< 3");
            } else {
                Log.d("obtainingFramedParam", ">= 3");
                hashMap2.put("VALUE_LIST", e(bArr));
            }
        }
    }

    public List<byte[]> c() {
        return this.f13733g;
    }

    public byte d() {
        if (w()) {
            int i8 = a.f13735a[this.f13730d.ordinal()];
            if (i8 == 1) {
                return this.f13731e ? g()[3] : g()[2];
            }
            if (i8 == 2 || i8 == 3 || i8 == 4) {
                return (byte) 0;
            }
        }
        return this.f13731e ? g()[2] : g()[1];
    }

    public com.crrepa.r.a f() {
        return this.f13730d;
    }

    public byte[] g() {
        int i8 = i();
        try {
            if (this.f13732f) {
                i8 -= 2;
            }
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f13727a, 4, bArr, 0, bArr.length);
            return bArr;
        } catch (IllegalArgumentException unused) {
            return new byte[0];
        }
    }

    public byte[] h() {
        if (!this.f13732f) {
            return new byte[0];
        }
        byte[] bArr = new byte[2];
        byte[] bArr2 = this.f13727a;
        System.arraycopy(bArr2, bArr2.length - 2, bArr, 0, 2);
        return bArr;
    }

    public short i() {
        byte[] bArr = new byte[2];
        System.arraycopy(this.f13727a, 2, bArr, 0, 2);
        return e.c(bArr);
    }

    public int j() {
        return this.f13729c;
    }

    public String k() {
        return l() + r();
    }

    public String l() {
        return e.a(m()) + e.a(d());
    }

    public byte m() {
        if (w()) {
            int i8 = a.f13735a[this.f13730d.ordinal()];
            if (i8 == 1) {
                return this.f13731e ? g()[2] : g()[1];
            }
            if (i8 == 2 || i8 == 3 || i8 == 4) {
                return (byte) 0;
            }
        }
        return this.f13731e ? g()[1] : g()[0];
    }

    public byte[] n() {
        byte[] bArr;
        byte[] bArr2;
        byte[] t7 = t();
        while (true) {
            String substring = e.b(t7[1]).substring(1);
            int i8 = 2;
            if (a(t7)) {
                int parseInt = Integer.parseInt(substring, 2);
                bArr2 = new byte[parseInt];
                System.arraycopy(t7, 2, bArr2, 0, parseInt);
            } else {
                int parseInt2 = Integer.parseInt(substring, 2);
                if (parseInt2 <= 1) {
                    bArr = new byte[2];
                    System.arraycopy(t7, 2, bArr, 0, parseInt2);
                } else {
                    bArr = new byte[parseInt2];
                    System.arraycopy(t7, 2, bArr, 0, parseInt2);
                }
                int c8 = e.c(bArr);
                byte[] bArr3 = new byte[c8];
                i8 = parseInt2 + 2;
                System.arraycopy(t7, i8, bArr3, 0, c8);
                bArr2 = bArr3;
            }
            this.f13733g.add(bArr2);
            if (t7.length == bArr2.length + i8) {
                return this.f13733g.get(0);
            }
            int length = (t7.length - bArr2.length) - i8;
            byte[] bArr4 = new byte[length];
            System.arraycopy(t7, i8 + bArr2.length, bArr4, 0, length);
            t7 = bArr4;
        }
    }

    public byte o() {
        return this.f13727a[0];
    }

    public byte q() {
        if (this.f13731e) {
            return g()[0];
        }
        Log.e("CommandParse", "沒有fid位");
        return (byte) 0;
    }

    public String r() {
        byte b8;
        if (w()) {
            int i8 = a.f13735a[this.f13730d.ordinal()];
            if (i8 == 1) {
                b8 = this.f13731e ? g()[4] : g()[3];
            } else if (i8 == 2 || i8 == 3 || i8 == 4) {
                b8 = 0;
            }
            return e.a(b8);
        }
        b8 = this.f13731e ? g()[3] : g()[2];
        return e.a(b8);
    }

    public byte s() {
        if (w()) {
            int i8 = a.f13735a[this.f13730d.ordinal()];
            if (i8 == 1) {
                return this.f13731e ? g()[4] : g()[3];
            }
            if (i8 == 2 || i8 == 3 || i8 == 4) {
                return (byte) 0;
            }
        }
        return this.f13731e ? g()[3] : g()[2];
    }

    public boolean u() {
        return this.f13732f;
    }

    public boolean v() {
        return this.f13731e;
    }

    public boolean w() {
        return this.f13728b;
    }

    public static List<byte[]> a(byte[] bArr, int i8) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 4, c(bArr));
        int length = a8.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(a8, 1, bArr2, 0, length);
        return d(bArr2, i8);
    }

    public static void b() {
        f13721i.clear();
        f13723k.clear();
        f13724l = 0;
    }

    public static byte[] c(int i8) {
        byte[] a8 = a((byte) 6, (byte) 6, (byte) 1, c(i8, 0));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static List<byte[]> d(byte[] bArr) {
        int i8;
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        while (!z7 && bArr.length != 0 && -81 == bArr[0]) {
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, 2, bArr2, 0, 2);
            short c8 = e.c(bArr2);
            if (c8 <= 2 || (i8 = c8 + 4) > bArr.length) {
                break;
            }
            int i9 = c8 - 2;
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, 4, bArr3, 0, i9);
            byte[] bArr4 = new byte[2];
            System.arraycopy(bArr, c8 + 2, bArr4, 0, 2);
            if (!Arrays.equals(e.d(bArr3), bArr4)) {
                break;
            }
            byte[] bArr5 = new byte[i8];
            System.arraycopy(bArr, 0, bArr5, 0, i8);
            arrayList.add(bArr5);
            bArr = Arrays.copyOfRange(bArr, i8, bArr.length);
            if (bArr.length == 0) {
                z7 = true;
            }
        }
        return arrayList;
    }

    private static byte e(int i8) {
        if (i8 < 0 || i8 > 255) {
            return (byte) 0;
        }
        return (byte) i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(byte b8) {
        com.crrepa.r.a aVar;
        int i8 = (b8 >> 2) & 3;
        this.f13729c = i8;
        if (i8 == 1) {
            aVar = com.crrepa.r.a.FRAME_START;
        } else if (i8 == 2) {
            aVar = com.crrepa.r.a.FRAME_EXECUTE;
        } else {
            if (i8 != 3) {
                this.f13730d = com.crrepa.r.a.NO_FRAME;
                this.f13728b = false;
                int i9 = (b8 >> 1) & 1;
                int i10 = b8 & 1;
                this.f13731e = i9 != 1;
                this.f13732f = i10 == 1;
            }
            aVar = com.crrepa.r.a.FRAME_END;
        }
        this.f13730d = aVar;
        this.f13728b = true;
        int i92 = (b8 >> 1) & 1;
        int i102 = b8 & 1;
        this.f13731e = i92 != 1;
        this.f13732f = i102 == 1;
    }

    public static byte[] b(int i8) {
        byte[] a8 = a((byte) 6, (byte) 5, (byte) 1, a(i8, 11, 0, 0));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] c(int i8, int i9) {
        byte[] bArr = new byte[8];
        byte[] b8 = e.b(i8);
        System.arraycopy(b8, 0, bArr, 0, b8.length);
        byte[] b9 = e.b(i9);
        System.arraycopy(b9, 0, bArr, 4, b9.length);
        return bArr;
    }

    public static List<byte[]> d(byte[] bArr, int i8) {
        ArrayList arrayList = new ArrayList();
        List<byte[]> b8 = b(bArr, i8);
        int i9 = 0;
        while (i9 < b8.size()) {
            byte[] c8 = c(b8.get(i9), i9);
            arrayList.add(a(e.d(c8), c8, i9 == 0 ? com.crrepa.r.a.FRAME_START : i9 == b8.size() + (-1) ? com.crrepa.r.a.FRAME_END : com.crrepa.r.a.FRAME_EXECUTE));
            i9++;
        }
        return arrayList;
    }

    public static List<byte[]> e(byte[] bArr) {
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        BleLog.d("splittingCombiningAndFramingPayload: " + e.b(bArr, bArr.length));
        ArrayList arrayList = new ArrayList();
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 2, bArr.length);
        while (true) {
            String substring = e.b(copyOfRange[1]).substring(1);
            try {
                if (a(copyOfRange)) {
                    int parseInt = Integer.parseInt(substring, 2);
                    bArr3 = new byte[parseInt];
                    System.arraycopy(copyOfRange, 2, bArr3, 0, parseInt);
                    i8 = 2;
                } else {
                    int parseInt2 = Integer.parseInt(substring, 2);
                    if (parseInt2 <= 1) {
                        bArr2 = new byte[2];
                        System.arraycopy(copyOfRange, 2, bArr2, 0, parseInt2);
                    } else {
                        bArr2 = new byte[parseInt2];
                        System.arraycopy(copyOfRange, 2, bArr2, 0, parseInt2);
                    }
                    int c8 = e.c(bArr2);
                    byte[] bArr4 = new byte[c8];
                    int i9 = parseInt2 + 2;
                    System.arraycopy(copyOfRange, i9, bArr4, 0, c8);
                    i8 = i9;
                    bArr3 = bArr4;
                }
                arrayList.add(bArr3);
                if (copyOfRange.length == bArr3.length + i8) {
                    break;
                }
                int length = (copyOfRange.length - bArr3.length) - i8;
                byte[] bArr5 = new byte[length];
                System.arraycopy(copyOfRange, i8 + bArr3.length, bArr5, 0, length);
                copyOfRange = bArr5;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private static byte[] b(int i8, int i9) {
        byte[] bArr = new byte[8];
        byte[] b8 = e.b(i8);
        System.arraycopy(b8, 0, bArr, 0, b8.length);
        byte[] b9 = e.b(i9);
        System.arraycopy(b9, 0, bArr, 4, b9.length);
        return bArr;
    }

    public static byte[] c(String str) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 2, d(str));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    private static byte[] d(int i8) {
        return e.b(i8);
    }

    public static void e(boolean z7) {
        f13722j = z7;
    }

    public boolean a() {
        if (!this.f13734h) {
            return false;
        }
        if (!this.f13732f) {
            return true;
        }
        byte[] g8 = g();
        if (g8 == null) {
            return false;
        }
        byte[] d8 = e.d(g8);
        byte[] h8 = h();
        if (h8 == null) {
            return false;
        }
        return Arrays.equals(d8, h8);
    }

    private static boolean a(byte[] bArr) {
        return e.b(bArr[1]).startsWith("1");
    }

    public static byte[] b(int i8, int i9, int i10, int i11) {
        byte[] bArr = new byte[16];
        System.arraycopy(e.c(i8), 0, bArr, 0, 4);
        System.arraycopy(e.c(i9), 0, bArr, 4, 4);
        System.arraycopy(e.c(i10), 0, bArr, 8, 4);
        System.arraycopy(e.c(i11), 0, bArr, 12, 4);
        byte[] a8 = a((byte) 6, (byte) 3, (byte) 1, bArr);
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    private static byte[] c(boolean z7) {
        return new byte[]{z7 ? (byte) 1 : (byte) 0};
    }

    private static byte[] d(String str) {
        byte[] bArr = new byte[4];
        String[] split = str.split("\\.");
        for (int i8 = 0; i8 < split.length; i8++) {
            bArr[i8] = (byte) Integer.parseInt(split[i8], 10);
        }
        return bArr;
    }

    public static byte[] e(String str) {
        int length = str.length() + 1;
        byte[] bytes = (str + "\u0000").getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 4];
        byte[] b8 = e.b(length);
        System.arraycopy(b8, 0, bArr, 0, b8.length);
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        byte[] a8 = a((byte) 6, (byte) 7, (byte) 1, bArr);
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    private static byte[] a(byte b8, byte b9, byte b10, byte[] bArr) {
        return a(b8, b9, b10, bArr, f13722j ? (byte) 35 : (byte) 36);
    }

    public static byte[] b(int i8, int i9, int i10, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        byte[] c8 = e.c(i8);
        System.arraycopy(c8, 0, bArr2, 0, c8.length);
        byte[] c9 = e.c(i9);
        System.arraycopy(c9, 0, bArr2, 4, c9.length);
        byte[] c10 = e.c(i10);
        System.arraycopy(c10, 0, bArr2, 8, c10.length);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    private static byte[] c(byte[] bArr) {
        return bArr;
    }

    private static byte[] d(boolean z7) {
        byte[] bArr = new byte[1];
        bArr[0] = z7 ? (byte) 1 : (byte) 2;
        return bArr;
    }

    public static byte[] a(byte b8, byte b9, byte b10, byte[] bArr, byte b11) {
        if (bArr.length <= 127) {
            byte[] bArr2 = new byte[bArr.length + 5];
            bArr2[0] = b11;
            bArr2[1] = b8;
            bArr2[2] = b9;
            bArr2[3] = (byte) (b10 + UnsignedBytes.MAX_POWER_OF_TWO);
            bArr2[4] = (byte) (bArr.length + 128);
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            return bArr2;
        }
        String hexString = Integer.toHexString(bArr.length);
        int length = hexString.length() / 2;
        if (hexString.length() % 2 != 0) {
            length++;
        }
        byte[] bArr3 = new byte[bArr.length + 5 + length];
        bArr3[0] = b11;
        bArr3[1] = b8;
        bArr3[2] = b9;
        bArr3[3] = (byte) (b10 + UnsignedBytes.MAX_POWER_OF_TWO);
        bArr3[4] = (byte) length;
        byte[] a8 = e.a(bArr.length);
        System.arraycopy(a8, 0, bArr3, 5, a8.length);
        System.arraycopy(bArr, 0, bArr3, a8.length + 5, bArr.length);
        return bArr3;
    }

    public static byte[] b(int i8, int i9, String str, short s7, short s8) {
        byte[] a8 = a((byte) 6, (byte) 2, (byte) 1, a(new d(i8).a((short) -20480).d((short) 2).b(i9).a(str.getBytes(StandardCharsets.UTF_8).length).a(str).b(s7).c(s8)));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] c(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = f13722j ? (byte) 35 : (byte) 36;
        bArr2[1] = e(i8);
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    public static byte[] a(byte b8, byte b9, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        byte[] bArr3 = new byte[length + 6];
        byte[] a8 = e.a((short) (bArr2.length + bArr.length));
        bArr3[0] = b8;
        bArr3[1] = b9;
        System.arraycopy(a8, 0, bArr3, 2, 2);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, length + 4, bArr.length);
        return bArr3;
    }

    private static byte[] b(String str) {
        int length = str.length() + 1;
        byte[] bytes = (str + "\u0000").getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 4];
        byte[] b8 = e.b(length);
        System.arraycopy(b8, 0, bArr, 0, b8.length);
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        return bArr;
    }

    public static byte[] a(int i8) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 7, d(i8));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] b(boolean z7) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 5, d(z7));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] a(int i8, int i9) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 3, b(i8, i9));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] b(byte[] bArr) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 4, c(bArr));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] a(int i8, int i9, int i10, int i11) {
        byte[] bArr = i11 <= 0 ? new byte[12] : new byte[16];
        byte[] c8 = e.c(i8);
        System.arraycopy(c8, 0, bArr, 0, c8.length);
        byte[] c9 = e.c(i9);
        System.arraycopy(c9, 0, bArr, 4, c9.length);
        byte[] c10 = e.c(i10);
        System.arraycopy(c10, 0, bArr, 8, c10.length);
        if (i11 > 0) {
            byte[] c11 = e.c(i11);
            System.arraycopy(c11, 0, bArr, 12, c11.length);
        }
        return bArr;
    }

    public static byte[] a(int i8, int i9, int i10, byte[] bArr) {
        byte[] a8 = a((byte) 6, (byte) 4, (byte) 1, b(i8, i9, i10, bArr));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] a(int i8, int i9, String str, short s7, short s8) {
        byte[] a8 = a((byte) 6, (byte) 2, (byte) 1, a(new d(i8).a((short) 12288).d((short) 0).b(i9).a(str.getBytes(StandardCharsets.UTF_8).length).a(str).b(s7).c(s8)));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    private static byte[] a(d dVar) {
        byte[] bytes = (dVar.d() + "\u0000").getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 24];
        byte[] c8 = e.c(dVar.g());
        System.arraycopy(c8, 0, bArr, 0, c8.length);
        byte[] a8 = e.a(dVar.a());
        System.arraycopy(a8, 0, bArr, 4, a8.length);
        byte[] a9 = e.a(dVar.h());
        System.arraycopy(a9, 0, bArr, 6, a9.length);
        byte[] c9 = e.c(dVar.f());
        System.arraycopy(c9, 0, bArr, 8, c9.length);
        byte[] a10 = e.a(dVar.b());
        System.arraycopy(a10, 0, bArr, 12, a10.length);
        byte[] a11 = e.a(dVar.c());
        System.arraycopy(a11, 0, bArr, 14, a11.length);
        byte[] c10 = e.c(dVar.e() + 4);
        System.arraycopy(c10, 0, bArr, 18, c10.length);
        byte[] a12 = e.a((short) bytes.length);
        System.arraycopy(a12, 0, bArr, 20, a12.length);
        byte[] a13 = e.a((short) 0);
        System.arraycopy(a13, 0, bArr, 22, a13.length);
        System.arraycopy(bytes, 0, bArr, 24, bytes.length);
        return bArr;
    }

    public static byte[] a(String str) {
        byte[] a8 = a((byte) 6, (byte) 8, (byte) 1, b(str));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    public static byte[] a(boolean z7) {
        byte[] a8 = a((byte) 13, (byte) 4, (byte) 1, c(z7));
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, com.crrepa.r.a aVar) {
        int length = bArr2.length;
        byte[] bArr3 = new byte[length + 6];
        byte[] a8 = e.a((short) (bArr2.length + bArr.length));
        bArr3[0] = p();
        bArr3[1] = a(aVar, true, true);
        System.arraycopy(a8, 0, bArr3, 2, 2);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, length + 4, bArr.length);
        return bArr3;
    }
}
