package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmi extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public jmi() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final jld a() {
        return new jld(getMessage());
    }
}
