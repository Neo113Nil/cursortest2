package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cod {
    public final cno a;
    public final cli b;

    public cod(cno cnoVar, cli cliVar) {
        this.a = cnoVar;
        this.b = cliVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cod) {
            cod codVar = (cod) obj;
            if (Objects.equals(this.a, codVar.a) && Objects.equals(this.b, codVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        oy.ax("key", this.a, arrayList);
        oy.ax("feature", this.b, arrayList);
        return oy.aw(arrayList, this);
    }
}
