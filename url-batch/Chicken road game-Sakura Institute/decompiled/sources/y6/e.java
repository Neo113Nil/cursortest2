package y6;

import com.android.installreferrer.api.InstallReferrerClient;
import i.z;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9906a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r6.l f9907b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9908c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(q6.a aVar, q6.c cVar) {
        r6.k.f(cVar, "getNextValue");
        this.f9907b = (r6.l) aVar;
        this.f9908c = cVar;
    }

    @Override // y6.f
    public final Iterator iterator() {
        switch (this.f9906a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new z(this);
            default:
                return new z6.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, q6.e eVar) {
        r6.k.f(charSequence, "input");
        this.f9908c = charSequence;
        this.f9907b = (r6.l) eVar;
    }
}
