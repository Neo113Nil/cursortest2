package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ced {
    public static final ced a;
    public static final ced b;
    public static final ced c;
    public static final ced d;
    public static final ced e;
    public static final ced f;
    private static final SparseArray g;
    private static final /* synthetic */ ced[] h;

    static {
        ced cedVar = new ced("DEFAULT", 0);
        a = cedVar;
        ced cedVar2 = new ced("UNMETERED_ONLY", 1);
        b = cedVar2;
        ced cedVar3 = new ced("UNMETERED_OR_DAILY", 2);
        c = cedVar3;
        ced cedVar4 = new ced("FAST_IF_RADIO_AWAKE", 3);
        d = cedVar4;
        ced cedVar5 = new ced("NEVER", 4);
        e = cedVar5;
        ced cedVar6 = new ced("UNRECOGNIZED", 5);
        f = cedVar6;
        h = new ced[]{cedVar, cedVar2, cedVar3, cedVar4, cedVar5, cedVar6};
        SparseArray sparseArray = new SparseArray();
        g = sparseArray;
        sparseArray.put(0, cedVar);
        sparseArray.put(1, cedVar2);
        sparseArray.put(2, cedVar3);
        sparseArray.put(3, cedVar4);
        sparseArray.put(4, cedVar5);
        sparseArray.put(-1, cedVar6);
    }

    public static ced[] values() {
        return (ced[]) h.clone();
    }
}
