package com.bytedance.sdk.component.adexpress.fs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.fs.iv;

/* loaded from: classes8.dex */
public class fs implements iv {
    private int btk;
    private mw fb;
    private com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn fs;
    private Context zmn;
    private zg zn;

    public fs(Context context, mw mwVar, boolean z, com.bytedance.sdk.component.adexpress.dynamic.btk.zg zgVar, zg zgVar2, com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn zmnVar, com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn zmnVar2) {
        this.zmn = context;
        this.fb = mwVar;
        this.zn = zgVar2;
        if (zmnVar2 != null) {
            this.fs = zmnVar2;
        } else {
            this.fs = new com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn(context, z, zgVar, mwVar, zmnVar);
        }
        this.fs.zmn(this.zn);
        if (zgVar instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps) {
            this.btk = 3;
        } else {
            this.btk = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public boolean zmn(final iv.zmn zmnVar) {
        this.fb.btk().zmn(this.btk);
        this.fs.zmn(new nps() { // from class: com.bytedance.sdk.component.adexpress.fs.fs.1
            @Override // com.bytedance.sdk.component.adexpress.fs.nps
            public void zmn(View view, rt rtVar) {
                if (zmnVar.zn()) {
                    return;
                }
                fs.this.fb.btk().btk(fs.this.btk);
                fs.this.fb.btk().hhw(fs.this.btk);
                fs.this.fb.btk().bvs();
                cn fs = zmnVar.fs();
                if (fs == null) {
                    return;
                }
                fs.zmn(fs.this.fs, rtVar);
                zmnVar.zmn(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.fs.nps
            public void zmn(int i, String str) {
                fs.this.fb.btk().zmn(fs.this.btk, i, str, zmnVar.fs(fs.this));
                if (zmnVar.fs(fs.this)) {
                    zmnVar.zmn(fs.this);
                    return;
                }
                cn fs = zmnVar.fs();
                if (fs == null) {
                    return;
                }
                fs.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public void zmn() {
        com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fb fs() {
        com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.fb();
        }
        return null;
    }
}
