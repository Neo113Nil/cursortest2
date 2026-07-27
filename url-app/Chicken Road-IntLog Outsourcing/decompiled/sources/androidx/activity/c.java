package androidx.activity;

import a0.InterfaceC0174e;
import android.os.Bundle;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0174e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4047b;

    public /* synthetic */ c(int i2, Object obj) {
        this.f4046a = i2;
        this.f4047b = obj;
    }

    @Override // a0.InterfaceC0174e
    public final Bundle a() {
        switch (this.f4046a) {
            case 0:
                return l.b((l) this.f4047b);
            default:
                return J.a((J) this.f4047b);
        }
    }
}
