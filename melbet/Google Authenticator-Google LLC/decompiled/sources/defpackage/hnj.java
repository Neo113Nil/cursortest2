package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hnj extends hmx {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final hmh d;
    private final int e;

    public hnj(String str, int i, Level level, boolean z, Set set, hmh hmhVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = hmhVar;
    }

    @Override // defpackage.hlw
    public final void b(hlu hluVar) {
        String str = (String) hluVar.k().d(hlo.a);
        if (str == null) {
            str = d();
        }
        if (str == null) {
            str = hluVar.f().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String e = hnu.e(str);
        Level o = hluVar.o();
        if (!this.b) {
            int d = hnu.d(o);
            if (!Log.isLoggable(e, d) && !Log.isLoggable("all", d)) {
                return;
            }
        }
        hnk.e(hluVar, e, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        return true;
    }
}
