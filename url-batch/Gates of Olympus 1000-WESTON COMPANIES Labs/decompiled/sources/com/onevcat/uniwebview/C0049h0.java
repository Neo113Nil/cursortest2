package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0049h0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049h0(String str, boolean z) {
        super(0);
        this.a = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0036d c0036d = C0036d.b;
        String name = this.a;
        c0036d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        A a = (A) c0036d.a.get(name);
        if (a != null) {
            a.i = this.b;
        }
        return Unit.INSTANCE;
    }
}
