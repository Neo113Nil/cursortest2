package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gc {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public hc a() {
        return new hc(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(na... naVarArr) {
        if (!this.a) {
            o8.j("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(naVarArr.length);
        for (na naVar : naVarArr) {
            arrayList.add(naVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            o8.j("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            o8.j("At least one cipher suite is required");
        }
    }

    public void d(h60... h60VarArr) {
        if (!this.a) {
            o8.j("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(h60VarArr.length);
        for (h60 h60Var : h60VarArr) {
            arrayList.add(h60Var.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            o8.j("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            o8.j("At least one TLS version is required");
        }
    }
}
