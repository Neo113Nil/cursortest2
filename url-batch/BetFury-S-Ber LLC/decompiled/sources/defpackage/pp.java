package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pp implements Comparable {
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public pp(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        pp ppVar = (pp) obj;
        ppVar.getClass();
        int i = this.f - ppVar.f;
        return i == 0 ? this.g - ppVar.g : i;
    }
}
