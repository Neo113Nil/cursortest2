package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ew, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3173ew implements InterfaceC3336hw {

    /* renamed from: e, reason: collision with root package name */
    public static final C3173ew f30553e = new C3173ew(new C3388iw());

    /* renamed from: a, reason: collision with root package name */
    public boolean f30554a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30555b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30556c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30557d;

    public C3173ew(C3388iw c3388iw) {
        this.f30557d = c3388iw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3336hw
    public void b(boolean z8) {
        if (!this.f30555b && z8) {
            Date date = new Date();
            Date date2 = (Date) this.f30556c;
            if (date2 == null || date.after(date2)) {
                this.f30556c = date;
                if (this.f30554a) {
                    Iterator it = Collections.unmodifiableCollection(C3282gw.f31116c.f31118b).iterator();
                    while (it.hasNext()) {
                        AbstractC3712ow abstractC3712ow = ((Wv) it.next()).f28529d;
                        Date date3 = (Date) this.f30556c;
                        abstractC3712ow.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f30555b = z8;
    }

    public C3173ew(C4017ue c4017ue, C2478Aq c2478Aq, C3870rt c3870rt) {
        this.f30554a = false;
        this.f30555b = false;
        this.f30556c = c3870rt;
        J3.a C7 = ((C3761pr) c2478Aq.f23905u).C(c3870rt.f34131b, c3870rt.f34130a, null);
        C2889Zc c2889Zc = new C2889Zc(this, c2478Aq, c4017ue, c3870rt, 5);
        SD sd = c3870rt.f34134e;
        this.f30557d = C3686oN.v(C3686oN.y(C7, c2889Zc, sd), Exception.class, new C3907sc(this, c2478Aq), sd);
    }
}
