package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.iqz.zmn.zmn;
import java.util.Objects;

/* loaded from: classes8.dex */
public class kgc {

    public interface zmn {
        void zmn();

        void zmn(com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.iqz.zmn zmnVar, int i, int i2, zmn zmnVar2, String str) {
        zmn(zmnVar, i, i2, zmnVar2, str, 0);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.iqz.zmn zmnVar, int i, int i2, final zmn zmnVar2, String str, int i3) {
        Objects.toString(zmnVar);
        com.bytedance.sdk.openadsdk.iqz.fs.fs().fb().zmn(zmnVar, new zmn.InterfaceC0197zmn() { // from class: com.bytedance.sdk.openadsdk.utils.kgc.1
            @Override // com.bytedance.sdk.openadsdk.iqz.zmn.zmn.InterfaceC0197zmn
            public void zmn(String str2, com.bytedance.sdk.openadsdk.iqz.zmn.fs fsVar) {
                zmn zmnVar3;
                if (fsVar.btk() && (zmnVar3 = zmn.this) != null) {
                    zmnVar3.zmn(fsVar);
                    return;
                }
                zmn zmnVar4 = zmn.this;
                if (zmnVar4 != null) {
                    zmnVar4.zmn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.iqz.zmn.zmn.InterfaceC0197zmn
            public void zmn(int i4, String str2, Throwable th) {
                zmn zmnVar3 = zmn.this;
                if (zmnVar3 != null) {
                    zmnVar3.zmn();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable zmn(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
