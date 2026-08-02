package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gda implements jrw {
    private final jsb a;

    public gda(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PackageManager b() {
        PackageManager packageManager = ((jrk) this.a).b().getPackageManager();
        packageManager.getClass();
        return packageManager;
    }
}
