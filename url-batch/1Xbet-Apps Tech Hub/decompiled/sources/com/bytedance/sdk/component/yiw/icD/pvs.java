package com.bytedance.sdk.component.yiw.icD;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.sUS;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: DownloadExecutor.java */
/* loaded from: classes.dex */
public class pvs extends vG {
    public File icD;
    public File pvs;

    public pvs(qh qhVar) {
        super(qhVar);
    }

    public void pvs(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.pvs = new File(str, str2);
        this.icD = new File(str, str2 + ".temp");
    }

    public void pvs(final com.bytedance.sdk.component.yiw.pvs.pvs pvsVar) {
        File file = this.pvs;
        if (file == null || this.icD == null) {
            if (pvsVar != null) {
                pvsVar.pvs(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.pvs.length() != 0 && pvsVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.yiw.icD icd = new com.bytedance.sdk.component.yiw.icD(true, 200, "Success", null, null, currentTimeMillis, currentTimeMillis);
            icd.pvs(this.pvs);
            pvsVar.pvs(this, icd);
            return;
        }
        long length = this.icD.length();
        final long j = length >= 0 ? length : 0L;
        Ju.pvs pvsVar2 = new Ju.pvs();
        pvsVar2.pvs((Object) icD());
        icD(HttpHeaders.RANGE, "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.so)) {
            pvsVar.pvs(this, new IOException("Url is Empty"));
            return;
        }
        try {
            pvsVar2.icD(this.so);
            if (!TextUtils.isEmpty(this.NB)) {
                pvsVar2.pvs(this.NB);
            }
            if (this.sUS > 0) {
                pvsVar2.pvs(this.sUS);
            }
            pvs(pvsVar2);
            this.vG.pvs(pvsVar2.pvs().icD()).pvs(new com.bytedance.sdk.component.icD.pvs.vG() { // from class: com.bytedance.sdk.component.yiw.icD.pvs.1
                @Override // com.bytedance.sdk.component.icD.pvs.vG
                public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd2, IOException iOException) {
                    com.bytedance.sdk.component.yiw.pvs.pvs pvsVar3 = pvsVar;
                    if (pvsVar3 != null) {
                        pvsVar3.pvs(pvs.this, iOException);
                    }
                    pvs.this.vG();
                }

                /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
                
                    r10.seek(r14);
                    r10.write(r0, 0, r11);
                    r14 = r14 + r11;
                    r11 = 0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0193 A[EDGE_INSN: B:103:0x0193->B:104:0x0193 BREAK  A[LOOP:1: B:56:0x0159->B:70:0x018a], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0198 A[Catch: all -> 0x018e, TryCatch #11 {all -> 0x018e, blocks: (B:61:0x016b, B:63:0x0171, B:68:0x017e, B:106:0x0198, B:109:0x01a4, B:111:0x01ae, B:113:0x01ba, B:115:0x01c8, B:127:0x01d7, B:128:0x01e4, B:131:0x0201), top: B:60:0x016b }] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:130:0x01fd  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
                @Override // com.bytedance.sdk.component.icD.pvs.vG
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd2, bNS bns) throws IOException {
                    RandomAccessFile randomAccessFile;
                    long j2;
                    byte[] bArr;
                    int i;
                    int read;
                    InputStream inputStream;
                    InputStream inputStream2;
                    if (pvsVar == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (bns == null) {
                        return;
                    }
                    sUS yiw = bns.yiw();
                    if (yiw != null) {
                        for (int i2 = 0; i2 < yiw.pvs(); i2++) {
                            hashMap.put(yiw.pvs(i2), yiw.icD(i2));
                        }
                    }
                    com.bytedance.sdk.component.yiw.icD icd3 = new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), hashMap, null, bns.icD(), bns.pvs());
                    if (bns.Jd()) {
                        long pvs = bns.sUS().pvs();
                        if (pvs <= 0) {
                            pvs = pvs.sUS(hashMap);
                        }
                        boolean NB = pvs.NB(hashMap);
                        int i3 = -1;
                        if (NB) {
                            pvs += j;
                            String str = (String) hashMap.get(HttpHeaders.CONTENT_RANGE);
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = "bytes " + j + "-" + (pvs - 1);
                                if (TextUtils.indexOf(str, str2) == -1) {
                                    pvs.this.vG();
                                    pvsVar.pvs(pvs.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + pvs.this.icD + "]."));
                                    return;
                                }
                            }
                        }
                        if (pvs > 0 && pvs.this.icD.exists() && pvs.this.icD.length() == pvs) {
                            if (pvs.this.icD.renameTo(pvs.this.pvs)) {
                                icd3.pvs(pvs.this.pvs);
                                pvsVar.pvs(pvs.this, icd3);
                                return;
                            } else {
                                pvsVar.pvs(pvs.this, new IOException("Rename fail"));
                                return;
                            }
                        }
                        InputStream inputStream3 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(pvs.this.icD, "rw");
                        } catch (Throwable unused) {
                            randomAccessFile = null;
                        }
                        if (NB) {
                            randomAccessFile.seek(j);
                            j2 = j;
                            try {
                                inputStream3 = bns.sUS().vG();
                                if (pvs.yiw(hashMap) && !(inputStream3 instanceof GZIPInputStream)) {
                                    inputStream3 = new GZIPInputStream(inputStream3);
                                }
                                try {
                                    bArr = new byte[16384];
                                    long j3 = 0;
                                    i = 0;
                                    while (true) {
                                        read = inputStream3.read(bArr, i, 16384 - i);
                                        boolean z = true;
                                        if (read != i3) {
                                            break;
                                        }
                                        i += read;
                                        inputStream2 = inputStream3;
                                        j3 += read;
                                        try {
                                            if (j3 % 16384 != 0 && j3 != pvs - j) {
                                                z = false;
                                            }
                                            inputStream3 = inputStream2;
                                            i3 = -1;
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStream3 = inputStream2;
                                            try {
                                                pvsVar.pvs(pvs.this, new IOException(th.getMessage()));
                                                if (!NB) {
                                                    pvs.this.vG();
                                                }
                                                if (inputStream3 != null) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused3) {
                                                    return;
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    inputStream = inputStream3;
                                    if (!NB) {
                                        pvs = pvs.this.icD.length();
                                    }
                                    if (pvs <= 0 && pvs.this.icD.exists() && pvs.this.icD.length() == pvs) {
                                        if (pvs.this.icD.renameTo(pvs.this.pvs)) {
                                            icd3.pvs(pvs.this.pvs);
                                            pvsVar.pvs(pvs.this, icd3);
                                        } else {
                                            pvsVar.pvs(pvs.this, new IOException("Rename fail"));
                                        }
                                    } else {
                                        pvsVar.pvs(pvs.this, new IOException(" tempFile.length() == fileSize is" + (pvs.this.icD.length() != pvs)));
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused5) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            randomAccessFile.setLength(0L);
                            j2 = 0;
                            inputStream3 = bns.sUS().vG();
                            if (pvs.yiw(hashMap)) {
                                inputStream3 = new GZIPInputStream(inputStream3);
                            }
                            bArr = new byte[16384];
                            long j32 = 0;
                            i = 0;
                            while (true) {
                                read = inputStream3.read(bArr, i, 16384 - i);
                                boolean z2 = true;
                                if (read != i3) {
                                }
                                inputStream3 = inputStream2;
                                i3 = -1;
                            }
                            inputStream = inputStream3;
                            if (!NB) {
                            }
                            if (pvs <= 0) {
                            }
                            pvsVar.pvs(pvs.this, new IOException(" tempFile.length() == fileSize is" + (pvs.this.icD.length() != pvs)));
                            if (inputStream != null) {
                            }
                            randomAccessFile.close();
                        }
                    } else {
                        pvsVar.pvs(pvs.this, icd3);
                    }
                }
            });
        } catch (IllegalArgumentException unused) {
            pvsVar.pvs(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be A[Catch: all -> 0x0250, TryCatch #9 {all -> 0x0250, blocks: (B:67:0x019f, B:69:0x01a5, B:71:0x01a9, B:72:0x01af, B:73:0x01b6, B:75:0x01be, B:77:0x01ce, B:82:0x01da, B:91:0x01f0, B:98:0x0208, B:100:0x0210, B:102:0x021a, B:104:0x0224, B:126:0x023e, B:139:0x01fe), top: B:66:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[Catch: all -> 0x0250, TryCatch #9 {all -> 0x0250, blocks: (B:67:0x019f, B:69:0x01a5, B:71:0x01a9, B:72:0x01af, B:73:0x01b6, B:75:0x01be, B:77:0x01ce, B:82:0x01da, B:91:0x01f0, B:98:0x0208, B:100:0x0210, B:102:0x021a, B:104:0x0224, B:126:0x023e, B:139:0x01fe), top: B:66:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb A[EDGE_INSN: B:88:0x01eb->B:89:0x01eb BREAK  A[LOOP:1: B:73:0x01b6->B:84:0x01e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f0 A[Catch: all -> 0x0250, TryCatch #9 {all -> 0x0250, blocks: (B:67:0x019f, B:69:0x01a5, B:71:0x01a9, B:72:0x01af, B:73:0x01b6, B:75:0x01be, B:77:0x01ce, B:82:0x01da, B:91:0x01f0, B:98:0x0208, B:100:0x0210, B:102:0x021a, B:104:0x0224, B:126:0x023e, B:139:0x01fe), top: B:66:0x019f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.yiw.icD pvs() {
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        InputStream vG;
        byte[] bArr;
        int i;
        int read;
        boolean z;
        File file = this.pvs;
        if (file != null && this.icD != null) {
            long j2 = 0;
            if (file.exists() && this.pvs.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.yiw.icD icd = new com.bytedance.sdk.component.yiw.icD(true, 200, "Success", null, null, currentTimeMillis, currentTimeMillis);
                icd.pvs(this.pvs);
                return icd;
            }
            long length = this.icD.length();
            if (length < 0) {
                length = 0;
            }
            Ju.pvs pvsVar = new Ju.pvs();
            pvsVar.pvs((Object) icD());
            icD(HttpHeaders.RANGE, "bytes=" + length + "-");
            if (TextUtils.isEmpty(this.so)) {
                Log.e("DownloadExecutor", "execute: Url is Empty");
                return null;
            }
            try {
                pvsVar.icD(this.so);
                pvs(pvsVar);
                try {
                    bNS pvs = this.vG.pvs(pvsVar.pvs().icD()).pvs();
                    if (pvs == null || !pvs.Jd()) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    sUS yiw = pvs.yiw();
                    if (yiw != null) {
                        for (int i2 = 0; i2 < yiw.pvs(); i2++) {
                            hashMap.put(yiw.pvs(i2), yiw.icD(i2));
                        }
                    }
                    com.bytedance.sdk.component.yiw.icD icd2 = new com.bytedance.sdk.component.yiw.icD(pvs.Jd(), pvs.vG(), pvs.NB(), hashMap, null, pvs.icD(), pvs.pvs());
                    long pvs2 = pvs.sUS().pvs();
                    if (pvs2 <= 0) {
                        pvs2 = sUS(hashMap);
                    }
                    long length2 = this.icD.length();
                    boolean NB = NB(hashMap);
                    int i3 = -1;
                    if (NB) {
                        pvs2 += length2;
                        String str = (String) hashMap.get(HttpHeaders.CONTENT_RANGE);
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = "bytes " + length2 + "-" + (pvs2 - 1);
                            if (TextUtils.indexOf(str, str2) == -1) {
                                new StringBuilder("execute: The Content-Range Header is invalid Assume[").append(str2).append("] vs Real[").append(str).append("], please remove the temporary file [").append(this.icD);
                                vG();
                                return null;
                            }
                        }
                        j2 = 0;
                    }
                    if (pvs2 > j2 && this.icD.exists() && this.icD.length() == pvs2) {
                        if (!this.icD.renameTo(this.pvs)) {
                            return null;
                        }
                        icd2.pvs(this.pvs);
                        return icd2;
                    }
                    com.bytedance.sdk.component.yiw.icD icd3 = icd2;
                    try {
                        randomAccessFile = new RandomAccessFile(this.icD, "rw");
                    } catch (Throwable unused) {
                        randomAccessFile = null;
                    }
                    if (!NB) {
                        randomAccessFile.setLength(0L);
                        j = 0;
                        vG = pvs.sUS().vG();
                        if (yiw(hashMap)) {
                            vG = new GZIPInputStream(vG);
                        }
                        bArr = new byte[16384];
                        i = 0;
                        long j3 = 0;
                        while (true) {
                            read = vG.read(bArr, i, 16384 - i);
                            if (read != i3) {
                            }
                            icd3 = r21;
                            i3 = -1;
                        }
                        com.bytedance.sdk.component.yiw.icD icd4 = icd3;
                        if (read != 0) {
                        }
                        if (NB) {
                        }
                        pvs2 = this.icD.length();
                        if (pvs2 > 0) {
                        }
                        int i4 = (this.icD.length() > pvs2 ? 1 : (this.icD.length() == pvs2 ? 0 : -1));
                        if (vG != null) {
                        }
                        randomAccessFile.close();
                        return null;
                    }
                    randomAccessFile.seek(length);
                    j = length;
                    try {
                        vG = pvs.sUS().vG();
                        try {
                            if (yiw(hashMap) && !(vG instanceof GZIPInputStream)) {
                                vG = new GZIPInputStream(vG);
                            }
                            bArr = new byte[16384];
                            i = 0;
                            long j32 = 0;
                            while (true) {
                                read = vG.read(bArr, i, 16384 - i);
                                if (read != i3) {
                                    break;
                                }
                                i += read;
                                com.bytedance.sdk.component.yiw.icD icd5 = icd3;
                                j32 += read;
                                if (j32 % 16384 != 0 && j32 != pvs2 - length) {
                                    z = false;
                                    if (!z) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i);
                                        j += i;
                                        i = 0;
                                    }
                                    icd3 = icd5;
                                    i3 = -1;
                                }
                                z = true;
                                if (!z) {
                                }
                                icd3 = icd5;
                                i3 = -1;
                            }
                            com.bytedance.sdk.component.yiw.icD icd42 = icd3;
                            if (read != 0) {
                                randomAccessFile.seek(j);
                                randomAccessFile.write(bArr, 0, i);
                            }
                            if (NB || length == 0) {
                                pvs2 = this.icD.length();
                            }
                            if (pvs2 > 0 || !this.icD.exists() || this.icD.length() != pvs2) {
                                int i42 = (this.icD.length() > pvs2 ? 1 : (this.icD.length() == pvs2 ? 0 : -1));
                                if (vG != null) {
                                    try {
                                        vG.close();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                    return null;
                                } catch (Throwable unused3) {
                                    return null;
                                }
                            }
                            if (this.icD.renameTo(this.pvs)) {
                                icd42.pvs(this.pvs);
                                if (vG != null) {
                                    try {
                                        vG.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused5) {
                                }
                                return icd42;
                            }
                            if (vG != null) {
                                try {
                                    vG.close();
                                } catch (Throwable unused6) {
                                }
                            }
                            try {
                                randomAccessFile.close();
                                return null;
                            } catch (Throwable unused7) {
                                return null;
                            }
                        } catch (Throwable unused8) {
                            inputStream = vG;
                            if (!NB) {
                                try {
                                    vG();
                                } finally {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused9) {
                                }
                            }
                            try {
                                randomAccessFile.close();
                                return null;
                            } catch (Throwable unused10) {
                                return null;
                            }
                        }
                    } catch (Throwable unused11) {
                        inputStream = null;
                    }
                } catch (IOException unused12) {
                    vG();
                    return null;
                }
            } catch (IllegalArgumentException unused13) {
                Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean NB(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long sUS(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey(HttpHeaders.CONTENT_LENGTH) ? map.get(HttpHeaders.CONTENT_LENGTH) : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean yiw(Map<String, String> map) {
        return TextUtils.equals(map.get(HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        try {
            this.pvs.delete();
        } catch (Throwable unused) {
        }
        try {
            this.icD.delete();
        } catch (Throwable unused2) {
        }
    }
}
