package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.u0;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f1194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i7) {
        super(0);
        this.f1193g = i7;
        this.f1194h = oVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f1193g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o oVar = this.f1194h;
                return new u0(oVar.getApplication(), oVar, oVar.getIntent() != null ? oVar.getIntent().getExtras() : null);
            case 1:
                this.f1194h.reportFullyDrawn();
                return d6.z.f2639a;
            case 2:
                o oVar2 = this.f1194h;
                return new x(oVar2.f1200k, new n(oVar2, 1));
            default:
                o oVar3 = this.f1194h;
                i0 i0Var = new i0(new d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (r6.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        oVar3.f8494f.a(new g(i0Var, oVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new androidx.room.b0(oVar3, 1, i0Var));
                    }
                }
                return i0Var;
        }
    }
}
