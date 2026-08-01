package a;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.lifecycle.G;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f909b;

    public /* synthetic */ f(int i, Object obj) {
        this.f908a = i;
        this.f909b = obj;
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f908a) {
            case 0:
                return p.c((AbstractActivityC0064v) this.f909b);
            default:
                return G.a((G) this.f909b);
        }
    }
}
