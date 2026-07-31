package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzph;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzkn extends zzmx {
    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    protected final boolean zzc() {
        return false;
    }

    public zzkn(zznc zzncVar) {
        super(zzncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x035e A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0382 A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03fb A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x046a A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0481 A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x048c A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ac A[Catch: all -> 0x0551, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a6 A[Catch: all -> 0x0551, LOOP:1: B:92:0x02a0->B:94:0x02a6, LOOP_END, TryCatch #0 {all -> 0x0551, SecurityException -> 0x0534, SecurityException -> 0x01b7, blocks: (B:14:0x0063, B:16:0x006d, B:19:0x0084, B:21:0x008a, B:24:0x00a1, B:26:0x00ba, B:27:0x00c1, B:29:0x00cb, B:30:0x00d8, B:32:0x00e2, B:33:0x00ef, B:35:0x00fa, B:36:0x0102, B:38:0x011f, B:39:0x012c, B:41:0x0148, B:43:0x0156, B:45:0x015c, B:47:0x0162, B:48:0x0165, B:50:0x0172, B:52:0x0178, B:55:0x018c, B:58:0x0196, B:59:0x01a7, B:61:0x01ab, B:64:0x01b8, B:67:0x01d3, B:69:0x0205, B:71:0x020b, B:73:0x0211, B:75:0x0228, B:77:0x0232, B:78:0x023f, B:79:0x024f, B:81:0x0255, B:87:0x026b, B:91:0x0299, B:92:0x02a0, B:94:0x02a6, B:96:0x02de, B:98:0x02f7, B:100:0x0303, B:101:0x0308, B:103:0x035e, B:104:0x0376, B:106:0x0382, B:107:0x03bf, B:108:0x03f5, B:110:0x03fb, B:113:0x0411, B:118:0x041c, B:120:0x046a, B:121:0x0479, B:123:0x0481, B:124:0x0484, B:126:0x048c, B:127:0x0495, B:129:0x049f, B:132:0x04ad, B:133:0x04b0, B:143:0x0492, B:144:0x03ac, B:145:0x0272, B:151:0x0536, B:154:0x0123, B:156:0x0129), top: B:13:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(zzbd zzbdVar, String str) {
        zznq zznqVar;
        List<zznq> list;
        int i;
        zzaz zzd;
        zzfn.zzj.zzb zzbVar;
        Bundle bundle;
        byte[] bArr;
        zzg zzgVar;
        zzfn.zzk.zza zzaVar;
        zzaz zza;
        long j;
        zzfn.zzf.zza zza2;
        Iterator<String> it;
        zzfn.zzk.zza zzaVar2;
        long zzs;
        long zzu;
        String zzal;
        zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zze(str, zzbf.zzbg)) {
            zzj().zzc().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbdVar.zza) && !"_iapx".equals(zzbdVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzbdVar.zza);
            return null;
        }
        zzfn.zzj.zzb zzb = zzfn.zzj.zzb();
        zzh().zzp();
        try {
            zzg zze = zzh().zze(str);
            if (zze == null) {
                zzj().zzc().zza("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zze.zzar()) {
                zzj().zzc().zza("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfn.zzk.zza zzp = zzfn.zzk.zzw().zzh(1).zzp("android");
            if (!TextUtils.isEmpty(zze.zzac())) {
                zzp.zzb(zze.zzac());
            }
            if (!TextUtils.isEmpty(zze.zzae())) {
                zzp.zzd((String) Preconditions.checkNotNull(zze.zzae()));
            }
            if (!TextUtils.isEmpty(zze.zzaf())) {
                zzp.zze((String) Preconditions.checkNotNull(zze.zzaf()));
            }
            if (zze.zze() != SieveCacheKt.NodeMetaAndPreviousMask) {
                zzp.zze((int) zze.zze());
            }
            zzp.zzf(zze.zzq()).zzd(zze.zzo());
            String zzah = zze.zzah();
            String zzaa = zze.zzaa();
            if (!TextUtils.isEmpty(zzah)) {
                zzp.zzm(zzah);
            } else if (!TextUtils.isEmpty(zzaa)) {
                zzp.zza(zzaa);
            }
            zzp.zzj(zze.zzw());
            zzin zzb2 = this.zzf.zzb(str);
            zzp.zzc(zze.zzn());
            if (this.zzu.zzac() && zze().zzj(zzp.zzt()) && zzb2.zzi() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(zzb2.zzg());
            if (zzb2.zzi() && zze.zzaq()) {
                Pair<String, Boolean> zza3 = zzn().zza(zze.zzac(), zzb2);
                if (zze.zzaq() && zza3 != null && !TextUtils.isEmpty((CharSequence) zza3.first)) {
                    zzp.zzq(zza((String) zza3.first, Long.toString(zzbdVar.zzd)));
                    if (zza3.second != null) {
                        zzp.zzc(((Boolean) zza3.second).booleanValue());
                    }
                }
            }
            zzf().zzac();
            zzfn.zzk.zza zzi = zzp.zzi(Build.MODEL);
            zzf().zzac();
            zzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzg()).zzs(zzf().zzh());
            if (zzb2.zzj() && zze.zzad() != null) {
                zzp.zzc(zza((String) Preconditions.checkNotNull(zze.zzad()), Long.toString(zzbdVar.zzd)));
            }
            if (!TextUtils.isEmpty(zze.zzag())) {
                zzp.zzl((String) Preconditions.checkNotNull(zze.zzag()));
            }
            String zzac = zze.zzac();
            List<zznq> zzk = zzh().zzk(zzac);
            Iterator<zznq> it2 = zzk.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    zznqVar = null;
                    break;
                }
                zznqVar = it2.next();
                if ("_lte".equals(zznqVar.zzc)) {
                    break;
                }
            }
            try {
                if (zznqVar != null && zznqVar.zze != null) {
                    list = zzk;
                    zzfn.zzo[] zzoVarArr = new zzfn.zzo[list.size()];
                    for (i = 0; i < list.size(); i++) {
                        zzfn.zzo.zza zzb3 = zzfn.zzo.zze().zza(list.get(i).zzc).zzb(list.get(i).zzd);
                        g_().zza(zzb3, list.get(i).zze);
                        zzoVarArr[i] = (zzfn.zzo) ((com.google.android.gms.internal.measurement.zzjk) zzb3.zzai());
                    }
                    zzp.zze(Arrays.asList(zzoVarArr));
                    g_().zza(zzp);
                    this.zzf.zza(zze, zzp);
                    if (zzoj.zza() && zze().zza(zzbf.zzcm)) {
                        this.zzf.zzb(zze, zzp);
                    }
                    zzga zza4 = zzga.zza(zzbdVar);
                    zzq().zza(zza4.zzb, zzh().zzd(str));
                    zzq().zza(zza4, zze().zzb(str));
                    Bundle bundle2 = zza4.zzb;
                    bundle2.putLong("_c", 1L);
                    zzj().zzc().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzbdVar.zzc);
                    if (zzq().zzd(zzp.zzt(), zze.zzam())) {
                        zzq().zza(bundle2, "_dbg", (Object) 1L);
                        zzq().zza(bundle2, "_r", (Object) 1L);
                    }
                    zzd = zzh().zzd(str, zzbdVar.zza);
                    if (zzd != null) {
                        bundle = bundle2;
                        bArr = null;
                        zzgVar = zze;
                        zzaVar = zzp;
                        zzbVar = zzb;
                        zza = new zzaz(str, zzbdVar.zza, 0L, 0L, zzbdVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzbVar = zzb;
                        bundle = bundle2;
                        bArr = null;
                        zzgVar = zze;
                        zzaVar = zzp;
                        long j2 = zzd.zzf;
                        zza = zzd.zza(zzbdVar.zzd);
                        j = j2;
                    }
                    zzaz zzazVar = zza;
                    zzh().zza(zzazVar);
                    zzba zzbaVar = new zzba(this.zzu, zzbdVar.zzc, str, zzbdVar.zza, zzbdVar.zzd, j, bundle);
                    zza2 = zzfn.zzf.zze().zzb(zzbaVar.zzc).zza(zzbaVar.zzb).zza(zzbaVar.zzd);
                    it = zzbaVar.zze.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        zzfn.zzh.zza zza5 = zzfn.zzh.zze().zza(next);
                        Object zzc = zzbaVar.zze.zzc(next);
                        if (zzc != null) {
                            g_().zza(zza5, zzc);
                            zza2.zza(zza5);
                        }
                    }
                    zzaVar2 = zzaVar;
                    zzaVar2.zza(zza2).zza(zzfn.zzl.zza().zza(zzfn.zzg.zza().zza(zzazVar.zzc).zza(zzbdVar.zza)));
                    zzaVar2.zza(zzg().zza(zzgVar.zzac(), Collections.emptyList(), zzaVar2.zzab(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc())));
                    if (zza2.zzg()) {
                        zzaVar2.zzi(zza2.zzc()).zze(zza2.zzc());
                    }
                    zzs = zzgVar.zzs();
                    if (zzs != 0) {
                        zzaVar2.zzg(zzs);
                    }
                    zzu = zzgVar.zzu();
                    if (zzu == 0) {
                        zzaVar2.zzh(zzu);
                    } else if (zzs != 0) {
                        zzaVar2.zzh(zzs);
                    }
                    zzal = zzgVar.zzal();
                    if (zzph.zza() && zze().zze(str, zzbf.zzbr) && zzal != null) {
                        zzaVar2.zzr(zzal);
                    }
                    zzgVar.zzap();
                    zzaVar2.zzf((int) zzgVar.zzt()).zzl(97001L).zzk(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
                    this.zzf.zza(zzaVar2.zzt(), zzaVar2);
                    zzfn.zzj.zzb zzbVar2 = zzbVar;
                    zzbVar2.zza(zzaVar2);
                    zzg zzgVar2 = zzgVar;
                    zzgVar2.zzr(zzaVar2.zzf());
                    zzgVar2.zzp(zzaVar2.zze());
                    zzh().zza(zzgVar2, false, false);
                    zzh().zzw();
                    return g_().zzb(((zzfn.zzj) ((com.google.android.gms.internal.measurement.zzjk) zzbVar2.zzai())).zzbz());
                }
                return g_().zzb(((zzfn.zzj) ((com.google.android.gms.internal.measurement.zzjk) zzbVar2.zzai())).zzbz());
            } catch (IOException e) {
                zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfw.zza(str), e);
                return bArr;
            }
            list = zzk;
            zznq zznqVar2 = new zznq(zzac, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzb().currentTimeMillis(), 0L);
            list.add(zznqVar2);
            zzh().zza(zznqVar2);
            zzfn.zzo[] zzoVarArr2 = new zzfn.zzo[list.size()];
            while (i < list.size()) {
            }
            zzp.zze(Arrays.asList(zzoVarArr2));
            g_().zza(zzp);
            this.zzf.zza(zze, zzp);
            if (zzoj.zza()) {
                this.zzf.zzb(zze, zzp);
            }
            zzga zza42 = zzga.zza(zzbdVar);
            zzq().zza(zza42.zzb, zzh().zzd(str));
            zzq().zza(zza42, zze().zzb(str));
            Bundle bundle22 = zza42.zzb;
            bundle22.putLong("_c", 1L);
            zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle22.putLong("_r", 1L);
            bundle22.putString("_o", zzbdVar.zzc);
            if (zzq().zzd(zzp.zzt(), zze.zzam())) {
            }
            zzd = zzh().zzd(str, zzbdVar.zza);
            if (zzd != null) {
            }
            zzaz zzazVar2 = zza;
            zzh().zza(zzazVar2);
            zzba zzbaVar2 = new zzba(this.zzu, zzbdVar.zzc, str, zzbdVar.zza, zzbdVar.zzd, j, bundle);
            zza2 = zzfn.zzf.zze().zzb(zzbaVar2.zzc).zza(zzbaVar2.zzb).zza(zzbaVar2.zzd);
            it = zzbaVar2.zze.iterator();
            while (it.hasNext()) {
            }
            zzaVar2 = zzaVar;
            zzaVar2.zza(zza2).zza(zzfn.zzl.zza().zza(zzfn.zzg.zza().zza(zzazVar2.zzc).zza(zzbdVar.zza)));
            zzaVar2.zza(zzg().zza(zzgVar.zzac(), Collections.emptyList(), zzaVar2.zzab(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc())));
            if (zza2.zzg()) {
            }
            zzs = zzgVar.zzs();
            if (zzs != 0) {
            }
            zzu = zzgVar.zzu();
            if (zzu == 0) {
            }
            zzal = zzgVar.zzal();
            if (zzph.zza()) {
                zzaVar2.zzr(zzal);
            }
            zzgVar.zzap();
            zzaVar2.zzf((int) zzgVar.zzt()).zzl(97001L).zzk(zzb().currentTimeMillis()).zzd(Boolean.TRUE.booleanValue());
            this.zzf.zza(zzaVar2.zzt(), zzaVar2);
            zzfn.zzj.zzb zzbVar22 = zzbVar;
            zzbVar22.zza(zzaVar2);
            zzg zzgVar22 = zzgVar;
            zzgVar22.zzr(zzaVar2.zzf());
            zzgVar22.zzp(zzaVar2.zze());
            zzh().zza(zzgVar22, false, false);
            zzh().zzw();
        } catch (SecurityException e2) {
            zzj().zzc().zza("app instance id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            zzj().zzc().zza("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            zzh().zzu();
        }
    }
}
