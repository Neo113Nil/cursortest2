package s1;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8338g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f8339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i7) {
        super(0);
        this.f8338g = i7;
        this.f8339h = rVar;
    }

    @Override // q6.a
    public final Object a() {
        int actionMasked;
        l lVar;
        switch (this.f8338g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = this.f8339h;
                MotionEvent motionEvent = rVar.f8388r0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    rVar.f8390s0 = SystemClock.uptimeMillis();
                    rVar.post(rVar.f8396v0);
                }
                return d6.z.f2639a;
            default:
                lVar = this.f8339h.get_viewTreeOwners();
                return lVar;
        }
    }
}
