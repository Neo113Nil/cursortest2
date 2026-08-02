package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Gb implements InterfaceC0705j2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0785m4 f10312a;

    public Gb(C0785m4 c0785m4) {
        this.f10312a = c0785m4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0705j2
    public final C0624fo a(Cdo cdo, C0624fo c0624fo) {
        int i4 = cdo.f11710b;
        int i5 = this.f10312a.f12323a;
        if (i4 == i5) {
            if (((C0624fo) ((HashMap) cdo.f11709a.get(c0624fo.f11891b)).get(new String(c0624fo.f11890a))) != null) {
                ((HashMap) cdo.f11709a.get(c0624fo.f11891b)).put(new String(c0624fo.f11890a), c0624fo);
                return c0624fo;
            }
        } else if (i4 < i5) {
            ((HashMap) cdo.f11709a.get(c0624fo.f11891b)).put(new String(c0624fo.f11890a), c0624fo);
            cdo.f11710b++;
        }
        return c0624fo;
    }
}
