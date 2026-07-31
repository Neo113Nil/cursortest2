package r0;

/* loaded from: classes.dex */
public final class q1 extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    public final int f20893f;

    public q1(int i7) {
        super(a(i7));
        this.f20893f = i7;
    }

    private static String a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
