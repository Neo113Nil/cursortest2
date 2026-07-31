package com.startapp.sdk.internal;

import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ya {

    /* renamed from: a, reason: collision with root package name */
    public final l8 f508a;
    public ArrayList b;
    public String c = "";

    public ya(l8 l8Var) {
        this.f508a = l8Var;
    }

    public final void a(List3DActivity list3DActivity) {
        l8 l8Var = this.f508a;
        l8Var.f = list3DActivity;
        l8Var.e.clear();
        l8Var.g = 0;
        l8Var.h.clear();
        HashMap hashMap = l8Var.c;
        if (hashMap != null) {
            for (ff ffVar : hashMap.values()) {
                if (ffVar != null) {
                    ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            l8Var.c.clear();
        }
    }
}
