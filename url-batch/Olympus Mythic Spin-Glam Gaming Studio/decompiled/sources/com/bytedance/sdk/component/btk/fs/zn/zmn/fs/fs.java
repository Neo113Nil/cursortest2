package com.bytedance.sdk.component.btk.fs.zn.zmn.fs;

import com.bytedance.sdk.component.btk.kgc;

/* loaded from: classes15.dex */
public class fs implements kgc {
    private com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, byte[]> fb;
    private int fs;
    private long zmn = 1048576;
    private int zn;

    public fs(int i, int i2) {
        this.zn = i;
        this.fs = i2;
        this.fb = new com.bytedance.sdk.component.btk.fs.zn.zmn.zn<>(i2);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean zmn(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.zmn) {
                    return false;
                }
                this.fb.zmn(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public byte[] zmn(String str) {
        try {
            return this.fb.zmn((com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean fs(String str) {
        return this.fb.zmn((com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, byte[]>) str) != null;
    }
}
