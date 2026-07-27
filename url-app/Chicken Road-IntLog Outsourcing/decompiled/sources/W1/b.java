package W1;

import N1.q;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import h2.C0481b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements N1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3395b;

    public /* synthetic */ b(q qVar, int i2) {
        this.f3394a = i2;
        this.f3395b = qVar;
    }

    @Override // N1.d
    public final Object d(B.d dVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f3394a) {
            case 0:
                return new d((Context) dVar.a(Context.class), ((K1.g) dVar.a(K1.g.class)).d(), dVar.d(q.a(e.class)), dVar.e(C0481b.class), (Executor) dVar.f(this.f3395b));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3395b, dVar);
                return lambda$getComponents$0;
        }
    }
}
