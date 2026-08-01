package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cd {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public dd a() {
        return new dd(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(db... dbVarArr) {
        if (!this.a) {
            g9.i("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(dbVarArr.length);
        for (db dbVar : dbVarArr) {
            arrayList.add(dbVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            g9.i("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            g9.i("At least one cipher suite is required");
        }
    }

    public void d(j90... j90VarArr) {
        if (!this.a) {
            g9.i("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(j90VarArr.length);
        for (j90 j90Var : j90VarArr) {
            arrayList.add(j90Var.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            g9.i("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            g9.i("At least one TLS version is required");
        }
    }
}
