package c;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: g, reason: collision with root package name */
    public static volatile a f59g;

    /* renamed from: f, reason: collision with root package name */
    public final Object f60f;

    public a(int i2) {
        switch (i2) {
            case 1:
                this.f60f = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f60f = new a(1);
                break;
        }
    }
}
