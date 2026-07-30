package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebBackForwardList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075k1 extends Lambda implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075k1(int i) {
        super(1);
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        int i = this.a;
        WebBackForwardList copyBackForwardList = aVar.copyBackForwardList();
        Intrinsics.checkNotNullExpressionValue(copyBackForwardList, "copyBackForwardList()");
        if (i < 0 || i >= copyBackForwardList.getSize()) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Invalid index to go in back forward list.", "message");
            b.a(A.INFO, "Invalid index to go in back forward list.");
        } else if (i == copyBackForwardList.getCurrentIndex()) {
            B b2 = B.b;
            b2.getClass();
            Intrinsics.checkNotNullParameter("Skip going to current item in back forward list.", "message");
            b2.a(A.INFO, "Skip going to current item in back forward list.");
        } else {
            aVar.goBackOrForward(i - copyBackForwardList.getCurrentIndex());
        }
        return Unit.INSTANCE;
    }
}
