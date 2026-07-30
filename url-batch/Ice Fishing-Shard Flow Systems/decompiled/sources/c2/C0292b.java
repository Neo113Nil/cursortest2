package c2;

import D6.z;
import S1.r;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0292b implements S1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f4177e;

    public /* synthetic */ C0292b(r rVar, int i2) {
        this.f4176d = i2;
        this.f4177e = rVar;
    }

    @Override // S1.e
    public final Object c(z zVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f4176d) {
            case 0:
                return new d((Context) zVar.a(Context.class), ((P1.g) zVar.a(P1.g.class)).g(), zVar.b(r.a(e.class)), zVar.e(l2.b.class), (Executor) zVar.d(this.f4177e));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f4177e, zVar);
                return lambda$getComponents$0;
        }
    }
}
