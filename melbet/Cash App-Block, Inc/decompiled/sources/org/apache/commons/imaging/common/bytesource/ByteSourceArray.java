package org.apache.commons.imaging.common.bytesource;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes9.dex */
public class ByteSourceArray extends ByteSource {
    private final byte[] bytes;

    public ByteSourceArray(String str, byte[] bArr) {
        super(str);
        this.bytes = bArr;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() {
        return this.bytes;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) {
        int i2;
        int i3 = (int) j;
        if (i3 >= 0 && i >= 0 && (i2 = i3 + i) >= 0) {
            byte[] bArr = this.bytes;
            if (i2 <= bArr.length) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i3, bArr2, 0, i);
                return bArr2;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, ").", Recorder$$ExternalSyntheticOutline2.m107m(i3, i, "Could not read block (block start: ", ", block length: ", ", data length: ")));
        return null;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public String getDescription() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, " byte array", new StringBuilder());
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() {
        return this.bytes.length;
    }

    public ByteSourceArray(byte[] bArr) {
        this(null, bArr);
    }
}
