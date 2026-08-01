package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhq extends zzgk {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzhq(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhp(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zze;
        int i3 = zzfs.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zzf == -1) {
                return -1;
            }
            throw new zzhp("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j2 = this.zzf;
        if (j2 != -1) {
            this.zzf = j2 - read;
        }
        zzg(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    @Override // com.google.android.gms.internal.ads.zzgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzgv zzgvVar) throws zzhp {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri normalizeScheme = zzgvVar.zza.normalizeScheme();
        this.zzc = normalizeScheme;
        try {
            try {
                if (!TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
                    if (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1) {
                        String lastPathSegment = normalizeScheme.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                        throw new zzhp("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, PointerIconCompat.TYPE_WAIT);
                    }
                    String path = normalizeScheme.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = normalizeScheme.getHost();
                    parseInt = this.zza.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.zzb);
                    if (parseInt == 0) {
                        throw new zzhp("Resource not found.", null, 2005);
                    }
                    zzi(zzgvVar);
                    openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                    this.zzd = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new zzhp("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, AdError.SERVER_ERROR_CODE);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.zze = fileInputStream;
                    if (length != -1) {
                        try {
                            if (zzgvVar.zzf > length) {
                                throw new zzhp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        } catch (zzhp e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new zzhp(null, e2, AdError.SERVER_ERROR_CODE);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(zzgvVar.zzf + startOffset) - startOffset;
                    if (skip != zzgvVar.zzf) {
                        throw new zzhp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.zzf = -1L;
                            j = -1;
                        } else {
                            j = channel.size() - channel.position();
                            this.zzf = j;
                            if (j < 0) {
                                throw new zzhp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        j = length - skip;
                        this.zzf = j;
                        if (j < 0) {
                            throw new zzgr(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j2 = zzgvVar.zzg;
                    if (j2 != -1) {
                        if (j != -1) {
                            j2 = Math.min(j, j2);
                        }
                        this.zzf = j2;
                    }
                    this.zzg = true;
                    zzj(zzgvVar);
                    long j3 = zzgvVar.zzg;
                    return j3 != -1 ? j3 : this.zzf;
                }
                openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                this.zzd = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new zzhp(null, e3, 2005);
            }
            String lastPathSegment2 = normalizeScheme.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            zzi(zzgvVar);
        } catch (NumberFormatException unused) {
            throw new zzhp("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws zzhp {
        this.zzc = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zze;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zze = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzhp(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } catch (IOException e2) {
                    throw new zzhp(null, e2, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.zze = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzhp(null, e3, AdError.SERVER_ERROR_CODE);
            }
        }
    }
}
