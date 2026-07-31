package com.bytedance.sdk.openadsdk.core.mw.fs.btk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.nps.zn;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fs extends com.bytedance.adsdk.ugeno.fs.zmn<zmn> {
    private int ob;
    private int rsi;
    private JSONArray tev;

    public fs(Context context) {
        super(context);
        this.ob = 0;
        this.rsi = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public View zmn() {
        try {
            zmn zmnVar = new zmn(this.fs);
            this.btk = zmnVar;
            zmnVar.zmn((fb) this);
        } catch (Throwable unused) {
            this.btk = new View(this.fs);
        }
        return this.btk;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "driveMode":
                this.rsi = zn.zmn(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.ob = 1;
                    break;
                } else {
                    this.ob = 0;
                    break;
                }
            case "dataList":
                this.tev = com.bytedance.adsdk.ugeno.nps.fs.zmn(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        T t = this.btk;
        if (t instanceof zmn) {
            ((zmn) t).setOrientation(this.ob);
            ((zmn) this.btk).zmn(this);
            if (this.rsi == 1) {
                fb();
            } else {
                zn();
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (znVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.add(znVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, ViewGroup.LayoutParams layoutParams) {
        if (znVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.add(znVar);
    }

    private void zn() {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> list = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.get(0);
        if (this.tev == null) {
            return;
        }
        for (int i = 0; i < this.tev.length(); i++) {
            klz klzVar = new klz(this.fs);
            klzVar.zmn(this.uw);
            try {
                JSONObject optJSONObject = this.tev.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("$chunk")) {
                        this.fb.put("$item", optJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.fb.put("$item", optJSONObject);
                    }
                    ((zmn) this.btk).zmn(klzVar.zmn(znVar.yj(), this.fb, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void fb() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.size(); i++) {
            com.bytedance.adsdk.ugeno.fs.zn<View> znVar = ((com.bytedance.adsdk.ugeno.fs.zmn) this).zmn.get(i);
            if (znVar != null) {
                klz klzVar = new klz(this.fs);
                klzVar.zmn(this.uw);
                ((zmn) this.btk).zmn(klzVar.zmn(znVar.yj(), this.fb, (JSONObject) null));
            }
        }
    }
}
