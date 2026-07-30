package com.baidu.ar.libloader;

import android.content.Context;
import com.baidu.ar.ARType;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes.dex */
public class b implements ILibLoader {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2757a = false;

    /* renamed from: b, reason: collision with root package name */
    public d f2758b = new d();

    @Override // com.baidu.ar.libloader.ILibLoader
    public void load(Context context, ILibLoader.b bVar) {
        this.f2757a = true;
        this.f2758b.b();
        this.f2758b.a();
        if (bVar != null) {
            bVar.onSuccess();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void prepareCaseRes(ARType aRType, String str, String str2, ILibLoader.a aVar) {
        if (aVar != null) {
            aVar.a(aRType, str, str2);
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void release() {
        d dVar = this.f2758b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void require(String str) {
        System.loadLibrary(str);
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibLoadPlugin(ILibLoaderPlugin iLibLoaderPlugin) {
    }

    @Override // com.baidu.ar.libloader.ILibLoader
    public void setLibReadyListener(String str, ILibLoader.c cVar) {
        if (cVar != null) {
            if (this.f2757a) {
                cVar.onReady();
            } else {
                this.f2758b.a(str, cVar);
            }
        }
    }
}
