package com.onevcat.uniwebview;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class t1 extends Lambda implements Function1 {
    public static final t1 a = new t1();

    public t1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ViewParent parent = it.e.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(it.e);
        }
        it.b();
        ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.m = null;
        it.n = null;
        it.p.destroy();
        g gVar = g.b;
        String name = it.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        o oVar = o.b;
        oVar.a(n.DEBUG, d.a("Removing web view container from manager: ", name, oVar, "message"));
        gVar.a.remove(name);
        u0.b();
        return Unit.INSTANCE;
    }
}
