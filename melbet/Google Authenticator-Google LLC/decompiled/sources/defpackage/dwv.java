package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwv {
    public final ehi b;
    private final Context h;
    public final iyh e = new iyh();
    public final hrz d = new hrz((byte[]) null);
    public final jiw a = new jiw();
    public final iyh f = new iyh();
    public final ilk c = new ilk();
    public final dja g = new dja();

    public /* synthetic */ dwv(Context context) {
        this.h = context;
        this.b = new ehi(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwv)) {
            return false;
        }
        dwv dwvVar = (dwv) obj;
        return ksp.b(this.e, dwvVar.e) && ksp.b(this.h, dwvVar.h);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "DiscScopeData(appStatelessRenderingObjects=" + this.e + ", context=" + this.h + ")";
    }
}
