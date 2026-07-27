package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Nb implements InterfaceC0967s2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0995t4 f7177a;

    public Nb(C0995t4 c0995t4) {
        this.f7177a = c0995t4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0967s2
    public final C0705ho a(C0653fo c0653fo, C0705ho c0705ho) {
        int i2 = c0653fo.f8210b;
        int i3 = this.f7177a.f9276a;
        if (i2 == i3) {
            if (((C0705ho) ((HashMap) c0653fo.f8209a.get(c0705ho.f8370b)).get(new String(c0705ho.f8369a))) != null) {
                ((HashMap) c0653fo.f8209a.get(c0705ho.f8370b)).put(new String(c0705ho.f8369a), c0705ho);
            }
        } else if (i2 < i3) {
            ((HashMap) c0653fo.f8209a.get(c0705ho.f8370b)).put(new String(c0705ho.f8369a), c0705ho);
            c0653fo.f8210b++;
        }
        return c0705ho;
    }
}
