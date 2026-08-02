package m;

import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106a extends C2.b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1106a f9944c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9945b;

    public C1106a(int i3) {
        switch (i3) {
            case 1:
                this.f9945b = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1107b());
                break;
            default:
                this.f9945b = new C1106a(1);
                break;
        }
    }
}
