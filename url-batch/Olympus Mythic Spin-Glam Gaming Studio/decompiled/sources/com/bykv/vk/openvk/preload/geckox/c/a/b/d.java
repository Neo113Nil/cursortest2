package com.bykv.vk.openvk.preload.geckox.c.a.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;

/* compiled from: MergePatchSingleFileInterceptor.java */
/* loaded from: classes8.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start merge patch single file, channel:", channel);
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File f = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = f.getParentFile().getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        File file = new File(parentFile, sb.toString());
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            throw new RuntimeException("can not found old full single file,:" + file.getAbsolutePath());
        }
        File file2 = listFiles[0];
        File file3 = new File(f.getParentFile(), "res" + str + com.bykv.vk.openvk.preload.geckox.c.a.a.b.a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file3);
        try {
            try {
                BsPatch.a(file2, f, file3.getParentFile(), file3.getName());
                com.bykv.vk.openvk.preload.geckox.utils.b.a(f);
                this.d.a();
                com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, file3.length());
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
                } finally {
                    a.e();
                }
            } catch (Exception e) {
                throw new RuntimeException("merge patch single file failed, channel：" + channel + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.preload.geckox.utils.b.a(f);
            throw th;
        }
    }
}
