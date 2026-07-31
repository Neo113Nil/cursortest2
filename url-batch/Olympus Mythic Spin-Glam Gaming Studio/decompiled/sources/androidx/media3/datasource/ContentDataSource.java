package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

@UnstableApi
/* loaded from: classes8.dex */
public final class ContentDataSource extends BaseDataSource {

    @Nullable
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;

    @Nullable
    private FileInputStream inputStream;
    private boolean opened;
    private final ContentResolver resolver;

    @Nullable
    private Uri uri;

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws ContentDataSourceException {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = dataSpec.uri.normalizeScheme();
            this.uri = normalizeScheme;
            transferInitializing(dataSpec);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.resolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.assetFileDescriptor = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1 && dataSpec.position > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip != dataSpec.position) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long position = size - channel.position();
                    this.bytesRemaining = position;
                    if (position < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j2 = dataSpec.length;
            if (j2 != -1) {
                long j3 = this.bytesRemaining;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.bytesRemaining = j2;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j4 = dataSpec.length;
            return j4 != -1 ? j4 : this.bytesRemaining;
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, 2000);
            }
        }
        int read = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws ContentDataSourceException {
        this.uri = null;
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }
}
