package com.baidu.ar;

import com.baidu.ar.remoteres.IDuMixResProcessor;
import java.io.File;

/* loaded from: classes.dex */
public class l8 implements IDuMixResProcessor {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2707d = {"dlModels/gesture", "dlModels/hairSeg"};

    /* renamed from: a, reason: collision with root package name */
    public boolean f2708a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2709b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2710c = false;

    public void a(DuMixController duMixController, File file) {
        if (duMixController == null || this.f2708a) {
            return;
        }
        for (String str : f2707d) {
            File file2 = new File(file, str);
            if (file2.exists()) {
                duMixController.setMdlModelPath(file2.getAbsolutePath());
            }
        }
        this.f2709b = false;
        this.f2708a = true;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public String getBusinessTag() {
        return "egl_core";
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isLoaded() {
        return this.f2708a;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isReady(File file, File file2) {
        if (this.f2709b) {
            return false;
        }
        if (this.f2708a) {
            return true;
        }
        if (!this.f2710c && !new File(file, "libdumixar.so").exists()) {
            return false;
        }
        for (String str : f2707d) {
            if (!new File(file2, str + "/dl_config.json").exists()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean load(DuMixController duMixController, File file, File file2) {
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            this.f2709b = false;
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f2709b = true;
            return false;
        }
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public void setUseLocalLib() {
        this.f2710c = true;
    }

    public void a(boolean z7) {
        this.f2708a = z7;
    }
}
