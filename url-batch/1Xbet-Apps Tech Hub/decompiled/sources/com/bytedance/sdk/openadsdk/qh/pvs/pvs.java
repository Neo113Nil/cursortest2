package com.bytedance.sdk.openadsdk.qh.pvs;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.NB.so;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.sUS.Jd;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.util.Map;

/* compiled from: GifLoader.java */
/* loaded from: classes2.dex */
public class pvs {

    /* compiled from: GifLoader.java */
    /* renamed from: com.bytedance.sdk.openadsdk.qh.pvs.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0094pvs {
        void pvs(int i, String str, Throwable th);

        void pvs(String str, icD icd);
    }

    public void pvs(com.bytedance.sdk.openadsdk.qh.pvs pvsVar, final InterfaceC0094pvs interfaceC0094pvs, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, cR cRVar) {
        Jd.pvs(pvsVar.pvs).pvs(pvsVar.icD).pvs(i).icD(i2).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).icD(str).pvs(Bitmap.Config.RGB_565).pvs(scaleType).pvs(!TextUtils.isEmpty(str)).pvs(new so() { // from class: com.bytedance.sdk.openadsdk.qh.pvs.pvs.2
            @Override // com.bytedance.sdk.component.NB.so
            public Bitmap pvs(Bitmap bitmap) {
                return i3 <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(mnm.pvs(), bitmap, i3);
            }
        }).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, pvsVar.pvs, new com.bytedance.sdk.component.NB.mnm() { // from class: com.bytedance.sdk.openadsdk.qh.pvs.pvs.1
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(qh qhVar) {
                pvs.this.pvs(qhVar, interfaceC0094pvs);
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i4, String str2, Throwable th) {
                pvs.this.pvs(i4, str2, th, interfaceC0094pvs);
            }
        }));
    }

    protected void pvs(qh qhVar, InterfaceC0094pvs interfaceC0094pvs) {
        if (interfaceC0094pvs != null) {
            Object icD = qhVar.icD();
            int pvs = pvs(qhVar);
            if (icD instanceof byte[]) {
                interfaceC0094pvs.pvs(qhVar.pvs(), new icD((byte[]) icD, pvs));
                return;
            }
            if (icD instanceof Bitmap) {
                interfaceC0094pvs.pvs(qhVar.pvs(), new icD((Bitmap) icD, qhVar.vG() instanceof Bitmap ? (Bitmap) qhVar.vG() : null, pvs));
            } else {
                interfaceC0094pvs.pvs(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int pvs(qh qhVar) {
        Object obj;
        Map<String, String> Jd = qhVar.Jd();
        if (Jd == null || (obj = Jd.get("image_size")) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void pvs(int i, String str, Throwable th, InterfaceC0094pvs interfaceC0094pvs) {
        if (interfaceC0094pvs != null) {
            interfaceC0094pvs.pvs(i, str, th);
        }
    }
}
