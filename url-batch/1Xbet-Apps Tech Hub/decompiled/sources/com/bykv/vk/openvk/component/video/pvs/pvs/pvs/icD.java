package com.bykv.vk.openvk.component.video.pvs.pvs.pvs;

import android.content.Context;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.mnm;
import com.bytedance.sdk.component.icD.pvs.qh;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: MediaDownloadPlayCacheImpl.java */
/* loaded from: classes.dex */
public class icD implements vG {
    private File Jd;
    private RandomAccessFile Mxy;
    private long NB;
    private final com.bykv.vk.openvk.component.video.api.vG.vG Wyp;
    private File vG;
    private volatile long pvs = -2147483648L;
    private final Object icD = new Object();
    private volatile long sUS = -1;
    private volatile boolean yiw = false;
    private volatile boolean so = false;

    public icD(Context context, com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        this.NB = 0L;
        this.Mxy = null;
        this.Wyp = vGVar;
        try {
            this.vG = com.bykv.vk.openvk.component.video.pvs.NB.icD.icD(vGVar.icD(), vGVar.IP());
            this.Jd = com.bykv.vk.openvk.component.video.pvs.NB.icD.vG(vGVar.icD(), vGVar.IP());
            if (Jd()) {
                this.Mxy = new RandomAccessFile(this.Jd, "r");
            } else {
                this.Mxy = new RandomAccessFile(this.vG, "rw");
            }
            if (Jd()) {
                return;
            }
            this.NB = this.vG.length();
            pvs();
        } catch (Throwable unused) {
            Object[] objArr = new Object[3];
            vGVar.Ju();
        }
    }

    private boolean Jd() {
        return this.Jd.exists();
    }

    public void pvs() {
        qh.pvs pvsVar;
        if (com.bykv.vk.openvk.component.video.api.vG.Jd() != null) {
            pvsVar = com.bykv.vk.openvk.component.video.api.vG.Jd().icD();
        } else {
            pvsVar = new qh.pvs("v_cache");
        }
        pvsVar.pvs(this.Wyp.mnm(), TimeUnit.MILLISECONDS).icD(this.Wyp.vA(), TimeUnit.MILLISECONDS).vG(this.Wyp.cR(), TimeUnit.MILLISECONDS);
        qh pvs = pvsVar.pvs();
        Object[] objArr = new Object[4];
        Long.valueOf(this.NB);
        this.Wyp.IP();
        pvs.pvs(new Ju.pvs().pvs("RANGE", "bytes=" + this.NB + "-").icD(this.Wyp.Ju()).pvs().pvs("videoLoadWhenPlaying").pvs(9).icD()).pvs(new com.bytedance.sdk.component.icD.pvs.vG() { // from class: com.bykv.vk.openvk.component.video.pvs.pvs.pvs.icD.1
            @Override // com.bytedance.sdk.component.icD.pvs.vG
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, IOException iOException) {
                icD.this.so = false;
                icD.this.pvs = -1L;
            }

            @Override // com.bytedance.sdk.component.icD.pvs.vG
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, bNS bns) throws IOException {
                mnm mnmVar;
                InputStream inputStream;
                boolean z;
                boolean z2;
                long length;
                long j;
                if (bns == null) {
                    icD.this.so = false;
                    icD icd2 = icD.this;
                    icd2.pvs = icd2.sUS;
                    return;
                }
                InputStream inputStream2 = null;
                try {
                    icD.this.so = bns.Jd();
                    if (icD.this.so) {
                        mnmVar = bns.sUS();
                        try {
                            if (icD.this.so && mnmVar != null) {
                                icD.this.pvs = mnmVar.pvs() + icD.this.NB;
                                inputStream2 = mnmVar.vG();
                            }
                            inputStream = inputStream2;
                            if (inputStream == null) {
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
                            try {
                                byte[] bArr = new byte[8192];
                                long j2 = icD.this.NB;
                                int i = 0;
                                long j3 = 0;
                                while (true) {
                                    int read = inputStream.read(bArr, i, 8192 - i);
                                    z = true;
                                    if (read == -1) {
                                        break;
                                    }
                                    i += read;
                                    j3 += read;
                                    if (j3 % 8192 != 0 && j3 != icD.this.pvs - icD.this.NB) {
                                        z = false;
                                    }
                                    Object[] objArr2 = new Object[14];
                                    Boolean.valueOf(z);
                                    Integer.valueOf(i);
                                    Long.valueOf(icD.this.pvs);
                                    Long.valueOf(j3);
                                    Long.valueOf(icD.this.NB);
                                    icD.this.Wyp.IP();
                                    icD.this.Wyp.Ju();
                                    if (z) {
                                        synchronized (icD.this.icD) {
                                            com.bykv.vk.openvk.component.video.pvs.NB.icD.pvs(icD.this.Mxy, bArr, Long.valueOf(j2).intValue(), i, icD.this.Wyp.IP());
                                        }
                                        j2 += i;
                                        i = 0;
                                    }
                                }
                                Object[] objArr3 = new Object[10];
                                Long.valueOf(icD.this.NB);
                                Long.valueOf(icD.this.pvs);
                                Long.valueOf(j3);
                                if (j3 != icD.this.pvs - icD.this.NB) {
                                    z = false;
                                }
                                Boolean.valueOf(z);
                                icD.this.Wyp.Ju();
                                inputStream2 = inputStream;
                            } catch (Throwable unused2) {
                                try {
                                    icD.this.so = false;
                                    icD icd3 = icD.this;
                                    icd3.pvs = icd3.sUS;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused3) {
                                            return;
                                        }
                                    }
                                    if (mnmVar != null) {
                                        mnmVar.close();
                                    }
                                    if (bns != null) {
                                        bns.close();
                                    }
                                    if (icD.this.so && icD.this.vG.length() == icD.this.pvs) {
                                        icD.this.sUS();
                                        return;
                                    }
                                    return;
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    if (mnmVar != null) {
                                        mnmVar.close();
                                    }
                                    if (bns != null) {
                                        bns.close();
                                    }
                                    if (icD.this.so && icD.this.vG.length() == icD.this.pvs) {
                                        icD.this.sUS();
                                    }
                                }
                            }
                        } catch (Throwable unused5) {
                            inputStream = null;
                        }
                    } else {
                        icD.this.so = false;
                        icD icd4 = icD.this;
                        icd4.pvs = icd4.sUS;
                        mnmVar = null;
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable unused6) {
                            return;
                        }
                    }
                    if (mnmVar != null) {
                        mnmVar.close();
                    }
                    if (bns != null) {
                        bns.close();
                    }
                    if (icD.this.so && icD.this.vG.length() == icD.this.pvs) {
                        icD.this.sUS();
                    }
                } catch (Throwable unused7) {
                    mnmVar = null;
                    inputStream = null;
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.pvs.pvs.vG
    public int pvs(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.pvs) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.yiw) {
                synchronized (this.icD) {
                    long NB = NB();
                    if (j < NB) {
                        new StringBuilder("read:  read ").append(j);
                        this.Mxy.seek(j);
                        i4 = this.Mxy.read(bArr, i, i2);
                    } else {
                        Object[] objArr = new Object[4];
                        Long.valueOf(j);
                        Long.valueOf(NB);
                        i3 += 33;
                        this.icD.wait(33L);
                    }
                }
                if (i4 > 0) {
                    return i4;
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

    @Override // com.bykv.vk.openvk.component.video.pvs.pvs.pvs.vG
    public void icD() {
        try {
            if (!this.yiw) {
                this.Mxy.close();
            }
            File file = this.vG;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.Jd;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.yiw = true;
    }

    private long NB() {
        if (Jd()) {
            return this.Jd.length();
        }
        return this.vG.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() throws IOException {
        synchronized (this.icD) {
            if (Jd()) {
                Object[] objArr = new Object[3];
                this.Wyp.Ju();
                this.Wyp.IP();
                return;
            }
            try {
            } finally {
            }
            if (!this.vG.renameTo(this.Jd)) {
                throw new IOException("Error renaming file " + this.vG + " to " + this.Jd + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.Mxy;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.Mxy = new RandomAccessFile(this.Jd, "rw");
            Object[] objArr2 = new Object[3];
            this.Wyp.IP();
            this.Wyp.Ju();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.pvs.pvs.vG
    public long vG() throws IOException {
        if (Jd()) {
            this.pvs = this.Jd.length();
        } else {
            synchronized (this.icD) {
                int i = 0;
                do {
                    if (this.pvs == -2147483648L) {
                        i += 15;
                        try {
                            this.icD.wait(5L);
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i <= 20000);
                return -1L;
            }
        }
        Object[] objArr = new Object[2];
        Long.valueOf(this.pvs);
        return this.pvs;
    }
}
