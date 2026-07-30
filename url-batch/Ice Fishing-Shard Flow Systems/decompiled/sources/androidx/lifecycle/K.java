package androidx.lifecycle;

import android.os.Bundle;
import k0.InterfaceC0592c;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements InterfaceC0592c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3859b;

    public /* synthetic */ K(int i2, Object obj) {
        this.f3858a = i2;
        this.f3859b = obj;
    }

    @Override // k0.InterfaceC0592c
    public final Bundle a() {
        switch (this.f3858a) {
            case 0:
                return L.a((L) this.f3859b);
            default:
                return d.o.c((d.o) this.f3859b);
        }
    }
}
