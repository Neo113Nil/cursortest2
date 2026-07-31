package j;

import androidx.datastore.preferences.protobuf.k0;
import java.util.concurrent.Executors;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179a extends k0 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0179a f2640f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2641e;

    public C0179a(int i2) {
        switch (i2) {
            case 1:
                this.f2641e = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0180b());
                break;
            default:
                this.f2641e = new C0179a(1);
                break;
        }
    }
}
