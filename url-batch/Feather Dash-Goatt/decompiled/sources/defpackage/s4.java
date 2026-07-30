package defpackage;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s4 implements os {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.os
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u4) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((v4) obj);
                break;
            case 2:
                ((vg0) obj2).f().f((nx) obj);
                break;
            case 3:
                ((j80) obj2).a.j((h80) obj);
                break;
            case 4:
                ((zf0) obj2).g.k(obj);
                break;
            default:
                kp1 kp1Var = (kp1) obj2;
                View view = (View) obj;
                int i2 = kp1Var.u - 1;
                kp1Var.u = i2;
                if (i2 == 0) {
                    int i3 = ln1.a;
                    hn1.a(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(kp1Var.v);
                    break;
                }
                break;
        }
    }
}
