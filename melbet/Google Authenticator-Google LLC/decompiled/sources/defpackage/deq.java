package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deq extends Exception {
    public deq(Throwable th) {
        super("ContentProvider query failed", th);
    }

    public deq(String str) {
        super(str);
    }
}
