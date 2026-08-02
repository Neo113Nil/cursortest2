package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igj {
    public static final igj a;
    public static final igj b;
    public static final igj c;
    public static final igj d;
    public static final igj e;
    private static final /* synthetic */ igj[] f;

    static {
        igj igjVar = new igj("NO_USER_DATA", 0);
        a = igjVar;
        igj igjVar2 = new igj("SERVER_KNOWN_USER_DATA", 1);
        b = igjVar2;
        igj igjVar3 = new igj("NON_TEXTUAL_INTERACTION_USER_DATA", 2);
        c = igjVar3;
        igj igjVar4 = new igj("CONFIRMED_UPLOAD_SAFE_USER_DATA", 3);
        d = igjVar4;
        igj igjVar5 = new igj("NEW_COLLECTION_USER_DATA", 4);
        e = igjVar5;
        f = new igj[]{igjVar, igjVar2, igjVar3, igjVar4, igjVar5};
    }

    public static igj[] values() {
        return (igj[]) f.clone();
    }
}
