package com.bykv.vk.openvk.preload.geckox.c.b.a;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* compiled from: DownloadFullZipInterceptor.java */
/* loaded from: classes5.dex */
public class b extends com.bykv.vk.openvk.preload.a.d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb.append(str);
        sb.append(updatePackage.getChannel());
        sb.append(str);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        File file3 = new File(file2, "res.zip");
        this.d.a();
        com.bykv.vk.openvk.preload.geckox.buffer.a a = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, length);
        try {
            this.d.i().downloadFile(uri, length, new BufferOutputStream(a));
            try {
                return bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a, updatePackage));
            } finally {
                a.e();
            }
        } catch (Throwable th) {
            a.e();
            throw new com.bykv.vk.openvk.preload.geckox.b.a("download full zip file failed, url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
