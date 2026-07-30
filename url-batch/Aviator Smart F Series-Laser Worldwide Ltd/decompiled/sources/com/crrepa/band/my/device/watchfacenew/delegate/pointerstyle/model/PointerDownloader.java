package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerBean;
import com.moyoung.dafit.module.common.utils.g;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class PointerDownloader {
    private final Listener listener;
    private final List<ClockPointerBean.PointerConfig> pointerConfigList;

    public interface Listener {
        void onFailed();

        void onSucceed();
    }

    public PointerDownloader(List<ClockPointerBean.PointerConfig> list, Listener listener) {
        this.pointerConfigList = list;
        this.listener = listener;
        downloadPointerFileList();
    }

    private void downloadPointerFile(String str) {
        final File pointerFile = ClockPointerBean.getPointerFile(str);
        Picasso.get().load(str).into(new a0() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.PointerDownloader.1
            @Override // com.squareup.picasso.a0
            public void onBitmapFailed(Exception exc, Drawable drawable) {
                PointerDownloader.this.listener.onFailed();
            }

            @Override // com.squareup.picasso.a0
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                Log.d("downloadPointerFile", "onBitmapLoaded");
                g.saveBitmap(bitmap, pointerFile);
                PointerDownloader.this.downloadPointerFileList();
            }

            @Override // com.squareup.picasso.a0
            public void onPrepareLoad(Drawable drawable) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadPointerFileList() {
        Iterator<ClockPointerBean.PointerConfig> it = this.pointerConfigList.iterator();
        while (it.hasNext()) {
            String str = it.next().pointer_file;
            if (!ClockPointerBean.getPointerFile(str).exists()) {
                downloadPointerFile(str);
                return;
            }
        }
        this.listener.onSucceed();
    }
}
