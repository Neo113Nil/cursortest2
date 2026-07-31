package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: FIFOCachePolicy.java */
/* loaded from: classes13.dex */
final class e extends b {
    e() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            List<File> b = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.d, it.next()));
            if (b != null && b.size() > this.c.a) {
                for (File file : b.subList(0, b.size() - this.c.a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.c.b != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
