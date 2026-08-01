package com.bytedance.sdk.openadsdk.core.yiw;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewabilitySessionManager.java */
/* loaded from: classes2.dex */
public class sUS {
    private yiw icD;
    final Set<Pair<View, FriendlyObstructionPurpose>> pvs = new HashSet();

    private sUS() {
        NB.pvs(mnm.pvs());
    }

    private Handler NB() {
        return com.bytedance.sdk.component.utils.so.icD();
    }

    public static sUS pvs() {
        return new sUS();
    }

    public void pvs(final WebView webView) {
        if (webView == null || this.icD != null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(webView);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.1
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(WebView webView) {
        try {
            if (this.icD == null) {
                this.icD = so.pvs(webView);
            }
        } catch (Throwable th) {
            Ju.icD("createWebViewSession failed : ".concat(String.valueOf(th)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            NB.pvs(hashMap);
        }
    }

    public void pvs(final View view, final Set<Wyp> set) {
        if (this.icD != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(view, set);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.4
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(view, (Set<Wyp>) set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(View view, Set<Wyp> set) {
        try {
            if (this.icD == null) {
                this.icD = so.pvs(view, set);
            }
        } catch (Throwable th) {
            Ju.icD("createVideoSession failed : ".concat(String.valueOf(th)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            NB.pvs(hashMap);
        }
    }

    public void icD() {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            sUS();
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.5
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.sUS();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        if (this.icD != null) {
            try {
                pvs((View) null, (FriendlyObstructionPurpose) null);
                this.icD.icD();
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(final boolean z, final float f) {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(z, f);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.6
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z, float f) {
        if (this.icD != null) {
            try {
                pvs((View) null, (FriendlyObstructionPurpose) null);
                this.icD.pvs(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    public void vG() {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            yiw();
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.7
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.yiw();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yiw() {
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            try {
                yiwVar.Jd();
            } catch (Throwable unused) {
            }
        }
    }

    public void Jd() {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            so();
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.8
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.so();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void so() {
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            try {
                yiwVar.vG();
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(view, friendlyObstructionPurpose);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.9
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        yiw yiwVar = this.icD;
        try {
            if (yiwVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.pvs.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                yiwVar.pvs(view, friendlyObstructionPurpose);
            }
            if (this.pvs.size() > 0) {
                yiwVar.pvs(this.pvs);
                this.pvs.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void pvs(final long j, final boolean z) {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(j, z);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.10
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(j, z);
                }
            });
        }
    }

    public void icD(long j, boolean z) {
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            try {
                yiwVar.pvs(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(final boolean z) {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(z);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.2
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z) {
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            try {
                yiwVar.pvs(z);
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(final int i) {
        if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            icD(i);
        } else {
            NB().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yiw.sUS.3
                @Override // java.lang.Runnable
                public void run() {
                    sUS.this.icD(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            try {
                yiwVar.icD(i);
            } catch (Throwable unused) {
            }
        }
    }
}
