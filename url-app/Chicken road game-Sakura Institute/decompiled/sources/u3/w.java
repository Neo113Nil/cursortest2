package u3;

import com.android.installreferrer.api.InstallReferrerClient;
import k.b0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final w f9032h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f9033i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f9034j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9035g;

    static {
        int i7 = 1;
        f9032h = new w(i7, 0);
        f9033i = new w(i7, 1);
        f9034j = new w(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i7, int i8) {
        super(i7);
        this.f9035g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9035g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((t3.h) obj).f8796k;
            case 1:
                return b0.a(l.e.l(700, 6, null));
            case 2:
                return b0.b(l.e.l(700, 6, null));
            default:
                t3.v vVar = ((t3.h) ((k.m) obj).c()).f8792g;
                r6.k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i7 = t3.v.f8856n;
                for (t3.v vVar2 : r4.a.E((h) vVar)) {
                }
                return null;
        }
    }
}
