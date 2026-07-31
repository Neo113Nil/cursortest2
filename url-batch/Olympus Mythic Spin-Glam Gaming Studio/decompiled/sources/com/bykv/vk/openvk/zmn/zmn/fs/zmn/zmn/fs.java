package com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn;

import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.utils.iqz;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fs implements zn {
    private File btk;
    private File fb;
    private long hhw;
    private final com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn klz;
    private volatile long mw;
    private RandomAccessFile rc;
    private boolean zmn;
    private volatile long fs = -2147483648L;
    private final Object zn = new Object();
    private volatile long nps = -1;
    private volatile int zg = -100;
    private volatile boolean bvs = false;
    private volatile boolean iv = false;

    public fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        this.hhw = 0L;
        this.rc = null;
        this.klz = znVar;
        try {
            String btk = znVar.btk();
            String olo = znVar.olo();
            this.fb = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.fs(btk, olo);
            this.btk = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zn(btk, olo);
            if (fb()) {
                this.rc = new RandomAccessFile(this.btk, "r");
            } else {
                this.rc = new RandomAccessFile(this.fb, "rw");
            }
            if (!fb()) {
                this.hhw = this.fb.length();
                zmn();
            }
            this.zmn = com.bykv.vk.openvk.zmn.zmn.fs.zmn.hhw() == 2;
        } catch (Throwable unused) {
            znVar.cyb();
        }
    }

    private boolean fb() {
        return this.btk.exists();
    }

    public void zmn() {
        rc.zmn zmnVar;
        if (com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn() != null) {
            zmnVar = com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn().zn();
        } else {
            zmnVar = new rc.zmn("v_cache");
        }
        long kw = this.klz.kw();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zmnVar.zmn(kw, timeUnit).fs(this.klz.iqz(), timeUnit).zn(this.klz.phc(), timeUnit);
        rc zmn = zmnVar.zmn();
        this.klz.olo();
        zmn.zmn(new klz.zmn().zmn("RANGE", "bytes=" + this.hhw + "-").fs(this.klz.cyb()).zmn().zmn("videoLoadWhenPlaying").zmn(9).fs()).zmn(new com.bytedance.sdk.component.fs.zmn.zn() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.fs.1
            @Override // com.bytedance.sdk.component.fs.zmn.zn
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, IOException iOException) {
                fs.this.zmn(30000, iOException.getMessage());
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:9:0x001a, B:12:0x0024, B:14:0x003e, B:32:0x0076, B:33:0x009a, B:35:0x00a3, B:37:0x00ad, B:41:0x00c2, B:43:0x00db, B:44:0x00e1, B:60:0x0133, B:61:0x0134, B:65:0x0139, B:46:0x00e2, B:48:0x0105, B:50:0x0111, B:52:0x0122, B:53:0x012e), top: B:8:0x001a, inners: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0135 A[SYNTHETIC] */
            @Override // com.bytedance.sdk.component.fs.zmn.zn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, rt rtVar) throws IOException {
                cn cnVar;
                boolean z;
                boolean z2;
                long length;
                long j;
                if (rtVar == null) {
                    fs.this.zmn(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStream = null;
                try {
                    fs.this.iv = rtVar.fb();
                    if (fs.this.iv) {
                        cnVar = rtVar.hhw();
                        try {
                            if (fs.this.iv && cnVar != null) {
                                fs.this.fs = cnVar.zmn() + fs.this.hhw;
                                inputStream = cnVar.zn();
                            }
                            if (inputStream == null) {
                                fs.this.zmn(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                }
                                if (z2) {
                                    if (length == j) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            }
                            int nps = com.bykv.vk.openvk.zmn.zmn.fs.zmn.nps();
                            byte[] bArr = new byte[nps];
                            long j2 = fs.this.hhw;
                            long unused2 = fs.this.fs;
                            long unused3 = fs.this.hhw;
                            fs.this.klz.cyb();
                            long j3 = 0;
                            long j4 = 0;
                            int i = 0;
                            while (true) {
                                int read = inputStream.read(bArr, i, nps - i);
                                if (read == -1) {
                                    break;
                                }
                                i += read;
                                j4 += read;
                                if (j4 % nps != j3 && j4 != fs.this.fs - fs.this.hhw) {
                                    z = false;
                                    long unused4 = fs.this.fs;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(j4);
                                    sb.append(", waitingAtPost=");
                                    long unused5 = fs.this.mw;
                                    if (!z) {
                                        synchronized (fs.this.zn) {
                                            try {
                                                com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zmn(fs.this.rc, bArr, Long.valueOf(j2).intValue(), i, fs.this.klz.olo());
                                                if (fs.this.zmn && fs.this.mw > -1 && fs.this.hhw + j4 >= fs.this.mw) {
                                                    fs.this.zn.notify();
                                                }
                                            } finally {
                                            }
                                        }
                                        j2 += i;
                                        i = 0;
                                    }
                                    j3 = 0;
                                }
                                z = true;
                                long unused42 = fs.this.fs;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(j4);
                                sb2.append(", waitingAtPost=");
                                long unused52 = fs.this.mw;
                                if (!z) {
                                }
                                j3 = 0;
                            }
                            long unused6 = fs.this.hhw;
                            long unused7 = fs.this.fs;
                            long unused8 = fs.this.fs;
                            long unused9 = fs.this.hhw;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                fs.this.zmn(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused10) {
                                        return;
                                    }
                                }
                                if (cnVar != null) {
                                    cnVar.close();
                                }
                                rtVar.close();
                                if (fs.this.iv && fs.this.fb.length() == fs.this.fs) {
                                    fs.this.hhw();
                                    return;
                                }
                                return;
                            } finally {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused11) {
                                    }
                                }
                                if (cnVar != null) {
                                    cnVar.close();
                                }
                                rtVar.close();
                                if (fs.this.iv && fs.this.fb.length() == fs.this.fs) {
                                    fs.this.hhw();
                                }
                            }
                        }
                    } else {
                        fs.this.zmn(rtVar.zn(), rtVar.btk());
                        cnVar = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused12) {
                            return;
                        }
                    }
                    if (cnVar != null) {
                        cnVar.close();
                    }
                    rtVar.close();
                    if (fs.this.iv && fs.this.fb.length() == fs.this.fs) {
                        fs.this.hhw();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cnVar = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, String str) {
        JSONObject zn;
        this.iv = false;
        this.zg = i;
        this.fs = this.nps;
        iqz.fs("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar = this.klz;
        if (znVar == null || !znVar.zmn() || (zn = this.klz.zn()) == null) {
            return;
        }
        try {
            zn.put("error_real_code", i);
            zn.put("error_real_msg", str);
        } catch (Throwable th) {
            iqz.zmn("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zn
    public int zmn(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.fs) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.bvs) {
                synchronized (this.zn) {
                    try {
                        if (j < btk()) {
                            this.rc.seek(j);
                            i4 = this.rc.read(bArr, i, i2);
                        } else {
                            i3 += 33;
                            this.mw = j;
                            this.zn.wait(33L);
                            this.mw = -1L;
                        }
                    } finally {
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar = this.klz;
                if (znVar != null && znVar.zmn() && this.zg != -100 && (!this.iv || this.fs == this.nps)) {
                    throw new IOException();
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zn
    public void fs() {
        try {
            if (!this.bvs) {
                this.rc.close();
            }
            File file = this.fb;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.btk;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.bvs = true;
    }

    private long btk() {
        if (fb()) {
            return this.btk.length();
        }
        return this.fb.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw() throws IOException {
        synchronized (this.zn) {
            if (fb()) {
                this.klz.cyb();
                this.klz.olo();
                return;
            }
            try {
            } finally {
            }
            if (!this.fb.renameTo(this.btk)) {
                throw new IOException("Error renaming file " + this.fb + " to " + this.btk + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.rc;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.rc = new RandomAccessFile(this.btk, "rw");
            this.klz.olo();
            this.klz.cyb();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zn
    public long zn() throws IOException {
        if (fb()) {
            this.fs = this.btk.length();
        } else {
            synchronized (this.zn) {
                int i = 0;
                while (this.fs == -2147483648L && !this.bvs) {
                    try {
                        i += 15;
                        try {
                            this.zn.wait(5L);
                            if (i > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.fs;
    }
}
