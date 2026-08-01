package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class XH implements AJ {
    public static String[] A0E = {"fmVPqkFD1cgVEf5yEceID3qk2mv0y9jV", "b0qKN8vCZijgotAYoetPmKMmgBOh17e", "g7TZXYRzX5Z2yGc3Q7ZfgtgqT", "qnhKgbP1LxOTukF1AVGitzUWI170z7Sc", "gLdsa9A", "GaZA", "7VW9", "auyYkXCiGRTQJpd2YduJgHCR"};
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = AJ.A00;
    public ByteBuffer A08 = AJ.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    private int A00(long j) {
        return (int) ((this.A04 * j) / 1000000);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= i; limit -= 2) {
            int i = byteBuffer.get(limit);
            if (Math.abs(i) > 4) {
                int i2 = this.A00;
                int i3 = ((limit / i2) * i2) + i2;
                String[] strArr = A0E;
                String str = strArr[4];
                String str2 = strArr[1];
                int length = str.length();
                int i4 = str2.length();
                if (length == i4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[4] = "SOTn58r";
                strArr2[1] = "mEuLJiBevsWuJD71nrz4KbfWqLj7leU";
                return i3;
            }
        }
        int i5 = byteBuffer.position();
        return i5;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < i; position += 2) {
            int i = byteBuffer.get(position);
            if (Math.abs(i) > 4) {
                int i2 = this.A00;
                return i2 * (position / i2);
            }
        }
        int i3 = byteBuffer.limit();
        return i3;
    }

    private void A03(int i) {
        if (this.A07.capacity() < i) {
            this.A07 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i > 0) {
            this.A0A = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        A03(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A05(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int position = maybeSilenceBufferRemaining - byteBuffer.position();
        byte[] bArr = this.A0C;
        int noisePosition = bArr.length;
        int limit2 = this.A02;
        int noisePosition2 = noisePosition - limit2;
        if (maybeSilenceBufferRemaining < limit && position < noisePosition2) {
            A09(bArr, limit2);
            this.A02 = 0;
            String[] strArr = A0E;
            String str = strArr[7];
            String str2 = strArr[2];
            int noisePosition3 = str.length();
            if (noisePosition3 == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "O6VD7siumNrk7CVoottqf9Wd";
            strArr2[2] = "eko4kK9cp1fEhg6H4c3WRP0k0";
            this.A05 = 0;
            return;
        }
        int maybeSilenceInputSize = Math.min(position, noisePosition2);
        byteBuffer.limit(byteBuffer.position() + maybeSilenceInputSize);
        byteBuffer.get(this.A0C, this.A02, maybeSilenceInputSize);
        int i = this.A02 + maybeSilenceInputSize;
        this.A02 = i;
        byte[] bArr2 = this.A0C;
        if (i == bArr2.length) {
            if (this.A0A) {
                A09(bArr2, this.A03);
                long j = this.A06;
                int noisePosition4 = this.A02;
                this.A06 = j + ((noisePosition4 - (this.A03 * 2)) / this.A00);
            } else {
                this.A06 += (i - this.A03) / this.A00;
            }
            A08(byteBuffer, this.A0C, this.A02);
            this.A02 = 0;
            this.A05 = 2;
        }
        byteBuffer.limit(limit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int limit2 = this.A0C.length;
        byteBuffer.limit(Math.min(limit, position + limit2));
        int noiseLimit = A01(byteBuffer);
        int limit3 = byteBuffer.position();
        if (noiseLimit == limit3) {
            this.A05 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A04(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void A07(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int A02 = A02(byteBuffer);
        byteBuffer.limit(A02);
        long j = this.A06;
        int noisyPosition = byteBuffer.remaining();
        int limit2 = this.A00;
        this.A06 = j + (noisyPosition / limit2);
        byte[] bArr = this.A0D;
        int limit3 = this.A03;
        A08(byteBuffer, bArr, limit3);
        if (A02 < limit) {
            byte[] bArr2 = this.A0D;
            int limit4 = this.A03;
            A09(bArr2, limit4);
            this.A05 = 0;
            byteBuffer.limit(limit);
        }
    }

    private void A08(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.A03);
        int i2 = this.A03 - min;
        System.arraycopy(bArr, i - i2, this.A0D, 0, i2);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - min);
        byteBuffer.get(this.A0D, i2, min);
    }

    private void A09(byte[] bArr, int i) {
        A03(i);
        this.A07.put(bArr, 0, i);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0A() {
        return this.A06;
    }

    public final void A0B(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A4N(int i, int i2, int i3) throws AI {
        if (i3 == 2) {
            if (this.A04 == i && this.A01 == i2) {
                return false;
            }
            this.A04 = i;
            this.A01 = i2;
            this.A00 = i2 * 2;
            return true;
        }
        throw new AI(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final ByteBuffer A7O() {
        ByteBuffer byteBuffer = this.A08;
        ByteBuffer outputBuffer = AJ.A00;
        this.A08 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7Q() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7R() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8l() {
        return this.A04 != -1 && this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8q() {
        return this.A0B && this.A08 == AJ.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE6() {
        this.A0B = true;
        int i = this.A02;
        if (i > 0) {
            A09(this.A0C, i);
        }
        if (!this.A0A) {
            long j = this.A06;
            int i2 = this.A03 / this.A00;
            String[] strArr = A0E;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "We9PvBsbdasK7tn9VyyhVUkeOk007ymd";
            strArr2[3] = "bdBvwmZlOtVUMyUHuHiUMKijb9L0xmkD";
            this.A06 = j + i2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE7(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            switch (this.A05) {
                case 0:
                    A06(byteBuffer);
                    break;
                case 1:
                    A05(byteBuffer);
                    break;
                case 2:
                    A07(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void flush() {
        if (A8l()) {
            int A00 = A00(150000L) * this.A00;
            int maybeSilenceBufferSize = this.A0C.length;
            if (maybeSilenceBufferSize != A00) {
                this.A0C = new byte[A00];
            }
            int A002 = A00(20000L);
            int maybeSilenceBufferSize2 = this.A00;
            int i = A002 * maybeSilenceBufferSize2;
            this.A03 = i;
            int maybeSilenceBufferSize3 = this.A0D.length;
            if (maybeSilenceBufferSize3 != i) {
                this.A0D = new byte[i];
            }
        }
        this.A05 = 0;
        this.A08 = AJ.A00;
        this.A0B = false;
        this.A06 = 0L;
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = AJ.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
