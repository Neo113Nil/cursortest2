package com.bytedance.sdk.openadsdk.core.rt;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class hhw {
    private nps fs;
    final Set<Pair<View, FriendlyObstructionPurpose>> zmn = new HashSet();

    private hhw() {
        btk.zmn(kgc.zmn());
    }

    private Handler btk() {
        return com.bytedance.sdk.component.utils.bvs.fs();
    }

    public static hhw zmn() {
        return new hhw();
    }

    @UiThread
    public void zmn(final WebView webView) {
        if (webView == null || this.fs != null) {
            return;
        }
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(webView);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.1
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(WebView webView) {
        try {
            if (this.fs == null) {
                this.fs = zg.zmn(webView);
            }
        } catch (Throwable th) {
            iqz.zn("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put("message", th.getMessage());
            btk.zmn(hashMap);
        }
    }

    public void zmn(final View view, final nqi nqiVar) {
        if (this.fs != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.fb exj = nqiVar.exj();
        final Set<iv> fs = exj != null ? exj.fs() : null;
        if (view == null || fs == null) {
            return;
        }
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            zmn(view, fs, nqiVar);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.3
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.zmn(view, (Set<iv>) fs, nqiVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(View view, Set<iv> set, nqi nqiVar) {
        try {
            if (this.fs == null) {
                this.fs = zg.zmn(view, set);
                if (nqiVar.ch()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, nqiVar.btk(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            iqz.zn("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put("message", th.getMessage());
            btk.zmn(hashMap);
        }
    }

    @UiThread
    public void fs() {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            hhw();
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.4
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.hhw();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw() {
        if (this.fs != null) {
            try {
                zmn((View) null, (FriendlyObstructionPurpose) null);
                this.fs.fs();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void zmn(final boolean z, final float f) {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(z, f);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.5
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(boolean z, float f) {
        if (this.fs != null) {
            try {
                zmn((View) null, (FriendlyObstructionPurpose) null);
                this.fs.zmn(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void zn() {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            nps();
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.6
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.nps();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nps() {
        nps npsVar = this.fs;
        if (npsVar != null) {
            try {
                npsVar.fb();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void fb() {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            zg();
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.7
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.zg();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zg() {
        nps npsVar = this.fs;
        if (npsVar != null) {
            try {
                npsVar.zn();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void zmn(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(view, friendlyObstructionPurpose);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.8
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        nps npsVar = this.fs;
        try {
            if (npsVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.zmn.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                npsVar.zmn(view, friendlyObstructionPurpose);
            }
            if (this.zmn.size() > 0) {
                npsVar.zmn(this.zmn);
                this.zmn.clear();
            }
        } catch (Throwable unused) {
        }
    }

    @UiThread
    public void zmn(final long j, final boolean z) {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(j, z);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.9
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(j, z);
                }
            });
        }
    }

    public void fs(long j, boolean z) {
        nps npsVar = this.fs;
        if (npsVar != null) {
            try {
                npsVar.zmn(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void zmn(final boolean z) {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(z);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.10
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(boolean z) {
        nps npsVar = this.fs;
        if (npsVar != null) {
            try {
                npsVar.zmn(z);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void zmn(final int i) {
        if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            fs(i);
        } else {
            btk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.hhw.2
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.fs(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(int i) {
        nps npsVar = this.fs;
        if (npsVar != null) {
            try {
                npsVar.fs(i);
            } catch (Throwable unused) {
            }
        }
    }
}
