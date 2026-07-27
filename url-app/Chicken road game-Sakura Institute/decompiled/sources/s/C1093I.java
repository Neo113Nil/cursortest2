package s;

import android.content.Context;
import android.view.View;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import r0.AbstractC1065f;
import s0.Q;
import s0.S;
import s1.C1183B;
import u.C1215c;
import z.C1353h;
import z.C1356k;

/* renamed from: s.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093I extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1093I(int i2, Object obj) {
        super(0);
        this.f9897d = i2;
        this.f9898e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9897d) {
            case 0:
                break;
            case 1:
                W2.B.b(((Q) this.f9898e).f10110i, null);
                break;
            case 2:
                ((S) this.f9898e).f10133b = null;
                break;
            case 3:
                C1183B c1183b = (C1183B) this.f9898e;
                c1183b.getClass();
                Context context = c1183b.f10436a;
                Intrinsics.checkNotNullParameter(context, "context");
                s1.I navigatorProvider = c1183b.f10457v;
                Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
                break;
            case 4:
                break;
            case 5:
                ((C1215c) this.f9898e).f10889O.invoke(Boolean.valueOf(!r0.f10888N));
                break;
            case 6:
                ((n.o) this.f9898e).f8540a.setValue(n.l.f8538a);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case AbstractC1024c.f9242c /* 9 */:
                Object systemService = ((View) ((y.t) this.f9898e).f11494e).getContext().getSystemService("input_method");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                break;
            case 10:
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                C1353h c1353h = (C1353h) this.f9898e;
                c1353h.f11753I = null;
                AbstractC1065f.p(c1353h);
                AbstractC1065f.o(c1353h);
                AbstractC1065f.n(c1353h);
                break;
            default:
                C1356k c1356k = (C1356k) this.f9898e;
                c1356k.f11770E = null;
                AbstractC1065f.p(c1356k);
                AbstractC1065f.o(c1356k);
                AbstractC1065f.n(c1356k);
                break;
        }
        return Boolean.TRUE;
    }
}
