package defpackage;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class gm0 implements FirebaseInstanceIdInternal.NewTokenListener, ev1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ FirebaseMessaging n;

    public /* synthetic */ gm0(FirebaseMessaging firebaseMessaging, int i) {
        this.m = i;
        this.n = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.n.lambda$new$1(str);
    }

    @Override // defpackage.ev1
    public void onSuccess(Object obj) {
        int i = this.m;
        FirebaseMessaging firebaseMessaging = this.n;
        switch (i) {
            case 1:
                firebaseMessaging.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
            default:
                firebaseMessaging.lambda$handleProxiedNotificationData$5((cv) obj);
                break;
        }
    }
}
