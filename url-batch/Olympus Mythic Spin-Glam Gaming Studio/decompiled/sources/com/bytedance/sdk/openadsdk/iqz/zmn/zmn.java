package com.bytedance.sdk.openadsdk.iqz.zmn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.component.btk.zg;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.iv.fb;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes15.dex */
public class zmn {

    /* renamed from: com.bytedance.sdk.openadsdk.iqz.zmn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0197zmn {
        void zmn(int i, String str, Throwable th);

        void zmn(String str, fs fsVar);
    }

    public void zmn(com.bytedance.sdk.openadsdk.iqz.zmn zmnVar, final InterfaceC0197zmn interfaceC0197zmn, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, nqi nqiVar) {
        iv zmn = fb.zmn(zmnVar.zmn).zmn(zmnVar.fs).zmn(i).fs(i2).btk(jy.btk(kgc.zmn())).fb(jy.zn(kgc.zmn())).fs(str).zmn(scaleType).zmn(!TextUtils.isEmpty(str));
        if (i3 > 0 && Build.VERSION.SDK_INT >= 26) {
            zmn.zn(2).zmn(new zg() { // from class: com.bytedance.sdk.openadsdk.iqz.zmn.zmn.1
                @Override // com.bytedance.sdk.component.btk.zg
                public Bitmap zmn(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(kgc.zmn(), bitmap, i3);
                }
            });
        } else {
            zmn.zn(1);
        }
        zmn.zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, zmnVar.zmn, new cyb() { // from class: com.bytedance.sdk.openadsdk.iqz.zmn.zmn.2
            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(rc rcVar) {
                zmn.this.zmn(rcVar, interfaceC0197zmn);
            }

            @Override // com.bytedance.sdk.component.btk.cyb
            public void zmn(int i4, String str2, Throwable th) {
                zmn.this.zmn(i4, str2, th, interfaceC0197zmn);
            }
        }));
    }

    protected void zmn(rc rcVar, InterfaceC0197zmn interfaceC0197zmn) {
        if (interfaceC0197zmn != null) {
            Object fs = rcVar.fs();
            int zmn = zmn(rcVar);
            if (fs instanceof Drawable) {
                interfaceC0197zmn.zmn(rcVar.zmn(), new fs((Drawable) fs, zmn));
                return;
            }
            if (fs instanceof byte[]) {
                interfaceC0197zmn.zmn(rcVar.zmn(), new fs((byte[]) fs, zmn));
                return;
            }
            if (fs instanceof Bitmap) {
                interfaceC0197zmn.zmn(rcVar.zmn(), new fs((Bitmap) fs, rcVar.zn() instanceof Bitmap ? (Bitmap) rcVar.zn() : null, zmn));
            } else {
                interfaceC0197zmn.zmn(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int zmn(rc rcVar) {
        Object obj;
        Map<String, String> fb = rcVar.fb();
        if (fb == null || (obj = fb.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void zmn(int i, String str, Throwable th, InterfaceC0197zmn interfaceC0197zmn) {
        if (interfaceC0197zmn != null) {
            interfaceC0197zmn.zmn(i, str, th);
        }
    }
}
