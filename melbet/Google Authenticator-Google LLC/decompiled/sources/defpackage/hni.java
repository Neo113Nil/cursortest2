package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hni implements hmz {
    public final Level b;
    public final boolean c;
    public final Set d;
    public final hmh e;
    private volatile hnj g;
    public final String a = "";
    public final int f = 2;

    public hni(int i, Level level, boolean z, Set set, hmh hmhVar) {
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = hmhVar;
    }

    @Override // defpackage.hmz
    public final hlw a(String str) {
        hnj hnjVar;
        if (!this.c || !str.contains(".")) {
            return new hnk(str, 2, this.b, this.d, this.e);
        }
        hnj hnjVar2 = this.g;
        if (hnjVar2 != null) {
            return hnjVar2;
        }
        synchronized (this) {
            hnjVar = this.g;
            if (hnjVar == null) {
                hnj hnjVar3 = new hnj(null, 2, this.b, false, this.d, this.e);
                this.g = hnjVar3;
                hnjVar = hnjVar3;
            }
        }
        return hnjVar;
    }
}
