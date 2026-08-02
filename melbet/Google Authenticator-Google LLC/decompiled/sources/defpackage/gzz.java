package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzz {
    public final gyv a;
    public final boolean b;
    public final gzy c;

    public gzz(gzy gzyVar, boolean z, gyv gyvVar) {
        this.c = gzyVar;
        this.b = z;
        this.a = gyvVar;
    }

    public static gzz b(char c) {
        return new gzz(new gzu(new gyn(c), 1));
    }

    public static gzz f() {
        gzi gziVar = new gzi(Pattern.compile(":"));
        hoq.C(!((Matcher) gziVar.a("").a).matches(), "The pattern may not match the empty string: %s", gziVar);
        return new gzz(new gzu(gziVar, 0));
    }

    public final gzz a() {
        return new gzz(this.c, true, this.a);
    }

    public final Iterable c(CharSequence charSequence) {
        charSequence.getClass();
        return new gzx(this, charSequence);
    }

    public final Iterator d(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator d = d(charSequence);
        ArrayList arrayList = new ArrayList();
        while (d.hasNext()) {
            arrayList.add((String) d.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public gzz(gzy gzyVar) {
        this(gzyVar, false, gys.a);
    }
}
