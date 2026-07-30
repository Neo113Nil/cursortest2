package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class fm0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ FirebaseMessaging n;
    public final /* synthetic */ kt2 o;

    public /* synthetic */ fm0(FirebaseMessaging firebaseMessaging, kt2 kt2Var, int i) {
        this.m = i;
        this.n = firebaseMessaging;
        this.o = kt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        kt2 kt2Var = this.o;
        FirebaseMessaging firebaseMessaging = this.n;
        switch (i) {
            case 0:
                firebaseMessaging.lambda$deleteToken$9(kt2Var);
                break;
            case 1:
                firebaseMessaging.lambda$getToken$7(kt2Var);
                break;
            default:
                firebaseMessaging.lambda$deleteToken$8(kt2Var);
                break;
        }
    }
}
