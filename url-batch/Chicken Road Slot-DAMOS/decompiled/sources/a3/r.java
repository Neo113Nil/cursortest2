package a3;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f259e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f260i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.m f261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, Function1 function1, h0 h0Var, a1.m mVar, int i3, View view) {
        super(0);
        this.f258d = context;
        this.f259e = function1;
        this.f260i = h0Var;
        this.f261r = mVar;
        this.f262s = i3;
        this.f263t = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view = this.f263t;
        view.getClass();
        return new e0(this.f258d, this.f259e, this.f260i, this.f261r, this.f262s, (d2.v) view).getLayoutNode();
    }
}
