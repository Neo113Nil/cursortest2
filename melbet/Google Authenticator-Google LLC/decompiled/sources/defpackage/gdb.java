package defpackage;

import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdb implements jrw {
    private final jsb a;

    public gdb(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PowerManager b() {
        PowerManager powerManager = (PowerManager) ((jrk) this.a).b().getSystemService("power");
        powerManager.getClass();
        return powerManager;
    }
}
