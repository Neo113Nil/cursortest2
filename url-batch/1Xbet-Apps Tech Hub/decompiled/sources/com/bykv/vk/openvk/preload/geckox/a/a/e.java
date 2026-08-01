package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: FIFOCachePolicy.java */
/* loaded from: classes.dex */
final class e extends b {
    e() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f.iterator();
        while (it.hasNext()) {
            List<File> b = com.bykv.vk.openvk.preload.geckox.utils.c.b(new File(this.e, it.next()));
            if (b != null && b.size() > this.d.a) {
                for (File file : b.subList(0, b.size() - this.d.a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.d.c != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
