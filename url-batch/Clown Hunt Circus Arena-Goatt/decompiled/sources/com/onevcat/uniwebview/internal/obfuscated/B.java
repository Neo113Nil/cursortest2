package com.onevcat.uniwebview.internal.obfuscated;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class B {
    public static final B b = new B();
    public int a;

    public B() {
        Intrinsics.checkNotNullParameter("UniWebView", "tag");
        this.a = 80;
    }

    public final void a(A a, String str) {
        if (a.a < this.a) {
            return;
        }
        if (a == A.CRITICAL) {
            Log.e("UniWebView", "<UniWebView-Android> " + a(str));
        } else if (a == A.WARNING) {
            Log.w("UniWebView", "<UniWebView-Android> " + a(str));
        } else {
            Log.d("UniWebView", "<UniWebView-Android> " + a(str));
        }
    }

    public final void a(A a, Function0 function0) {
        if (a.a < this.a) {
            return;
        }
        a(a, (String) function0.invoke());
    }

    public final void a(String format, String arg) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        A a = A.DEBUG;
        if (10 < this.a) {
            return;
        }
        a(a, StringsKt.replace$default(format, "%s", a(arg), false, 4, (Object) null));
    }

    public static void a(A level, String mark, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(message, "message");
        int ordinal = level.ordinal();
        if (ordinal == 3) {
            Log.w("UniWebView", mark + " <UniWebView-Web> " + a(message));
        } else if (ordinal != 4) {
            Log.d("UniWebView", mark + " <UniWebView-Web> " + a(message));
        } else {
            Log.e("UniWebView", mark + " <UniWebView-Web> " + a(message));
        }
    }

    public static String a(String str) {
        if (str.length() <= 5000) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 5000);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return sb.append(substring).append("...truncated").toString();
    }
}
