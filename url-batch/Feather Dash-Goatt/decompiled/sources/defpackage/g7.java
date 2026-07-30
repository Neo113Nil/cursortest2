package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g7 extends pc0 implements Function0 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ fl g;
    public final /* synthetic */ t51 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(Context context, Function1 function1, fl flVar, t51 t51Var, int i, View view) {
        super(0);
        this.d = context;
        this.e = function1;
        this.g = flVar;
        this.h = t51Var;
        this.i = i;
        this.j = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.j;
        callback.getClass();
        return new pn1(this.d, this.e, this.g, this.h, this.i, (eu0) callback).getLayoutNode();
    }
}
