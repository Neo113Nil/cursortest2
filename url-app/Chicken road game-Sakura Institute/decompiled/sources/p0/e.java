package p0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f6996h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f6997i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6998g;

    static {
        int i7 = 1;
        f6996h = new e(i7, 0);
        f6997i = new e(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f6998g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f6998g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
