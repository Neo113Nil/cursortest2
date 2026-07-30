package com.onevcat.uniwebview.internal.obfuscated;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class X0 extends Lambda implements Function1 {
    public static final X0 a = new X0();

    public X0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ViewParent parent = it.d.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(it.d);
        }
        it.b();
        ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.m = null;
        it.n = null;
        Iterator it2 = CollectionsKt.toList(it.o.keySet()).iterator();
        while (it2.hasNext()) {
            it.a(((Number) it2.next()).longValue());
        }
        C0030b c0030b = it.p;
        if (c0030b != null) {
            c0030b.a();
        }
        it.p = null;
        it.s = null;
        B b = B.b;
        String message = "Transparency mask cleared for " + it.b;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a2 = A.DEBUG;
        b.a(a2, message);
        it.t = null;
        it.z.removeView(it.v);
        it.v.destroy();
        it.z.removeAllViews();
        it.d.removeAllViews();
        C0055g c0055g = C0055g.b;
        String name = it.b;
        c0055g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String message2 = "Removing web view container from manager: " + name;
        Intrinsics.checkNotNullParameter(message2, "message");
        b.a(a2, message2);
        c0055g.a.remove(name);
        AbstractC0125x0.b();
        return Unit.INSTANCE;
    }
}
