package m;

import android.view.View;
import android.widget.Magnifier;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 implements y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f6107b = new a1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f6108c = new a1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6109a;

    public /* synthetic */ a1(int i7) {
        this.f6109a = i7;
    }

    @Override // m.y0
    public final boolean a() {
        switch (this.f6109a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                return true;
        }
    }

    @Override // m.y0
    public final x0 b(View view, m2.b bVar) {
        switch (this.f6109a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new z0(new Magnifier(view));
            default:
                return new b1(new Magnifier(view));
        }
    }
}
