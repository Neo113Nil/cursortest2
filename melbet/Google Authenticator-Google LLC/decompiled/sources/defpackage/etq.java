package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etq extends RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public etq(int i, String str, Throwable th) {
        super(r4, th);
        String valueOf;
        if (str != null) {
            valueOf = i + ": " + str;
        } else {
            valueOf = String.valueOf(i);
        }
        this.a = i;
    }
}
