package com.bytedance.sdk.component.nps.fs;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.fs.zmn.hhw;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import io.bidmachine.util.network.NetworkUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* loaded from: classes8.dex */
public class zmn extends zn {
    public File fs;
    private volatile boolean rc;
    public File zmn;

    public zmn(rc rcVar) {
        super(rcVar);
    }

    public void zmn(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.zmn = new File(str, str2);
        this.fs = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public void zmn(final com.bytedance.sdk.component.nps.zmn.zmn zmnVar) {
        File file = this.zmn;
        if (file == null || this.fs == null) {
            if (zmnVar != null) {
                zmnVar.zmn(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.zmn.length() != 0 && zmnVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.nps.fs fsVar = new com.bytedance.sdk.component.nps.fs(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            fsVar.zmn(this.zmn);
            zmnVar.zmn(this, fsVar);
            return;
        }
        long length = this.fs.length();
        final long j = length >= 0 ? length : 0L;
        klz.zmn zmnVar2 = new klz.zmn();
        zmnVar2.zmn((Object) fb());
        zmn(zmnVar2);
        fs(Command.HTTP_HEADER_RANGE, "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.zg)) {
            zmnVar.zmn(this, new IOException("Url is Empty"));
            return;
        }
        try {
            zmnVar2.fs(this.zg);
            if (!TextUtils.isEmpty(this.btk)) {
                zmnVar2.zmn(this.btk);
            }
            int i = this.hhw;
            if (i > 0) {
                zmnVar2.zmn(i);
            }
            fs(zmnVar2);
            com.bytedance.sdk.component.fs.zmn.fs zmn = this.zn.zmn(zmnVar2.zmn().fs());
            if (zmn == null) {
                zmnVar.zmn(this, new IOException("new call error"));
            } else {
                zmn.zmn(new com.bytedance.sdk.component.fs.zmn.zn() { // from class: com.bytedance.sdk.component.nps.fs.zmn.1
                    @Override // com.bytedance.sdk.component.fs.zmn.zn
                    public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar2, IOException iOException) {
                        com.bytedance.sdk.component.nps.zmn.zmn zmnVar3 = zmnVar;
                        if (zmnVar3 != null) {
                            zmnVar3.zmn(zmn.this, iOException);
                        }
                        zmn.this.iv();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:101:0x019e A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0192 A[LOOP:1: B:55:0x015c->B:66:0x0192, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x0196 A[SYNTHETIC] */
                    @Override // com.bytedance.sdk.component.fs.zmn.zn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar2, rt rtVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        byte[] bArr;
                        int i2;
                        int read;
                        boolean z;
                        InputStream inputStream;
                        if (zmnVar == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (rtVar == null) {
                            return;
                        }
                        zmn.this.zmn(rtVar.bvs());
                        hhw nps = rtVar.nps();
                        if (nps != null) {
                            for (int i3 = 0; i3 < nps.zmn(); i3++) {
                                hashMap.put(nps.zmn(i3), nps.fs(i3));
                            }
                        }
                        com.bytedance.sdk.component.nps.fs fsVar3 = new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), hashMap, null, rtVar.fs(), rtVar.zmn());
                        if (rtVar.fb()) {
                            long zmn2 = rtVar.hhw().zmn();
                            if (zmn2 <= 0) {
                                zmn2 = zmn.hhw(hashMap);
                            }
                            boolean btk = zmn.btk(hashMap);
                            int i4 = -1;
                            if (btk) {
                                zmn2 += j;
                                String str = (String) hashMap.get("Content-Range");
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j + "-" + (zmn2 - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        zmn.this.iv();
                                        zmnVar.zmn(zmn.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + zmn.this.fs + "]."));
                                        return;
                                    }
                                }
                            }
                            if (zmn2 > 0 && zmn.this.fs.exists() && zmn.this.fs.length() == zmn2) {
                                zmn zmnVar3 = zmn.this;
                                if (!zmnVar3.fs.renameTo(zmnVar3.zmn)) {
                                    zmnVar.zmn(zmn.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    fsVar3.zmn(zmn.this.zmn);
                                    zmnVar.zmn(zmn.this, fsVar3);
                                    return;
                                }
                            }
                            InputStream inputStream2 = null;
                            try {
                                randomAccessFile = new RandomAccessFile(zmn.this.fs, "rw");
                            } catch (Throwable unused) {
                                randomAccessFile = null;
                            }
                            if (btk) {
                                randomAccessFile.seek(j);
                                j2 = j;
                                try {
                                    inputStream2 = rtVar.hhw().zn();
                                    if (zmn.nps(hashMap) && !(inputStream2 instanceof GZIPInputStream)) {
                                        inputStream2 = new GZIPInputStream(inputStream2);
                                    }
                                    try {
                                        bArr = new byte[16384];
                                        long j3 = 0;
                                        i2 = 0;
                                        while (true) {
                                            read = inputStream2.read(bArr, i2, 16384 - i2);
                                            if (read == i4) {
                                                i2 += read;
                                                inputStream = inputStream2;
                                                j3 += read;
                                                try {
                                                    if (j3 % 16384 != 0) {
                                                        if (j3 == zmn2 - j) {
                                                        }
                                                        if (!zmn.this.rc) {
                                                            throw new IOException("net is cancel");
                                                        }
                                                        inputStream2 = inputStream;
                                                        i4 = -1;
                                                    }
                                                    randomAccessFile.seek(j2);
                                                    randomAccessFile.write(bArr, 0, i2);
                                                    j2 += i2;
                                                    i2 = 0;
                                                    if (!zmn.this.rc) {
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream2 = inputStream;
                                                    try {
                                                        zmnVar.zmn(zmn.this, new IOException(th.getMessage()));
                                                        if (!btk) {
                                                            zmn.this.iv();
                                                        }
                                                        if (inputStream2 != null) {
                                                            try {
                                                                inputStream2.close();
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
                                            } else {
                                                InputStream inputStream3 = inputStream2;
                                                if (i2 != 0) {
                                                    randomAccessFile.seek(j2);
                                                    z = false;
                                                    randomAccessFile.write(bArr, 0, i2);
                                                } else {
                                                    z = false;
                                                }
                                                if (!btk) {
                                                    zmn2 = zmn.this.fs.length();
                                                }
                                                if (zmn2 > 0 && zmn.this.fs.exists() && zmn.this.fs.length() == zmn2) {
                                                    zmn zmnVar4 = zmn.this;
                                                    if (!zmnVar4.fs.renameTo(zmnVar4.zmn)) {
                                                        zmnVar.zmn(zmn.this, new IOException("Rename fail"));
                                                    } else {
                                                        fsVar3.zmn(zmn.this.zmn);
                                                        zmnVar.zmn(zmn.this, fsVar3);
                                                    }
                                                } else {
                                                    com.bytedance.sdk.component.nps.zmn.zmn zmnVar5 = zmnVar;
                                                    zmn zmnVar6 = zmn.this;
                                                    StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                                    sb.append(zmn.this.fs.length() == zmn2 ? true : z);
                                                    zmnVar5.zmn(zmnVar6, new IOException(sb.toString()));
                                                }
                                                try {
                                                    inputStream3.close();
                                                } catch (Throwable unused4) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused5) {
                                                    return;
                                                }
                                            }
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
                                inputStream2 = rtVar.hhw().zn();
                                if (zmn.nps(hashMap)) {
                                    inputStream2 = new GZIPInputStream(inputStream2);
                                }
                                bArr = new byte[16384];
                                long j32 = 0;
                                i2 = 0;
                                while (true) {
                                    read = inputStream2.read(bArr, i2, 16384 - i2);
                                    if (read == i4) {
                                    }
                                    inputStream2 = inputStream;
                                    i4 = -1;
                                }
                            }
                        } else {
                            zmnVar.zmn(zmn.this, fsVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            zmnVar.zmn(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae A[Catch: all -> 0x023e, TryCatch #16 {all -> 0x023e, blocks: (B:72:0x018f, B:74:0x0195, B:76:0x0199, B:77:0x019f, B:78:0x01a6, B:80:0x01ae, B:82:0x01be, B:86:0x01d1, B:90:0x01da, B:91:0x01e1, B:92:0x01c7, B:96:0x01e7, B:103:0x01ff, B:105:0x0207, B:107:0x0211, B:109:0x021b, B:129:0x0231, B:140:0x01f5), top: B:71:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5 A[LOOP:1: B:78:0x01a6->B:88:0x01d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2 A[SYNTHETIC] */
    @Override // com.bytedance.sdk.component.nps.fs.zn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.nps.fs zmn() {
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        InputStream zn;
        byte[] bArr;
        int i;
        int read;
        com.bytedance.sdk.component.nps.fs fsVar;
        File file = this.zmn;
        if (file != null && this.fs != null) {
            long j2 = 0;
            if (file.exists() && this.zmn.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.nps.fs fsVar2 = new com.bytedance.sdk.component.nps.fs(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
                fsVar2.zmn(this.zmn);
                return fsVar2;
            }
            long length = this.fs.length();
            if (length < 0) {
                length = 0;
            }
            klz.zmn zmnVar = new klz.zmn();
            zmnVar.zmn((Object) fb());
            zmn(zmnVar);
            fs(Command.HTTP_HEADER_RANGE, "bytes=" + length + "-");
            if (TextUtils.isEmpty(this.zg)) {
                Log.e("DownloadExecutor", "execute: Url is Empty");
                return null;
            }
            try {
                zmnVar.fs(this.zg);
                fs(zmnVar);
                try {
                    com.bytedance.sdk.component.fs.zmn.fs zmn = this.zn.zmn(zmnVar.zmn().fs());
                    if (zmn == null) {
                        return null;
                    }
                    rt fs = zmn.fs();
                    if (fs != null) {
                        zmn(fs.bvs());
                    }
                    if (fs == null || !fs.fb()) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    hhw nps = fs.nps();
                    if (nps != null) {
                        for (int i2 = 0; i2 < nps.zmn(); i2++) {
                            hashMap.put(nps.zmn(i2), nps.fs(i2));
                        }
                    }
                    com.bytedance.sdk.component.nps.fs fsVar3 = new com.bytedance.sdk.component.nps.fs(fs.fb(), fs.zn(), fs.btk(), hashMap, null, fs.fs(), fs.zmn());
                    long zmn2 = fs.hhw().zmn();
                    if (zmn2 <= 0) {
                        zmn2 = hhw(hashMap);
                    }
                    long length2 = this.fs.length();
                    boolean btk = btk(hashMap);
                    int i3 = -1;
                    if (btk) {
                        zmn2 += length2;
                        String str = (String) hashMap.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (zmn2 - 1)) == -1) {
                                Objects.toString(this.fs);
                                iv();
                                return null;
                            }
                        }
                        j2 = 0;
                    }
                    if (zmn2 > j2 && this.fs.exists() && this.fs.length() == zmn2) {
                        if (!this.fs.renameTo(this.zmn)) {
                            return null;
                        }
                        fsVar3.zmn(this.zmn);
                        return fsVar3;
                    }
                    com.bytedance.sdk.component.nps.fs fsVar4 = fsVar3;
                    try {
                        randomAccessFile = new RandomAccessFile(this.fs, "rw");
                    } catch (Throwable unused) {
                        randomAccessFile = null;
                    }
                    if (btk) {
                        randomAccessFile.seek(length);
                        j = length;
                        try {
                            zn = fs.hhw().zn();
                        } catch (Throwable unused2) {
                            inputStream = null;
                        }
                        try {
                            if (nps(hashMap) && !(zn instanceof GZIPInputStream)) {
                                zn = new GZIPInputStream(zn);
                            }
                            bArr = new byte[16384];
                            i = 0;
                            long j3 = 0;
                            while (true) {
                                read = zn.read(bArr, i, 16384 - i);
                                if (read != i3) {
                                    com.bytedance.sdk.component.nps.fs fsVar5 = fsVar4;
                                    if (read != 0) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i);
                                    }
                                    if (!btk || length == 0) {
                                        zmn2 = this.fs.length();
                                    }
                                    if (zmn2 <= 0 || !this.fs.exists() || this.fs.length() != zmn2) {
                                        this.fs.length();
                                        try {
                                            zn.close();
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                            return null;
                                        } catch (Throwable unused4) {
                                            return null;
                                        }
                                    }
                                    if (this.fs.renameTo(this.zmn)) {
                                        fsVar5.zmn(this.zmn);
                                        try {
                                            zn.close();
                                        } catch (Throwable unused5) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused6) {
                                        }
                                        return fsVar5;
                                    }
                                    try {
                                        zn.close();
                                    } catch (Throwable unused7) {
                                    }
                                    try {
                                        randomAccessFile.close();
                                        return null;
                                    } catch (Throwable unused8) {
                                        return null;
                                    }
                                }
                                i += read;
                                fsVar = fsVar4;
                                j3 += read;
                                if (j3 % 16384 != 0 && j3 != zmn2 - length) {
                                    if (!this.rc) {
                                        throw new IOException("net is cancel");
                                    }
                                    fsVar4 = fsVar;
                                    i3 = -1;
                                }
                                randomAccessFile.seek(j);
                                randomAccessFile.write(bArr, 0, i);
                                j += i;
                                i = 0;
                                if (!this.rc) {
                                }
                            }
                        } catch (Throwable unused9) {
                            inputStream = zn;
                            if (!btk) {
                                try {
                                    iv();
                                } finally {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused10) {
                                }
                            }
                            try {
                                randomAccessFile.close();
                                return null;
                            } catch (Throwable unused11) {
                                return null;
                            }
                        }
                    } else {
                        randomAccessFile.setLength(0L);
                        j = 0;
                        zn = fs.hhw().zn();
                        if (nps(hashMap)) {
                            zn = new GZIPInputStream(zn);
                        }
                        bArr = new byte[16384];
                        i = 0;
                        long j32 = 0;
                        while (true) {
                            read = zn.read(bArr, i, 16384 - i);
                            if (read != i3) {
                            }
                            fsVar4 = fsVar;
                            i3 = -1;
                        }
                    }
                } catch (IOException unused12) {
                    iv();
                    return null;
                }
            } catch (IllegalArgumentException unused13) {
                Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean btk(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long hhw(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey(NetworkUtils.HEADER_CONTENT_LENGTH) ? map.get(NetworkUtils.HEADER_CONTENT_LENGTH) : null;
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
    public static boolean nps(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iv() {
        try {
            this.zmn.delete();
        } catch (Throwable unused) {
        }
        try {
            this.fs.delete();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public void fs() {
        this.rc = true;
        super.fs();
    }
}
