package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bep implements ben {
    int a;
    public Bitmap.Config b;
    private final beq c;

    public bep(beq beqVar) {
        this.c = beqVar;
    }

    @Override // defpackage.ben
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bep) {
            bep bepVar = (bep) obj;
            if (this.a == bepVar.a) {
                Bitmap.Config config = this.b;
                Bitmap.Config config2 = bepVar.b;
                char[] cArr = bmi.a;
                if (iwo.b(config, config2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return ber.a(this.a, this.b);
    }
}
