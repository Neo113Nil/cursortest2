package com.bytedance.sdk.component.nps;

import com.bytedance.sdk.component.fs.zmn.iv;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class fs {
    final long btk;
    private final boolean bvs;
    final String fb;
    final String fs;
    final long hhw;
    iv nps;
    final int zmn;
    final Map<String, String> zn;
    private File zg = null;
    private byte[] iv = null;

    public fs(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.bvs = z;
        this.zmn = i;
        this.fs = str;
        this.zn = map;
        this.fb = str2;
        this.btk = j;
        this.hhw = j2;
    }

    public int zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public Map<String, String> zn() {
        return this.zn;
    }

    public String fb() {
        return this.fb;
    }

    public File btk() {
        return this.zg;
    }

    public void zmn(File file) {
        this.zg = file;
    }

    public boolean hhw() {
        return this.bvs;
    }

    public void zmn(byte[] bArr) {
        this.iv = bArr;
    }

    public iv nps() {
        return this.nps;
    }

    public void zmn(iv ivVar) {
        this.nps = ivVar;
    }
}
