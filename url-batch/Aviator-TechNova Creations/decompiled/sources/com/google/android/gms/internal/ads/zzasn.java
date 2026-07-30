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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public class zzasn implements zzarr {
    protected final zzasp zza;
    private final zzasm zzb;

    public zzasn(zzasm zzasmVar) {
        zzasp zzaspVar = new zzasp(4096);
        this.zzb = zzasmVar;
        this.zza = zzaspVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    @Override // com.google.android.gms.internal.ads.zzarr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaru zza(zzary zzaryVar) throws zzash {
        byte[] bArr;
        zzash zzartVar;
        String str;
        int zzo;
        Map map;
        zzasw zza;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzasw zzaswVar = null;
            try {
                zzarh zzk = zzaryVar.zzk();
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
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzasv.zzc(j));
                    }
                    map = hashMap;
                }
                zza = this.zzb.zza(zzaryVar, map);
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
            try {
                int zza2 = zza.zza();
                List zzb = zza.zzb();
                if (zza2 == 304) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    zzarh zzk2 = zzaryVar.zzk();
                    if (zzk2 == null) {
                        return new zzaru(304, (byte[]) null, true, elapsedRealtime2, zzb);
                    }
                    TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if (!zzb.isEmpty()) {
                        Iterator it = zzb.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((zzarq) it.next()).zza());
                        }
                    }
                    ArrayList arrayList = new ArrayList(zzb);
                    List list = zzk2.zzh;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (zzarq zzarqVar : zzk2.zzh) {
                                if (!treeSet.contains(zzarqVar.zza())) {
                                    arrayList.add(zzarqVar);
                                }
                            }
                        }
                    } else if (!zzk2.zzg.isEmpty()) {
                        for (Map.Entry entry : zzk2.zzg.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new zzaru(304, zzk2.zza, true, elapsedRealtime2, (List) arrayList);
                }
                InputStream zzd = zza.zzd();
                if (zzd != null) {
                    int zzc = zza.zzc();
                    zzasp zzaspVar = this.zza;
                    zzata zzataVar = new zzata(zzaspVar, zzc);
                    try {
                        bArr3 = zzaspVar.zza(1024);
                        while (true) {
                            try {
                                int read = zzd.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzataVar.write(bArr3, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    zzd.close();
                                    break;
                                } catch (IOException unused) {
                                    zzask.zza("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzaspVar.zzb(bArr3);
                                zzataVar.close();
                                throw th;
                            }
                        }
                        bArr2 = zzataVar.toByteArray();
                        try {
                            zzd.close();
                        } catch (IOException unused2) {
                            zzask.zza("Error occurred when closing InputStream", new Object[0]);
                        }
                        zzaspVar.zzb(bArr3);
                        zzataVar.close();
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
                    if (zzask.zzb || elapsedRealtime3 > 3000) {
                        zzask.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaryVar, Long.valueOf(elapsedRealtime3), bArr4 != null ? Integer.valueOf(bArr4.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(zza2), Integer.valueOf(zzaryVar.zzy().zzb()));
                    }
                    if (zza2 < 200 || zza2 > 299) {
                        throw new IOException();
                    }
                    return new zzaru(zza2, bArr4, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
                } catch (IOException e2) {
                    e = e2;
                    zzaswVar = zza;
                    bArr = bArr4;
                    if (!(e instanceof SocketTimeoutException)) {
                        zzartVar = new zzasg();
                        str = "socket";
                    } else {
                        if (e instanceof MalformedURLException) {
                            String zzh = zzaryVar.zzh();
                            String.valueOf(zzh);
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzh)), e);
                        }
                        if (zzaswVar == null) {
                            throw new zzarv(e);
                        }
                        int zza3 = zzaswVar.zza();
                        zzask.zzc("Unexpected response code %d for %s", Integer.valueOf(zza3), zzaryVar.zzh());
                        if (bArr != null) {
                            zzaru zzaruVar = new zzaru(zza3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaswVar.zzb());
                            if (zza3 != 401 && zza3 != 403) {
                                if (zza3 < 400 || zza3 > 499) {
                                    throw new zzasf(zzaruVar);
                                }
                                throw new zzarl(zzaruVar);
                            }
                            zzartVar = new zzarg(zzaruVar);
                            str = "auth";
                        } else {
                            zzartVar = new zzart();
                            str = "network";
                        }
                    }
                    zzarm zzy = zzaryVar.zzy();
                    zzo = zzaryVar.zzo();
                    try {
                        zzy.zzc(zzartVar);
                        zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
                    } catch (zzash e3) {
                        zzaryVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzo)));
                        throw e3;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
                zzaswVar = zza;
                if (!(e instanceof SocketTimeoutException)) {
                }
                zzarm zzy2 = zzaryVar.zzy();
                zzo = zzaryVar.zzo();
                zzy2.zzc(zzartVar);
                zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
            }
            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
        }
    }
}
