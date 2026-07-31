package com.onevcat.uniwebview;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class e2 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(String str, int i, int i2, int i3, int i4) {
        super(0);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        String name = this.a;
        s0 container = new s0(activity, name, new h(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        activity.addContentView(container.e, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        container.r.addView(container.q);
        container.r.addView(container.p, layoutParams2);
        container.e.addView(container.r, layoutParams);
        g gVar = g.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.DEBUG, d.a("Adding web view container to manager: ", name, oVar, "message"));
        gVar.a.put(name, container);
        if (a0.e) {
            b1 frameLayout = container.e;
            Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            Intrinsics.checkNotNullParameter(activity, "activity");
            container.o = new b(frameLayout, activity);
        }
        container.a(this.b, this.c, this.d, this.e);
        return Unit.INSTANCE;
    }
}
