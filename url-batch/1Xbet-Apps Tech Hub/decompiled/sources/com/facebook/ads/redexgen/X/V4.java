package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V4 implements InterfaceC0512Gc {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final InterfaceC0532Gy<? super V4> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, Ascii.CAN, Ascii.DC4, Ascii.SUB, Ascii.ETB, 8, 10, -59, Ascii.SO, 9, 10, 19, Ascii.EM, Ascii.SO, Ascii.VT, Ascii.SO, 10, Ascii.ETB, -59, Ascii.DC2, Ascii.SUB, Ascii.CAN, Ascii.EM, -59, 7, 10, -59, 6, 19, -59, Ascii.SO, 19, Ascii.EM, 10, Ascii.FF, 10, Ascii.ETB, -45, 5, 2, -7, -48, Ascii.GS, 37, 35, 36, -48, 37, 35, Ascii.NAK, -48, 35, 19, Ascii.CAN, Ascii.NAK, Ascii.GS, Ascii.NAK, -48, 34, 17, 39, 34, Ascii.NAK, 35, Ascii.US, 37, 34, 19, Ascii.NAK, 36, 19, 41, 36, Ascii.ETB, 37, 33, 39, 36, Ascii.NAK, Ascii.ETB};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public V4(Context context, InterfaceC0532Gy<? super V4> interfaceC0532Gy) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0532Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final Uri A85() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final long ADb(C0516Gg c0516Gg) throws C0531Gx {
        try {
            Uri uri = c0516Gg.A04;
            this.A02 = uri;
            if (TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    long skip = this.A03.skip(c0516Gg.A03);
                    long skipped = c0516Gg.A03;
                    if (skip >= skipped) {
                        if (c0516Gg.A02 != -1) {
                            this.A00 = c0516Gg.A02;
                        } else {
                            long length = this.A01.getLength();
                            if (A08[7].length() != 19) {
                                throw new RuntimeException();
                            }
                            A08[0] = "nEQCtk";
                            this.A00 = length != -1 ? length - c0516Gg.A03 : -1L;
                        }
                        this.A04 = true;
                        InterfaceC0532Gy<? super V4> interfaceC0532Gy = this.A06;
                        if (interfaceC0532Gy != null) {
                            interfaceC0532Gy.ADF(this, c0516Gg);
                        }
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0531Gx(A00(0, 39, 94));
                }
            }
            throw new C0531Gx(A00(39, 31, 105));
        } catch (IOException e) {
            throw new C0531Gx(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final void close() throws C0531Gx {
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C0531Gx(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0532Gy<? super V4> interfaceC0532Gy = this.A06;
                        if (interfaceC0532Gy != null) {
                            interfaceC0532Gy.ADE(this);
                        }
                    }
                }
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.A01;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0532Gy<? super V4> interfaceC0532Gy2 = this.A06;
                            if (interfaceC0532Gy2 != null) {
                                interfaceC0532Gy2.ADE(this);
                            }
                        }
                        throw th;
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0532Gy<? super V4> interfaceC0532Gy3 = this.A06;
                            if (interfaceC0532Gy3 != null) {
                                interfaceC0532Gy3.ADE(this);
                            }
                        }
                    }
                } catch (IOException e2) {
                    throw new C0531Gx(e2);
                }
            }
        } catch (IOException e3) {
            throw new C0531Gx(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final int read(byte[] bArr, int i, int i2) throws C0531Gx {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0531Gx(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0531Gx(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        InterfaceC0532Gy<? super V4> interfaceC0532Gy = this.A06;
        if (interfaceC0532Gy != null) {
            interfaceC0532Gy.AAm(this, read);
        }
        return read;
    }
}
