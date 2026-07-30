package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzggi extends zzghb {
    private final Map zza;
    private final Context zzb;
    private final zzgcc zzc;
    private final long zzd;
    private final long zze;

    zzggi(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.LREM));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgccVar;
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        zzaxg zzaxgVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        Object[] objArr2 = objArr;
        String str = ExifInterface.LONGITUDE_EAST;
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaxgVar = (zzaxg) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
                str = zzaxgVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr2[5];
        synchronized (zzawgVar) {
            zzawgVar.zzu(((Long) objArr2[0]).longValue());
            zzawgVar.zzt((String) objArr2[1]);
            zzawgVar.zzD((String) objArr2[2]);
            zzawgVar.zzE((String) objArr2[3]);
            zzgxa zzi = zzgxa.zzn().zzi();
            byte[] bArr = (byte[]) objArr2[4];
            zzawgVar.zzp(zzi.zzj(bArr, 0, bArr.length));
            zzawgVar.zzo(str);
            if (bool != null) {
                if (true == bool.booleanValue()) {
                    i = 2;
                }
                zzawgVar.zzai(i);
            }
        }
    }
}
