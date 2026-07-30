package com.onevcat.uniwebview.internal.obfuscated;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class P2 extends Lambda implements Function0 {
    public final /* synthetic */ String[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(String[] strArr) {
        super(0);
        this.a = strArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = B3.D;
        List packages = ArraysKt.toList(this.a);
        Intrinsics.checkNotNullParameter(packages, "packages");
        ArrayList arrayList = B3.E;
        arrayList.clear();
        arrayList.addAll(packages);
        B b = B.b;
        String message = "Set preferred Custom Tabs browsers: " + arrayList;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.DEBUG, message);
        return Unit.INSTANCE;
    }
}
