package com.bytedance.adsdk.lottie.icD;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.lottie.vG;
import com.bytedance.adsdk.lottie.vG.yiw;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class pvs {
    private final AssetManager Jd;
    private vG NB;
    private final yiw<String> pvs = new yiw<>();
    private final Map<yiw<String>, Typeface> icD = new HashMap();
    private final Map<String, Typeface> vG = new HashMap();
    private String sUS = ".ttf";

    public pvs(Drawable.Callback callback, vG vGVar) {
        this.NB = vGVar;
        if (!(callback instanceof View)) {
            this.Jd = null;
        } else {
            this.Jd = ((View) callback).getContext().getAssets();
        }
    }

    public void pvs(vG vGVar) {
        this.NB = vGVar;
    }

    public void pvs(String str) {
        this.sUS = str;
    }

    public Typeface pvs(com.bytedance.adsdk.lottie.vG.vG vGVar) {
        this.pvs.pvs(vGVar.pvs(), vGVar.vG());
        Typeface typeface = this.icD.get(this.pvs);
        if (typeface != null) {
            return typeface;
        }
        Typeface pvs = pvs(icD(vGVar), vGVar.vG());
        this.icD.put(this.pvs, pvs);
        return pvs;
    }

    private Typeface icD(com.bytedance.adsdk.lottie.vG.vG vGVar) {
        Typeface typeface;
        String pvs = vGVar.pvs();
        Typeface typeface2 = this.vG.get(pvs);
        if (typeface2 != null) {
            return typeface2;
        }
        String vG = vGVar.vG();
        String icD = vGVar.icD();
        vG vGVar2 = this.NB;
        if (vGVar2 != null) {
            typeface = vGVar2.pvs(pvs, vG, icD);
            if (typeface == null) {
                typeface = this.NB.pvs(pvs);
            }
        } else {
            typeface = null;
        }
        vG vGVar3 = this.NB;
        if (vGVar3 != null && typeface == null) {
            String icD2 = vGVar3.icD(pvs, vG, icD);
            if (icD2 == null) {
                icD2 = this.NB.icD(pvs);
            }
            if (icD2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.Jd, icD2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (vGVar.Jd() != null) {
            return vGVar.Jd();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.Jd, "fonts/" + pvs + this.sUS);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.vG.put(pvs, typeface);
        return typeface;
    }

    private Typeface pvs(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
