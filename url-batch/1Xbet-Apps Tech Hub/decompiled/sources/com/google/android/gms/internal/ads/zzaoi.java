package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzaoi implements zzaoj {
    private static final Logger zzb = Logger.getLogger(zzaoi.class.getName());
    final ThreadLocal zza = new zzaoh(this);

    public abstract zzaom zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final zzaom zzb(zzhdb zzhdbVar, zzaon zzaonVar) throws IOException {
        int zza;
        long zzc;
        long zzb2 = zzhdbVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhdbVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzaol.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhdbVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        zzc = zzaol.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        zzc = zze == 0 ? zzhdbVar.zzc() - zzhdbVar.zzb() : zze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhdbVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j = zzc;
                    zzaom zza2 = zza(str, bArr, zzaonVar instanceof zzaom ? ((zzaom) zzaonVar).zza() : "");
                    zza2.zzc(zzaonVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhdbVar, (ByteBuffer) this.zza.get(), j, this);
                    return zza2;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (zza >= 0);
        zzhdbVar.zze(zzb2);
        throw new EOFException();
    }
}
