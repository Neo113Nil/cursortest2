package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhn {
    public final jit a;
    public final jgi b;
    public final List c;
    public final List d;
    public final jiu e;

    public jhn(jit jitVar, jgi jgiVar, List list, List list2, jiu jiuVar) {
        this.a = jitVar;
        this.b = jgiVar;
        this.c = list;
        this.d = list2;
        this.e = jiuVar;
    }

    public static /* synthetic */ jhn a(jhn jhnVar, jgi jgiVar, List list, jiu jiuVar, int i) {
        jit jitVar = (i & 1) != 0 ? jhnVar.a : null;
        if ((i & 2) != 0) {
            jgiVar = jhnVar.b;
        }
        jgi jgiVar2 = jgiVar;
        if ((i & 4) != 0) {
            list = jhnVar.c;
        }
        List list2 = list;
        List list3 = (i & 8) != 0 ? jhnVar.d : null;
        if ((i & 16) != 0) {
            jiuVar = jhnVar.e;
        }
        jitVar.getClass();
        jgiVar2.getClass();
        list2.getClass();
        list3.getClass();
        return new jhn(jitVar, jgiVar2, list2, list3, jiuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhn)) {
            return false;
        }
        jhn jhnVar = (jhn) obj;
        return ksp.b(this.a, jhnVar.a) && ksp.b(this.b, jhnVar.b) && ksp.b(this.c, jhnVar.c) && ksp.b(this.d, jhnVar.d) && ksp.b(this.e, jhnVar.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        jiu jiuVar = this.e;
        return (hashCode * 31) + (jiuVar == null ? 0 : jiuVar.hashCode());
    }

    public final String toString() {
        return "SelectedAccountData(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", greetingMessagePossibleTexts=" + this.c + ", myAccountButtonPossibleTexts=" + this.d + ", selectedAccountAvatarTap=" + this.e + ")";
    }
}
