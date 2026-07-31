package com.bytedance.sdk.openadsdk.bjh.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class zn extends fs {
    private int fb;

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected void fs(int i) {
    }

    public zn(Integer num, View view, nqi nqiVar, btk.zmn zmnVar) {
        super(num, view, nqiVar, 1000, zmnVar);
        this.fb = -1;
        fs(view);
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected boolean zn() {
        WeakReference<View> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.zmn.get();
        if (this.fb == -1) {
            fs(view);
        }
        return hhw.zmn(view, this.fb == 1, this.fs.sft());
    }

    private void fs(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.fb = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    protected void fb() {
        super.fb();
    }

    @Override // com.bytedance.sdk.openadsdk.bjh.fs.fs
    public int hhw() {
        nqi nqiVar = this.fs;
        return (nqiVar != null && nqiVar.dgt() && this.fs.ldx() == 1) ? 1000 : 100;
    }
}
