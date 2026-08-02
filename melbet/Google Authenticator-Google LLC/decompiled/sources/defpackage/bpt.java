package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpt {
    public static final /* synthetic */ int a = 0;
    private static final hfm b = hfm.p("totp", "hotp");

    public static void a(String str) {
        if (!b.contains(str)) {
            throw new bps("Cannot validate otp type");
        }
    }
}
