package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzapw implements zzapa {
    protected final zzapy zza;
    private final zzapv zzb;

    public zzapw(zzapv zzapvVar) {
        zzapy zzapyVar = new zzapy(4096);
        this.zzb = zzapvVar;
        this.zza = zzapyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    @Override // com.google.android.gms.internal.ads.zzapa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapd zza(zzaph zzaphVar) throws zzapq {
        byte[] bArr;
        zzapq zzapcVar;
        String str;
        int zzo;
        Map map;
        zzaqf zza;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzaqf zzaqfVar = null;
            try {
                zzaoq zzk = zzaphVar.zzk();
                if (zzk == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = zzk.zzb;
                    if (str2 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzk.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzaqe.zzc(j));
                    }
                    map = hashMap;
                }
                zza = this.zzb.zza(zzaphVar, map);
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
            try {
                int zza2 = zza.zza();
                List zzb = zza.zzb();
                if (zza2 == 304) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    zzaoq zzk2 = zzaphVar.zzk();
                    if (zzk2 == null) {
                        return new zzapd(304, (byte[]) null, true, elapsedRealtime2, zzb);
                    }
                    TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if (!zzb.isEmpty()) {
                        Iterator it = zzb.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((zzaoz) it.next()).zza());
                        }
                    }
                    ArrayList arrayList = new ArrayList(zzb);
                    List list = zzk2.zzh;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (zzaoz zzaozVar : zzk2.zzh) {
                                if (!treeSet.contains(zzaozVar.zza())) {
                                    arrayList.add(zzaozVar);
                                }
                            }
                        }
                    } else if (!zzk2.zzg.isEmpty()) {
                        for (Map.Entry entry : zzk2.zzg.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new zzapd(304, zzk2.zza, true, elapsedRealtime2, (List) arrayList);
                }
                InputStream zzd = zza.zzd();
                if (zzd != null) {
                    int zzc = zza.zzc();
                    zzapy zzapyVar = this.zza;
                    zzaqj zzaqjVar = new zzaqj(zzapyVar, zzc);
                    try {
                        bArr3 = zzapyVar.zza(1024);
                        while (true) {
                            try {
                                int read = zzd.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzaqjVar.write(bArr3, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    zzd.close();
                                    break;
                                } catch (IOException unused) {
                                    zzapt.zza("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzapyVar.zzb(bArr3);
                                zzaqjVar.close();
                                throw th;
                            }
                        }
                        bArr2 = zzaqjVar.toByteArray();
                        try {
                            zzd.close();
                        } catch (IOException unused2) {
                            zzapt.zza("Error occurred when closing InputStream", new Object[0]);
                        }
                        zzapyVar.zzb(bArr3);
                        zzaqjVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bArr3 = null;
                    }
                } else {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                try {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (zzapt.zzb || elapsedRealtime3 > 3000) {
                        zzapt.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaphVar, Long.valueOf(elapsedRealtime3), bArr4 != null ? Integer.valueOf(bArr4.length) : "null", Integer.valueOf(zza2), Integer.valueOf(zzaphVar.zzy().zzb()));
                    }
                    if (zza2 < 200 || zza2 > 299) {
                        throw new IOException();
                    }
                    return new zzapd(zza2, bArr4, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
                } catch (IOException e2) {
                    e = e2;
                    zzaqfVar = zza;
                    bArr = bArr4;
                    if (!(e instanceof SocketTimeoutException)) {
                        zzapcVar = new zzapp();
                        str = "socket";
                    } else {
                        if (e instanceof MalformedURLException) {
                            String zzh = zzaphVar.zzh();
                            String.valueOf(zzh);
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzh)), e);
                        }
                        if (zzaqfVar == null) {
                            throw new zzape(e);
                        }
                        int zza3 = zzaqfVar.zza();
                        zzapt.zzc("Unexpected response code %d for %s", Integer.valueOf(zza3), zzaphVar.zzh());
                        if (bArr != null) {
                            zzapd zzapdVar = new zzapd(zza3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaqfVar.zzb());
                            if (zza3 != 401 && zza3 != 403) {
                                if (zza3 < 400 || zza3 > 499) {
                                    throw new zzapo(zzapdVar);
                                }
                                throw new zzaou(zzapdVar);
                            }
                            zzapcVar = new zzaop(zzapdVar);
                            str = "auth";
                        } else {
                            zzapcVar = new zzapc();
                            str = "network";
                        }
                    }
                    zzaov zzy = zzaphVar.zzy();
                    zzo = zzaphVar.zzo();
                    try {
                        zzy.zzc(zzapcVar);
                        zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
                    } catch (zzapq e3) {
                        zzaphVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzo)));
                        throw e3;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
                zzaqfVar = zza;
                if (!(e instanceof SocketTimeoutException)) {
                }
                zzaov zzy2 = zzaphVar.zzy();
                zzo = zzaphVar.zzo();
                zzy2.zzc(zzapcVar);
                zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
            }
            zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
        }
    }
}
