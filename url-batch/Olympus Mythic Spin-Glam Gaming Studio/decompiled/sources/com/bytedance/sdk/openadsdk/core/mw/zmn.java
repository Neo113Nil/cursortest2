package com.bytedance.sdk.openadsdk.core.mw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.core.rc;
import com.bytedance.adsdk.ugeno.zmn;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.fs.zn.btk;
import com.bytedance.sdk.component.btk.fs.zn.hhw;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes12.dex */
public class zmn implements com.bytedance.adsdk.ugeno.zmn {

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0172zmn {
        void zmn(Drawable drawable);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn
    public void zmn(rc rcVar, String str, ImageView imageView, int i, int i2, zmn.InterfaceC0116zmn interfaceC0116zmn) {
        String zmn = fb.zmn(str);
        iv zn2 = com.bytedance.sdk.openadsdk.iv.fb.zmn(zmn).zn(1);
        zmn(rcVar, zn2, zmn);
        zn2.zmn(new zn(imageView, this, i, i2), 4);
    }

    private static class zn implements cyb {
        private final int fb;
        private final zmn fs;
        private final WeakReference<ImageView> zmn;
        private final int zn;

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, Throwable th) {
        }

        public zn(ImageView imageView, zmn zmnVar, int i, int i2) {
            this.zmn = new WeakReference<>(imageView);
            this.fs = zmnVar;
            this.zn = i;
            this.fb = i2;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            try {
                final ImageView imageView = this.zmn.get();
                if (imageView == null) {
                    return;
                }
                final Object fs = rcVar.fs();
                if (fs instanceof Drawable) {
                    nu.zmn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.zn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                                zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                            }
                            imageView.setImageDrawable((Drawable) fs);
                        }
                    });
                    return;
                }
                if (fs instanceof byte[]) {
                    if (rcVar.btk()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.fs.zmn((byte[]) fs, imageView);
                            return;
                        } else {
                            this.fs.zmn(imageView, (byte[]) fs, this.zn, this.fb);
                            return;
                        }
                    }
                    if (this.fs.zmn((byte[]) fs)) {
                        this.fs.zmn(imageView, (byte[]) fs, this.zn, this.fb);
                        return;
                    }
                    final Bitmap zmn = new com.bytedance.sdk.component.btk.fs.zn.fs.fs(this.zn, this.fb, imageView.getScaleType(), Bitmap.Config.RGB_565, this.zn, this.fb).zmn((byte[]) fs, new hhw(kgc.zmn(), new btk.zmn().zmn(com.bytedance.sdk.openadsdk.iv.fb.fs()).zmn()));
                    if (zmn != null) {
                        nu.zmn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.zn.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(zmn);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (fs instanceof Bitmap) {
                    nu.zmn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.zn.3
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) fs);
                        }
                    });
                }
            } catch (Throwable th) {
                iqz.zn("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final ImageView imageView, byte[] bArr, int i, int i2) {
        ImageDecoder.Source createSource;
        final Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(wrap);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                if (decodeDrawable != null) {
                    nu.zmn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (fs$$ExternalSyntheticApiModelOutline0.m(decodeDrawable)) {
                                zn$$ExternalSyntheticApiModelOutline0.m(decodeDrawable).start();
                            }
                            imageView.setImageDrawable(decodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e) {
                iqz.zn("ImageLoaderProvider", e.getMessage());
                return;
            }
        }
        fs(imageView, bArr, i, i2);
    }

    private void fs(final ImageView imageView, byte[] bArr, int i, int i2) {
        final Bitmap zmn = new com.bytedance.sdk.component.btk.fs.zn.fs.fs(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).zmn(bArr, new hhw(kgc.zmn(), new btk.zmn().zmn(com.bytedance.sdk.openadsdk.iv.fb.fs()).zmn()));
        if (zmn != null) {
            nu.zmn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(zmn);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(byte[] bArr, final ImageView imageView) {
        try {
            zmn(bArr, new InterfaceC0172zmn() { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.3
                @Override // com.bytedance.sdk.openadsdk.core.mw.zmn.InterfaceC0172zmn
                public void zmn(final Drawable drawable) {
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
                                zn$$ExternalSyntheticApiModelOutline0.m(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e) {
            iqz.zn("ImageLoaderProvider", e.getMessage());
        }
    }

    private void zmn(final byte[] bArr, final InterfaceC0172zmn interfaceC0172zmn) {
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable fs2 = zmn.this.fs(bArr);
                InterfaceC0172zmn interfaceC0172zmn2 = interfaceC0172zmn;
                if (interfaceC0172zmn2 != null) {
                    interfaceC0172zmn2.zmn(fs2);
                }
            }
        });
    }

    public boolean zmn(byte[] bArr) {
        return com.bytedance.sdk.component.utils.rc.zmn(bArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable fs(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File zmn;
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        try {
            zmn = nps.zmn(kgc.zmn(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = PangleFilesBridge.fileOutputStreamCtor(zmn);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                createSource = ImageDecoder.createSource(zmn);
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return decodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(kgc.zmn().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th2) {
            th = th2;
            try {
                iqz.zmn("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn
    public void zmn(rc rcVar, String str, zmn.InterfaceC0116zmn interfaceC0116zmn) {
        fs(rcVar, fb.zmn(str), interfaceC0116zmn);
    }

    public void fs(rc rcVar, String str, zmn.InterfaceC0116zmn interfaceC0116zmn) {
        iv zn2 = com.bytedance.sdk.openadsdk.iv.fb.zmn(str).zn(2);
        zmn(rcVar, zn2, str);
        zn2.zmn(new fs(interfaceC0116zmn), 4);
    }

    private static class fs implements cyb {
        private final WeakReference<zmn.InterfaceC0116zmn> zmn;

        public fs(zmn.InterfaceC0116zmn interfaceC0116zmn) {
            this.zmn = new WeakReference<>(interfaceC0116zmn);
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            zmn.InterfaceC0116zmn interfaceC0116zmn = this.zmn.get();
            if (rcVar == null) {
                if (interfaceC0116zmn != null) {
                    interfaceC0116zmn.zmn(null);
                }
            } else if (interfaceC0116zmn != null) {
                Object fs = rcVar.fs();
                if (fs instanceof Bitmap) {
                    interfaceC0116zmn.zmn((Bitmap) fs);
                    return;
                }
                if (rcVar.fs() instanceof byte[]) {
                    try {
                        interfaceC0116zmn.zmn(BitmapFactory.decodeByteArray((byte[]) rcVar.fs(), 0, ((byte[]) rcVar.fs()).length));
                        return;
                    } catch (Throwable unused) {
                    }
                }
                interfaceC0116zmn.zmn(null);
            }
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, Throwable th) {
            zmn.InterfaceC0116zmn interfaceC0116zmn = this.zmn.get();
            if (interfaceC0116zmn != null) {
                interfaceC0116zmn.zmn(null);
            }
        }
    }

    private void zmn(rc rcVar, @NonNull iv ivVar, String str) {
        Map<String, Object> fs2;
        if (rcVar == null || (fs2 = rcVar.fs()) == null) {
            return;
        }
        Object obj = fs2.get("image_info");
        if (obj instanceof Map) {
            ivVar.zmn((String) ((Map) obj).get(str));
        }
        String str2 = (String) fs2.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ivVar.fs(str2);
    }
}
