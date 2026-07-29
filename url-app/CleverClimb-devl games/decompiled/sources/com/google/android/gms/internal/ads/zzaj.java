package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.aiming.mdt.utils.Constants;
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

/* loaded from: classes2.dex */
public class zzaj implements zzm {
    private static final boolean DEBUG = zzaf.DEBUG;

    @Deprecated
    private final zzar zzbo;
    private final zzai zzbp;
    private final zzak zzbq;

    public zzaj(zzai zzaiVar) {
        this(zzaiVar, new zzak(4096));
    }

    private zzaj(zzai zzaiVar, zzak zzakVar) {
        this.zzbp = zzaiVar;
        this.zzbo = zzaiVar;
        this.zzbq = zzakVar;
    }

    @Deprecated
    public zzaj(zzar zzarVar) {
        this(zzarVar, new zzak(4096));
    }

    @Deprecated
    private zzaj(zzar zzarVar, zzak zzakVar) {
        this.zzbo = zzarVar;
        this.zzbp = new zzah(zzarVar);
        this.zzbq = zzakVar;
    }

    private static void zza(String str, zzr<?> zzrVar, zzae zzaeVar) throws zzae {
        zzab zzj = zzrVar.zzj();
        int zzi = zzrVar.zzi();
        try {
            zzj.zza(zzaeVar);
            zzrVar.zzb(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzi)));
        } catch (zzae e) {
            zzrVar.zzb(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzi)));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzac {
        zzau zzauVar = new zzau(this.zzbq, i);
        byte[] bArr = null;
        try {
            if (inputStream == null) {
                throw new zzac();
            }
            byte[] zzb = this.zzbq.zzb(1024);
            while (true) {
                try {
                    int read = inputStream.read(zzb);
                    if (read == -1) {
                        break;
                    }
                    zzauVar.write(zzb, 0, read);
                } catch (Throwable th) {
                    th = th;
                    bArr = zzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            zzaf.v("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    this.zzbq.zza(bArr);
                    zzauVar.close();
                    throw th;
                }
            }
            byte[] byteArray = zzauVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzaf.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbq.zza(zzb);
            zzauVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x013d, code lost:
    
        if (r13 > 3000) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0196, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    @Override // com.google.android.gms.internal.ads.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzp zzc(zzr<?> zzrVar) throws zzae {
        String str;
        zzae zzadVar;
        List<zzl> list;
        zzaq zzaqVar;
        byte[] bArr;
        ?? r8;
        Map<String, String> map;
        byte[] zza;
        List<zzl> list2;
        Object valueOf;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List<zzl> emptyList = Collections.emptyList();
            try {
                try {
                    zzc zzf = zzrVar.zzf();
                    if (zzf == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        if (zzf.zza != null) {
                            hashMap.put(Constants.KEY_IF_NONE_MATCH, zzf.zza);
                        }
                        if (zzf.zzc > 0) {
                            hashMap.put(Constants.KEY_IF_MODIFIED_SINCE, zzap.zzb(zzf.zzc));
                        }
                        map = hashMap;
                    }
                    zzaqVar = this.zzbp.zza(zzrVar, map);
                    try {
                        int statusCode = zzaqVar.getStatusCode();
                        List<zzl> zzq = zzaqVar.zzq();
                        if (statusCode == 304) {
                            zzc zzf2 = zzrVar.zzf();
                            if (zzf2 == null) {
                                return new zzp(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzq.isEmpty()) {
                                Iterator<zzl> it = zzq.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(it.next().getName());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzq);
                            if (zzf2.zzg != null) {
                                if (!zzf2.zzg.isEmpty()) {
                                    for (zzl zzlVar : zzf2.zzg) {
                                        if (!treeSet.contains(zzlVar.getName())) {
                                            arrayList.add(zzlVar);
                                        }
                                    }
                                }
                            } else if (!zzf2.zzf.isEmpty()) {
                                for (Map.Entry<String, String> entry : zzf2.zzf.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzl(entry.getKey(), entry.getValue()));
                                    }
                                }
                            }
                            return new zzp(304, zzf2.data, true, SystemClock.elapsedRealtime() - elapsedRealtime, (List<zzl>) arrayList);
                        }
                        try {
                            InputStream content = zzaqVar.getContent();
                            if (content != null) {
                                try {
                                    zza = zza(content, zzaqVar.getContentLength());
                                } catch (IOException e) {
                                    e = e;
                                    list = zzq;
                                    bArr = null;
                                    if (zzaqVar == null) {
                                    }
                                }
                            } else {
                                zza = new byte[0];
                            }
                            byte[] bArr2 = zza;
                            try {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (!DEBUG) {
                                    list2 = r8;
                                }
                                ?? r82 = new Object[5];
                                r82[0] = zzrVar;
                                r82[1] = Long.valueOf(elapsedRealtime2);
                                if (bArr2 != null) {
                                    try {
                                        valueOf = Integer.valueOf(bArr2.length);
                                    } catch (IOException e2) {
                                        e = e2;
                                        bArr = bArr2;
                                        list = zzq;
                                        if (zzaqVar == null) {
                                        }
                                    }
                                } else {
                                    valueOf = "null";
                                }
                                r82[2] = valueOf;
                                r82[3] = Integer.valueOf(statusCode);
                                r82[4] = Integer.valueOf(zzrVar.zzj().zzd());
                                zzaf.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", r82);
                                list2 = r82;
                            } catch (IOException e3) {
                                e = e3;
                                list2 = zzq;
                            }
                            try {
                                if (statusCode < 200 || statusCode > 299) {
                                    break;
                                }
                                return new zzp(statusCode, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                            } catch (IOException e4) {
                                e = e4;
                                bArr = bArr2;
                                list = list2;
                                if (zzaqVar == null) {
                                    throw new zzq(e);
                                }
                                int statusCode2 = zzaqVar.getStatusCode();
                                r8 = zzrVar.getUrl();
                                zzaf.e("Unexpected response code %d for %s", new Object[]{Integer.valueOf(statusCode2), r8});
                                if (bArr != null) {
                                    zzp zzpVar = new zzp(statusCode2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, list);
                                    if (statusCode2 != 401 && statusCode2 != 403) {
                                        if (statusCode2 >= 400 && statusCode2 <= 499) {
                                            throw new zzg(zzpVar);
                                        }
                                        if (statusCode2 < 500 || statusCode2 > 599) {
                                            throw new zzac(zzpVar);
                                        }
                                        throw new zzac(zzpVar);
                                    }
                                    zza("auth", zzrVar, new zza(zzpVar));
                                } else {
                                    str = "network";
                                    zzadVar = new zzo();
                                    r8 = r8;
                                    zza(str, zzrVar, zzadVar);
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            list = zzq;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        list = emptyList;
                    }
                } catch (IOException e7) {
                    e = e7;
                    list = emptyList;
                    zzaqVar = null;
                }
            } catch (MalformedURLException e8) {
                String valueOf2 = String.valueOf(zzrVar.getUrl());
                throw new RuntimeException(valueOf2.length() != 0 ? "Bad URL ".concat(valueOf2) : new String("Bad URL "), e8);
            } catch (SocketTimeoutException unused) {
                str = "socket";
                zzadVar = new zzad();
                r8 = r8;
                zza(str, zzrVar, zzadVar);
            }
        }
    }
}
