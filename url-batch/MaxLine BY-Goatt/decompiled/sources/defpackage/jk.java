package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jk {
    public static final jk m;
    public static final jk n;
    public static final jk o;
    public static final jk p;
    public static final /* synthetic */ jk[] q;

    static {
        jk jkVar = new jk("GEM", 0);
        m = jkVar;
        jk jkVar2 = new jk("MINERAL", 1);
        n = jkVar2;
        jk jkVar3 = new jk("FOSSIL", 2);
        o = jkVar3;
        jk jkVar4 = new jk("METAL", 3);
        p = jkVar4;
        q = new jk[]{jkVar, jkVar2, jkVar3, jkVar4};
    }

    public static jk valueOf(String str) {
        return (jk) Enum.valueOf(jk.class, str);
    }

    public static jk[] values() {
        return (jk[]) q.clone();
    }
}
