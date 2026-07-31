package com.bykv.vk.openvk.zmn.zmn.fs.zmn;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.fs;
import com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class zmn extends MediaDataSource {
    public static final ConcurrentHashMap<String, zmn> zmn = new ConcurrentHashMap<>();
    private final zn btk;
    private final Context fb;
    private final com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zn fs;
    private long zn = -2147483648L;

    public zmn(Context context, zn znVar) {
        this.fb = context;
        this.btk = znVar;
        this.fs = new fs(znVar);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int zmn2 = this.fs.zmn(j, bArr, i, i2);
        int length = bArr.length;
        return zmn2;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.zn == -2147483648L) {
            if (this.fb == null || TextUtils.isEmpty(this.btk.cyb())) {
                return -1L;
            }
            this.zn = this.fs.zn();
        }
        return this.zn;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.btk.cyb();
        com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zn znVar = this.fs;
        if (znVar != null) {
            znVar.fs();
        }
        zmn.remove(this.btk.olo());
    }

    public zn zmn() {
        return this.btk;
    }

    public static zmn zmn(Context context, zn znVar) {
        zmn zmnVar = new zmn(context, znVar);
        zmn.put(znVar.olo(), zmnVar);
        return zmnVar;
    }
}
