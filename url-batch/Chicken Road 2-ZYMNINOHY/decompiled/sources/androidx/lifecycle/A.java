package androidx.lifecycle;

import android.os.Bundle;
import b.AbstractActivityC0253n;
import m1.InterfaceC1306d;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC1306d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5004b;

    public /* synthetic */ A(int i4, Object obj) {
        this.f5003a = i4;
        this.f5004b = obj;
    }

    @Override // m1.InterfaceC1306d
    public final Bundle a() {
        switch (this.f5003a) {
            case 0:
                return B.a((B) this.f5004b);
            default:
                return AbstractActivityC0253n.c((AbstractActivityC0253n) this.f5004b);
        }
    }
}
