package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class giz {
    public final Context a;
    public final fug b;
    public final hum c;
    public frv d;
    public final cfe e;
    private final jpt f;
    private final etd g;
    private final Map h;

    public giz(Context context, jpt jptVar, etd etdVar, fug fugVar, cfe cfeVar, Map map) {
        jptVar.getClass();
        etdVar.getClass();
        map.getClass();
        this.a = context;
        this.f = jptVar;
        this.g = etdVar;
        this.b = fugVar;
        this.e = cfeVar;
        this.h = map;
        this.c = new hum();
    }

    public final hvi a(etm etmVar, jjq jjqVar, String str, String str2) {
        String str3;
        if (jjqVar != null) {
            etd etdVar = this.g;
            Set set = (Set) this.h.get(etb.c(str2));
            if (set == null) {
                set = kpm.a;
            }
            str3 = str2;
            etdVar.i.k(jjqVar, set, str, str3, true, true);
        } else {
            str3 = str2;
        }
        return ((fym) this.f.b()).b(str3, etmVar);
    }
}
