package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.dislike.NB;
import com.bytedance.sdk.openadsdk.dislike.vG;
import java.util.List;

/* compiled from: TTAdDislikeImpl.java */
/* loaded from: classes2.dex */
public class icD implements ny {
    private boolean Jd;
    private ny.pvs NB;
    private final Context icD;
    public NB pvs;
    private vG vG;

    public icD(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            Ju.icD("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.icD = context;
        pvs(str, list, str2, str3);
    }

    private void pvs(String str, List<FilterWord> list, String str2, String str3) {
        this.vG = new vG(this.icD, str, list, str3);
        NB nb = new NB(this.icD);
        this.pvs = nb;
        nb.pvs(str, str2);
        this.pvs.pvs(str3);
        this.pvs.pvs(new NB.pvs() { // from class: com.bytedance.sdk.openadsdk.dislike.icD.1
            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void pvs() {
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void icD() {
                icD.this.pvs();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void vG() {
                icD.this.pvs();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.NB.pvs
            public void pvs(int i, FilterWord filterWord) {
                if (icD.this.NB != null) {
                    icD.this.NB.pvs(i, filterWord.getName());
                }
                if (icD.this.NB != null) {
                    icD.this.NB.pvs();
                }
            }
        });
        this.vG.pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.dislike.icD.2
            @Override // com.bytedance.sdk.openadsdk.dislike.vG.pvs
            public void pvs() {
                icD.this.pvs(true);
                if (icD.this.vG != null && icD.this.vG.isShowing()) {
                    icD.this.vG.dismiss();
                }
                icD.this.vG();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.vG.pvs
            public void pvs(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && icD.this.NB != null) {
                        icD.this.NB.pvs(i, filterWord.getName());
                    }
                    Ju.pvs("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + filterWord.getName());
                } catch (Throwable th) {
                    Ju.pvs("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.vG.pvs
            public void icD() {
                Ju.pvs("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (icD.this.NB != null) {
                        icD.this.NB.pvs();
                    }
                } catch (Throwable th) {
                    Ju.pvs("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.vG.pvs
            public void vG() {
                Ju.pvs("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ny
    public void pvs() {
        Context context = this.icD;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.vG.isShowing()) {
            return;
        }
        this.vG.show();
    }

    public void pvs(String str, List<FilterWord> list) {
        this.vG.pvs(str, list);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ny
    public void pvs(ny.pvs pvsVar) {
        this.NB = pvsVar;
    }

    public void pvs(String str) {
        vG vGVar = this.vG;
        if (vGVar != null) {
            vGVar.pvs(str);
        }
    }

    public boolean icD() {
        return this.Jd;
    }

    public void pvs(boolean z) {
        this.Jd = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        if ((this.icD instanceof Activity) && (!((Activity) r0).isFinishing()) && !this.pvs.isShowing()) {
            this.pvs.show();
        }
    }
}
