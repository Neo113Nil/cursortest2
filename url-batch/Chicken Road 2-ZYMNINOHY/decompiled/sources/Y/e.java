package Y;

import W.J;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f3684e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3685f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f3686g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f3687h;

    /* renamed from: i, reason: collision with root package name */
    public long f3688i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3689j;

    public e(Context context) {
        super(false);
        this.f3684e = context.getContentResolver();
    }

    @Override // Y.h
    public final Uri B() {
        return this.f3685f;
    }

    @Override // Y.h
    public final long b(k kVar) {
        int i4;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = kVar.f3701a;
                long j4 = kVar.f3706f;
                long j5 = kVar.f3705e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f3685f = normalizeScheme;
                g();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f3684e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f3686g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i4 = 2000;
                    try {
                        throw new d(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e4) {
                        e = e4;
                        if (e instanceof FileNotFoundException) {
                            i4 = 2005;
                        }
                        throw new d(e, i4);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f3687h = fileInputStream;
                if (length != -1 && j5 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (skip != j5) {
                    throw new d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f3688i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f3688i = position;
                        if (position < 0) {
                            throw new d(null, 2008);
                        }
                    }
                } else {
                    long j6 = length - skip;
                    this.f3688i = j6;
                    if (j6 < 0) {
                        throw new d(null, 2008);
                    }
                }
                if (j4 != -1) {
                    long j7 = this.f3688i;
                    this.f3688i = j7 == -1 ? j4 : Math.min(j7, j4);
                }
                this.f3689j = true;
                h(kVar);
                return j4 != -1 ? j4 : this.f3688i;
            } catch (d e5) {
                throw e5;
            }
        } catch (IOException e6) {
            e = e6;
            i4 = 2000;
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3685f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3687h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3687h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3686g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new d(e4, 2000);
                    }
                } finally {
                    this.f3686g = null;
                    if (this.f3689j) {
                        this.f3689j = false;
                        f();
                    }
                }
            } catch (IOException e5) {
                throw new d(e5, 2000);
            }
        } catch (Throwable th) {
            this.f3687h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3686g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3686g = null;
                    if (this.f3689j) {
                        this.f3689j = false;
                        f();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new d(e6, 2000);
                }
            } finally {
                this.f3686g = null;
                if (this.f3689j) {
                    this.f3689j = false;
                    f();
                }
            }
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3688i;
        if (j4 != 0) {
            if (j4 != -1) {
                try {
                    i5 = (int) Math.min(j4, i5);
                } catch (IOException e4) {
                    throw new d(e4, 2000);
                }
            }
            FileInputStream fileInputStream = this.f3687h;
            String str = J.f3263a;
            int read = fileInputStream.read(bArr, i4, i5);
            if (read != -1) {
                long j5 = this.f3688i;
                if (j5 != -1) {
                    this.f3688i = j5 - read;
                }
                a(read);
                return read;
            }
        }
        return -1;
    }
}
