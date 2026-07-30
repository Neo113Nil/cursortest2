package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.K;
import x0.InterfaceC5201b;

/* renamed from: androidx.activity.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0464f implements InterfaceC5201b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4561b;

    public /* synthetic */ C0464f(int i, Object obj) {
        this.f4560a = i;
        this.f4561b = obj;
    }

    @Override // x0.InterfaceC5201b
    public final Bundle a() {
        switch (this.f4560a) {
            case 0:
                return p.c((p) this.f4561b);
            default:
                return K.a((K) this.f4561b);
        }
    }
}
