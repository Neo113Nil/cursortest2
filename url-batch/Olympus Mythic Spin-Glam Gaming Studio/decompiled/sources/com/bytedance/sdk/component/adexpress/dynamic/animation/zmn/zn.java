package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public class zn {
    private static volatile zn zmn;

    private zn() {
    }

    public static zn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public fb zmn(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        if (zmnVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(zmnVar.bvs())) {
            return new rc(view, zmnVar);
        }
        if ("translate".equals(zmnVar.bvs())) {
            return new cn(view, zmnVar);
        }
        if ("ripple".equals(zmnVar.bvs())) {
            return new zg(view, zmnVar);
        }
        if ("marquee".equals(zmnVar.bvs())) {
            return new nps(view, zmnVar);
        }
        if ("waggle".equals(zmnVar.bvs())) {
            return new cyb(view, zmnVar);
        }
        if ("shine".equals(zmnVar.bvs())) {
            return new klz(view, zmnVar);
        }
        if ("swing".equals(zmnVar.bvs())) {
            return new rt(view, zmnVar);
        }
        if ("fade".equals(zmnVar.bvs())) {
            return new zmn(view, zmnVar);
        }
        if ("rubIn".equals(zmnVar.bvs())) {
            return new iv(view, zmnVar);
        }
        if ("rotate".equals(zmnVar.bvs())) {
            return new bvs(view, zmnVar);
        }
        if ("cutIn".equals(zmnVar.bvs())) {
            return new hhw(view, zmnVar);
        }
        if ("stretch".equals(zmnVar.bvs())) {
            return new mw(view, zmnVar);
        }
        if ("bounce".equals(zmnVar.bvs())) {
            return new btk(view, zmnVar);
        }
        return null;
    }
}
