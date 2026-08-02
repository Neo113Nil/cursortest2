package k;

import a.AbstractC0132a;
import java.util.concurrent.Executors;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251a extends AbstractC0132a {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0251a f3103k;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251a(int i2) {
        super(26);
        switch (i2) {
            case 1:
                super(26);
                this.f3104j = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0252b());
                break;
            default:
                this.f3104j = new C0251a(1);
                break;
        }
    }
}
