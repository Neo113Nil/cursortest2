package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.util.UriUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfx extends zzfs {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfx(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws zzfw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfw(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzeo.zza;
        FileInputStream fileInputStream2 = fileInputStream;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzfw {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri normalizeScheme = zzgeVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzf(zzgeVar);
                if (Objects.equals(normalizeScheme.getScheme(), UriUtil.LOCAL_CONTENT_SCHEME)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    String valueOf = String.valueOf(normalizeScheme);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    IOException iOException = new IOException(sb.toString());
                    i = 2000;
                    try {
                        throw new zzfw(iOException, 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new zzfw(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgeVar.zze > length) {
                    throw new zzfw(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j2 = zzgeVar.zze;
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new zzfw(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.zze = j;
                        if (j < 0) {
                            throw new zzfw(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.zze = j;
                    if (j < 0) {
                        throw new zzfw(null, 2008);
                    }
                }
                long j3 = zzgeVar.zzf;
                if (j3 != -1) {
                    this.zze = j == -1 ? j3 : Math.min(j, j3);
                }
                this.zzf = true;
                zzg(zzgeVar);
                return j3 != -1 ? j3 : this.zze;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzfw e3) {
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzfw {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e) {
                        throw new zzfw(e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzfw(e2, 2000);
                }
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzfw(e3, 2000);
            }
        }
    }
}
