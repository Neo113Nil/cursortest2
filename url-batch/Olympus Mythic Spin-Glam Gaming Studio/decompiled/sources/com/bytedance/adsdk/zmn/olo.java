package com.bytedance.adsdk.zmn;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public class olo {
    public static Object zmn(com.bytedance.adsdk.zmn.fs.zmn.zmn zmnVar) {
        iv zmn;
        if (zmnVar == null || (zmn = zmn(zmnVar.zmn())) == null) {
            return null;
        }
        return zmn.zmn(null, zmnVar.fs());
    }

    public static iv zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "toNumber":
                return new rt();
            case "toString":
                return new cn();
            case "formatDecimal":
                return new nps();
            case "modArray":
                return new rc();
            case "find":
                return new hhw();
            case "size":
                return new klz();
            case "includes":
                return new zg();
            case "chunk":
                return new zmn();
            case "exist":
                return new btk();
            case "split":
                return new mw();
            case "decodeUrl":
                return new fs();
            case "translate":
                return new cyb();
            case "encodeUrl":
                return new fb();
            case "isDigit":
                return new bvs();
            default:
                return null;
        }
    }
}
