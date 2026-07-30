package i;

import a.AbstractC0069a;
import java.util.concurrent.Executors;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174a extends AbstractC0069a {

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0174a f2344j;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2345i;

    public C0174a(int i2) {
        switch (i2) {
            case 1:
                this.f2345i = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2345i = new C0174a(1);
                break;
        }
    }
}
