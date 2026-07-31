package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class E0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0093w c0093w = it.p;
        String str3 = this.a;
        String str4 = this.b;
        c0093w.getClass();
        C0060l c0060l = C0060l.b;
        c0060l.a(EnumC0057k.INFO, AbstractC0075q.a("UniWebView will load HTML string with base url: ", str4, c0060l, "message"));
        String message = "Input HTML content: \n" + str3;
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.VERBOSE, message);
        J j = c0093w.e;
        j.f = 200;
        j.d = true;
        j.c = false;
        j.e = false;
        if (str3 != null) {
            str = "UTF-8";
            str2 = null;
        } else {
            str = "UTF-8";
            str2 = null;
            str3 = "";
        }
        c0093w.loadDataWithBaseURL(str4, str3, "text/html", str, str2);
        return Unit.INSTANCE;
    }
}
