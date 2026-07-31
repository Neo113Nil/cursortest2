package H1;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import y1.C0759c;
import y1.C0760d;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements p1.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.o f993g;

    public /* synthetic */ t(p1.o oVar, int i7) {
        this.f992f = i7;
        this.f993g = oVar;
    }

    @Override // p1.c
    public final Object b(A.e eVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f992f) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f993g, eVar);
                return lambda$getComponents$0;
            default:
                return new C0759c((Context) eVar.a(Context.class), ((m1.g) eVar.a(m1.g.class)).d(), eVar.b(p1.o.a(C0760d.class)), eVar.c(J1.b.class), (Executor) eVar.e(this.f993g));
        }
    }
}
