package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.player.UnityPlayer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091o1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091o1(String str, int i, int i2, int i3, int i4) {
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
        com.onevcat.uniwebview.d container = new com.onevcat.uniwebview.d(activity, name, new C0065i());
        activity.addContentView(container.d, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        container.z.addView(container.w);
        container.z.addView(container.v, layoutParams);
        container.d.setBackgroundColor(0);
        container.d.setClipChildren(false);
        container.d.setClipToPadding(false);
        container.d.addView(container.y);
        container.d.addView(container.z);
        w3 w3Var = container.z;
        C0101r0 c0101r0 = container.u;
        w3Var.a(c0101r0.a, c0101r0.b, c0101r0.c, c0101r0.d);
        D3 d3 = container.y;
        C0101r0 c0101r02 = container.u;
        float f = c0101r02.a;
        float f2 = c0101r02.b;
        float f3 = c0101r02.c;
        float f4 = c0101r02.d;
        d3.getClass();
        float[] fArr = {RangesKt.coerceAtLeast(f, 0.0f), RangesKt.coerceAtLeast(f2, 0.0f), RangesKt.coerceAtLeast(f3, 0.0f), RangesKt.coerceAtLeast(f4, 0.0f)};
        if (!Arrays.equals(d3.b, fArr)) {
            d3.b = fArr;
            d3.invalidate();
        }
        C0055g c0055g = C0055g.b;
        c0055g.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        B b = B.b;
        b.a(A.DEBUG, AbstractC0045e.a("Adding web view container to manager: ", name, b, "message"));
        c0055g.a.put(name, container);
        if (O.e) {
            w3 frameLayout = container.z;
            Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            Intrinsics.checkNotNullParameter(activity, "activity");
            container.p = new C0030b(frameLayout, activity);
        }
        container.a(this.b, this.c, this.d, this.e);
        return Unit.INSTANCE;
    }
}
