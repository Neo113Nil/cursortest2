package com.realsil.sdk.dfu.h;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public class b extends BaseBinInputStream {
    public b(InputStream inputStream, long j8, int i8, int i9, boolean z7) {
        super(inputStream, j8, i8, i9, z7);
    }

    @Override // com.realsil.sdk.dfu.image.stream.BaseBinInputStream
    public void a(ByteBuffer byteBuffer) {
        String format;
        super.a(byteBuffer);
        if (this.otaVersion == 0) {
            this.icType = byteBuffer.get();
            byteBuffer.get();
            this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
            this.imageVersion = byteBuffer.getShort() & u.MAX_VALUE;
            byteBuffer.getShort();
            if (this.f15906k <= 0) {
                this.f15905j = byteBuffer.getInt();
            }
            if (!this.f15896a) {
                return;
            } else {
                format = String.format(Locale.US, "binHeader: icType=0x%02X, imageId=0x%04X, imageVersion=0x%08X,  imageSize(exclude image header)=0x%08X(%d)", Byte.valueOf(this.icType), Integer.valueOf(this.f15904i), Long.valueOf(this.imageVersion), Integer.valueOf(this.f15905j), Integer.valueOf(this.f15905j));
            }
        } else {
            this.icType = byteBuffer.get();
            byteBuffer.get();
            if (a(18)) {
                byteBuffer.getShort();
            } else {
                this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
            }
            byteBuffer.getShort();
            byteBuffer.getShort();
            byteBuffer.getInt();
            if (!this.f15896a) {
                return;
            } else {
                format = String.format(Locale.US, "binHeader: icType=0x%02X", Byte.valueOf(this.icType));
            }
        }
        ZLogger.d(format);
    }
}
