package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyz {
    public final List a;
    public final jwt b;
    public final Object[][] c;

    public jyz(List list, jwt jwtVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        jwtVar.getClass();
        this.b = jwtVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("addrs", this.a);
        T.b("attrs", this.b);
        T.b("customOptions", Arrays.deepToString(this.c));
        return T.toString();
    }
}
