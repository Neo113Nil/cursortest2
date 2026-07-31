package com.bytedance.sdk.component.btk.fs.zn.fs;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.btk.fs.zn.hhw;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class zmn {

    /* renamed from: com.bytedance.sdk.component.btk.fs.zn.fs.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0127zmn {
        void zmn();

        void zmn(Drawable drawable);

        void zmn(byte[] bArr);
    }

    public void zmn(byte[] bArr, hhw hhwVar, InterfaceC0127zmn interfaceC0127zmn) {
        if (Build.VERSION.SDK_INT <= 30) {
            zmn(bArr, interfaceC0127zmn, hhwVar);
        } else {
            zmn(bArr, interfaceC0127zmn);
        }
    }

    public void zmn(byte[] bArr, InterfaceC0127zmn interfaceC0127zmn) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0127zmn != null) {
                interfaceC0127zmn.zmn(bArr);
                return;
            }
            return;
        }
        createSource = ImageDecoder.createSource(wrap);
        try {
            decodeDrawable = ImageDecoder.decodeDrawable(createSource);
            if (interfaceC0127zmn != null) {
                interfaceC0127zmn.zmn(decodeDrawable);
            }
        } catch (Throwable th) {
            iqz.zn("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0127zmn != null) {
                interfaceC0127zmn.zmn();
            }
        }
    }

    private void zmn(final byte[] bArr, final InterfaceC0127zmn interfaceC0127zmn, final hhw hhwVar) {
        try {
            hhwVar.zg().submit(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.fs.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.fs(bArr, hhwVar, interfaceC0127zmn);
                }
            });
        } catch (Throwable th) {
            iqz.zn("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0127zmn != null) {
                interfaceC0127zmn.zmn();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(byte[] bArr, hhw hhwVar, InterfaceC0127zmn interfaceC0127zmn) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        FileOutputStream fileOutputStream = null;
        try {
            File zmn = nps.zmn(hhwVar.zmn(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(zmn);
            try {
                fileOutputStreamCtor.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0127zmn != null) {
                        interfaceC0127zmn.zmn(bArr);
                    }
                    try {
                        fileOutputStreamCtor.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                createSource = ImageDecoder.createSource(zmn);
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                if (interfaceC0127zmn != null) {
                    interfaceC0127zmn.zmn(decodeDrawable);
                }
                try {
                    fileOutputStreamCtor.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStreamCtor;
                try {
                    iqz.zmn("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0127zmn != null) {
                        interfaceC0127zmn.zmn();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
