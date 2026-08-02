package com.startapp.sdk.internal;

import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    public final a9 f7528a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7529b;

    /* renamed from: c, reason: collision with root package name */
    public String f7530c = "";

    public rb(a9 a9Var) {
        this.f7528a = a9Var;
    }

    public final void a(List3DActivity list3DActivity) {
        a9 a9Var = this.f7528a;
        a9Var.f6657f = list3DActivity;
        a9Var.f6656e.clear();
        a9Var.f6658g = 0;
        a9Var.f6659h.clear();
        HashMap hashMap = a9Var.f6654c;
        if (hashMap != null) {
            for (xf xfVar : hashMap.values()) {
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            a9Var.f6654c.clear();
        }
    }
}
