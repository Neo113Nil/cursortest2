package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zn {
    protected String btk;
    protected final fs fb;
    protected final nqi fs;
    protected final Activity zmn;
    protected String zn;

    public boolean btk() {
        return true;
    }

    public void bvs() {
    }

    public abstract List<nqi> cn();

    public void cyb() {
    }

    public boolean fb() {
        return false;
    }

    public void fs() {
    }

    public void fs(Activity activity) {
    }

    public abstract void fs(zg zgVar, int i);

    public void hhw() {
    }

    public abstract int iv();

    public abstract void kgc();

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.zn klz();

    public abstract void kw();

    public zg mw() {
        return null;
    }

    public void nps() {
    }

    public void olo() {
    }

    public zg rc() {
        return null;
    }

    public btk rt() {
        return null;
    }

    public abstract int zg();

    public void zmn() {
    }

    public void zmn(float f) {
    }

    public abstract void zmn(int i);

    public void zmn(int i, int i2) {
    }

    public void zmn(Activity activity) {
    }

    public void zmn(Bundle bundle) {
    }

    public void zmn(View view) {
    }

    public void zmn(View view, boolean z) {
    }

    public void zmn(zg zgVar) {
    }

    public void zmn(zg zgVar, fs.btk btkVar) {
    }

    public void zmn(zg zgVar, zg zgVar2, fs.btk btkVar) {
    }

    public void zmn(zg zgVar, boolean z) {
    }

    public void zmn(zg zgVar, boolean z, boolean z2, boolean z3, int i) {
    }

    public void zmn(zmn zmnVar, boolean z) {
    }

    public void zmn(Map<String, Object> map, zg zgVar, float f, float f2) {
    }

    public void zmn(boolean z) {
    }

    public abstract boolean zmn(zg zgVar, int i);

    public void zn() {
    }

    public zn(Activity activity, nqi nqiVar, fs fsVar) {
        this.zmn = activity;
        this.fs = nqiVar;
        if (nqiVar != null) {
            this.zn = am.uqh(nqiVar);
        }
        if (activity != null) {
            this.btk = String.valueOf(activity.hashCode());
        }
        this.fb = fsVar;
    }
}
