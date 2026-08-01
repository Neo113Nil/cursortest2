package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzafe {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafe() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzafd zzafdVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzafdVar.zza);
            String str = zzafdVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzafdVar.zzc);
            this.zzb.writeLong(zzafdVar.zzd);
            this.zzb.write(zzafdVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
