package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.f.b;
import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GeckoResLoader.java */
/* loaded from: classes.dex */
public final class a implements ILoader {
    public b a;
    public AtomicBoolean b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            throw new RuntimeException("resRootDir == null");
        }
        this.a = new b(context, str, file);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released!");
        }
        GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        b bVar = this.a;
        if (bVar.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        com.bykv.vk.openvk.preload.geckox.f.a a = bVar.a(str.trim());
        return a.a(a.b).a(com.bykv.vk.openvk.preload.geckox.f.a.a(a.b, str));
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released!");
        }
        b bVar = this.a;
        if (bVar.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        com.bykv.vk.openvk.preload.geckox.f.a a = bVar.a(str.trim());
        return a.a(a.b).b(com.bykv.vk.openvk.preload.geckox.f.a.a(a.b, str));
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.a.c;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        b bVar = this.a;
        if (bVar.b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (bVar.a) {
            for (com.bykv.vk.openvk.preload.geckox.f.a aVar : bVar.a.values()) {
                if (!aVar.e.getAndSet(true)) {
                    com.bykv.vk.openvk.preload.geckox.g.b a = com.bykv.vk.openvk.preload.geckox.g.b.a(aVar.a + File.separator + aVar.b + File.separator + "select.lock");
                    GeckoLogger.d("gecko-file-lock", "channel version loader clean");
                    try {
                        if (aVar.c != null) {
                            c.b(aVar.c.getAbsolutePath() + File.separator + "using.lock");
                            a.a();
                            com.bykv.vk.openvk.preload.geckox.a.c.a(aVar.a + File.separator + aVar.b);
                        }
                    } finally {
                        a.a();
                    }
                }
            }
            bVar.a.clear();
        }
    }
}
