package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.net.URLDecoder;

@Deprecated
/* loaded from: classes3.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;

    @Nullable
    private byte[] data;

    @Nullable
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] split = Util.split(normalizeScheme.getSchemeSpecificPart(), SystemInfoUtil.COMMA);
        if (split.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e8) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e8);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, Charsets.US_ASCII.name()));
        }
        long j8 = dataSpec.position;
        byte[] bArr = this.data;
        if (j8 > bArr.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i8 = (int) j8;
        this.readPosition = i8;
        int length = bArr.length - i8;
        this.bytesRemaining = length;
        long j9 = dataSpec.length;
        if (j9 != -1) {
            this.bytesRemaining = (int) Math.min(length, j9);
        }
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
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i8, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
