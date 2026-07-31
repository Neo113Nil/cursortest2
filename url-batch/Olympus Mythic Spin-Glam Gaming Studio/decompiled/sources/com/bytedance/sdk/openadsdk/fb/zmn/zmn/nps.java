package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import android.content.Context;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.zmn.zn;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public class nps {
    private static volatile com.bytedance.zmn.fb zmn;

    public static void zmn(final Context context) {
        zn.btk btkVar = new zn.btk("ads") { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.1
            @Override // com.bytedance.zmn.zn.btk
            public boolean zmn() {
                return kgc.zmn(context);
            }
        };
        btkVar.zmn(bvs.class, new zmn());
        btkVar.zmn(rc.class, new klz());
        btkVar.zmn(mw.class, new rt());
        btkVar.zmn(zn.fs().fs);
        btkVar.zn(zn.fs().fb);
        final com.bytedance.sdk.component.zg.fs.nps klz = nu.klz();
        if (klz != null) {
            btkVar.zmn(Math.max(2, klz.zmn() / 2));
        }
        btkVar.zmn(zn.fs().btk);
        btkVar.fb(zn.fs().hhw);
        btkVar.btk(zn.fs().nps);
        btkVar.zmn(new zn.fb() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.2
            @Override // com.bytedance.zmn.zn.fb
            public ExecutorService zmn() {
                return nu.rc();
            }

            @Override // com.bytedance.zmn.zn.fb
            public ExecutorService fs() {
                return com.bytedance.sdk.component.zg.fs.nps.this;
            }
        });
        btkVar.zmn(new zn.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.3
            @Override // com.bytedance.zmn.zn.zmn
            public byte[] zmn(byte[] bArr) {
                return com.bytedance.sdk.component.fb.fs.fs(bArr, btk.zmn());
            }

            @Override // com.bytedance.zmn.zn.zmn
            public byte[] fs(byte[] bArr) {
                return com.bytedance.sdk.component.fb.fs.zmn(bArr, btk.zmn());
            }
        });
        zmn = com.bytedance.zmn.zn.zmn(context, btkVar);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.fb.zmn zmnVar) {
        zmn(new bvs(zmnVar));
    }

    public static void zmn(com.bytedance.zmn.zmn zmnVar) {
        if (zmn == null || zmnVar == null) {
            return;
        }
        zmn.zmn(zmnVar);
    }

    public static boolean zmn() {
        return zmn != null;
    }
}
