package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class me {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public ne a() {
        return new ne(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(zb... zbVarArr) {
        if (!this.a) {
            s9.k("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(zbVarArr.length);
        for (zb zbVar : zbVarArr) {
            arrayList.add(zbVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            s9.k("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            s9.k("At least one cipher suite is required");
        }
    }

    public void d(ni0... ni0VarArr) {
        if (!this.a) {
            s9.k("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(ni0VarArr.length);
        for (ni0 ni0Var : ni0VarArr) {
            arrayList.add(ni0Var.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            s9.k("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            s9.k("At least one TLS version is required");
        }
    }
}
