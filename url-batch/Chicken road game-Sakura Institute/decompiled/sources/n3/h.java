package n3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6534b;

    public /* synthetic */ h(k kVar, int i7) {
        this.f6533a = i7;
        this.f6534b = kVar;
    }

    public final void a(Object obj) {
        switch (this.f6533a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f6534b.c(false);
                break;
            case 1:
                if (((Integer) obj).intValue() == 80) {
                    this.f6534b.e(false);
                    break;
                }
                break;
            case 2:
                boolean z8 = ((s2.c) obj).f8495a;
                this.f6534b.f(false);
                break;
            default:
                boolean z9 = ((s2.p) obj).f8520a;
                this.f6534b.i(false);
                break;
        }
    }
}
