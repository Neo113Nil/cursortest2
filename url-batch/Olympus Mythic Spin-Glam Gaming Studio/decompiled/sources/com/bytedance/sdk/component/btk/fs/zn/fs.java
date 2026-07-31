package com.bytedance.sdk.component.btk.fs.zn;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.btk.cn;
import com.bytedance.sdk.component.btk.fs.zn.zn;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.btk.kgc;
import com.bytedance.sdk.component.btk.mw;
import com.bytedance.sdk.component.utils.cyb;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class fs implements cn {
    private volatile hhw zmn;

    private fs() {
    }

    public static cn zmn(Context context, mw mwVar) {
        fs fsVar = new fs();
        fsVar.fs(context, mwVar);
        return fsVar;
    }

    private void fs(Context context, mw mwVar) {
        if (this.zmn != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (mwVar == null) {
            mwVar = btk.zmn(context);
        }
        this.zmn = new hhw(context, mwVar);
    }

    @Override // com.bytedance.sdk.component.btk.cn
    public iv zmn(String str) {
        return new zn.fs(this.zmn).zn(str);
    }

    @Override // com.bytedance.sdk.component.btk.cn
    public InputStream zmn(String str, String str2) {
        byte[] zmn;
        if (this.zmn != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = cyb.zmn(str);
            }
            kgc zn = this.zmn.zn();
            if (zn != null && (zmn = zn.zmn(str2)) != null) {
                return new ByteArrayInputStream(zmn);
            }
            Collection<com.bytedance.sdk.component.btk.zn> fb = this.zmn.fb();
            if (fb != null) {
                Iterator<com.bytedance.sdk.component.btk.zn> it = fb.iterator();
                while (it.hasNext()) {
                    InputStream zmn2 = it.next().zmn(str2);
                    if (zmn2 != null) {
                        return zmn2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.btk.cn
    public boolean zmn(String str, String str2, String str3) {
        if (this.zmn == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = cyb.zmn(str);
        }
        com.bytedance.sdk.component.btk.zn zmn = this.zmn.zmn(str3);
        if (zmn != null) {
            return zmn.fs(str2);
        }
        return false;
    }
}
