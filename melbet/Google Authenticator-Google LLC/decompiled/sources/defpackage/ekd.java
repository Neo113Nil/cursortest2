package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekd {
    public static final ekd a = new ekd(new ekg[0]);
    public final ekg[] b;
    public final int[] c;

    public ekd(ekg[] ekgVarArr) {
        this.b = ekgVarArr;
        this.c = new int[ekgVarArr.length];
        for (int i = 0; i < ekgVarArr.length; i++) {
            this.c[i] = ekgVarArr[i].c;
        }
    }
}
