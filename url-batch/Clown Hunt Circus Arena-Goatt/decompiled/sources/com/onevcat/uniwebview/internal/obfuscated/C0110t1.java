package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110t1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0110t1(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        String str = this.a;
        String str2 = this.b;
        aVar.getClass();
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("UniWebView will load HTML string with base url: ", str2, b, "message"));
        String message = "Input HTML content: \n" + str;
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.VERBOSE, message);
        com.onevcat.uniwebview.c cVar = aVar.e;
        cVar.f = 200;
        cVar.d = true;
        cVar.c = false;
        cVar.e = false;
        if (str != null) {
            aVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        } else {
            aVar.loadDataWithBaseURL(str2, "", "text/html", "UTF-8", null);
        }
        return Unit.INSTANCE;
    }
}
