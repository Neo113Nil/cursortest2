package l1;

import f1.AbstractC0121a;
import m1.C0244a;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0211d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0210c f3269a = new C0210c();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0208a f3270b;

    static {
        Integer num = AbstractC0121a.f2693a;
        f3270b = (num == null || num.intValue() >= 34) ? new C0244a() : new C0209b();
    }

    public abstract int a();

    public int b() {
        int a2;
        int i;
        do {
            a2 = a() >>> 1;
            i = a2 % 135;
        } while ((a2 - i) + 134 < 0);
        return 120 + i;
    }
}
