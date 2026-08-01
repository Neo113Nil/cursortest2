package com.bykv.vk.openvk.component.video.pvs.pvs;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.vG.vG;
import com.bykv.vk.openvk.component.video.pvs.pvs.pvs.icD;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SdkMediaDataSource.java */
/* loaded from: classes.dex */
public class pvs extends MediaDataSource {
    public static final ConcurrentHashMap<String, pvs> pvs = new ConcurrentHashMap<>();
    private final Context Jd;
    private final vG NB;
    private final com.bykv.vk.openvk.component.video.pvs.pvs.pvs.vG icD;
    private long vG = -2147483648L;

    public pvs(Context context, vG vGVar) {
        this.Jd = context;
        this.NB = vGVar;
        this.icD = new icD(context, vGVar);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int pvs2 = this.icD.pvs(j, bArr, i, i2);
        new StringBuilder("readAt: position = ").append(j).append("  buffer.length =").append(bArr.length).append("  offset = ").append(i).append(" size =").append(pvs2).append("  current = ").append(Thread.currentThread());
        return pvs2;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.vG == -2147483648L) {
            if (this.Jd == null || TextUtils.isEmpty(this.NB.Ju())) {
                return -1L;
            }
            this.vG = this.icD.vG();
        }
        return this.vG;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[2];
        this.NB.Ju();
        com.bykv.vk.openvk.component.video.pvs.pvs.pvs.vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.icD();
        }
        pvs.remove(this.NB.IP());
    }

    public vG pvs() {
        return this.NB;
    }

    public static pvs pvs(Context context, vG vGVar) {
        pvs pvsVar = new pvs(context, vGVar);
        pvs.put(vGVar.IP(), pvsVar);
        return pvsVar;
    }
}
