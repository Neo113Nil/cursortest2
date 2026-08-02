package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hoe {
    public final int a;
    public final hlr b;

    protected hoe(hlr hlrVar, int i) {
        if (hlrVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.Y(i, "invalid index: "));
        }
        this.a = i;
        this.b = hlrVar;
    }

    public abstract void a(hoi hoiVar, Object obj);
}
