package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcz implements jrw {
    private final jsb a;

    public gcz(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ConnectivityManager b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((jrk) this.a).b().getSystemService("connectivity");
        connectivityManager.getClass();
        return connectivityManager;
    }
}
