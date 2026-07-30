package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
final class IcyDataSource implements DataSource {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final DataSource upstream;

    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i8, Listener listener) {
        Assertions.checkArgument(i8 > 0);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i8;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i8;
    }

    private boolean readMetadata() {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i8 = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i8 == 0) {
            return true;
        }
        byte[] bArr = new byte[i8];
        int i9 = i8;
        int i10 = 0;
        while (i9 > 0) {
            int read = this.upstream.read(bArr, i10, i9);
            if (read == -1) {
                return false;
            }
            i10 += read;
            i9 -= read;
        }
        while (i8 > 0 && bArr[i8 - 1] == 0) {
            i8--;
        }
        if (i8 > 0) {
            this.listener.onIcyMetadata(new ParsableByteArray(bArr, i8));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i8, int i9) {
        if (this.bytesUntilMetadata == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.bytesUntilMetadata = this.metadataIntervalBytes;
        }
        int read = this.upstream.read(bArr, i8, Math.min(this.bytesUntilMetadata, i9));
        if (read != -1) {
            this.bytesUntilMetadata -= read;
        }
        return read;
    }
}
