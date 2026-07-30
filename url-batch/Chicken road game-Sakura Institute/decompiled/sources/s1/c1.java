package s1;

import android.graphics.Matrix;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final c1 f8183h;

    /* renamed from: i, reason: collision with root package name */
    public static final c1 f8184i;

    /* renamed from: j, reason: collision with root package name */
    public static final c1 f8185j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8186g;

    static {
        int i7 = 2;
        f8183h = new c1(i7, 0);
        f8184i = new c1(i7, 1);
        f8185j = new c1(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i7, int i8) {
        super(i7);
        this.f8186g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f8186g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                }
                break;
            case 1:
                ((h1) obj).K((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return d6.z.f2639a;
    }
}
