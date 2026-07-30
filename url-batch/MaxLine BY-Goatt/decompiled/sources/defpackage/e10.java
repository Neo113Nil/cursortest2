package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e10 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public f10 a() {
        return new f10(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(eu... euVarArr) {
        if (!this.a) {
            lh.e("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(euVarArr.length);
        for (eu euVar : euVarArr) {
            arrayList.add(euVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            lh.e("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            lh.e("At least one cipher suite is required");
        }
    }

    public void d(xx2... xx2VarArr) {
        if (!this.a) {
            lh.e("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(xx2VarArr.length);
        for (xx2 xx2Var : xx2VarArr) {
            arrayList.add(xx2Var.m);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            lh.e("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            lh.e("At least one TLS version is required");
        }
    }
}
