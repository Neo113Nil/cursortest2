package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2872Yc implements InterfaceC3476kc {

    /* renamed from: a, reason: collision with root package name */
    public final C2753Rc f28836a;

    /* renamed from: b, reason: collision with root package name */
    public final C3320hg f28837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2889Zc f28838c;

    public C2872Yc(C2753Rc c2753Rc, C2889Zc c2889Zc, C3320hg c3320hg) {
        Objects.requireNonNull(c2889Zc);
        this.f28838c = c2889Zc;
        this.f28836a = c2753Rc;
        this.f28837b = c3320hg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3476kc
    public final void b(String str) {
        C3320hg c3320hg = this.f28837b;
        C2753Rc c2753Rc = this.f28836a;
        try {
            if (str == null) {
                c3320hg.b(new K2.m());
            } else {
                c3320hg.b(new K2.m(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c2753Rc.s();
            throw th;
        }
        c2753Rc.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3476kc
    public final void c(JSONObject jSONObject) {
        C2753Rc c2753Rc = this.f28836a;
        C3320hg c3320hg = this.f28837b;
        try {
            try {
                c3320hg.a(((InterfaceC2821Vc) this.f28838c.f28996c).c(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e6) {
                c3320hg.b(e6);
            }
        } finally {
            c2753Rc.s();
        }
    }
}
