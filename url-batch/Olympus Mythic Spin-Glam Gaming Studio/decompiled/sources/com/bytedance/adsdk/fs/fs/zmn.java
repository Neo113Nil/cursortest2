package com.bytedance.adsdk.fs.fs;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.fs.zn;
import com.bytedance.adsdk.fs.zn.nps;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class zmn {
    private zn btk;
    private final AssetManager fb;
    private final nps<String> zmn = new nps<>();
    private final Map<nps<String>, Typeface> fs = new HashMap();
    private final Map<String, Typeface> zn = new HashMap();
    private String hhw = ".ttf";

    public zmn(Drawable.Callback callback, zn znVar) {
        this.btk = znVar;
        if (!(callback instanceof View)) {
            this.fb = null;
        } else {
            this.fb = ((View) callback).getContext().getAssets();
        }
    }

    public void zmn(zn znVar) {
        this.btk = znVar;
    }

    public void zmn(String str) {
        this.hhw = str;
    }

    public Typeface zmn(com.bytedance.adsdk.fs.zn.zn znVar) {
        this.zmn.zmn(znVar.zmn(), znVar.zn());
        Typeface typeface = this.fs.get(this.zmn);
        if (typeface != null) {
            return typeface;
        }
        Typeface zmn = zmn(fs(znVar), znVar.zn());
        this.fs.put(this.zmn, zmn);
        return zmn;
    }

    private Typeface fs(com.bytedance.adsdk.fs.zn.zn znVar) {
        Typeface typeface;
        String zmn = znVar.zmn();
        Typeface typeface2 = this.zn.get(zmn);
        if (typeface2 != null) {
            return typeface2;
        }
        String zn = znVar.zn();
        String fs = znVar.fs();
        zn znVar2 = this.btk;
        if (znVar2 != null) {
            typeface = znVar2.zmn(zmn, zn, fs);
            if (typeface == null) {
                typeface = this.btk.zmn(zmn);
            }
        } else {
            typeface = null;
        }
        zn znVar3 = this.btk;
        if (znVar3 != null && typeface == null) {
            String fs2 = znVar3.fs(zmn, zn, fs);
            if (fs2 == null) {
                fs2 = this.btk.fs(zmn);
            }
            if (fs2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.fb, fs2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (znVar.fb() != null) {
            return znVar.fb();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.fb, "fonts/" + zmn + this.hhw);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.zn.put(zmn, typeface);
        return typeface;
    }

    private Typeface zmn(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
