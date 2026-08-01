package a;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.lifecycle.G;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f910b;

    public /* synthetic */ f(int i, Object obj) {
        this.f909a = i;
        this.f910b = obj;
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f909a) {
            case 0:
                return p.c((AbstractActivityC0064v) this.f910b);
            default:
                return G.a((G) this.f910b);
        }
    }
}
