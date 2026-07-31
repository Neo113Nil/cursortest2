package com.bytedance.sdk.openadsdk.core.mw.zn;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.olo;

/* loaded from: classes14.dex */
public class fs {
    private final boolean btk;
    private com.bytedance.sdk.openadsdk.core.mw.zn.zmn fb;
    private Context fs;
    private zn zmn;
    private nqi zn;

    public fs(Context context, nqi nqiVar) {
        this(context, nqiVar, false);
    }

    public fs(Context context, nqi nqiVar, boolean z) {
        this.fs = context;
        this.zn = nqiVar;
        this.btk = z;
    }

    public void zmn(cyb cybVar) {
        zn zmn2 = zmn.zmn(this.fs, this.zn, this.btk);
        this.zmn = zmn2;
        if (zmn2 != null) {
            zmn2.zmn();
            this.zmn.zmn(cybVar);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.zn.zmn zmnVar) {
        this.fb = zmnVar;
        zn znVar = this.zmn;
        if (znVar != null) {
            znVar.zmn(zmnVar);
        }
    }

    public void zmn(int i) {
        fkt btk;
        zn znVar = this.zmn;
        if (!(znVar instanceof fb) || (btk = ((fb) znVar).btk()) == null || btk.zmn() == null) {
            return;
        }
        btk.zmn().zmn(i);
    }

    public zn zmn() {
        return this.zmn;
    }

    public void fs() {
        zn znVar = this.zmn;
        if (znVar != null) {
            znVar.fs();
        }
    }

    public View zn() {
        zn znVar = this.zmn;
        if (znVar != null) {
            return znVar.fb();
        }
        return null;
    }

    public void fb() {
        zn znVar = this.zmn;
        if (znVar != null) {
            znVar.zn();
        }
    }

    public static class zmn {
        public static zn zmn(Context context, nqi nqiVar, boolean z) {
            if (olo.zmn(nqiVar, z)) {
                return new fb(context, nqiVar, z);
            }
            return null;
        }
    }
}
