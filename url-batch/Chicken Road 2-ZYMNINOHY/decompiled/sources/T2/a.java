package T2;

import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.p;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2956b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2955a = i4;
        this.f2956b = obj;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f2955a) {
            case 0:
                return Integer.valueOf(((AtomicInteger) this.f2956b).get());
            case 1:
                return ((com.startapp.sdk.components.a) this.f2956b).e();
            default:
                return ((p) this.f2956b).a();
        }
    }
}
