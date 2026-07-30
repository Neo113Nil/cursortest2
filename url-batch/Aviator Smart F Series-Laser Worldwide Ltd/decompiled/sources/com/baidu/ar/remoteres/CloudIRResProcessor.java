package com.baidu.ar.remoteres;

import com.baidu.ar.DuMixController;
import com.baidu.ar.libloader.a;
import java.io.File;

/* loaded from: classes.dex */
class CloudIRResProcessor implements IDuMixResProcessor {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3119d = {"dumixar"};

    /* renamed from: a, reason: collision with root package name */
    public boolean f3120a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3121b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3122c = false;

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public String getBusinessTag() {
        return "egl_core";
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isLoaded() {
        return this.f3120a;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isReady(File file, File file2) {
        if (this.f3121b) {
            return false;
        }
        if (!this.f3120a && !this.f3122c) {
            for (String str : f3119d) {
                if (!new File(file, "lib" + str + ".so").exists()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean load(DuMixController duMixController, File file, File file2) {
        try {
            if (!this.f3122c) {
                for (String str : f3119d) {
                    a.a(str);
                }
            }
            this.f3120a = true;
            this.f3121b = false;
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f3121b = true;
            return false;
        }
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public void setUseLocalLib() {
        this.f3122c = true;
    }
}
