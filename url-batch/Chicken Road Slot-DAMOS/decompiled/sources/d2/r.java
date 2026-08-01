package d2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends wd.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final r f3515e;

    /* renamed from: i, reason: collision with root package name */
    public static final r f3516i;

    /* renamed from: r, reason: collision with root package name */
    public static final r f3517r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f3518s;

    /* renamed from: t, reason: collision with root package name */
    public static final r f3519t;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3520d;

    static {
        int i3 = 1;
        f3515e = new r(i3, 0);
        f3516i = new r(i3, 1);
        f3517r = new r(i3, 2);
        f3518s = new r(i3, 3);
        f3519t = new r(i3, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i10) {
        super(i3);
        this.f3520d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3520d) {
            case 0:
                return Boolean.TRUE;
            case 1:
                j2.j k10 = ((j2.m) obj).k();
                return Boolean.valueOf(k10.f4975d.c(j2.q.f5016z));
            case 2:
                x0.h hVar = (x0.h) obj;
                n0.v vVar = AndroidCompositionLocals_androidKt.f464a;
                hVar.getClass();
                n0.h.s(hVar, vVar);
                return ((Context) n0.h.s(hVar, AndroidCompositionLocals_androidKt.f465b)).getResources();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(h0.e(obj));
            default:
                if (obj == null) {
                    return Unit.f5554a;
                }
                kotlin.collections.i0.j();
                return null;
        }
    }
}
