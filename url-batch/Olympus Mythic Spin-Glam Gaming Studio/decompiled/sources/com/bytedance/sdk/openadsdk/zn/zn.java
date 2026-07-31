package com.bytedance.sdk.openadsdk.zn;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.yj;
import com.bytedance.sdk.openadsdk.zn.fb;
import com.bytedance.sdk.openadsdk.zn.klz;
import java.util.List;

/* loaded from: classes13.dex */
public class zn implements yj {
    private yj.zmn btk;
    private boolean fb;
    private final Context fs;
    public klz zmn;
    private fb zn;

    public zn(Context context, String str, List<FilterWord> list, nqi nqiVar) {
        this.fs = context;
        zmn(str, list, nqiVar);
    }

    private void zmn(String str, List<FilterWord> list, nqi nqiVar) {
        this.zn = new fb(this.fs, str, list);
        klz klzVar = new klz(this.fs, this.zn.getDislikeManager());
        this.zmn = klzVar;
        klzVar.zmn(nqiVar);
        this.zmn.zmn(new klz.zmn() { // from class: com.bytedance.sdk.openadsdk.zn.zn.1
            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zmn() {
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void fs() {
                zn.this.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zn() {
                zn.this.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.zn.klz.zmn
            public void zmn(int i, FilterWord filterWord, String str2) {
                zn.this.zn.onSuggestionSubmit(str2);
                zn.this.zmn();
            }
        });
        this.zn.zmn(new fb.zmn() { // from class: com.bytedance.sdk.openadsdk.zn.zn.2
            @Override // com.bytedance.sdk.openadsdk.zn.fb.zmn
            public void zmn() {
                zn.this.zmn(true);
                if (zn.this.zn != null && zn.this.zn.isShowing()) {
                    zn.this.zn.hide();
                }
                zn.this.fb();
            }

            @Override // com.bytedance.sdk.openadsdk.zn.fb.zmn
            public void zmn(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && zn.this.btk != null) {
                        zn.this.btk.zmn(i, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zn.fb.zmn
            public void fs() {
                try {
                    if (zn.this.btk != null) {
                        zn.this.btk.zmn();
                    }
                } catch (Throwable th) {
                    iqz.zmn("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.yj
    public void zmn() {
        Context context = this.fs;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.zn.isShowing()) {
            return;
        }
        this.zn.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.yj
    public void zmn(yj.zmn zmnVar) {
        this.btk = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yj
    public void fs() {
        fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.destroy();
        }
    }

    public boolean zn() {
        return this.fb;
    }

    public void zmn(boolean z) {
        this.fb = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        Context context = this.fs;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.zmn.isShowing()) {
            return;
        }
        this.zmn.show();
    }
}
