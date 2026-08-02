package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kqh implements Serializable {
    private static final long serialVersionUID = 0;
    private final kqn[] a;

    public kqh(kqn[] kqnVarArr) {
        this.a = kqnVarArr;
    }

    private final Object readResolve() {
        kqn kqnVar = kqo.a;
        int i = 0;
        while (true) {
            kqn[] kqnVarArr = this.a;
            if (i >= kqnVarArr.length) {
                return kqnVar;
            }
            kqnVar = kqnVar.plus(kqnVarArr[i]);
            i++;
        }
    }
}
