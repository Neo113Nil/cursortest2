package com.bytedance.sdk.component.btk.fs.fs;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.btk.fs.zn.fs.zmn;
import com.bytedance.sdk.component.btk.kw;
import com.bytedance.sdk.component.utils.rc;

/* loaded from: classes4.dex */
public class fb<T> implements hhw {
    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, kw kwVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        byte[] mw = znVar.mw();
        if (mw == null) {
            zmnVar.zmn(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int rc = znVar.rc();
        znVar.zmn(mw.length);
        if (rc == 2) {
            boolean z = (com.bytedance.sdk.component.utils.hhw.fs(mw) || rc.zmn(mw, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.hhw.zmn(mw)) {
                zmn(znVar, mw, z, zmnVar);
            } else {
                zmnVar.zmn(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (rc == 3) {
            zmnVar.zmn(new com.bytedance.sdk.component.btk.fs.zn.fb().zmn(znVar, mw, null, com.bytedance.sdk.component.utils.hhw.fs(mw)));
        } else if (com.bytedance.sdk.component.utils.hhw.fs(mw)) {
            fs(znVar, mw, zmnVar);
        } else if (rc.zmn(mw, 0)) {
            zmn(znVar, mw, zmnVar);
        } else if (com.bytedance.sdk.component.utils.hhw.zmn(mw)) {
            zmn(znVar, mw, true, zmnVar);
        } else {
            zmnVar.zmn(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void zmn(final com.bytedance.sdk.component.btk.fs.zn.zn znVar, final byte[] bArr, final com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        try {
            new com.bytedance.sdk.component.btk.fs.zn.fs.zmn().zmn(bArr, new zmn.InterfaceC0127zmn() { // from class: com.bytedance.sdk.component.btk.fs.fs.fb.1
                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn(Drawable drawable) {
                    zmnVar.zmn(new com.bytedance.sdk.component.btk.fs.zn.fb().zmn(znVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn() {
                    zmnVar.zmn(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.hhw.zmn(bArr)) {
                        fb.this.zmn(znVar, bArr, true, zmnVar);
                    } else {
                        zmnVar.zmn(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            zmnVar.zmn(2000, "decode webp animation error", th);
        }
    }

    private void fs(final com.bytedance.sdk.component.btk.fs.zn.zn znVar, final byte[] bArr, final com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        try {
            new com.bytedance.sdk.component.btk.fs.zn.fs.zmn().zmn(bArr, znVar.cyb(), new zmn.InterfaceC0127zmn() { // from class: com.bytedance.sdk.component.btk.fs.fs.fb.2
                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn(Drawable drawable) {
                    zmnVar.zmn(new com.bytedance.sdk.component.btk.fs.zn.fb().zmn(znVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn() {
                    zmnVar.zmn(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.btk.fs.zn.fs.zmn.InterfaceC0127zmn
                public void zmn(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.hhw.zmn(bArr)) {
                        fb.this.zmn(znVar, bArr, true, zmnVar);
                    } else {
                        zmnVar.zmn(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            zmnVar.zmn(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public String zmn() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, byte[] bArr, boolean z, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        try {
            com.bytedance.sdk.component.btk.fs.zn.hhw cyb = znVar.cyb();
            Bitmap zmn = cyb.zmn(znVar).zmn(bArr, cyb);
            if (zmn != null) {
                znVar.zg();
                znVar.zmn();
                zmn.getWidth();
                zmn.getHeight();
                zmn.getByteCount();
                zmnVar.zmn(new com.bytedance.sdk.component.btk.fs.zn.fb().zmn(znVar, zmn, null, false));
                if (z) {
                    zmn(znVar.olo(), cyb, znVar.zg(), zmn);
                    return;
                }
                return;
            }
            znVar.zg();
            znVar.zmn();
            zmnVar.zmn(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            znVar.zg();
            znVar.zmn();
            zmnVar.zmn(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    private void zmn(com.bytedance.sdk.component.btk.fs fsVar, com.bytedance.sdk.component.btk.fs.zn.hhw hhwVar, String str, Bitmap bitmap) {
        if (fsVar == null || hhwVar == null || !fsVar.btk()) {
            return;
        }
        hhwVar.zmn(fsVar).zmn(str, bitmap);
    }
}
