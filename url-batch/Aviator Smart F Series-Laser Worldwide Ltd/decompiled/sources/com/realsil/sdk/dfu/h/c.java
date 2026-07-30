package com.realsil.sdk.dfu.h;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public class c extends BaseBinInputStream {
    public c(InputStream inputStream, long j8, int i8, int i9, boolean z7) {
        super(inputStream, j8, i8, i9, z7);
    }

    @Override // com.realsil.sdk.dfu.image.stream.BaseBinInputStream
    public void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.icType = (byte) 3;
        if (this.otaVersion != 0) {
            byteBuffer.getShort();
            if (a(18)) {
                byteBuffer.getShort();
            } else {
                this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
            }
            byteBuffer.getShort();
            byteBuffer.getShort();
            byteBuffer.getShort();
            byte[] bArr = this.f15903h;
            byte b8 = bArr[10];
            byte b9 = bArr[11];
            return;
        }
        this.f15910o = byteBuffer.getShort() & u.MAX_VALUE;
        this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
        this.imageVersion = byteBuffer.getShort() & u.MAX_VALUE;
        byteBuffer.getShort();
        this.f15905j = byteBuffer.getShort() & u.MAX_VALUE;
        byte[] bArr2 = this.f15903h;
        byte b10 = bArr2[10];
        byte b11 = bArr2[11];
        if (this.f15896a) {
            ZLogger.v(String.format(Locale.US, "flashAddr=0x%04X, imageId=0x%04X, imageVersion=0x%08X(%d), imageSize=0x%04X(%d)", Integer.valueOf(this.f15910o), Integer.valueOf(this.f15904i), Long.valueOf(this.imageVersion), Long.valueOf(this.imageVersion), Integer.valueOf(this.f15905j), Integer.valueOf(this.f15905j)));
        }
    }

    @Override // com.realsil.sdk.dfu.image.stream.BaseBinInputStream
    public int remainSizeInBytes() {
        return (this.f15905j * 4) - this.f15917v;
    }
}
