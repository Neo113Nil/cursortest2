package i3;

import androidx.lifecycle.r0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import f8.w;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4897h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i7) {
        super(0);
        this.f4896g = i7;
        this.f4897h = fVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4896g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r0 r0Var = this.f4897h.f4902c;
                w wVar = (w) r0Var.a();
                if (g8.c.a(wVar) != -1) {
                    return j4.i.m(wVar.f3646f.C(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + r0Var + ", instead got " + wVar).toString());
            default:
                j4.i iVar = f.f4899f;
                f fVar = this.f4897h;
                synchronized (iVar) {
                    f.f4898e.remove(((w) fVar.f4903d.getValue()).f3646f.C());
                }
                return z.f2639a;
        }
    }
}
