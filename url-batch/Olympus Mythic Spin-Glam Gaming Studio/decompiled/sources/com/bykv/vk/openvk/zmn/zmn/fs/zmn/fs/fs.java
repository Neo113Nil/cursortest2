package com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs;

import android.content.Context;
import com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn;
import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class fs {
    private File btk;
    private File fb;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn fs;
    private Context zmn;
    private volatile boolean zn = false;
    private final List<zmn.InterfaceC0101zmn> hhw = new ArrayList();
    private volatile boolean nps = false;

    public fs(Context context, com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        this.fb = null;
        this.btk = null;
        this.zmn = context;
        this.fs = znVar;
        this.fb = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.fs(znVar.btk(), znVar.olo());
        this.btk = com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zn(znVar.btk(), znVar.olo());
    }

    public void zmn(zmn.InterfaceC0101zmn interfaceC0101zmn) {
        if (this.nps) {
            synchronized (zmn.InterfaceC0101zmn.class) {
                this.hhw.add(interfaceC0101zmn);
            }
            return;
        }
        this.hhw.add(interfaceC0101zmn);
        if (fs()) {
            this.fs.zg(1);
            zmn(this.fs, 200);
            zn.zmn(this.fs);
        } else {
            this.nps = true;
            this.fs.zg(0);
            zn();
        }
    }

    private boolean fs() {
        if (this.btk.exists()) {
            return true;
        }
        if (!this.fs.mw()) {
            if (this.fb.length() >= this.fs.hhw()) {
                return true;
            }
            if (this.fs.fb() > 0 && this.fb.length() >= this.fs.fb()) {
                return true;
            }
        }
        return false;
    }

    private void zn() {
        rc.zmn zmnVar;
        if (com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn() != null) {
            zmnVar = com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn().zn();
        } else {
            zmnVar = new rc.zmn("v_preload");
        }
        long kw = this.fs.kw();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zmnVar.zmn(kw, timeUnit).fs(this.fs.iqz(), timeUnit).zn(this.fs.phc(), timeUnit);
        rc zmn = zmnVar.zmn();
        klz.zmn zmnVar2 = new klz.zmn();
        final long length = this.fb.length();
        int hhw = this.fs.hhw();
        boolean mw = this.fs.mw();
        int fb = this.fs.fb();
        if (fb > 0) {
            if (fb >= this.fs.klz()) {
                mw = true;
            } else {
                hhw = fb;
            }
        }
        zmnVar2.zmn("videoPreload").zmn(6);
        if (mw) {
            zmnVar2.zmn("RANGE", "bytes=" + length + "-").fs(this.fs.cyb()).zmn().fs();
        } else {
            zmnVar2.zmn("RANGE", "bytes=" + length + "-" + hhw).fs(this.fs.cyb()).zmn().fs();
        }
        zmn.zmn(zmnVar2.fs()).zmn(new com.bytedance.sdk.component.fs.zmn.zn() { // from class: com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs.fs.1
            @Override // com.bytedance.sdk.component.fs.zmn.zn
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, IOException iOException) {
                fs fsVar2 = fs.this;
                fsVar2.zmn(fsVar2.fs, 601, iOException.getMessage());
                zn.zmn(fs.this.fs);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:61:0x015e A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:59:0x0151, B:61:0x015e, B:62:0x0165), top: B:58:0x0151 }] */
            /* JADX WARN: Type inference failed for: r13v5 */
            @Override // com.bytedance.sdk.component.fs.zmn.zn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, rt rtVar) throws IOException {
                int i;
                InputStream inputStream;
                Closeable closeable;
                cn cnVar;
                Closeable closeable2;
                boolean fb2;
                RandomAccessFile randomAccessFile;
                long j;
                long j2 = length;
                cn cnVar2 = null;
                if (rtVar != null) {
                    try {
                        fb2 = rtVar.fb();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        closeable2 = null;
                    }
                    if (fb2) {
                        cnVar = rtVar.hhw();
                        try {
                            cnVar = rtVar.hhw();
                            if (!fb2 || cnVar == null) {
                                inputStream = null;
                                j = 0;
                            } else {
                                j = length + cnVar.zmn();
                                inputStream = cnVar.zn();
                            }
                            try {
                                if (inputStream == null) {
                                    fs fsVar2 = fs.this;
                                    fsVar2.zmn(fsVar2.fs, rtVar.zn(), rtVar.btk());
                                } else {
                                    randomAccessFile = new RandomAccessFile(fs.this.fb, "rw");
                                    try {
                                        int nps = com.bykv.vk.openvk.zmn.zmn.fs.zmn.nps();
                                        byte[] bArr = new byte[nps];
                                        int i2 = 0;
                                        long j3 = 0;
                                        while (true) {
                                            int read = inputStream.read(bArr, i2, nps - i2);
                                            if (read == -1) {
                                                if (fs.this.fs.mw() && j == fs.this.fb.length()) {
                                                    fs.this.btk();
                                                }
                                                fs fsVar3 = fs.this;
                                                fsVar3.zmn(fsVar3.fs, rtVar.zn());
                                                cnVar2 = randomAccessFile;
                                            } else if (fs.this.zn) {
                                                fs fsVar4 = fs.this;
                                                fsVar4.fs(fsVar4.fs, rtVar.zn());
                                                fs.this.zmn(randomAccessFile);
                                                break;
                                            } else {
                                                i2 += read;
                                                j3 += read;
                                                if (j3 % nps == 0 || j3 == j - length) {
                                                    com.bykv.vk.openvk.zmn.zmn.fs.fb.fs.zmn(randomAccessFile, bArr, Long.valueOf(j2).intValue(), i2, fs.this.fs.olo());
                                                    j2 += i2;
                                                    i2 = 0;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cnVar2 = cnVar;
                                        closeable2 = randomAccessFile;
                                        i = 601;
                                        closeable = closeable2;
                                        try {
                                            fs.this.fb();
                                            fs fsVar5 = fs.this;
                                            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar = fsVar5.fs;
                                            if (rtVar != null) {
                                            }
                                            fsVar5.zmn(znVar, i, th.getMessage());
                                            fs.this.zmn(closeable);
                                            fs.this.zmn(inputStream);
                                            fs.this.zmn(cnVar2);
                                            fs.this.zmn(rtVar);
                                            fs.this.fs.cyb();
                                            fs.this.fs.hhw();
                                            zn.zmn(fs.this.fs);
                                        } catch (Throwable th3) {
                                            fs.this.zmn(closeable);
                                            fs.this.zmn(inputStream);
                                            fs.this.zmn(cnVar2);
                                            fs.this.zmn(rtVar);
                                            fs.this.fs.cyb();
                                            fs.this.fs.hhw();
                                            zn.zmn(fs.this.fs);
                                            throw th3;
                                        }
                                    }
                                }
                                fs.this.zmn(cnVar2);
                                fs.this.zmn(inputStream);
                                fs.this.zmn(cnVar);
                            } catch (Throwable th4) {
                                th = th4;
                                randomAccessFile = cnVar2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                            randomAccessFile = 0;
                        }
                    } else {
                        fs fsVar6 = fs.this;
                        fsVar6.zmn(fsVar6.fs, rtVar.zn(), rtVar.btk());
                        fs.this.zmn((Closeable) null);
                        fs.this.zmn((Closeable) null);
                        fs.this.zmn(cnVar2);
                    }
                } else {
                    try {
                        fs fsVar7 = fs.this;
                        i = 601;
                        try {
                            fsVar7.zmn(fsVar7.fs, 601, "Network link failed.");
                            cnVar = null;
                            inputStream = null;
                            fs.this.zmn(cnVar2);
                            fs.this.zmn(inputStream);
                            fs.this.zmn(cnVar);
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                            closeable = null;
                            fs.this.fb();
                            fs fsVar52 = fs.this;
                            com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2 = fsVar52.fs;
                            if (rtVar != null) {
                                i = rtVar.zn();
                            }
                            fsVar52.zmn(znVar2, i, th.getMessage());
                            fs.this.zmn(closeable);
                            fs.this.zmn(inputStream);
                            fs.this.zmn(cnVar2);
                            fs.this.zmn(rtVar);
                            fs.this.fs.cyb();
                            fs.this.fs.hhw();
                            zn.zmn(fs.this.fs);
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        i = 601;
                    }
                }
                fs.this.zmn(rtVar);
                fs.this.fs.cyb();
                fs.this.fs.hhw();
                zn.zmn(fs.this.fs);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn zmn() {
        return this.fs;
    }

    public void zmn(boolean z) {
        this.zn = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
        synchronized (zmn.InterfaceC0101zmn.class) {
            try {
                for (zmn.InterfaceC0101zmn interfaceC0101zmn : this.hhw) {
                    if (interfaceC0101zmn != null) {
                        interfaceC0101zmn.zmn(znVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
        synchronized (zmn.InterfaceC0101zmn.class) {
            try {
                for (zmn.InterfaceC0101zmn interfaceC0101zmn : this.hhw) {
                    if (interfaceC0101zmn != null) {
                        interfaceC0101zmn.zmn(znVar, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
        synchronized (zmn.InterfaceC0101zmn.class) {
            try {
                for (zmn.InterfaceC0101zmn interfaceC0101zmn : this.hhw) {
                    if (interfaceC0101zmn != null) {
                        interfaceC0101zmn.fs(znVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        try {
            this.btk.delete();
            this.fb.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk() {
        try {
            if (this.fb.renameTo(this.btk)) {
                return;
            }
            throw new IOException("Error renaming file " + this.fb + " to " + this.btk + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
