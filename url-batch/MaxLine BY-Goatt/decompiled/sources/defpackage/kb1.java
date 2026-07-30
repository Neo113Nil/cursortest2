package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kb1 {
    public final jd2 a;
    public final x30 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public kb1(jd2 jd2Var, x30 x30Var) {
        this.a = jd2Var;
        this.b = x30Var;
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.c;
        jb1 jb1Var = (jb1) linkedHashMap.get(obj);
        int i2 = 12;
        if (jb1Var != null && jb1Var.c == i && Intrinsics.b(jb1Var.b, obj2)) {
            my myVar = jb1Var.d;
            if (myVar != null) {
                return myVar;
            }
            my myVar2 = new my(1403994769, new n8(i2, jb1Var.e, jb1Var), true);
            jb1Var.d = myVar2;
            return myVar2;
        }
        jb1 jb1Var2 = new jb1(this, i, obj, obj2);
        linkedHashMap.put(obj, jb1Var2);
        my myVar3 = jb1Var2.d;
        if (myVar3 != null) {
            return myVar3;
        }
        my myVar4 = new my(1403994769, new n8(i2, this, jb1Var2), true);
        jb1Var2.d = myVar4;
        return myVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        jb1 jb1Var = (jb1) this.c.get(obj);
        if (jb1Var != null) {
            return jb1Var.b;
        }
        mb1 mb1Var = (mb1) this.b.invoke();
        int a = mb1Var.a(obj);
        if (a != -1) {
            return mb1Var.e(a);
        }
        return null;
    }
}
