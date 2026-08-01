package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: AnimatorFactory.java */
/* loaded from: classes.dex */
public class vG {
    private static volatile vG pvs;

    private vG() {
    }

    public static vG pvs() {
        if (pvs == null) {
            synchronized (vG.class) {
                if (pvs == null) {
                    pvs = new vG();
                }
            }
        }
        return pvs;
    }

    public Jd pvs(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        if (pvsVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(pvsVar.Mxy())) {
            return new qh(view, pvsVar);
        }
        if ("translate".equals(pvsVar.Mxy())) {
            return new bNS(view, pvsVar);
        }
        if ("ripple".equals(pvsVar.Mxy())) {
            return new so(view, pvsVar);
        }
        if ("marquee".equals(pvsVar.Mxy())) {
            return new yiw(view, pvsVar);
        }
        if ("waggle".equals(pvsVar.Mxy())) {
            return new mnm(view, pvsVar);
        }
        if ("shine".equals(pvsVar.Mxy())) {
            return new kj(view, pvsVar);
        }
        if ("swing".equals(pvsVar.Mxy())) {
            return new IP(view, pvsVar);
        }
        if ("fade".equals(pvsVar.Mxy())) {
            return new pvs(view, pvsVar);
        }
        if ("rubIn".equals(pvsVar.Mxy())) {
            return new Wyp(view, pvsVar);
        }
        if ("rotate".equals(pvsVar.Mxy())) {
            return new Mxy(view, pvsVar);
        }
        if ("cutIn".equals(pvsVar.Mxy())) {
            return new sUS(view, pvsVar);
        }
        if ("stretch".equals(pvsVar.Mxy())) {
            return new Ju(view, pvsVar);
        }
        if ("bounce".equals(pvsVar.Mxy())) {
            return new NB(view, pvsVar);
        }
        return null;
    }
}
