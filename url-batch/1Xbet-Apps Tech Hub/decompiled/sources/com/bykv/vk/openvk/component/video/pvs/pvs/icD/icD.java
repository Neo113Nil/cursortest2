package com.bykv.vk.openvk.component.video.pvs.pvs.icD;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.NB.pvs;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.mnm;
import com.bytedance.sdk.component.icD.pvs.qh;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ReallyVideoPreload.java */
/* loaded from: classes.dex */
public class icD {
    private File Jd;
    private File NB;
    private com.bykv.vk.openvk.component.video.api.vG.vG icD;
    private Context pvs;
    private volatile boolean vG = false;
    private final List<pvs.InterfaceC0017pvs> sUS = new ArrayList();
    private volatile boolean yiw = false;

    public icD(Context context, com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        this.Jd = null;
        this.NB = null;
        this.pvs = context;
        this.icD = vGVar;
        this.Jd = com.bykv.vk.openvk.component.video.pvs.NB.icD.icD(vGVar.icD(), vGVar.IP());
        this.NB = com.bykv.vk.openvk.component.video.pvs.NB.icD.vG(vGVar.icD(), vGVar.IP());
    }

    public void pvs(pvs.InterfaceC0017pvs interfaceC0017pvs) {
        if (this.yiw) {
            synchronized (pvs.InterfaceC0017pvs.class) {
                this.sUS.add(interfaceC0017pvs);
            }
            return;
        }
        this.sUS.add(interfaceC0017pvs);
        if (icD()) {
            this.icD.yiw(1);
            pvs(this.icD, 200);
            vG.pvs(this.icD);
        } else {
            this.yiw = true;
            this.icD.yiw(0);
            vG();
        }
    }

    private boolean icD() {
        if (this.NB.exists()) {
            return true;
        }
        if (!this.icD.Wyp()) {
            if (this.Jd.length() >= this.icD.vG()) {
                return true;
            }
            if (this.icD.pvs() > 0 && this.Jd.length() >= this.icD.pvs()) {
                return true;
            }
        }
        return false;
    }

    private void vG() {
        qh.pvs pvsVar;
        if (com.bykv.vk.openvk.component.video.api.vG.Jd() != null) {
            pvsVar = com.bykv.vk.openvk.component.video.api.vG.Jd().icD();
        } else {
            pvsVar = new qh.pvs("v_preload");
        }
        pvsVar.pvs(this.icD.mnm(), TimeUnit.MILLISECONDS).icD(this.icD.vA(), TimeUnit.MILLISECONDS).vG(this.icD.cR(), TimeUnit.MILLISECONDS);
        qh pvs = pvsVar.pvs();
        Ju.pvs pvsVar2 = new Ju.pvs();
        final long length = this.Jd.length();
        int vG = this.icD.vG();
        boolean Wyp = this.icD.Wyp();
        int pvs2 = this.icD.pvs();
        if (pvs2 > 0) {
            if (pvs2 >= this.icD.Mxy()) {
                Wyp = true;
            } else {
                vG = pvs2;
            }
        }
        pvsVar2.pvs("videoPreload").pvs(6);
        if (Wyp) {
            pvsVar2.pvs("RANGE", "bytes=" + length + "-").icD(this.icD.Ju()).pvs().icD();
        } else {
            pvsVar2.pvs("RANGE", "bytes=" + length + "-" + vG).icD(this.icD.Ju()).pvs().icD();
        }
        pvs.pvs(pvsVar2.icD()).pvs(new com.bytedance.sdk.component.icD.pvs.vG() { // from class: com.bykv.vk.openvk.component.video.pvs.pvs.icD.icD.1
            @Override // com.bytedance.sdk.component.icD.pvs.vG
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, IOException iOException) {
                icD icd2 = icD.this;
                icd2.pvs(icd2.icD, 601, iOException.getMessage());
                vG.pvs(icD.this.icD);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x017e A[Catch: all -> 0x0199, TryCatch #3 {all -> 0x0199, blocks: (B:18:0x0171, B:20:0x017e, B:21:0x0182), top: B:17:0x0171 }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00ea A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:52:0x00a7, B:53:0x00ac, B:55:0x00b5, B:71:0x00bd, B:58:0x00d6, B:60:0x00dc, B:65:0x00ea, B:74:0x0104, B:76:0x0110, B:78:0x011e, B:79:0x0123), top: B:51:0x00a7 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v17 */
            /* JADX WARN: Type inference failed for: r7v3 */
            @Override // com.bytedance.sdk.component.icD.pvs.vG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, bNS bns) throws IOException {
                InputStream inputStream;
                RandomAccessFile randomAccessFile;
                int i;
                mnm sUS;
                long j;
                boolean z;
                long j2 = length;
                int i2 = 4;
                mnm mnmVar = null;
                RandomAccessFile randomAccessFile2 = null;
                mnmVar = null;
                r7 = 0;
                ?? r7 = 0;
                if (bns != null) {
                    try {
                        boolean Jd = bns.Jd();
                        if (Jd) {
                            sUS = bns.sUS();
                            try {
                                sUS = bns.sUS();
                                if (!Jd || sUS == null) {
                                    inputStream = null;
                                    j = 0;
                                } else {
                                    j = length + sUS.pvs();
                                    inputStream = sUS.vG();
                                }
                                try {
                                    if (inputStream == null) {
                                        icD icd2 = icD.this;
                                        icd2.pvs(icd2.icD, bns.vG(), bns.NB());
                                        icD.this.pvs((Closeable) null);
                                    } else {
                                        randomAccessFile = new RandomAccessFile(icD.this.Jd, "rw");
                                        try {
                                            byte[] bArr = new byte[8192];
                                            long j3 = 0;
                                            int i3 = 0;
                                            while (true) {
                                                int read = inputStream.read(bArr, i3, 8192 - i3);
                                                if (read == -1) {
                                                    if (icD.this.icD.Wyp() && j == icD.this.Jd.length()) {
                                                        icD.this.NB();
                                                    }
                                                    icD icd3 = icD.this;
                                                    icd3.pvs(icd3.icD, bns.vG());
                                                    randomAccessFile2 = randomAccessFile;
                                                } else {
                                                    if (icD.this.vG) {
                                                        icD icd4 = icD.this;
                                                        icd4.icD(icd4.icD, bns.vG());
                                                        icD.this.pvs(randomAccessFile);
                                                        r7 = read;
                                                        break;
                                                    }
                                                    i3 += read;
                                                    j3 += read;
                                                    if (j3 % 8192 != 0 && j3 != j - length) {
                                                        z = false;
                                                        if (!z) {
                                                            com.bykv.vk.openvk.component.video.pvs.NB.icD.pvs(randomAccessFile, bArr, Long.valueOf(j2).intValue(), i3, icD.this.icD.IP());
                                                            j2 += i3;
                                                            i3 = 0;
                                                        }
                                                        i2 = 4;
                                                    }
                                                    z = true;
                                                    if (!z) {
                                                    }
                                                    i2 = 4;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            mnmVar = sUS;
                                            i = 601;
                                            try {
                                                icD.this.Jd();
                                                icD icd5 = icD.this;
                                                com.bykv.vk.openvk.component.video.api.vG.vG vGVar = icd5.icD;
                                                if (bns != null) {
                                                    i = bns.vG();
                                                }
                                                icd5.pvs(vGVar, i, th.getMessage());
                                                icD.this.pvs(randomAccessFile);
                                                icD.this.pvs(inputStream);
                                                icD.this.pvs(mnmVar);
                                                icD.this.pvs(bns);
                                                Object[] objArr = new Object[4];
                                                icD.this.icD.Ju();
                                                Integer.valueOf(icD.this.icD.vG());
                                                vG.pvs(icD.this.icD);
                                            } catch (Throwable th2) {
                                                icD.this.pvs(randomAccessFile);
                                                icD.this.pvs(inputStream);
                                                icD.this.pvs(mnmVar);
                                                icD.this.pvs(bns);
                                                Object[] objArr2 = new Object[4];
                                                icD.this.icD.Ju();
                                                Integer.valueOf(icD.this.icD.vG());
                                                vG.pvs(icD.this.icD);
                                                throw th2;
                                            }
                                        }
                                    }
                                    icD.this.pvs(inputStream);
                                    icD.this.pvs(sUS);
                                } catch (Throwable th3) {
                                    th = th3;
                                    randomAccessFile = r7;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                                randomAccessFile = null;
                            }
                        } else {
                            icD icd6 = icD.this;
                            icd6.pvs(icd6.icD, bns.vG(), bns.NB());
                            icD.this.pvs((Closeable) null);
                            icD.this.pvs((Closeable) null);
                            icD.this.pvs((Closeable) null);
                        }
                        icD.this.pvs(bns);
                        Object[] objArr3 = new Object[i2];
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = null;
                        randomAccessFile = null;
                    }
                    icD.this.icD.Ju();
                    Integer.valueOf(icD.this.icD.vG());
                    vG.pvs(icD.this.icD);
                }
                try {
                    icD icd7 = icD.this;
                    i = 601;
                    try {
                        icd7.pvs(icd7.icD, 601, "Network link failed.");
                        sUS = null;
                        inputStream = null;
                        icD.this.pvs(randomAccessFile2);
                        icD.this.pvs(inputStream);
                        icD.this.pvs(sUS);
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                        randomAccessFile = null;
                        icD.this.Jd();
                        icD icd52 = icD.this;
                        com.bykv.vk.openvk.component.video.api.vG.vG vGVar2 = icd52.icD;
                        if (bns != null) {
                        }
                        icd52.pvs(vGVar2, i, th.getMessage());
                        icD.this.pvs(randomAccessFile);
                        icD.this.pvs(inputStream);
                        icD.this.pvs(mnmVar);
                        icD.this.pvs(bns);
                        Object[] objArr4 = new Object[4];
                        icD.this.icD.Ju();
                        Integer.valueOf(icD.this.icD.vG());
                        vG.pvs(icD.this.icD);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    i = 601;
                }
                icD.this.pvs(bns);
                Object[] objArr42 = new Object[4];
                icD.this.icD.Ju();
                Integer.valueOf(icD.this.icD.vG());
                vG.pvs(icD.this.icD);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.vG.vG pvs() {
        return this.icD;
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
        synchronized (pvs.InterfaceC0017pvs.class) {
            for (pvs.InterfaceC0017pvs interfaceC0017pvs : this.sUS) {
                if (interfaceC0017pvs != null) {
                    interfaceC0017pvs.pvs(vGVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
        synchronized (pvs.InterfaceC0017pvs.class) {
            for (pvs.InterfaceC0017pvs interfaceC0017pvs : this.sUS) {
                if (interfaceC0017pvs != null) {
                    interfaceC0017pvs.pvs(vGVar, i, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
        synchronized (pvs.InterfaceC0017pvs.class) {
            for (pvs.InterfaceC0017pvs interfaceC0017pvs : this.sUS) {
                if (interfaceC0017pvs != null) {
                    interfaceC0017pvs.icD(vGVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        try {
            this.NB.delete();
            this.Jd.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB() {
        try {
            if (this.Jd.renameTo(this.NB)) {
            } else {
                throw new IOException("Error renaming file " + this.Jd + " to " + this.NB + " for completion!");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
