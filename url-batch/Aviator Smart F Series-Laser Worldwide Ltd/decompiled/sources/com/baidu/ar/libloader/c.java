package com.baidu.ar.libloader;

import android.text.TextUtils;
import com.baidu.ar.h;
import com.baidu.ar.libloader.ILibLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public String f2759c;

    /* renamed from: d, reason: collision with root package name */
    public List<String> f2760d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public a f2761e;

    public interface a {
        void a(String str, String str2);
    }

    public c(String str) {
        this.f2759c = str;
    }

    public void a(a aVar) {
        this.f2761e = aVar;
    }

    @Override // com.baidu.ar.libloader.b, com.baidu.ar.libloader.ILibLoader
    public void require(String str) {
        h.c("LocalWithPathLibLoader", "require libName = " + str);
        try {
            super.require(str);
            if (this.f2760d.contains(str)) {
                return;
            }
            this.f2760d.add(str);
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(this.f2759c)) {
                File file = new File(this.f2759c, "lib" + str + ".so");
                if (file.exists()) {
                    a(file.getAbsolutePath());
                    if (this.f2760d.contains(str)) {
                        return;
                    }
                    this.f2760d.add(str);
                    return;
                }
            }
            throw th;
        }
    }

    @Override // com.baidu.ar.libloader.b, com.baidu.ar.libloader.ILibLoader
    public void setLibReadyListener(String str, ILibLoader.c cVar) {
        if (cVar == null || !this.f2760d.contains(str)) {
            super.setLibReadyListener(str, cVar);
        } else {
            cVar.onReady();
        }
    }

    public final void a(String str) {
        try {
            System.load(str);
        } catch (Throwable th) {
            if (this.f2761e != null) {
                this.f2761e.a(str, th.getMessage());
            }
            throw th;
        }
    }
}
