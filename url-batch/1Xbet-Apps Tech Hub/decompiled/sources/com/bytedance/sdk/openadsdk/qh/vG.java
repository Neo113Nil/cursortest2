package com.bytedance.sdk.openadsdk.qh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.icD.pvs.Jd;
import com.bytedance.sdk.component.icD.pvs.pvs.pvs.Mxy;
import com.bytedance.sdk.component.yiw.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: TTNetClient.java */
/* loaded from: classes2.dex */
public class vG {
    private static volatile vG pvs;
    private final com.bytedance.sdk.component.yiw.pvs icD;
    private com.bytedance.sdk.openadsdk.qh.pvs.vG vG;

    public static vG pvs() {
        if (pvs == null) {
            synchronized (vG.class) {
                if (pvs == null) {
                    pvs = new vG(mnm.pvs());
                }
            }
        }
        return pvs;
    }

    private vG(Context context) {
        com.bytedance.sdk.component.yiw.pvs pvs2 = new pvs.C0060pvs().pvs(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).icD(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).vG(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS).pvs(true).pvs();
        this.icD = pvs2;
        com.bytedance.sdk.component.icD.pvs.pvs.pvs.pvs.pvs(new Mxy() { // from class: com.bytedance.sdk.openadsdk.qh.vG.1
            @Override // com.bytedance.sdk.component.icD.pvs.pvs.pvs.Mxy
            public ExecutorService pvs() {
                if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Oa()) {
                    return ae.Mxy();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.icD.pvs.pvs.pvs.Mxy
            public boolean icD() {
                return com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Oa();
            }
        });
        Jd pvs3 = pvs2.NB().pvs();
        if (pvs3 != null) {
            pvs3.pvs(32);
        }
    }

    public com.bytedance.sdk.component.yiw.pvs icD() {
        return this.icD;
    }

    public com.bytedance.sdk.openadsdk.qh.pvs.vG vG() {
        Jd();
        return this.vG;
    }

    public void pvs(String str, int i, int i2, ImageView imageView, cR cRVar) {
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(str).pvs(i).icD(i2).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(cRVar, str, imageView));
    }

    public void pvs(int i, final ImageView imageView, final cR cRVar) {
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(cRVar.sUS()).pvs(i).icD(i).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(cRVar, cRVar.sUS(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qh.vG.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String yiw = cRVar.yiw();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(yiw));
                        try {
                            com.bytedance.sdk.component.utils.icD.pvs(mnm.pvs(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void pvs(bNS bns, ImageView imageView, cR cRVar) {
        if (bns == null || TextUtils.isEmpty(bns.pvs()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(bns).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(cRVar, bns.pvs(), imageView));
    }

    private void Jd() {
        if (this.vG == null) {
            this.vG = new com.bytedance.sdk.openadsdk.qh.pvs.vG();
        }
    }
}
