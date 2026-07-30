package com.realsil.sdk.dfu.h;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public class e extends BaseBinInputStream {
    public e(InputStream inputStream, long j8, int i8, int i9, boolean z7) {
        super(inputStream, j8, i8, i9, z7);
    }

    @Override // com.realsil.sdk.dfu.image.stream.BaseBinInputStream
    public void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.getShort();
        this.icType = byteBuffer.get();
        this.f15911p = byteBuffer.get();
        byteBuffer.getShort();
        if (a(18)) {
            byteBuffer.getShort();
        } else {
            this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
        }
        this.E = byteBuffer.getInt();
        ZLogger.v(String.format(Locale.US, "icType=0x%02X, secure_version=0x%02x,  imageId=0x%04x, imageVersion=0x%08X, imageSize=0x%08X(%d)", Byte.valueOf(this.icType), Integer.valueOf(this.f15911p), Integer.valueOf(this.f15904i), Long.valueOf(this.imageVersion), Integer.valueOf(this.f15905j), Integer.valueOf(this.f15905j)));
    }
}
