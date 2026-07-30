package defpackage;

import com.facebook.appevents.AnalyticsUserIDStore;
import com.facebook.appevents.codeless.CodelessManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    public /* synthetic */ l6(String str, int i) {
        this.m = i;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        String str = this.n;
        switch (i) {
            case 0:
                AnalyticsUserIDStore.setUserID$lambda$1(str);
                break;
            default:
                CodelessManager.checkCodelessSession$lambda$1(str);
                break;
        }
    }
}
