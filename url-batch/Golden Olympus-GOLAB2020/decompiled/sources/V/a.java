package V;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class a {

    /* renamed from: W, reason: collision with root package name */
    private static SimpleDateFormat f9396W;

    /* renamed from: a0, reason: collision with root package name */
    private static final d[] f9400a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final d[] f9401b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final d[] f9402c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final d[] f9403d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final d[] f9404e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final d f9405f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final d[] f9406g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final d[] f9407h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final d[] f9408i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final d[] f9409j0;

    /* renamed from: k0, reason: collision with root package name */
    static final d[][] f9410k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final d[] f9411l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final d f9412m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final d f9413n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final HashMap[] f9414o0;

    /* renamed from: p0, reason: collision with root package name */
    private static final HashMap[] f9415p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final HashSet f9416q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final HashMap f9417r0;

    /* renamed from: s0, reason: collision with root package name */
    static final Charset f9418s0;

    /* renamed from: t0, reason: collision with root package name */
    static final byte[] f9419t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final byte[] f9420u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final Pattern f9421v0;

    /* renamed from: w0, reason: collision with root package name */
    private static final Pattern f9423w0;

    /* renamed from: a, reason: collision with root package name */
    private String f9427a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f9428b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f9429c;

    /* renamed from: d, reason: collision with root package name */
    private int f9430d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9431e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap[] f9432f;

    /* renamed from: g, reason: collision with root package name */
    private Set f9433g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f9434h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9435i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9436j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9437k;

    /* renamed from: l, reason: collision with root package name */
    private int f9438l;

    /* renamed from: m, reason: collision with root package name */
    private int f9439m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f9440n;

    /* renamed from: o, reason: collision with root package name */
    private int f9441o;

    /* renamed from: p, reason: collision with root package name */
    private int f9442p;

    /* renamed from: q, reason: collision with root package name */
    private int f9443q;

    /* renamed from: r, reason: collision with root package name */
    private int f9444r;

    /* renamed from: s, reason: collision with root package name */
    private int f9445s;

    /* renamed from: t, reason: collision with root package name */
    private int f9446t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9447u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9448v;

    /* renamed from: w, reason: collision with root package name */
    private static final boolean f9422w = Log.isLoggable("ExifInterface", 3);

    /* renamed from: x, reason: collision with root package name */
    private static final List f9424x = Arrays.asList(1, 6, 3, 8);

    /* renamed from: y, reason: collision with root package name */
    private static final List f9425y = Arrays.asList(2, 7, 4, 5);

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9426z = {8, 8, 8};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f9374A = {4};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f9375B = {8};

    /* renamed from: C, reason: collision with root package name */
    static final byte[] f9376C = {-1, -40, -1};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f9377D = {102, 116, 121, 112};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f9378E = {109, 105, 102, 49};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f9379F = {104, 101, 105, 99};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f9380G = {79, 76, 89, 77, 80, 0};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f9381H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f9382I = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f9383J = {101, 88, 73, 102};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f9384K = {73, 72, 68, 82};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f9385L = {73, 69, 78, 68};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f9386M = {82, 73, 70, 70};

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f9387N = {87, 69, 66, 80};

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f9388O = {69, 88, 73, 70};

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f9389P = {-99, 1, 42};

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f9390Q = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f9391R = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f9392S = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: T, reason: collision with root package name */
    private static final byte[] f9393T = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: U, reason: collision with root package name */
    private static final byte[] f9394U = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V, reason: collision with root package name */
    private static final byte[] f9395V = "XMP ".getBytes(Charset.defaultCharset());

    /* renamed from: X, reason: collision with root package name */
    static final String[] f9397X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: Y, reason: collision with root package name */
    static final int[] f9398Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Z, reason: collision with root package name */
    static final byte[] f9399Z = {65, 83, 67, 73, 73, 0, 0, 0};

    private static class b extends InputStream implements DataInput {

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f9452f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g, reason: collision with root package name */
        private static final ByteOrder f9453g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b, reason: collision with root package name */
        private DataInputStream f9454b;

        /* renamed from: c, reason: collision with root package name */
        private ByteOrder f9455c;

        /* renamed from: d, reason: collision with root package name */
        final int f9456d;

        /* renamed from: e, reason: collision with root package name */
        int f9457e;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public void J(ByteOrder byteOrder) {
            this.f9455c = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f9454b.available();
        }

        public int m() {
            return this.f9456d;
        }

        public int n() {
            return this.f9457e;
        }

        public long o() {
            return readInt() & 4294967295L;
        }

        public void p(long j4) {
            int i4 = this.f9457e;
            if (i4 > j4) {
                this.f9457e = 0;
                this.f9454b.reset();
                this.f9454b.mark(this.f9456d);
            } else {
                j4 -= i4;
            }
            int i5 = (int) j4;
            if (skipBytes(i5) != i5) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() {
            this.f9457e++;
            return this.f9454b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f9457e++;
            return this.f9454b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i4 = this.f9457e + 1;
            this.f9457e = i4;
            if (i4 > this.f9456d) {
                throw new EOFException();
            }
            int read = this.f9454b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f9457e += 2;
            return this.f9454b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i4, int i5) {
            int i6 = this.f9457e + i5;
            this.f9457e = i6;
            if (i6 > this.f9456d) {
                throw new EOFException();
            }
            if (this.f9454b.read(bArr, i4, i5) != i5) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i4 = this.f9457e + 4;
            this.f9457e = i4;
            if (i4 > this.f9456d) {
                throw new EOFException();
            }
            int read = this.f9454b.read();
            int read2 = this.f9454b.read();
            int read3 = this.f9454b.read();
            int read4 = this.f9454b.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9455c;
            if (byteOrder == f9452f) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f9453g) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f9455c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i4 = this.f9457e + 8;
            this.f9457e = i4;
            if (i4 > this.f9456d) {
                throw new EOFException();
            }
            int read = this.f9454b.read();
            int read2 = this.f9454b.read();
            int read3 = this.f9454b.read();
            int read4 = this.f9454b.read();
            int read5 = this.f9454b.read();
            int read6 = this.f9454b.read();
            int read7 = this.f9454b.read();
            int read8 = this.f9454b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9455c;
            if (byteOrder == f9452f) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f9453g) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f9455c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i4 = this.f9457e + 2;
            this.f9457e = i4;
            if (i4 > this.f9456d) {
                throw new EOFException();
            }
            int read = this.f9454b.read();
            int read2 = this.f9454b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9455c;
            if (byteOrder == f9452f) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f9453g) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f9455c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f9457e += 2;
            return this.f9454b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f9457e++;
            return this.f9454b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i4 = this.f9457e + 2;
            this.f9457e = i4;
            if (i4 > this.f9456d) {
                throw new EOFException();
            }
            int read = this.f9454b.read();
            int read2 = this.f9454b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9455c;
            if (byteOrder == f9452f) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f9453g) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f9455c);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i4) {
            int min = Math.min(i4, this.f9456d - this.f9457e);
            int i5 = 0;
            while (i5 < min) {
                i5 += this.f9454b.skipBytes(min - i5);
            }
            this.f9457e += i5;
            return i5;
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f9455c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9454b = dataInputStream;
            int available = dataInputStream.available();
            this.f9456d = available;
            this.f9457e = 0;
            this.f9454b.mark(available);
            this.f9455c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) {
            int read = this.f9454b.read(bArr, i4, i5);
            this.f9457e += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f9457e + bArr.length;
            this.f9457e = length;
            if (length <= this.f9456d) {
                if (this.f9454b.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f9458a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9459b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9460c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f9461d;

        c(int i4, int i5, byte[] bArr) {
            this(i4, i5, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f9418s0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j4, ByteOrder byteOrder) {
            return c(new long[]{j4}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9398Y[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j4 : jArr) {
                wrap.putInt((int) j4);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9398Y[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f9466a);
                wrap.putInt((int) eVar.f9467b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i4, ByteOrder byteOrder) {
            return g(new int[]{i4}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9398Y[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putShort((short) i4);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (k4 instanceof String) {
                return Double.parseDouble((String) k4);
            }
            if (k4 instanceof long[]) {
                if (((long[]) k4).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k4 instanceof int[]) {
                if (((int[]) k4).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k4 instanceof double[]) {
                double[] dArr = (double[]) k4;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k4 instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) k4;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (k4 instanceof String) {
                return Integer.parseInt((String) k4);
            }
            if (k4 instanceof long[]) {
                long[] jArr = (long[]) k4;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k4 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) k4;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                return null;
            }
            if (k4 instanceof String) {
                return (String) k4;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            if (k4 instanceof long[]) {
                long[] jArr = (long[]) k4;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (k4 instanceof int[]) {
                int[] iArr = (int[]) k4;
                while (i4 < iArr.length) {
                    sb.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (k4 instanceof double[]) {
                double[] dArr = (double[]) k4;
                while (i4 < dArr.length) {
                    sb.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (!(k4 instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) k4;
            while (i4 < eVarArr.length) {
                sb.append(eVarArr[i4].f9466a);
                sb.append('/');
                sb.append(eVarArr[i4].f9467b);
                i4++;
                if (i4 != eVarArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:178:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:181:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Object k(ByteOrder byteOrder) {
            b bVar;
            InputStream inputStream;
            byte b4;
            byte b5;
            int i4 = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f9461d);
                    try {
                        bVar.J(byteOrder);
                        switch (this.f9458a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f9461d;
                                if (bArr.length != 1 || (b4 = bArr[0]) < 0 || b4 > 1) {
                                    String str = new String(bArr, a.f9418s0);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e4) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b4 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (this.f9459b >= a.f9399Z.length) {
                                    int i5 = 0;
                                    while (true) {
                                        byte[] bArr2 = a.f9399Z;
                                        if (i5 >= bArr2.length) {
                                            i4 = bArr2.length;
                                        } else if (this.f9461d[i5] == bArr2[i5]) {
                                            i5++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (i4 < this.f9459b && (b5 = this.f9461d[i4]) != 0) {
                                    if (b5 >= 32) {
                                        sb.append((char) b5);
                                    } else {
                                        sb.append('?');
                                    }
                                    i4++;
                                }
                                String sb2 = sb.toString();
                                try {
                                    bVar.close();
                                    return sb2;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    return sb2;
                                }
                            case 3:
                                int[] iArr = new int[this.f9459b];
                                while (i4 < this.f9459b) {
                                    iArr[i4] = bVar.readUnsignedShort();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return iArr;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return iArr;
                                }
                            case 4:
                                long[] jArr = new long[this.f9459b];
                                while (i4 < this.f9459b) {
                                    jArr[i4] = bVar.o();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return jArr;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return jArr;
                                }
                            case 5:
                                e[] eVarArr = new e[this.f9459b];
                                while (i4 < this.f9459b) {
                                    eVarArr[i4] = new e(bVar.o(), bVar.o());
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return eVarArr;
                                }
                            case 8:
                                int[] iArr2 = new int[this.f9459b];
                                while (i4 < this.f9459b) {
                                    iArr2[i4] = bVar.readShort();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return iArr2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return iArr2;
                                }
                            case 9:
                                int[] iArr3 = new int[this.f9459b];
                                while (i4 < this.f9459b) {
                                    iArr3[i4] = bVar.readInt();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return iArr3;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return iArr3;
                                }
                            case 10:
                                e[] eVarArr2 = new e[this.f9459b];
                                while (i4 < this.f9459b) {
                                    eVarArr2[i4] = new e(bVar.readInt(), bVar.readInt());
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr2;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return eVarArr2;
                                }
                            case 11:
                                double[] dArr = new double[this.f9459b];
                                while (i4 < this.f9459b) {
                                    dArr[i4] = bVar.readFloat();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return dArr;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return dArr;
                                }
                            case 12:
                                double[] dArr2 = new double[this.f9459b];
                                while (i4 < this.f9459b) {
                                    dArr2[i4] = bVar.readDouble();
                                    i4++;
                                }
                                try {
                                    bVar.close();
                                    return dArr2;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return dArr2;
                                }
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return null;
                                }
                        }
                    } catch (IOException e16) {
                        e = e16;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e18) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                        }
                    }
                    throw th;
                }
            } catch (IOException e19) {
                e = e19;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public String toString() {
            return "(" + a.f9397X[this.f9458a] + ", data length:" + this.f9461d.length + ")";
        }

        c(int i4, int i5, long j4, byte[] bArr) {
            this.f9458a = i4;
            this.f9459b = i5;
            this.f9460c = j4;
            this.f9461d = bArr;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f9466a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9467b;

        e(long j4, long j5) {
            if (j5 == 0) {
                this.f9466a = 0L;
                this.f9467b = 1L;
            } else {
                this.f9466a = j4;
                this.f9467b = j5;
            }
        }

        public double a() {
            return this.f9466a / this.f9467b;
        }

        public String toString() {
            return this.f9466a + "/" + this.f9467b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        f9400a0 = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9401b0 = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f9402c0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f9403d0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9404e0 = dVarArr5;
        f9405f0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f9406g0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f9407h0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f9408i0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f9409j0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f9410k0 = dVarArr10;
        f9411l0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f9412m0 = new d("JPEGInterchangeFormat", 513, 4);
        f9413n0 = new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4);
        f9414o0 = new HashMap[dVarArr10.length];
        f9415p0 = new HashMap[dVarArr10.length];
        f9416q0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f9417r0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f9418s0 = forName;
        f9419t0 = "Exif\u0000\u0000".getBytes(forName);
        f9420u0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f9396W = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            d[][] dVarArr11 = f9410k0;
            if (i4 >= dVarArr11.length) {
                HashMap hashMap = f9417r0;
                d[] dVarArr12 = f9411l0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f9462a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f9462a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f9462a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f9462a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f9462a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f9462a), 8);
                f9421v0 = Pattern.compile(".*[1-9].*");
                f9423w0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f9414o0[i4] = new HashMap();
            f9415p0[i4] = new HashMap();
            for (d dVar : dVarArr11[i4]) {
                f9414o0[i4].put(Integer.valueOf(dVar.f9462a), dVar);
                f9415p0[i4].put(dVar.f9463b, dVar);
            }
            i4++;
        }
    }

    public a(String str) {
        d[][] dVarArr = f9410k0;
        this.f9432f = new HashMap[dVarArr.length];
        this.f9433g = new HashSet(dVarArr.length);
        this.f9434h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        t(str);
    }

    private static boolean A(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f9422w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean B(HashMap hashMap) {
        c cVar;
        int i4;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f9434h);
            int[] iArr2 = f9426z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f9430d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i4 = cVar.i(this.f9434h)) == 1 && Arrays.equals(iArr, f9375B)) || (i4 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f9422w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean C(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f9434h) <= 512 && cVar2.i(this.f9434h) <= 512;
    }

    private boolean D(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f9386M;
            if (i4 >= bArr2.length) {
                int i5 = 0;
                while (true) {
                    byte[] bArr3 = f9387N;
                    if (i5 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f9386M.length + i5 + 4] != bArr3[i5]) {
                        return false;
                    }
                    i5++;
                }
            } else {
                if (bArr[i4] != bArr2[i4]) {
                    return false;
                }
                i4++;
            }
        }
    }

    private void E(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i4 = 0; i4 < f9410k0.length; i4++) {
            try {
                try {
                    this.f9432f[i4] = new HashMap();
                } catch (IOException e4) {
                    this.f9447u = false;
                    boolean z4 = f9422w;
                    if (z4) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e4);
                    }
                    a();
                    if (z4) {
                        G();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (f9422w) {
                    G();
                }
                throw th;
            }
        }
        if (!this.f9431e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f9430d = j(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f9431e) {
            switch (this.f9430d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    n(bVar);
                    break;
                case 4:
                    i(bVar, 0, 0);
                    break;
                case 7:
                    k(bVar);
                    break;
                case 9:
                    m(bVar);
                    break;
                case 10:
                    o(bVar);
                    break;
                case 12:
                    h(bVar);
                    break;
                case 13:
                    l(bVar);
                    break;
                case 14:
                    q(bVar);
                    break;
            }
        } else {
            p(bVar);
        }
        L(bVar);
        this.f9447u = true;
        a();
        if (f9422w) {
            G();
        }
    }

    private void F(b bVar, int i4) {
        ByteOrder H3 = H(bVar);
        this.f9434h = H3;
        bVar.J(H3);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i5 = this.f9430d;
        if (i5 != 7 && i5 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8 || readInt >= i4) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i6 = readInt - 8;
        if (i6 <= 0 || bVar.skipBytes(i6) == i6) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i6);
    }

    private void G() {
        for (int i4 = 0; i4 < this.f9432f.length; i4++) {
            Log.d("ExifInterface", "The size of tag group[" + i4 + "]: " + this.f9432f[i4].size());
            for (Map.Entry entry : this.f9432f[i4].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f9434h) + "'");
            }
        }
    }

    private ByteOrder H(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f9422w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f9422w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void I(byte[] bArr, int i4) {
        b bVar = new b(bArr);
        F(bVar, bArr.length);
        J(bVar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void J(b bVar, int i4) {
        short s4;
        short s5;
        long j4;
        int i5;
        d dVar;
        long j5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        d dVar2;
        int readUnsignedShort;
        long j6;
        int i8 = i4;
        this.f9433g.add(Integer.valueOf(bVar.f9457e));
        if (bVar.f9457e + 2 > bVar.f9456d) {
            return;
        }
        short readShort = bVar.readShort();
        if (f9422w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (bVar.f9457e + (readShort * 12) > bVar.f9456d || readShort <= 0) {
            return;
        }
        short s6 = 0;
        while (s6 < readShort) {
            int readUnsignedShort2 = bVar.readUnsignedShort();
            int readUnsignedShort3 = bVar.readUnsignedShort();
            int readInt = bVar.readInt();
            long n4 = bVar.n() + 4;
            d dVar3 = (d) f9414o0[i8].get(Integer.valueOf(readUnsignedShort2));
            boolean z6 = f9422w;
            if (z6) {
                j4 = 4;
                i5 = 4;
                s4 = readShort;
                s5 = s6;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(readUnsignedShort2), dVar3 != null ? dVar3.f9463b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s4 = readShort;
                s5 = s6;
                j4 = 4;
                i5 = 4;
            }
            if (dVar3 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f9398Y.length) {
                        if (dVar3.a(readUnsignedShort3)) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = dVar3.f9464c;
                            }
                            dVar = dVar3;
                            j5 = readInt * r6[readUnsignedShort3];
                            if (j5 < 0 || j5 > 2147483647L) {
                                if (z6) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z4 = false;
                                if (z4) {
                                    bVar.p(n4);
                                } else {
                                    if (j5 > j4) {
                                        int readInt2 = bVar.readInt();
                                        if (z6) {
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        }
                                        int i9 = this.f9430d;
                                        if (i9 == 7) {
                                            dVar2 = dVar;
                                            z5 = z6;
                                            if ("MakerNote".equals(dVar2.f9463b)) {
                                                this.f9443q = readInt2;
                                            } else if (i8 == 6 && "ThumbnailImage".equals(dVar2.f9463b)) {
                                                this.f9444r = readInt2;
                                                this.f9445s = readInt;
                                                c f4 = c.f(6, this.f9434h);
                                                i6 = readUnsignedShort2;
                                                i7 = readUnsignedShort3;
                                                c b4 = c.b(this.f9444r, this.f9434h);
                                                c b5 = c.b(this.f9445s, this.f9434h);
                                                this.f9432f[i5].put("Compression", f4);
                                                this.f9432f[i5].put("JPEGInterchangeFormat", b4);
                                                this.f9432f[i5].put("JPEGInterchangeFormatLength", b5);
                                            }
                                            i6 = readUnsignedShort2;
                                            i7 = readUnsignedShort3;
                                        } else {
                                            z5 = z6;
                                            i6 = readUnsignedShort2;
                                            i7 = readUnsignedShort3;
                                            dVar2 = dVar;
                                            if (i9 == 10 && "JpgFromRaw".equals(dVar2.f9463b)) {
                                                this.f9446t = readInt2;
                                            }
                                        }
                                        long j7 = readInt2;
                                        if (j7 + j5 <= bVar.f9456d) {
                                            bVar.p(j7);
                                        } else {
                                            if (z5) {
                                                Log.d("ExifInterface", "Skip the tag entry since data offset is invalid: " + readInt2);
                                            }
                                            bVar.p(n4);
                                        }
                                    } else {
                                        z5 = z6;
                                        i6 = readUnsignedShort2;
                                        i7 = readUnsignedShort3;
                                        dVar2 = dVar;
                                    }
                                    Integer num = (Integer) f9417r0.get(Integer.valueOf(i6));
                                    if (z5) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j5);
                                    }
                                    if (num != null) {
                                        int i10 = i7;
                                        if (i10 != 3) {
                                            if (i10 == i5) {
                                                j6 = bVar.o();
                                            } else if (i10 == 8) {
                                                readUnsignedShort = bVar.readShort();
                                            } else if (i10 == 9 || i10 == 13) {
                                                readUnsignedShort = bVar.readInt();
                                            } else {
                                                j6 = -1;
                                            }
                                            if (z5) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j6), dVar2.f9463b));
                                            }
                                            if (j6 > 0 || j6 >= bVar.f9456d) {
                                                if (z5) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j6);
                                                }
                                            } else if (!this.f9433g.contains(Integer.valueOf((int) j6))) {
                                                bVar.p(j6);
                                                J(bVar, num.intValue());
                                            } else if (z5) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j6 + ")");
                                            }
                                            bVar.p(n4);
                                        } else {
                                            readUnsignedShort = bVar.readUnsignedShort();
                                        }
                                        j6 = readUnsignedShort;
                                        if (z5) {
                                        }
                                        if (j6 > 0) {
                                        }
                                        if (z5) {
                                        }
                                        bVar.p(n4);
                                    } else {
                                        int n5 = bVar.n() + this.f9442p;
                                        byte[] bArr = new byte[(int) j5];
                                        bVar.readFully(bArr);
                                        d dVar4 = dVar2;
                                        c cVar = new c(i7, readInt, n5, bArr);
                                        this.f9432f[i4].put(dVar4.f9463b, cVar);
                                        if ("DNGVersion".equals(dVar4.f9463b)) {
                                            this.f9430d = 3;
                                        }
                                        if ((("Make".equals(dVar4.f9463b) || "Model".equals(dVar4.f9463b)) && cVar.j(this.f9434h).contains("PENTAX")) || ("Compression".equals(dVar4.f9463b) && cVar.i(this.f9434h) == 65535)) {
                                            this.f9430d = 8;
                                        }
                                        if (bVar.n() != n4) {
                                            bVar.p(n4);
                                        }
                                    }
                                }
                                s6 = (short) (s5 + 1);
                                i8 = i4;
                                readShort = s4;
                            } else {
                                z4 = true;
                                if (z4) {
                                }
                                s6 = (short) (s5 + 1);
                                i8 = i4;
                                readShort = s4;
                            }
                        } else if (z6) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f9397X[readUnsignedShort3] + ") is unexpected for tag: " + dVar3.f9463b);
                        }
                    }
                }
                dVar = dVar3;
                if (z6) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j5 = 0;
                z4 = false;
                if (z4) {
                }
                s6 = (short) (s5 + 1);
                i8 = i4;
                readShort = s4;
            } else if (z6) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            dVar = dVar3;
            j5 = 0;
            z4 = false;
            if (z4) {
            }
            s6 = (short) (s5 + 1);
            i8 = i4;
            readShort = s4;
        }
        if (bVar.n() + 4 <= bVar.f9456d) {
            int readInt3 = bVar.readInt();
            boolean z7 = f9422w;
            if (z7) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j8 = readInt3;
            if (j8 <= 0 || readInt3 >= bVar.f9456d) {
                if (z7) {
                    Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            if (this.f9433g.contains(Integer.valueOf(readInt3))) {
                if (z7) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            bVar.p(j8);
            if (this.f9432f[4].isEmpty()) {
                J(bVar, 4);
            } else if (this.f9432f[5].isEmpty()) {
                J(bVar, 5);
            }
        }
    }

    private void K(b bVar, int i4) {
        c cVar;
        c cVar2 = (c) this.f9432f[i4].get("ImageLength");
        c cVar3 = (c) this.f9432f[i4].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = (c) this.f9432f[i4].get("JPEGInterchangeFormat")) != null) {
            i(bVar, cVar.i(this.f9434h), i4);
        }
    }

    private void L(b bVar) {
        HashMap hashMap = this.f9432f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar == null) {
            this.f9441o = 6;
            r(bVar, hashMap);
            return;
        }
        int i4 = cVar.i(this.f9434h);
        this.f9441o = i4;
        if (i4 != 1) {
            if (i4 == 6) {
                r(bVar, hashMap);
                return;
            } else if (i4 != 7) {
                return;
            }
        }
        if (B(hashMap)) {
            s(bVar, hashMap);
        }
    }

    private static boolean M(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr2.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private void N(int i4, int i5) {
        if (this.f9432f[i4].isEmpty() || this.f9432f[i5].isEmpty()) {
            if (f9422w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f9432f[i4].get("ImageLength");
        c cVar2 = (c) this.f9432f[i4].get("ImageWidth");
        c cVar3 = (c) this.f9432f[i5].get("ImageLength");
        c cVar4 = (c) this.f9432f[i5].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f9422w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f9422w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i6 = cVar.i(this.f9434h);
        int i7 = cVar2.i(this.f9434h);
        int i8 = cVar3.i(this.f9434h);
        int i9 = cVar4.i(this.f9434h);
        if (i6 >= i8 || i7 >= i9) {
            return;
        }
        HashMap[] hashMapArr = this.f9432f;
        HashMap hashMap = hashMapArr[i4];
        hashMapArr[i4] = hashMapArr[i5];
        hashMapArr[i5] = hashMap;
    }

    private void O(b bVar, int i4) {
        c f4;
        c f5;
        c cVar = (c) this.f9432f[i4].get("DefaultCropSize");
        c cVar2 = (c) this.f9432f[i4].get("SensorTopBorder");
        c cVar3 = (c) this.f9432f[i4].get("SensorLeftBorder");
        c cVar4 = (c) this.f9432f[i4].get("SensorBottomBorder");
        c cVar5 = (c) this.f9432f[i4].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                K(bVar, i4);
                return;
            }
            int i5 = cVar2.i(this.f9434h);
            int i6 = cVar4.i(this.f9434h);
            int i7 = cVar5.i(this.f9434h);
            int i8 = cVar3.i(this.f9434h);
            if (i6 <= i5 || i7 <= i8) {
                return;
            }
            c f6 = c.f(i6 - i5, this.f9434h);
            c f7 = c.f(i7 - i8, this.f9434h);
            this.f9432f[i4].put("ImageLength", f6);
            this.f9432f[i4].put("ImageWidth", f7);
            return;
        }
        if (cVar.f9458a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f9434h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            f4 = c.d(eVarArr[0], this.f9434h);
            f5 = c.d(eVarArr[1], this.f9434h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f9434h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            f4 = c.f(iArr[0], this.f9434h);
            f5 = c.f(iArr[1], this.f9434h);
        }
        this.f9432f[i4].put("ImageWidth", f4);
        this.f9432f[i4].put("ImageLength", f5);
    }

    private void P() {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        c cVar = (c) this.f9432f[1].get("PixelXDimension");
        c cVar2 = (c) this.f9432f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f9432f[0].put("ImageWidth", cVar);
            this.f9432f[0].put("ImageLength", cVar2);
        }
        if (this.f9432f[4].isEmpty() && C(this.f9432f[5])) {
            HashMap[] hashMapArr = this.f9432f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (C(this.f9432f[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void a() {
        String e4 = e("DateTimeOriginal");
        if (e4 != null && e("DateTime") == null) {
            this.f9432f[0].put("DateTime", c.a(e4));
        }
        if (e("ImageWidth") == null) {
            this.f9432f[0].put("ImageWidth", c.b(0L, this.f9434h));
        }
        if (e("ImageLength") == null) {
            this.f9432f[0].put("ImageLength", c.b(0L, this.f9434h));
        }
        if (e("Orientation") == null) {
            this.f9432f[0].put("Orientation", c.b(0L, this.f9434h));
        }
        if (e("LightSource") == null) {
            this.f9432f[1].put("LightSource", c.b(0L, this.f9434h));
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b4)));
        }
        return sb.toString();
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] d(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            jArr[i4] = iArr[i4];
        }
        return jArr;
    }

    private c g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f9422w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i4 = 0; i4 < f9410k0.length; i4++) {
            c cVar = (c) this.f9432f[i4].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void h(b bVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0066a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str != null) {
                this.f9432f[0].put("ImageWidth", c.f(Integer.parseInt(str), this.f9434h));
            }
            if (str2 != null) {
                this.f9432f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.f9434h));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                this.f9432f[0].put("Orientation", c.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f9434h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.p(parseInt2);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i4 = parseInt2 + 6;
                int i5 = parseInt3 - 6;
                if (!Arrays.equals(bArr, f9419t0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i5];
                if (bVar.read(bArr2) != i5) {
                    throw new IOException("Can't read exif");
                }
                this.f9442p = i4;
                I(bArr2, 0);
            }
            if (f9422w) {
                Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        r20.J(r19.f9434h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(b bVar, int i4, int i5) {
        int i6;
        if (f9422w) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.J(ByteOrder.BIG_ENDIAN);
        bVar.p(i4);
        byte readByte = bVar.readByte();
        byte b4 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i7 = i4 + 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b4) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            boolean z4 = f9422w;
            if (z4) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i8 = readUnsignedShort - 2;
                int i9 = i7 + 4;
                if (z4) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i8];
                    bVar.readFully(bArr);
                    int i10 = i9 + i8;
                    byte[] bArr2 = f9419t0;
                    if (M(bArr, bArr2)) {
                        int length = i9 + bArr2.length;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i8);
                        this.f9442p = length;
                        I(copyOfRange, i5);
                    } else {
                        byte[] bArr3 = f9420u0;
                        if (M(bArr, bArr3)) {
                            int length2 = i9 + bArr3.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i8);
                            if (e("Xmp") == null) {
                                i6 = i10;
                                this.f9432f[0].put("Xmp", new c(1, copyOfRange2.length, length2, copyOfRange2));
                                this.f9448v = true;
                                i9 = i6;
                            }
                        }
                    }
                    i6 = i10;
                    i9 = i6;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            if (bVar.skipBytes(1) != 1) {
                                                throw new IOException("Invalid SOFx");
                                            }
                                            this.f9432f[i5].put("ImageLength", c.b(bVar.readUnsignedShort(), this.f9434h));
                                            this.f9432f[i5].put("ImageWidth", c.b(bVar.readUnsignedShort(), this.f9434h));
                                            i8 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    if (i8 >= 0) {
                        throw new IOException("Invalid length");
                    }
                    if (bVar.skipBytes(i8) != i8) {
                        throw new IOException("Invalid JPEG segment");
                    }
                    i7 = i9 + i8;
                    b4 = -1;
                } else {
                    byte[] bArr4 = new byte[i8];
                    if (bVar.read(bArr4) != i8) {
                        throw new IOException("Invalid exif");
                    }
                    if (e("UserComment") == null) {
                        this.f9432f[1].put("UserComment", c.a(new String(bArr4, f9418s0)));
                    }
                }
                i8 = 0;
                if (i8 >= 0) {
                }
            }
        }
    }

    private int j(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (v(bArr)) {
            return 4;
        }
        if (y(bArr)) {
            return 9;
        }
        if (u(bArr)) {
            return 12;
        }
        if (w(bArr)) {
            return 7;
        }
        if (z(bArr)) {
            return 10;
        }
        if (x(bArr)) {
            return 13;
        }
        return D(bArr) ? 14 : 0;
    }

    private void k(b bVar) {
        int i4;
        int i5;
        n(bVar);
        c cVar = (c) this.f9432f[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f9461d);
            bVar2.J(this.f9434h);
            byte[] bArr = f9380G;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.p(0L);
            byte[] bArr3 = f9381H;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.p(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.p(12L);
            }
            J(bVar2, 6);
            c cVar2 = (c) this.f9432f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f9432f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f9432f[5].put("JPEGInterchangeFormat", cVar2);
                this.f9432f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f9432f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f9434h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 <= i7 || (i4 = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i8 = (i6 - i7) + 1;
                int i9 = (i4 - i5) + 1;
                if (i8 < i9) {
                    int i10 = i8 + i9;
                    i9 = i10 - i9;
                    i8 = i10 - i9;
                }
                c f4 = c.f(i8, this.f9434h);
                c f5 = c.f(i9, this.f9434h);
                this.f9432f[0].put("ImageWidth", f4);
                this.f9432f[0].put("ImageLength", f5);
            }
        }
    }

    private void l(b bVar) {
        if (f9422w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.J(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f9382I;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = length + 8;
                if (i4 == 16 && !Arrays.equals(bArr2, f9384K)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f9385L)) {
                    return;
                }
                if (Arrays.equals(bArr2, f9383J)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f9442p = i4;
                        I(bArr3, 0);
                        P();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i5 = readInt + 4;
                bVar.skipBytes(i5);
                length = i4 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void m(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i4 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        i(bVar, i4, 5);
        bVar.p(i5);
        bVar.J(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f9422w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i6 = 0; i6 < readInt; i6++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f9405f0.f9462a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f4 = c.f(readShort, this.f9434h);
                c f5 = c.f(readShort2, this.f9434h);
                this.f9432f[0].put("ImageLength", f4);
                this.f9432f[0].put("ImageWidth", f5);
                if (f9422w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void n(b bVar) {
        c cVar;
        F(bVar, bVar.available());
        J(bVar, 0);
        O(bVar, 0);
        O(bVar, 5);
        O(bVar, 4);
        P();
        if (this.f9430d != 8 || (cVar = (c) this.f9432f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f9461d);
        bVar2.J(this.f9434h);
        bVar2.p(6L);
        J(bVar2, 9);
        c cVar2 = (c) this.f9432f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f9432f[1].put("ColorSpace", cVar2);
        }
    }

    private void o(b bVar) {
        n(bVar);
        if (((c) this.f9432f[0].get("JpgFromRaw")) != null) {
            i(bVar, this.f9446t, 5);
        }
        c cVar = (c) this.f9432f[0].get("ISO");
        c cVar2 = (c) this.f9432f[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        this.f9432f[1].put("PhotographicSensitivity", cVar);
    }

    private void p(b bVar) {
        byte[] bArr = f9419t0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f9442p = bArr.length;
        I(bArr2, 0);
    }

    private void q(b bVar) {
        if (f9422w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.J(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f9386M.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f9387N.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i4 = skipBytes + 8;
                if (Arrays.equals(f9388O, bArr)) {
                    byte[] bArr2 = new byte[readInt2];
                    if (bVar.read(bArr2) == readInt2) {
                        this.f9442p = i4;
                        I(bArr2, 0);
                        this.f9442p = i4;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                int i5 = i4 + readInt2;
                if (i5 == readInt) {
                    return;
                }
                if (i5 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int skipBytes2 = bVar.skipBytes(readInt2);
                if (skipBytes2 != readInt2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                skipBytes = i4 + skipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void r(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i4 = cVar.i(this.f9434h);
        int i5 = cVar2.i(this.f9434h);
        if (this.f9430d == 7) {
            i4 += this.f9443q;
        }
        int min = Math.min(i5, bVar.m() - i4);
        if (i4 > 0 && min > 0) {
            this.f9435i = true;
            int i6 = this.f9442p + i4;
            this.f9438l = i6;
            this.f9439m = min;
            if (this.f9427a == null && this.f9429c == null && this.f9428b == null) {
                byte[] bArr = new byte[min];
                bVar.p(i6);
                bVar.readFully(bArr);
                this.f9440n = bArr;
            }
        }
        if (f9422w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i4 + ", length: " + min);
        }
    }

    private void s(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] d4 = d(cVar.k(this.f9434h));
        long[] d5 = d(cVar2.k(this.f9434h));
        if (d4 == null || d4.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (d5 == null || d5.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (d4.length != d5.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j4 = 0;
        for (long j5 : d5) {
            j4 += j5;
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        this.f9437k = true;
        this.f9436j = true;
        this.f9435i = true;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < d4.length; i7++) {
            int i8 = (int) d4[i7];
            int i9 = (int) d5[i7];
            if (i7 < d4.length - 1 && i8 + i9 != d4[i7 + 1]) {
                this.f9437k = false;
            }
            int i10 = i8 - i5;
            if (i10 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
            }
            bVar.p(i10);
            int i11 = i5 + i10;
            byte[] bArr2 = new byte[i9];
            bVar.read(bArr2);
            i5 = i11 + i9;
            System.arraycopy(bArr2, 0, bArr, i6, i9);
            i6 += i9;
        }
        this.f9440n = bArr;
        if (this.f9437k) {
            this.f9438l = ((int) d4[0]) + this.f9442p;
            this.f9439m = i4;
        }
    }

    private void t(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f9429c = null;
        this.f9427a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (A(fileInputStream.getFD())) {
                this.f9428b = fileInputStream.getFD();
            } else {
                this.f9428b = null;
            }
            E(fileInputStream);
            c(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            c(fileInputStream2);
            throw th;
        }
    }

    private boolean u(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j4;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e5) {
            e = e5;
            bVar2 = bVar;
            if (f9422w) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f9377D)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j4 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j4 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j5 = readInt - j4;
        if (j5 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z4 = false;
        boolean z5 = false;
        for (long j6 = 0; j6 < j5 / 4; j6++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j6 != 1) {
                if (Arrays.equals(bArr3, f9378E)) {
                    z4 = true;
                } else if (Arrays.equals(bArr3, f9379F)) {
                    z5 = true;
                }
                if (z4 && z5) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean v(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f9376C;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    private boolean w(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder H3 = H(bVar2);
                this.f9434h = H3;
                bVar2.J(H3);
                short readShort = bVar2.readShort();
                boolean z4 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z4;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean x(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f9382I;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    private boolean y(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i4 = 0; i4 < bytes.length; i4++) {
            if (bArr[i4] != bytes[i4]) {
                return false;
            }
        }
        return true;
    }

    private boolean z(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder H3 = H(bVar2);
                this.f9434h = H3;
                bVar2.J(H3);
                boolean z4 = bVar2.readShort() == 85;
                bVar2.close();
                return z4;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c g4 = g(str);
        if (g4 != null) {
            if (!f9416q0.contains(str)) {
                return g4.j(this.f9434h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i4 = g4.f9458a;
                if (i4 != 5 && i4 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + g4.f9458a);
                    return null;
                }
                e[] eVarArr = (e[]) g4.k(this.f9434h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f9466a / eVar.f9467b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f9466a / eVar2.f9467b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f9466a / eVar3.f9467b)));
            }
            try {
                return Double.toString(g4.h(this.f9434h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int f(String str, int i4) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c g4 = g(str);
        if (g4 != null) {
            try {
                return g4.i(this.f9434h);
            } catch (NumberFormatException unused) {
            }
        }
        return i4;
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f9462a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9463b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9464c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9465d;

        d(String str, int i4, int i5) {
            this.f9463b = str;
            this.f9462a = i4;
            this.f9464c = i5;
            this.f9465d = -1;
        }

        boolean a(int i4) {
            int i5;
            int i6 = this.f9464c;
            if (i6 == 7 || i4 == 7 || i6 == i4 || (i5 = this.f9465d) == i4) {
                return true;
            }
            if ((i6 == 4 || i5 == 4) && i4 == 3) {
                return true;
            }
            if ((i6 == 9 || i5 == 9) && i4 == 8) {
                return true;
            }
            return (i6 == 12 || i5 == 12) && i4 == 11;
        }

        d(String str, int i4, int i5, int i6) {
            this.f9463b = str;
            this.f9462a = i4;
            this.f9464c = i5;
            this.f9465d = i6;
        }
    }

    /* renamed from: V.a$a, reason: collision with other inner class name */
    class C0066a extends MediaDataSource implements AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        long f9449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f9450c;

        C0066a(b bVar) {
            this.f9450c = bVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j4, byte[] bArr, int i4, int i5) {
            if (i5 == 0) {
                return 0;
            }
            if (j4 < 0) {
                return -1;
            }
            try {
                long j5 = this.f9449b;
                if (j5 != j4) {
                    if (j5 >= 0 && j4 >= j5 + this.f9450c.available()) {
                        return -1;
                    }
                    this.f9450c.p(j4);
                    this.f9449b = j4;
                }
                if (i5 > this.f9450c.available()) {
                    i5 = this.f9450c.available();
                }
                int read = this.f9450c.read(bArr, i4, i5);
                if (read >= 0) {
                    this.f9449b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f9449b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
