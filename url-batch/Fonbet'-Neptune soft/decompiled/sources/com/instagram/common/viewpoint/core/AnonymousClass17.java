package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass17 extends AbstractC02709l {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, Utf8.REPLACEMENT_BYTE, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, Utf8.REPLACEMENT_BYTE, 37, 125, 113, 38, 57, 56, 50, 57, 113, 48, 35, 52, 113, Utf8.REPLACEMENT_BYTE, 62, 37, 113, 34, 36, 33, 33, 62, 35, 37, 52, 53, Byte.MAX_VALUE, 113, Ascii.NAK, 56, 53, 113, 40, 62, 36, 113, 50, 48, Base64.padSymbol, Base64.padSymbol, 113, 4, 35, 56, Byte.MAX_VALUE, 33, 48, 35, 34, 52, 121, 120, 113, 62, Utf8.REPLACEMENT_BYTE, 113, 48, 113, 34, 37, 35, 56, Utf8.REPLACEMENT_BYTE, 54, 113, 50, 62, Utf8.REPLACEMENT_BYTE, 37, 48, 56, Utf8.REPLACEMENT_BYTE, 56, Utf8.REPLACEMENT_BYTE, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, Byte.MAX_VALUE, 55, 35, 62, 60, Ascii.ETB, 56, Base64.padSymbol, 52, 121, Utf8.REPLACEMENT_BYTE, 52, 38, 113, Ascii.ETB, 56, Base64.padSymbol, 52, 121, 33, 48, 37, 57, 120, 120, 113, 37, 62, 113, 48, 39, 62, 56, 53, 113, 37, 57, 56, 34, Byte.MAX_VALUE, 113, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, Utf8.REPLACEMENT_BYTE, 37, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1765nl
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFy(AnonymousClass56 anonymousClass56) throws C1759nf {
        C4S.A02(A01(0, 15, 71));
        Uri uri = anonymousClass56.A06;
        this.A01 = uri;
        A0G(anonymousClass56);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(anonymousClass56.A04);
                this.A00 = anonymousClass56.A03 == -1 ? this.A02.length() - anonymousClass56.A04 : anonymousClass56.A03;
                C4S.A00();
                if (this.A00 < 0) {
                    throw new C1759nf(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.A03 = true;
                A0H(anonymousClass56);
                long j = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j;
            } catch (IOException e) {
                throw new C1759nf(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            C4S.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public AnonymousClass17() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RandomAccessFile A00(Uri uri) throws C1759nf {
        boolean A00;
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) C3M.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e) {
            boolean isEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (isEmpty && TextUtils.isEmpty(uri.getFragment())) {
                if (AbstractC01424a.A02 >= 21) {
                    A00 = AnonymousClass58.A00(e.getCause());
                }
                i = 2005;
                throw new C1759nf(e, i);
            }
            throw new C1759nf(String.format(A01(30, Opcodes.CHECKCAST, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e, PointerIconCompat.TYPE_WAIT);
        } catch (SecurityException e2) {
            throw new C1759nf(e2, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e3) {
            throw new C1759nf(e3, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1765nl
    public final Uri A9H() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r6.A03 = false;
        A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r4 != false) goto L22;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1765nl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws C1759nf {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e) {
                throw new C1759nf(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.A02 = null;
            boolean z2 = this.A03;
            String[] strArr3 = A05;
            if (strArr3[3].charAt(29) != strArr3[7].charAt(29)) {
                String[] strArr4 = A05;
                strArr4[0] = "Vm3YcALUN";
                strArr4[2] = "c4edS4Kr4EVyTdnKAl";
            } else {
                String[] strArr5 = A05;
                strArr5[5] = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z";
                strArr5[4] = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P";
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i2) throws C1759nf {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                C4S.A02(A01(15, 14, 75));
                int read = ((RandomAccessFile) AbstractC01424a.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i2));
                if (read > 0) {
                    this.A00 -= read;
                    A0F(read);
                }
                return read;
            } catch (IOException e) {
                throw new C1759nf(e, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            C4S.A00();
        }
    }
}
