package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class cc {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public dc a() {
        return new dc(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(ka... kaVarArr) {
        if (!this.a) {
            t8.k("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(kaVarArr.length);
        for (ka kaVar : kaVarArr) {
            arrayList.add(kaVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            t8.k("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            t8.k("At least one cipher suite is required");
        }
    }

    public void d(z50... z50VarArr) {
        if (!this.a) {
            t8.k("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(z50VarArr.length);
        for (z50 z50Var : z50VarArr) {
            arrayList.add(z50Var.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            t8.k("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            t8.k("At least one TLS version is required");
        }
    }
}
