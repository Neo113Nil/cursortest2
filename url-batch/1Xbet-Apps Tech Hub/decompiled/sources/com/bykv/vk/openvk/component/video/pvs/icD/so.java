package com.bykv.vk.openvk.component.video.pvs.icD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileWrapper.java */
/* loaded from: classes.dex */
class so {
    private final RandomAccessFile pvs;

    so(File file, String str) throws pvs {
        try {
            this.pvs = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new pvs(e);
        }
    }

    void pvs(long j) throws pvs {
        try {
            this.pvs.seek(j);
        } catch (IOException e) {
            throw new pvs(e);
        }
    }

    void pvs(byte[] bArr, int i, int i2) throws pvs {
        try {
            this.pvs.write(bArr, i, i2);
        } catch (IOException e) {
            throw new pvs(e);
        }
    }

    int pvs(byte[] bArr) throws pvs {
        try {
            return this.pvs.read(bArr);
        } catch (IOException e) {
            throw new pvs(e);
        }
    }

    void pvs() {
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(this.pvs);
    }

    /* compiled from: RandomAccessFileWrapper.java */
    static class pvs extends Exception {
        pvs(Throwable th) {
            super(th);
        }
    }
}
