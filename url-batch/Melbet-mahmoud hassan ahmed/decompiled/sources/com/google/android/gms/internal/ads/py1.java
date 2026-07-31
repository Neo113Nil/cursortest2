package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class py1 {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f10475a;

    /* renamed from: b, reason: collision with root package name */
    private final ot1 f10476b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10477c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List<oy1> f10478d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f10479e;

    py1(cy1 cy1Var, ot1 ot1Var) {
        this.f10475a = cy1Var;
        this.f10476b = ot1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List<f90> list) {
        qf0 qf0Var;
        String qf0Var2;
        synchronized (this.f10477c) {
            if (this.f10479e) {
                return;
            }
            for (f90 f90Var : list) {
                List<oy1> list2 = this.f10478d;
                String str = f90Var.f5045f;
                nt1 a7 = this.f10476b.a(str);
                if (a7 != null && (qf0Var = a7.f9311b) != null) {
                    qf0Var2 = qf0Var.toString();
                    String str2 = qf0Var2;
                    list2.add(new oy1(str, str2, f90Var.f5046g ? 1 : 0, f90Var.f5048i, f90Var.f5047h));
                }
                qf0Var2 = "";
                String str22 = qf0Var2;
                list2.add(new oy1(str, str22, f90Var.f5046g ? 1 : 0, f90Var.f5048i, f90Var.f5047h));
            }
            this.f10479e = true;
        }
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f10477c) {
            if (!this.f10479e) {
                if (!this.f10475a.s()) {
                    c();
                    return jSONArray;
                }
                d(this.f10475a.f());
            }
            Iterator<oy1> it = this.f10478d.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().a());
            }
            return jSONArray;
        }
    }

    public final void c() {
        this.f10475a.r(new ny1(this));
    }
}
