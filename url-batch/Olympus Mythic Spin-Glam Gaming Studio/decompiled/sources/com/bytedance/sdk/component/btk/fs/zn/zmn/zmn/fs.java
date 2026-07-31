package com.bytedance.sdk.component.btk.fs.zn.zmn.zmn;

import com.bytedance.sdk.component.btk.zn;
import com.bytedance.sdk.component.utils.iv;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes11.dex */
public class fs implements zn {
    private zmn fs;
    private int zmn;

    public fs(File file, long j) {
        int i = (int) j;
        this.zmn = i;
        this.fs = zmn.zmn(i, file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.btk.zn
    public InputStream zmn(String str) {
        zmn zmnVar = this.fs;
        if (zmnVar == null) {
            return null;
        }
        return zmnVar.zmn(str);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean zmn(String str, byte[] bArr) {
        zmn zmnVar = this.fs;
        if (zmnVar == null || bArr == null || str == null) {
            return false;
        }
        return zmnVar.zmn(str, bArr);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    /* renamed from: fs, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] zmn(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        zmn zmnVar = this.fs;
        if (zmnVar != null && str != null) {
            try {
                inputStream = zmnVar.zmn(str);
                if (inputStream != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            iv.zmn(inputStream);
                            iv.zmn(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        iv.zmn(inputStream);
                        iv.zmn(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    iv.zmn(inputStream);
                    iv.zmn(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStream = null;
            }
            iv.zmn(inputStream);
            iv.zmn(byteArrayOutputStream);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public boolean fs(String str) {
        try {
            InputStream zmn = this.fs.zmn(str);
            boolean z = zmn != null;
            iv.zmn(zmn);
            return z;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                iv.zmn(null);
            }
        }
    }
}
