package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ike extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ike(Throwable th) {
        super("Internal error has occurred when executing ML Kit tasks", th);
        oy.as("Internal error has occurred when executing ML Kit tasks", "Provided message must not be empty.");
        this.a = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ike(String str, int i) {
        super(str);
        oy.as(str, "Provided message must not be empty.");
        this.a = i;
    }
}
