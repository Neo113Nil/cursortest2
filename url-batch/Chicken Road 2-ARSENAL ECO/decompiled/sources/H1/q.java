package H1;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements k1.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f983g;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging, int i7) {
        this.f982f = i7;
        this.f983g = firebaseMessaging;
    }

    @Override // k1.e
    public final void b(Object obj) {
        boolean z5;
        switch (this.f982f) {
            case 0:
                H h7 = (H) obj;
                if (!this.f983g.f3905e.c() || h7.f909h.a() == null) {
                    return;
                }
                synchronized (h7) {
                    z5 = h7.f908g;
                }
                if (z5) {
                    return;
                }
                h7.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f983g;
                Q0.a aVar = (Q0.a) obj;
                D3.M m4 = FirebaseMessaging.f3898k;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    A3.c.S(aVar.f1962f);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
