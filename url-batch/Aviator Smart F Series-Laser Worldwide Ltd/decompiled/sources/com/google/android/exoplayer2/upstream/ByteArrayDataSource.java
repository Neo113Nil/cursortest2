package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private final byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        super(false);
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        long j8 = dataSpec.position;
        byte[] bArr = this.data;
        if (j8 > bArr.length) {
            throw new DataSourceException(2008);
        }
        this.readPosition = (int) j8;
        int length = bArr.length - ((int) j8);
        this.bytesRemaining = length;
        long j9 = dataSpec.length;
        if (j9 != -1) {
            this.bytesRemaining = (int) Math.min(length, j9);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j10 = dataSpec.length;
        return j10 != -1 ? j10 : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.bytesRemaining;
        if (i10 == 0) {
            return -1;
        }
        int min = Math.min(i9, i10);
        System.arraycopy(this.data, this.readPosition, bArr, i8, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
