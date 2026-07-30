package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05601j extends AQ {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, c.f16476c, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, c.f16476c, 37, 125, 113, 38, 57, 56, 50, 57, 113, 48, 35, 52, 113, c.f16476c, 62, 37, 113, 34, 36, 33, 33, 62, 35, 37, 52, 53, Byte.MAX_VALUE, 113, 21, 56, 53, 113, 40, 62, 36, 113, 50, 48, 61, 61, 113, 4, 35, 56, Byte.MAX_VALUE, 33, 48, 35, 34, 52, 121, 120, 113, 62, c.f16476c, 113, 48, 113, 34, 37, 35, 56, c.f16476c, 54, 113, 50, 62, c.f16476c, 37, 48, 56, c.f16476c, 56, c.f16476c, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, Byte.MAX_VALUE, 55, 35, 62, 60, 23, 56, 61, 52, 121, c.f16476c, 52, 38, 113, 23, 56, 61, 52, 121, 33, 48, 37, 57, 120, 120, 113, 37, 62, 113, 48, 39, 62, 56, 53, 113, 37, 57, 56, 34, Byte.MAX_VALUE, 113, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, c.f16476c, 37, 108, 116, 34};
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
    @Override // com.instagram.common.viewpoint.core.InterfaceC2335pF
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AGi(C06595i c06595i) throws C2330pA {
        AnonymousClass54.A02(A01(0, 15, 71));
        Uri uri = c06595i.A06;
        this.A01 = uri;
        A0G(c06595i);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c06595i.A04);
                this.A00 = c06595i.A03 == -1 ? this.A02.length() - c06595i.A04 : c06595i.A03;
                AnonymousClass54.A00();
                if (this.A00 < 0) {
                    throw new C2330pA(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.A03 = true;
                A0H(c06595i);
                long j9 = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j9;
            } catch (IOException e6) {
                throw new C2330pA(e6, 2000);
            }
        } catch (Throwable th) {
            AnonymousClass54.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public C05601j() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RandomAccessFile A00(Uri uri) throws C2330pA {
        boolean A00;
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) AbstractC06233y.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e6) {
            boolean isEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (isEmpty && TextUtils.isEmpty(uri.getFragment())) {
                if (C5C.A02 >= 21) {
                    A00 = C06615k.A00(e6.getCause());
                }
                i = 2005;
                throw new C2330pA(e6, i);
            }
            throw new C2330pA(String.format(A01(30, 192, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e6, 1004);
        } catch (SecurityException e9) {
            throw new C2330pA(e9, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e10) {
            throw new C2330pA(e10, 2000);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2335pF
    public final Uri A9P() {
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
    @Override // com.instagram.common.viewpoint.core.InterfaceC2335pF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws C2330pA {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z8 = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z8) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e6) {
                throw new C2330pA(e6, 2000);
            }
        } catch (Throwable th) {
            this.A02 = null;
            boolean z9 = this.A03;
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC05792c
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i4) throws C2330pA {
        if (i4 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AnonymousClass54.A02(A01(15, 14, 75));
                int read = ((RandomAccessFile) C5C.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i4));
                if (read > 0) {
                    this.A00 -= read;
                    A0F(read);
                }
                return read;
            } catch (IOException e6) {
                throw new C2330pA(e6, 2000);
            }
        } finally {
            AnonymousClass54.A00();
        }
    }
}
