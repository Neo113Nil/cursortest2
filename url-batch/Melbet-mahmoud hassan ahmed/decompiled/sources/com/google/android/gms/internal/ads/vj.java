package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public class vj {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13415a;

    /* renamed from: c, reason: collision with root package name */
    public final List f13417c;

    /* renamed from: e, reason: collision with root package name */
    public final e73<xm> f13419e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final List f13420f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13421g;

    /* renamed from: b, reason: collision with root package name */
    public final String f13416b = null;

    /* renamed from: d, reason: collision with root package name */
    public final String f13418d = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ vj(Uri uri, String str, pd pdVar, f3 f3Var, List list, String str2, e73 e73Var, Object obj, ui uiVar) {
        this.f13415a = uri;
        this.f13417c = list;
        this.f13419e = e73Var;
        b73 q7 = e73.q();
        if (e73Var.size() > 0) {
            throw null;
        }
        this.f13420f = q7.g();
        this.f13421g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return this.f13415a.equals(vjVar.f13415a) && n13.p(null, null) && n13.p(null, null) && n13.p(null, null) && this.f13417c.equals(vjVar.f13417c) && n13.p(null, null) && this.f13419e.equals(vjVar.f13419e) && n13.p(null, null);
    }

    public final int hashCode() {
        return ((((this.f13415a.hashCode() * 923521) + this.f13417c.hashCode()) * 961) + this.f13419e.hashCode()) * 31;
    }
}
