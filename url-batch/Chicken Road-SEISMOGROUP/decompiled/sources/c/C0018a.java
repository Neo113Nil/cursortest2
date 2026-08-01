package c;

import a.AbstractC0016a;
import java.util.concurrent.Executors;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018a extends AbstractC0016a {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0018a f516h;

    /* renamed from: g, reason: collision with root package name */
    public final Object f517g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018a(int i2) {
        super(16);
        switch (i2) {
            case 1:
                super(16);
                this.f517g = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0019b());
                break;
            default:
                this.f517g = new C0018a(1);
                break;
        }
    }
}
