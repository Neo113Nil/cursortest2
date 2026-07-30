package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.remoteres.IDuMixResProcessor;
import java.io.File;

/* loaded from: classes.dex */
public class o3 implements IDuMixResProcessor {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2874a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2875b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f2876c;

    public void a(String str) {
        this.f2876c = str;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public String getBusinessTag() {
        return TextUtils.isEmpty(this.f2876c) ? "egl_core" : this.f2876c;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isLoaded() {
        return this.f2874a;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean isReady(File file, File file2) {
        return !this.f2875b;
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public boolean load(DuMixController duMixController, File file, File file2) {
        try {
            this.f2875b = false;
            this.f2874a = true;
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            this.f2875b = true;
            return false;
        }
    }

    @Override // com.baidu.ar.remoteres.IDuMixResProcessor
    public void setUseLocalLib() {
    }
}
