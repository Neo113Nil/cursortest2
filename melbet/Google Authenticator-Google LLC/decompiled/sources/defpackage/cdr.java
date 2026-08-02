package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdr {
    public static final cdr a;
    public static final cdr b;
    private static final SparseArray c;
    private static final /* synthetic */ cdr[] d;

    static {
        cdr cdrVar = new cdr("NOT_SET", 0);
        a = cdrVar;
        cdr cdrVar2 = new cdr("EVENT_OVERRIDE", 1);
        b = cdrVar2;
        d = new cdr[]{cdrVar, cdrVar2};
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        sparseArray.put(0, cdrVar);
        sparseArray.put(5, cdrVar2);
    }

    public static cdr[] values() {
        return (cdr[]) d.clone();
    }
}
