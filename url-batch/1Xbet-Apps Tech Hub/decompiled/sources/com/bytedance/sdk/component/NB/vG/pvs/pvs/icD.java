package com.bytedance.sdk.component.NB.vG.pvs.pvs;

import android.util.Log;
import com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: LruCountDiskCache.java */
/* loaded from: classes.dex */
public class icD implements com.bytedance.sdk.component.NB.vG {
    private pvs icD;
    private long pvs;

    public icD(File file, long j, ExecutorService executorService) {
        this.pvs = j;
        try {
            this.icD = pvs.pvs(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.toString());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.NB.vG
    public InputStream pvs(String str) {
        pvs pvsVar = this.icD;
        if (pvsVar == null) {
            return null;
        }
        try {
            pvs.vG pvs = pvsVar.pvs(str);
            if (pvs != null) {
                return pvs.pvs(0);
            }
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean pvs(String str, byte[] bArr) {
        Closeable closeable;
        pvs.C0038pvs icD;
        pvs pvsVar = this.icD;
        if (pvsVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        pvs.C0038pvs c0038pvs = null;
        try {
            try {
                icD = pvsVar.icD(str);
            } catch (IOException e) {
                e = e;
                closeable = null;
            }
            try {
                if (icD == null) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(null);
                    return false;
                }
                OutputStream pvs = icD.pvs(0);
                if (pvs == pvs.vG) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(pvs);
                    return false;
                }
                pvs.write(bArr);
                icD.pvs();
                this.icD.pvs();
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(pvs);
                return true;
            } catch (IOException e2) {
                e = e2;
                closeable = null;
                c0038pvs = icD;
                try {
                    Log.w("LruCountDiskCache", e.toString());
                    if (c0038pvs != null) {
                        try {
                            c0038pvs.icD();
                        } catch (IOException unused) {
                        }
                    }
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(closeable);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(closeable2);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(closeable2);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    /* renamed from: icD, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] pvs(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        pvs pvsVar = this.icD;
        InputStream inputStream2 = null;
        if (pvsVar == null || str == null) {
            return null;
        }
        try {
            pvs.vG pvs = pvsVar.pvs(str);
            if (pvs == null) {
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(null);
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(null);
                return null;
            }
            inputStream = pvs.pvs(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("LruCountDiskCache", e.toString());
                            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream);
                            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream2);
                        com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream);
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream2);
                    com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
                    throw th;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream);
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(inputStream2);
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(byteArrayOutputStream);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    /* renamed from: vG, reason: merged with bridge method [inline-methods] */
    public boolean icD(String str) {
        try {
            try {
                pvs.vG pvs = this.icD.pvs(str);
                boolean z = pvs != null;
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(pvs);
                return z;
            } catch (IOException e) {
                Log.w("LruCountDiskCache", e.getMessage());
                com.bytedance.sdk.component.NB.vG.vG.icD.pvs(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.NB.vG.vG.icD.pvs(null);
            throw th;
        }
    }
}
