package com.baidu.ar.remoteres;

import com.baidu.ar.DuMixController;
import com.baidu.ar.libloader.a;
import java.io.File;

/* loaded from: classes.dex */
class OnDeviceIRResProcessor implements IDuMixResProcessor {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3151a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3152b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3153c = false;

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public String getBusinessTag() {
        return "local_recognize";
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isLoaded() {
        return this.f3151a;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isReady(File file, File file2) {
        if (this.f3152b) {
            return false;
        }
        if (this.f3151a) {
            return true;
        }
        return new File(file, "libImgRecognition.so").exists();
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean load(DuMixController duMixController, File file, File file2) {
        try {
            if (!this.f3153c) {
                a.a("ImgRecognition");
            }
            this.f3152b = false;
            this.f3151a = true;
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f3152b = true;
            return false;
        }
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public void setUseLocalLib() {
        this.f3153c = true;
    }
}
