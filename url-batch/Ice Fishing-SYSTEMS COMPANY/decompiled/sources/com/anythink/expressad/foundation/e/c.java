package com.anythink.expressad.foundation.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.internal.ads.CL;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19162a = "FailureReason";

    /* renamed from: b, reason: collision with root package name */
    private int f19163b;

    /* renamed from: c, reason: collision with root package name */
    private int f19164c;

    /* renamed from: d, reason: collision with root package name */
    private String f19165d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f19166e;

    /* renamed from: f, reason: collision with root package name */
    private d f19167f;

    /* renamed from: g, reason: collision with root package name */
    private String f19168g;

    /* renamed from: h, reason: collision with root package name */
    private String f19169h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private int f19170j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f19171k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f19172l;

    /* renamed from: m, reason: collision with root package name */
    private int f19173m;

    /* renamed from: n, reason: collision with root package name */
    private String f19174n;

    /* renamed from: o, reason: collision with root package name */
    private String f19175o;

    /* renamed from: p, reason: collision with root package name */
    private String f19176p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19177q;

    /* renamed from: r, reason: collision with root package name */
    private String f19178r;

    /* renamed from: s, reason: collision with root package name */
    private String f19179s;

    public c(int i) {
        this.f19163b = i;
        this.f19164c = b.b(i);
    }

    private void a(int i) {
        this.f19163b = i;
    }

    private String d(String str) {
        String e6 = AbstractC5051n.e(this.f19163b, " # ", new StringBuilder());
        int i = this.f19163b;
        if (i != -1) {
            e6 = b.a(i);
        }
        if (!TextUtils.isEmpty(this.f19165d)) {
            StringBuilder c4 = AbstractC5088e.c(e6, " # ");
            c4.append(this.f19165d);
            e6 = c4.toString();
        }
        Throwable th = this.f19166e;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                e6 = CL.k(e6, " # ", message);
            }
        }
        return !TextUtils.isEmpty(str) ? CL.k(e6, " # ", str) : e6;
    }

    private void e(String str) {
        this.f19168g = str;
    }

    private void f(String str) {
        this.f19169h = str;
    }

    private int g() {
        return this.f19163b;
    }

    private Throwable h() {
        return this.f19166e;
    }

    private String i() {
        return TextUtils.isEmpty(this.f19168g) ? "" : this.f19168g;
    }

    private String j() {
        return this.f19169h;
    }

    private String k() {
        if (this.f19172l == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Object, Object> entry : this.f19172l.entrySet()) {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
        return "";
    }

    private int l() {
        return this.f19173m;
    }

    private String m() {
        return this.f19174n;
    }

    private String n() {
        return this.f19175o;
    }

    private String o() {
        return this.f19176p;
    }

    private boolean p() {
        return this.f19177q;
    }

    private String q() {
        return this.f19178r;
    }

    private String r() {
        return this.f19179s;
    }

    public final d b() {
        return this.f19167f;
    }

    public final boolean c() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f19163b);
        sb.append(", errorSubType=");
        sb.append(this.f19164c);
        sb.append(", message='");
        sb.append(this.f19165d);
        sb.append("', cause=");
        sb.append(this.f19166e);
        sb.append(", campaign=");
        sb.append(this.f19167f);
        sb.append(", requestId='");
        sb.append(this.f19168g);
        sb.append("', localRequestId='");
        sb.append(this.f19169h);
        sb.append("', isHeaderBidding=");
        sb.append(this.i);
        sb.append(", typeD=");
        sb.append(this.f19170j);
        sb.append(", reasonD='");
        sb.append(this.f19171k);
        sb.append("', extraMap=");
        sb.append(this.f19172l);
        sb.append(", serverErrorCode=");
        sb.append(this.f19173m);
        sb.append(", errorUrl='");
        sb.append(this.f19174n);
        sb.append("', serverErrorResponse='");
        sb.append(this.f19175o);
        sb.append("', unitId='");
        sb.append(this.f19178r);
        sb.append("', placementId='");
        return AbstractC5051n.g(sb, this.f19179s, "'}");
    }

    private void b(int i) {
        this.f19164c = i;
    }

    private void c(int i) {
        this.f19170j = i;
    }

    private void g(String str) {
        this.f19171k = str;
    }

    private void h(String str) {
        this.f19174n = str;
    }

    private void j(String str) {
        this.f19176p = str;
    }

    public final String a() {
        int i;
        String str = !TextUtils.isEmpty(this.f19165d) ? this.f19165d : "";
        if (TextUtils.isEmpty(str) && (i = this.f19163b) != -1) {
            str = b.a(i);
        }
        Throwable th = this.f19166e;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? CL.k(str, " # ", message) : str;
    }

    public final int e() {
        return this.f19170j;
    }

    public final String f() {
        return this.f19171k;
    }

    private void b(boolean z8) {
        this.f19177q = z8;
    }

    public final void c(String str) {
        this.f19179s = str;
    }

    private void i(String str) {
        this.f19175o = str;
    }

    public final void b(String str) {
        this.f19178r = str;
    }

    public c(int i, String str) {
        this.f19163b = i;
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f19577M, str);
        }
        this.f19165d = str;
        this.f19164c = b.b(i);
    }

    public c(int i, int i4, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f19577M, str);
            this.f19165d = str;
        } else {
            this.f19165d = b.a(i4);
        }
        this.f19173m = i;
        this.f19164c = b.b(i4);
    }

    public final void a(String str) {
        this.f19165d = str;
    }

    private c(int i, Throwable th, d dVar) {
        this.f19163b = i;
        this.f19166e = th;
        this.f19167f = dVar;
        this.f19164c = b.b(i);
    }

    public final void a(Throwable th) {
        this.f19166e = th;
    }

    public final void a(d dVar) {
        this.f19167f = dVar;
    }

    public final void a(boolean z8) {
        this.i = z8;
    }

    private void a(Object obj, Object obj2) {
        if (this.f19172l == null) {
            this.f19172l = new HashMap<>();
        }
        this.f19172l.put(obj, obj2);
    }

    private c(int i, String str, Throwable th, d dVar) {
        this.f19163b = i;
        this.f19165d = str;
        this.f19166e = th;
        this.f19167f = dVar;
        this.f19164c = b.b(i);
    }

    private Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f19172l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f19172l.get(obj);
        }
        return null;
    }

    public final int d() {
        return this.f19164c;
    }

    private void d(int i) {
        this.f19173m = i;
    }
}
