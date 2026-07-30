package e5;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2771c;

    public /* synthetic */ h(Object obj, int i7, Object obj2) {
        this.f2769a = i7;
        this.f2770b = obj;
        this.f2771c = obj2;
    }

    @Override // z5.b
    public final Object get() {
        switch (this.f2769a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = (i) this.f2770b;
                c cVar = (c) this.f2771c;
                return cVar.f2764e.b(new v(cVar, iVar));
            default:
                return new x((Context) this.f2770b, (String) this.f2771c);
        }
    }
}
