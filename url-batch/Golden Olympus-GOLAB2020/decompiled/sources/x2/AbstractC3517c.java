package x2;

import t2.G;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3517c {

    /* renamed from: a, reason: collision with root package name */
    private static final G f46691a = new G("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final G f46692b = new G("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC3515a a(boolean z4) {
        return new C3516b(z4);
    }

    public static /* synthetic */ InterfaceC3515a b(boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return a(z4);
    }
}
