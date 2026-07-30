package com.baidu.ar.remoteres;

import com.baidu.ar.DuMixController;
import com.baidu.ar.filter.FilterParam;
import java.io.File;

/* loaded from: classes.dex */
class FaceResProcessor implements IDuMixResProcessor {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3149a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3150b = false;

    public final void a(DuMixController duMixController, File file) {
        File file2 = new File(file, "filter/beauty_skin_small_video.png");
        if (file2.exists()) {
            duMixController.updateFilter(FilterParam.SkinFilter.whitenFile, file2.getAbsolutePath());
        }
        File file3 = new File(file, "faceModels");
        if (file3.exists()) {
            duMixController.getARProxyManager().getFaceAR().setFaceModelPath(file3.getAbsolutePath() + "/");
        }
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public String getBusinessTag() {
        return "face_alg_model";
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isLoaded() {
        return this.f3149a;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isReady(File file, File file2) {
        if (this.f3150b) {
            return false;
        }
        if (this.f3149a) {
            return true;
        }
        return new File(file2, "faceModels").exists();
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean load(DuMixController duMixController, File file, File file2) {
        if (duMixController != null) {
            try {
                a(duMixController, file2);
            } catch (Throwable th) {
                th.printStackTrace();
                this.f3150b = true;
                return false;
            }
        }
        this.f3150b = false;
        this.f3149a = true;
        return true;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public void setUseLocalLib() {
    }
}
