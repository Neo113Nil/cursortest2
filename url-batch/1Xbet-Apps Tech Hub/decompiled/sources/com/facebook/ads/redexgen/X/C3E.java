package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3E extends AbstractC0443Dl {
    public static byte[] A0d;
    public static String[] A0e = {"el1NIdjJdnQk8rQ7yI3DLJMJGUNGpsaL", "cMnDkAErKs2M6cVzDcwdPqTaRDuVL2G6", "3Ljz1yFix4teFI07gFBJ1ZVJZ4Elk", "rfweshkfyu7YGNu9gmTN5aJbUxr0jD44", "UwDJ5OwzyxxJZbvw2og9SG", ExifInterface.LONGITUDE_EAST, "kELoxR7DFwuexd5ZjpenISH", "LMGopoJZLCWwOw1IQPtLBjMdbqq8sxxW"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public BJ<X6> A08;
    public BJ<X6> A09;
    public C0435Cy A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0393Au A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C9X A0W;
    public final XE A0X;
    public final XE A0Y;
    public final BK<X6> A0Z;
    public final D4 A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 57;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[0] = "GT4OiQXgMfCUtJ1QRZ1mZZkQ0KPtv7dD";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{85, 89, Ascii.ESC, Ascii.FF, Ascii.CR, 89, Ascii.ETB, Ascii.SYN, 89, 10, Ascii.FS, Ascii.SUB, Ascii.FF, Ascii.VT, Ascii.FS, 89, Ascii.GS, Ascii.FS, Ascii.SUB, Ascii.SYN, Ascii.GS, Ascii.FS, Ascii.VT, 89, Ascii.CAN, Ascii.SI, Ascii.CAN, 16, Ascii.NAK, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 87, 89, 45, Ascii.VT, 0, 16, Ascii.ETB, Ascii.RS, 89, Ascii.CR, Ascii.SYN, 89, 9, Ascii.VT, Ascii.SYN, Ascii.SUB, Ascii.FS, Ascii.FS, Ascii.GS, 89, Ascii.SO, 16, Ascii.CR, 17, 89, 19, 106, 106, 106, 106, 106, 107, 108, 109, 110, 104, Ascii.EM, 106, 106, Ascii.CAN, Ascii.RS, Ascii.ESC, 104, 111, 99, 106, 106, 106, 106, 106, 106, 107, 108, 98, Ascii.EM, Ascii.US, 106, Ascii.FS, 107, 105, 104, 106, 106, 106, 106, 106, 106, 107, 108, 111, 98, 98, 98, 110, 106, Ascii.RS, Ascii.EM, Ascii.US, 109, 107, 107, 98, Ascii.ESC, 106, 106, 106, 104, Ascii.FS, Ascii.CAN, Ascii.FS, 107, Ascii.EM, 105, 107, Ascii.EM, 105, 104, 109, 111, Ascii.RS, 109, 98, 107, 108, 126, 104, 3, 4, Ascii.SYN, Ascii.SI, 88, 95, 77, 74, Ascii.ETB, 59, 55, 44, 57, 56, 0, 54, 41, 100, 55, 33, 55, 55, 45, 43, 42, 100, 54, 33, 53, 49, 45, 54, 33, 55, 100, 55, 33, 39, 49, 54, 33, 100, 32, 33, 39, 43, 32, 33, 54, 100, 34, 43, 54, 100, 71, 111, 110, 99, 107, 42, 120, 111, 123, Byte.MAX_VALUE, 99, 120, 111, 121, 42, 107, 42, 78, 120, 103, 89, 111, 121, 121, 99, 101, 100, 71, 107, 100, 107, 109, 111, 120, 34, 10, Ascii.VT, 6, Ascii.SO, 44, 0, Ascii.VT, 10, Ascii.FF, Base64.padSymbol, 10, 1, Ascii.VT, 10, Ascii.GS, 10, Ascii.GS, 42, 40, Base64.padSymbol, 75, 32, Ascii.GS, Ascii.FS, Ascii.VT, 10, Ascii.SYN, 75, 4, 19, 6, 75, 1, 0, 6, 80, 82, 71, 49, 90, 103, 102, 113, 112, 108, 49, 126, 105, 124, 49, 123, 122, 124, 49, 108, 122, 124, 106, 109, 122, 36, 38, 51, 69, 38, 63, 32, 69, 42, 62, 47, 34, 36, 69, 47, 46, 40, 36, 47, 46, 57, 69, 38, 59, 88, 63, Base64.padSymbol, 40, 94, Base64.padSymbol, 36, 59, 94, 38, 57, 52, 53, 63, 94, 52, 53, 51, 63, 52, 53, 34, 94, 49, 38, 51, Ascii.SO, Ascii.FF, Ascii.EM, 111, Ascii.SI, 55, 40, 37, 40, 32, 111, 41, 115, 119, 117, 111, 37, 36, 34, 46, 37, 36, 4, 6, 19, 101, 5, Base64.padSymbol, 34, 47, 34, 42, 101, 35, 121, 125, Byte.MAX_VALUE, 101, 47, 46, 40, 36, 47, 46, 101, 56, 46, 40, 62, 57, 46, 4, 6, 19, 101, Ascii.CAN, Ascii.SO, 8, 101, 42, Base64.padSymbol, 40, 101, 47, 46, 40, 75, 73, 92, 42, 87, 65, 71, 42, 101, 114, 103, 42, 96, 97, 103, 42, 119, 97, 103, 113, 118, 97, 110, 108, 121, Ascii.SI, 64, 77, 77, 86, 72, 79, 79, 68, 83, Ascii.SI, 87, 72, 69, 68, 78, Ascii.SI, 69, 68, 66, 78, 69, 68, 83, Ascii.SI, 64, 87, 66, 87, 85, 64, 54, 121, 117, 116, 119, Byte.MAX_VALUE, 113, 123, 54, 121, 110, 123, 54, 124, 125, 123, 119, 124, 125, 106, 54, 121, 111, 125, 107, 119, 117, 125, 114, 112, 101, 19, 92, 80, 81, 82, 90, 84, 94, 19, 92, 75, 94, 19, 89, 88, 94, 82, 89, 88, 79, 19, 92, 74, 88, 78, 82, 80, 88, 19, 78, 88, 94, 72, 79, 88, 123, 121, 108, Ascii.SUB, 83, 91, 91, 83, 88, 81, Ascii.SUB, 85, 85, 87, Ascii.SUB, 80, 81, 87, 91, 80, 81, 70, 95, 93, 72, 62, 119, Byte.MAX_VALUE, Byte.MAX_VALUE, 119, 124, 117, 62, 102, Byte.MAX_VALUE, 98, 114, 121, 99, 62, 116, 117, 115, Byte.MAX_VALUE, 116, 117, 98, 38, 36, 49, 71, Ascii.ESC, 2, 71, Ascii.US, 0, Ascii.CR, Ascii.FF, 6, 54, Ascii.CR, Ascii.FF, 10, 6, Ascii.CR, Ascii.FF, Ascii.ESC, 71, 8, Ascii.US, 10, 57, 39, 71, 43, 95, 91, 90, Ascii.VT, Ascii.NAK, 117, Ascii.EM, 109, 106, 104, 105, 119, Ascii.ETB, 125, 2, 10, 10, 90, 68, 36, 67, 62, 57, 57, 76, 82, 50, 75, 42, 39, 42, Ascii.VT, 0, 9, 6, 6, Ascii.CR, 4, 69, Ascii.VT, 7, Ascii.GS, 6, Ascii.FS, 4, 8, 9, 1, Ascii.SO, 0, Ascii.DC2, Ascii.NAK, 2, 36, 8, 3, 2, 4, 125, 108, 123, Byte.MAX_VALUE, 106, 123, 93, 113, 122, 123, 125, 36, Ascii.FS, 10, Ascii.EM, 17, Ascii.SYN, 57, Ascii.SYN, Ascii.FS, 62, Ascii.GS, Ascii.GS, Ascii.FS, 57, 51, 48, 42, 49, 59, 58, 45, 106, 96, 99, 121, 98, 104, 105, 126, 83, 96, 120, 105, 1, Ascii.DC4, 9, 19, Ascii.SYN, 3, Ascii.DC4, 64, 74, Ascii.SUB, Ascii.CAN, Ascii.CAN, Ascii.CAN, 62, 51, 63, 49, 62, 34, 125, 122, 111, 124, 122, 77, 97, 106, 107, 109, 66, 95, 90, 87, 70, 95, 87, 51, 45, 32, 48, 44};
    }

    public abstract int A1B(D4 d4, BK<X6> bk, Format format) throws D7;

    public abstract void A1N(C0435Cy c0435Cy, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws D7;

    public abstract boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C9K;

    static {
        A0j();
        A0f = C0557Hx.A0h(A0Z(59, 76, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3E(int i, D4 d4, BK<X6> bk, boolean z) {
        super(i);
        HI.A04(C0557Hx.A02 >= 16);
        this.A0a = (D4) HI.A01(d4);
        this.A0Z = bk;
        this.A0c = z;
        this.A0X = new XE(0);
        this.A0Y = XE.A02();
        this.A0W = new C9X();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (C0557Hx.A02 <= 25 && A0Z(263, 25, 38).equals(str) && (C0557Hx.A06.startsWith(A0Z(625, 7, 38)) || C0557Hx.A06.startsWith(A0Z(597, 7, 83)) || C0557Hx.A06.startsWith(A0Z(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 7, 97)) || C0557Hx.A06.startsWith(A0Z(618, 7, 48)))) {
            return 2;
        }
        if (C0557Hx.A02 < 24) {
            if (A0Z(338, 22, 120).equals(str) || A0Z(360, 29, 114).equals(str)) {
                if (!A0Z(683, 8, 102).equals(C0557Hx.A03)) {
                    if (!A0Z(691, 12, 53).equals(C0557Hx.A03)) {
                        if (!A0Z(703, 7, 95).equals(C0557Hx.A03)) {
                            if (A0Z(732, 7, 15).equals(C0557Hx.A03)) {
                                return 1;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(XE xe, int i) {
        MediaCodec.CryptoInfo A02 = xe.A02.A02();
        if (i == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        int i2 = iArr[0];
        if (A0e[2].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0e;
        strArr[7] = "NOzrMPRB76F8DdbUb3OPVPb4rTNpEGvY";
        strArr[3] = "IDmZDsJhwqXuUzopfYWLVElAjmr2DtdU";
        iArr[0] = i2 + i;
        return A02;
    }

    private ByteBuffer A0a(int i) {
        if (C0557Hx.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        ByteBuffer byteBuffer = this.A0S[i];
        String[] strArr = A0e;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "akmimywpCQzy2zgGqC6e1Zi0HtFx9MqZ";
        strArr2[3] = "4g16x1WFaX1F1Ai56lyJAgpz1Kjl0dDQ";
        return byteBuffer;
    }

    private ByteBuffer A0b(int i) {
        if (C0557Hx.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (C0557Hx.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            MediaCodec mediaCodec = this.A06;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[2] = "BQUwUvW99pDNY9ExELsrhPAvhUrne6";
            this.A0T = mediaCodec.getOutputBuffers();
        }
    }

    private void A0d() throws C9K {
        if (this.A02 == 2) {
            A1G();
            A1I();
        } else {
            this.A0N = true;
            A1H();
        }
    }

    private void A0e() {
        if (C0557Hx.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C9K {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 125)) == 32 && outputFormat.getInteger(A0Z(716, 6, 111)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 81), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C0557Hx.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(D0 d0) throws C9K {
        throw C9K.A01(d0, A0y());
    }

    private boolean A0l() {
        if (A0Z(Opcodes.I2S, 6, 111).equals(C0557Hx.A05)) {
            if (!A0Z(Opcodes.F2I, 4, 123).equals(C0557Hx.A06)) {
                if (A0Z(Opcodes.I2D, 4, 19).equals(C0557Hx.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        if (r14.A0G == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
    
        r14.A0K = true;
        r14.A06.queueInputBuffer(r14.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        throw com.facebook.ads.redexgen.X.C9K.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r14.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r14.A01 != 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r14.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a8, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0m() throws C9K {
        int A10;
        MediaCodec mediaCodec = this.A06;
        if (mediaCodec == null || this.A02 == 2 || this.A0M) {
            return false;
        }
        if (this.A03 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.A03 = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.A0X.A01 = A0a(dequeueInputBuffer);
            this.A0X.A07();
        }
        int i = this.A02;
        if (A0e[2].length() == 1) {
            throw new RuntimeException();
        }
        A0e[0] = "BGv06lkWwG6z0hSmECPMwAj0xiUhKKMm";
        if (i == 1) {
            if (!this.A0G) {
                this.A0K = true;
                this.A06.queueInputBuffer(this.A03, 0, 0, 0L, 4);
                A0h();
            }
            this.A02 = 2;
            return false;
        }
        if (this.A0C) {
            this.A0C = false;
            ByteBuffer byteBuffer = this.A0X.A01;
            byte[] bArr = A0f;
            byteBuffer.put(bArr);
            this.A06.queueInputBuffer(this.A03, 0, bArr.length, 0L, 0);
            A0h();
            this.A0J = true;
            return true;
        }
        int result = 0;
        if (this.A0R) {
            A10 = -4;
            if (A0e[2].length() == 1) {
                throw new RuntimeException();
            }
            A0e[0] = "cWcFMDoxN8Aku4bywP95fMqNRICNv17K";
        } else {
            if (this.A01 == 1) {
                for (int i2 = 0; i2 < this.A07.A0P.size(); i2++) {
                    this.A0X.A01.put(this.A07.A0P.get(i2));
                }
                this.A01 = 2;
            }
            result = this.A0X.A01.position();
            C9X c9x = this.A0W;
            if (A0e[5].length() != 20) {
                String[] strArr = A0e;
                strArr[7] = "GMhmsEJxFGP4UGYwyrNMJ7ABPSyH92Wb";
                strArr[3] = "9vGc1NAfm636mRfTzlbxXXygjN4bGT7w";
                A10 = A10(c9x, this.A0X, false);
            } else {
                String[] strArr2 = A0e;
                strArr2[4] = "jZbWd1eO6yZY8R9xWwlVER";
                strArr2[6] = "QWk96bCMj56V6fYDRZTqXno";
                A10 = A10(c9x, this.A0X, false);
            }
        }
        if (A10 == -3) {
            return false;
        }
        if (A10 == -5) {
            if (this.A01 == 2) {
                this.A0X.A07();
                this.A01 = 1;
            }
            A1L(this.A0W.A00);
            return true;
        }
        if (this.A0X.A04()) {
            if (this.A01 == 2) {
                this.A0X.A07();
                this.A01 = 1;
            }
            this.A0M = true;
            boolean z = this.A0J;
            if (A0e[1].charAt(18) == 'w') {
                A0e[5] = "IK13ew4";
            }
        } else {
            if (this.A0Q) {
                XE xe = this.A0X;
                if (A0e[0].charAt(8) != 's') {
                    A0e[0] = "ywBWkcBFyHyOTxmikBGNQ7ElC4JSn47y";
                } else {
                    String[] strArr3 = A0e;
                    strArr3[7] = "uqwAh7OiLzrqYCdIK7FE27Aq9dnmjoOb";
                    strArr3[3] = "CGhJEeUUTBGplB6hh3d6N38sXeZGKtI8";
                }
            }
            this.A0Q = false;
            boolean A0A = this.A0X.A0A();
            boolean A0w = A0w(A0A);
            this.A0R = A0w;
            if (A0w) {
                return false;
            }
            if (this.A0D && !A0A) {
                C0537Hd.A0A(this.A0X.A01);
                if (this.A0X.A01.position() == 0) {
                    return true;
                }
                this.A0D = false;
            }
            try {
                long j = this.A0X.A00;
                if (this.A0X.A03()) {
                    this.A0b.add(Long.valueOf(j));
                }
                this.A0X.A08();
                A1M(this.A0X);
                if (!A0A) {
                    this.A06.queueInputBuffer(this.A03, 0, this.A0X.A01.limit(), j, 0);
                } else {
                    this.A06.queueSecureInputBuffer(this.A03, 0, A0Y(this.A0X, result), j, 0);
                }
                A0h();
                this.A0J = true;
                this.A01 = 0;
                this.A0U.A04++;
                return true;
            } catch (MediaCodec.CryptoException e) {
                throw C9K.A01(e, A0y());
            }
        }
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            if (this.A0b.get(i).longValue() == j) {
                this.A0b.remove(i);
                int i2 = A0e[1].charAt(18);
                if (i2 != 119) {
                    throw new RuntimeException();
                }
                A0e[5] = "GAQPkPxILqrNxqRn";
                return true;
            }
        }
        return false;
    }

    private boolean A0p(long j, long j2) throws C9K {
        boolean processedOutputBuffer;
        int dequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                int outputIndex = this.A0V.size;
                if (outputIndex == 0) {
                    int outputIndex2 = this.A0V.flags;
                    if ((outputIndex2 & 4) != 0) {
                        A0d();
                        return false;
                    }
                }
                this.A04 = dequeueOutputBuffer;
                ByteBuffer A0b = A0b(dequeueOutputBuffer);
                this.A0B = A0b;
                if (A0b != null) {
                    int outputIndex3 = this.A0V.offset;
                    A0b.position(outputIndex3);
                    ByteBuffer byteBuffer = this.A0B;
                    int i = this.A0V.offset;
                    int outputIndex4 = this.A0V.size;
                    int i2 = i + outputIndex4;
                    if (A0e[2].length() != 1) {
                        String[] strArr = A0e;
                        strArr[4] = "FaJE2XiArfhYqeNyfkTyaQ";
                        strArr[6] = "HvmGKe0EFE5f200jghUPQNW";
                        byteBuffer.limit(i2);
                    }
                }
                this.A0P = A0o(this.A0V.presentationTimeUs);
            } else if (A0e[5].length() != 20) {
                A0e[1] = "HT1pBWWLOYy8PEf8scwcSavywhmMK5P3";
                if (dequeueOutputBuffer == -2) {
                    A0f();
                    String[] strArr2 = A0e;
                    String str = strArr2[4];
                    String str2 = strArr2[6];
                    int length = str.length();
                    int outputIndex5 = str2.length();
                    if (length == outputIndex5) {
                        return true;
                    }
                    A0e[5] = "todLl0dSZi0vPTtgICo1ottwNzErViL";
                    return true;
                }
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[5] = "4PVEqwR";
                if (dequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                boolean z = this.A0G;
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[1] = "oPTnjsm2EBoNSW7B2QwBvulptlCCgQiW";
                if (z && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
            throw new RuntimeException();
        }
        if (this.A0F && this.A0K) {
            try {
                processedOutputBuffer = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            } catch (IllegalStateException unused2) {
                A0d();
                if (this.A0N) {
                    A1G();
                }
                return false;
            }
        } else {
            processedOutputBuffer = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
        }
        if (processedOutputBuffer) {
            A1J(this.A0V.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0V.flags & 4) != 0;
            A0i();
            if (!processedOutputBuffer2) {
                return true;
            }
            A0d();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.equals(r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0q(C0435Cy c0435Cy) {
        String str = c0435Cy.A02;
        if (C0557Hx.A02 <= 17) {
            String name = A0Z(573, 24, 80);
            if (!name.equals(str)) {
                String name2 = A0Z(426, 31, 24);
            }
            return true;
        }
        String str2 = C0557Hx.A05;
        String name3 = A0Z(Opcodes.I2S, 6, 111);
        if (name3.equals(str2)) {
            String A0Z = A0Z(Opcodes.D2L, 4, 32);
            String name4 = A0e[5];
            if (name4.length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[4] = "ta8dfTbq5GbSxrQo9R7BCH";
            strArr[6] = "TLzt7USKw6C8aMs6TrECz9n";
            String name5 = C0557Hx.A06;
            if (A0Z.equals(name5) && c0435Cy.A05) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0r(String str) {
        if (C0557Hx.A02 > 23 || !A0Z(548, 25, 41).equals(str)) {
            if (C0557Hx.A02 <= 19) {
                if (!A0Z(710, 6, 17).equals(C0557Hx.A03) || (!A0Z(457, 31, 33).equals(str) && !A0Z(488, 38, 4).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C0557Hx.A02 == 21 && A0Z(526, 22, 13).equals(str);
    }

    public static boolean A0t(String str) {
        return C0557Hx.A02 < 18 || (C0557Hx.A02 == 18 && (A0Z(389, 15, 114).equals(str) || A0Z(TTAdConstant.DEEPLINK_FALLBACK_CODE, 22, 61).equals(str))) || (C0557Hx.A02 == 19 && C0557Hx.A06.startsWith(A0Z(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 7, 3)) && (A0Z(245, 18, 92).equals(str) || A0Z(263, 25, 38).equals(str)));
    }

    public static boolean A0u(String str, Format format) {
        return C0557Hx.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 73).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C0557Hx.A02 <= 18 && format.A05 == 1 && A0Z(288, 25, 82).equals(str);
    }

    private boolean A0w(boolean z) throws C9K {
        BJ<X6> bj = this.A08;
        if (bj == null || (!z && this.A0c)) {
            return false;
        }
        int A7t = bj.A7t();
        if (A7t != 1) {
            return A7t != 4;
        }
        BH A6q = this.A08.A6q();
        int drmSessionState = A0y();
        throw C9K.A01(A6q, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                BJ<X6> bj = this.A08;
                if (bj != null) {
                    this.A0Z.AEU(bj);
                }
                try {
                    BJ<X6> bj2 = this.A09;
                    if (bj2 != null && bj2 != this.A08) {
                        this.A0Z.AEU(bj2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    BJ<X6> bj3 = this.A09;
                    if (bj3 != null && bj3 != this.A08) {
                        this.A0Z.AEU(bj3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.AEU(this.A08);
                }
                try {
                    BJ<X6> bj4 = this.A09;
                    if (bj4 != null && bj4 != this.A08) {
                        this.A0Z.AEU(bj4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    BJ<X6> bj5 = this.A09;
                    if (bj5 != null && bj5 != this.A08) {
                        this.A0Z.AEU(bj5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public void A15(long j, boolean z) throws C9K {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public void A16(boolean z) throws C9K {
        this.A0U = new C0393Au();
    }

    public int A1A(MediaCodec mediaCodec, C0435Cy c0435Cy, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C0435Cy A1D() {
        return this.A0A;
    }

    public C0435Cy A1E(D4 d4, Format format, boolean z) throws D7 {
        return d4.A6f(format.A0O, z);
    }

    public void A1F() throws C9K {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1G();
            A1I();
        } else if (this.A02 != 0) {
            A1G();
            A1I();
        } else {
            this.A06.flush();
            this.A0J = false;
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    BJ<X6> bj = this.A08;
                    if (bj != null && this.A09 != bj) {
                        try {
                            this.A0Z.AEU(bj);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    BJ<X6> bj2 = this.A08;
                    if (A0e[1].charAt(18) != 'w') {
                        throw new RuntimeException();
                    }
                    A0e[1] = "xSjaYNEZ4qh1ZPx8xTwjTufaVWwElX5P";
                    if (bj2 != null && this.A09 != bj2) {
                        try {
                            this.A0Z.AEU(bj2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    BJ<X6> bj3 = this.A08;
                    if (bj3 != null && this.A09 != bj3) {
                        try {
                            this.A0Z.AEU(bj3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    BJ<X6> bj4 = this.A08;
                    if (bj4 != null) {
                        BJ<X6> bj5 = this.A09;
                        if (A0e[1].charAt(18) != 'w') {
                            throw new RuntimeException();
                        }
                        A0e[0] = "vD6SaWSNQpnT2etBhelIXAl4LKAzAMEb";
                        if (bj5 != bj4) {
                            try {
                                this.A0Z.AEU(bj4);
                            } finally {
                            }
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws C9K {
    }

    public final void A1I() throws C9K {
        Format format;
        long j;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCrypto = null;
        String[] strArr = A0e;
        if (strArr[7].charAt(15) == strArr[3].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "pTVSxclXptnWdkcsOldSnbHbt080oNsP";
        strArr2[3] = "3A2dqVKC7anzB9bdQIqtLGHUlM9PHMrl";
        boolean z = false;
        BJ<X6> bj = this.A08;
        if (bj != null) {
            X6 A7G = bj.A7G();
            if (A7G == null) {
                if (this.A08.A6q() == null) {
                    return;
                }
            } else {
                mediaCrypto = A7G.A00();
                z = A7G.A01(str);
            }
            if (A0l()) {
                int A7t = this.A08.A7t();
                if (A7t != 1) {
                    if (A7t != 4) {
                        return;
                    }
                } else {
                    throw C9K.A01(this.A08.A6q(), A0y());
                }
            }
        }
        C0435Cy c0435Cy = this.A0A;
        String[] strArr3 = A0e;
        String str2 = strArr3[4];
        String mimeType = strArr3[6];
        if (str2.length() == mimeType.length()) {
            throw new RuntimeException();
        }
        A0e[5] = "oPP6wTkKkwktIyM";
        if (c0435Cy == null) {
            try {
                C0435Cy A1E = A1E(this.A0a, this.A07, z);
                this.A0A = A1E;
                if (A1E == null && z) {
                    C0435Cy A1E2 = A1E(this.A0a, this.A07, false);
                    this.A0A = A1E2;
                    if (A1E2 != null) {
                        String A0Z = A0Z(227, 18, 86);
                        StringBuilder sb = new StringBuilder();
                        String mimeType2 = A0Z(153, 40, 125);
                        StringBuilder append = sb.append(mimeType2).append(str);
                        String mimeType3 = A0Z(0, 58, 64);
                        StringBuilder append2 = append.append(mimeType3);
                        String mimeType4 = this.A0A.A02;
                        StringBuilder append3 = append2.append(mimeType4);
                        String mimeType5 = A0Z(58, 1, 4);
                        Log.w(A0Z, append3.append(mimeType5).toString());
                    }
                }
            } catch (D7 e) {
                A0k(new D0(this.A07, e, z, -49998));
            }
            if (this.A0A == null) {
                A0k(new D0(this.A07, (Throwable) null, z, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str3 = this.A0A.A02;
        this.A00 = A0W(str3);
        this.A0D = A0u(str3, this.A07);
        this.A0H = A0t(str3);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str3);
        this.A0F = A0s(str3);
        this.A0I = A0v(str3, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb2 = new StringBuilder();
            String mimeType6 = A0Z(659, 12, 39);
            C0554Hu.A02(sb2.append(mimeType6).append(str3).toString());
            this.A06 = MediaCodec.createByCodecName(str3);
            C0554Hu.A00();
            String mimeType7 = A0Z(645, 14, 94);
            C0554Hu.A02(mimeType7);
            A1N(this.A0A, this.A06, this.A07, mediaCrypto);
            C0554Hu.A00();
            String mimeType8 = A0Z(722, 10, 55);
            C0554Hu.A02(mimeType8);
            this.A06.start();
            C0554Hu.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1O(str3, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0c();
        } catch (Exception e2) {
            A0k(new D0(this.A07, e2, z, str3));
        }
        if (A7t() == 2) {
            j = SystemClock.elapsedRealtime() + 1000;
        } else {
            j = -9223372036854775807L;
        }
        this.A05 = j;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C9K {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r0.A08 == r4.A08) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1L(Format format) throws C9K {
        DrmInitData drmInitData;
        MediaCodec mediaCodec;
        boolean z;
        Format format2 = this.A07;
        this.A07 = format;
        DrmInitData drmInitData2 = format.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!C0557Hx.A0g(drmInitData2, drmInitData)) {
            Format oldFormat = this.A07;
            if (oldFormat.A0H != null) {
                BK<X6> bk = this.A0Z;
                if (bk != null) {
                    Looper myLooper = Looper.myLooper();
                    Format oldFormat2 = this.A07;
                    BJ<X6> A2X = bk.A2X(myLooper, oldFormat2.A0H);
                    this.A09 = A2X;
                    if (A2X == this.A08) {
                        this.A0Z.AEU(A2X);
                    }
                } else {
                    throw C9K.A01(new IllegalStateException(A0Z(Opcodes.INSTANCEOF, 34, 51)), A0y());
                }
            } else {
                this.A09 = null;
            }
        }
        boolean z2 = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null) {
            C0435Cy c0435Cy = this.A0A;
            Format oldFormat3 = this.A07;
            switch (A1A(mediaCodec, c0435Cy, format2, oldFormat3)) {
                case 0:
                    break;
                case 1:
                    z2 = true;
                    break;
                case 2:
                default:
                    throw new IllegalStateException();
                case 3:
                    z2 = true;
                    this.A0L = true;
                    this.A01 = 1;
                    int i = this.A00;
                    if (i != 2) {
                        if (i == 1) {
                            Format oldFormat4 = this.A07;
                            if (oldFormat4.A0F == format2.A0F) {
                                Format oldFormat5 = this.A07;
                                break;
                            }
                        }
                        z = false;
                        this.A0C = z;
                        break;
                    }
                    z = true;
                    this.A0C = z;
            }
        }
        if (!z2) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1G();
                A1I();
            }
        }
    }

    public void A1M(XE xe) {
    }

    public void A1O(String str, long j, long j2) {
    }

    public boolean A1Q(C0435Cy c0435Cy) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public boolean A8q() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public boolean A90() {
        return (this.A07 == null || this.A0R || (!A18() && !A0n() && (this.A05 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6.A06 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        com.facebook.ads.redexgen.X.C0554Hu.A02(A0Z(671, 12, 65));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (A0p(r7, r9) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (A0m() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        com.facebook.ads.redexgen.X.C0554Hu.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r6.A0U.A07 += A0z(r7);
        r6.A0Y.A07();
        r0 = A10(r6.A0W, r6.A0Y, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r0 != (-5)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        A1L(r6.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (r0 != (-4)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        com.facebook.ads.redexgen.X.HI.A04(r6.A0Y.A04());
        r6.A0M = true;
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r6.A06 != null) goto L19;
     */
    @Override // com.facebook.ads.redexgen.X.XS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEb(long j, long j2) throws C9K {
        if (this.A0N) {
            A1H();
            String[] strArr = A0e;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0e[0] = "lwFTUI1opuqPhbxVYngJAvB4EigDaO53";
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int result = A10(this.A0W, this.A0Y, true);
            if (result == -5) {
                A1L(this.A0W.A00);
            } else {
                if (result == -4) {
                    HI.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                    return;
                }
                return;
            }
        }
        A1I();
        String[] strArr2 = A0e;
        if (strArr2[4].length() != strArr2[6].length()) {
            A0e[0] = "eroLcdOpjUP85EYGmYhVy7jJ6XqjjMHN";
        } else {
            A0e[1] = "qeXDyPBokWYcVwHFGawdRvPvaKboAA5h";
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03669s
    public final int AFt(Format format) throws C9K {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (D7 e) {
            throw C9K.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl, com.facebook.ads.redexgen.X.InterfaceC03669s
    public final int AFv() {
        return 8;
    }
}
