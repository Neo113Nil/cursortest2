package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final Mb f6029a;

    public G4() {
        this(C0876ua.k().l());
    }

    public static L4 a(E4 e4) {
        return new L4(new J4(e4), e4);
    }

    public G4(Mb mb) {
        this.f6029a = mb;
    }

    public final C0734on a(E4 e4, Em em) {
        C0734on c0734on = new C0734on(e4, new Ng(em));
        Mb mb = this.f6029a;
        synchronized (mb) {
            mb.f6330c.add(c0734on);
        }
        return c0734on;
    }
}
