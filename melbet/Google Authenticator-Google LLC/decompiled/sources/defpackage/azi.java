package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azi extends bai {
    @Override // defpackage.bai
    public final boolean equals(Object obj) {
        if (!(obj instanceof azi) || !(obj instanceof bai)) {
            return false;
        }
        a aVar = this.a;
        a aVar2 = ((bai) obj).a;
        char[] cArr = bmi.a;
        return iwo.b(aVar, aVar2);
    }
}
