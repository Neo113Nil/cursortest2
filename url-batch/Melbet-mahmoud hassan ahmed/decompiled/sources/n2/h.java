package n2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f19428e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f19429f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f19430g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f19431h;

    /* renamed from: i, reason: collision with root package name */
    private long f19432i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19433j;

    public static class a extends m {
        public a(IOException iOException, int i7) {
            super(iOException, i7);
        }
    }

    public h(Context context) {
        super(false);
        this.f19428e = context.getContentResolver();
    }

    @Override // n2.l
    public long b(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.f19496a;
            this.f19429f = uri;
            s(pVar);
            if ("content".equals(pVar.f19496a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f19428e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f19428e.openAssetFileDescriptor(uri, "r");
            }
            this.f19430g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f19431h = fileInputStream;
            if (length != -1 && pVar.f19502g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(pVar.f19502g + startOffset) - startOffset;
            if (skip != pVar.f19502g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f19432i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f19432i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j7 = length - skip;
                this.f19432i = j7;
                if (j7 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j8 = pVar.f19503h;
            if (j8 != -1) {
                long j9 = this.f19432i;
                if (j9 != -1) {
                    j8 = Math.min(j9, j8);
                }
                this.f19432i = j8;
            }
            this.f19433j = true;
            t(pVar);
            long j10 = pVar.f19503h;
            return j10 != -1 ? j10 : this.f19432i;
        } catch (a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // n2.l
    public void close() {
        this.f19429f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19431h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19431h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19430g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f19430g = null;
                        if (this.f19433j) {
                            this.f19433j = false;
                            r();
                        }
                    }
                } catch (IOException e7) {
                    throw new a(e7, 2000);
                }
            } catch (IOException e8) {
                throw new a(e8, 2000);
            }
        } catch (Throwable th) {
            this.f19431h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19430g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19430g = null;
                    if (this.f19433j) {
                        this.f19433j = false;
                        r();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new a(e9, 2000);
                }
            } finally {
                this.f19430g = null;
                if (this.f19433j) {
                    this.f19433j = false;
                    r();
                }
            }
        }
    }

    @Override // n2.l
    public Uri k() {
        return this.f19429f;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19432i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        }
        int read = ((FileInputStream) o2.m0.j(this.f19431h)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f19432i;
        if (j8 != -1) {
            this.f19432i = j8 - read;
        }
        q(read);
        return read;
    }
}
