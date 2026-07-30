package com.realsil.sdk.dfu.h;

import android.support.v4.media.session.PlaybackStateCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public class f extends BaseBinInputStream {
    public f(InputStream inputStream, long j8, int i8, int i9, boolean z7) {
        super(inputStream, j8, i8, i9, z7);
    }

    @Override // com.realsil.sdk.dfu.image.stream.BaseBinInputStream
    public void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.getShort();
        this.icType = byteBuffer.get();
        byteBuffer.get();
        byteBuffer.getShort();
        if (a(18)) {
            byteBuffer.getShort();
        } else {
            this.f15904i = byteBuffer.getShort() & u.MAX_VALUE;
        }
        int i8 = byteBuffer.getInt();
        this.E = i8;
        if (i8 > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            this.compressed = true;
            this.compressMode = 0;
        } else {
            this.compressed = false;
        }
        if (this.f15896a) {
            ZLogger.d(String.format(Locale.US, "binHeader: icType=0x%02X, payloadLength=0x%04X,isMergeBandFile=%b", Byte.valueOf(this.icType), Integer.valueOf(this.E), Boolean.valueOf(this.isMergeBandFile)));
        }
    }
}
