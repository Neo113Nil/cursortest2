package com.bytedance.sdk.component.adexpress.fs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.fs.iv;

/* loaded from: classes11.dex */
public class hhw implements iv {
    private zmn fs;
    private Context zmn;
    private mw zn;

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public void zmn() {
    }

    public hhw(Context context, mw mwVar, zmn zmnVar) {
        this.zmn = context;
        this.fs = zmnVar;
        this.zn = mwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public boolean zmn(final iv.zmn zmnVar) {
        this.zn.btk().nps(0);
        this.fs.zmn(new nps() { // from class: com.bytedance.sdk.component.adexpress.fs.hhw.1
            @Override // com.bytedance.sdk.component.adexpress.fs.nps
            public void zmn(View view, rt rtVar) {
                if (zmnVar.zn()) {
                    return;
                }
                cn fs = zmnVar.fs();
                if (fs != null) {
                    fs.zmn(hhw.this.fs, rtVar);
                }
                zmnVar.zmn(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.fs.nps
            public void zmn(int i, String str) {
                cn fs = zmnVar.fs();
                if (fs != null) {
                    fs.a_(i);
                }
            }
        });
        return true;
    }

    public void zmn(zn znVar) {
        this.fs.zmn(znVar);
    }
}
