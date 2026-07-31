package com.onevcat.uniwebview;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0073p0 extends Lambda implements Function1 {
    public static final C0073p0 a = new C0073p0();

    public C0073p0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
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
        C0039e c0039e = C0039e.b;
        String name = it.b;
        c0039e.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0060l c0060l = C0060l.b;
        c0060l.a(EnumC0057k.DEBUG, AbstractC0075q.a("Removing web view container from manager: ", name, c0060l, "message"));
        c0039e.a.remove(name);
        P.b();
        return Unit.INSTANCE;
    }
}
