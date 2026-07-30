package z7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends v7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f10168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, n nVar, int i7, int i8, int i9) {
        super(str, true);
        this.f10167e = i9;
        this.f10168f = nVar;
        this.f10169g = i7;
        this.f10170h = i8;
    }

    @Override // v7.a
    public final long a() {
        switch (this.f10167e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n nVar = this.f10168f;
                try {
                    nVar.B.u(this.f10169g, this.f10170h, true);
                    return -1L;
                } catch (IOException e9) {
                    nVar.b(2, 2, e9);
                    return -1L;
                }
            case 1:
                y yVar = this.f10168f.f10191p;
                int i7 = this.f10170h;
                yVar.getClass();
                r6.i.f("errorCode", i7);
                synchronized (this.f10168f) {
                    this.f10168f.D.remove(Integer.valueOf(this.f10169g));
                }
                return -1L;
            default:
                n nVar2 = this.f10168f;
                try {
                    int i8 = this.f10169g;
                    int i9 = this.f10170h;
                    r6.i.f("statusCode", i9);
                    nVar2.B.w(i8, i9);
                    return -1L;
                } catch (IOException e10) {
                    nVar2.b(2, 2, e10);
                    return -1L;
                }
        }
    }
}
