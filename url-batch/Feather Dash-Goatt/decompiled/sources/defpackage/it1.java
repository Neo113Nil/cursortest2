package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class it1 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public it1(a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract void a(fm fmVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.k) {
            this.c.k.remove(this);
        }
    }
}
