package com.onevcat.uniwebview;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {
    public static final o b = new o();
    public int a;

    public o() {
        Intrinsics.checkNotNullParameter("UniWebView", "tag");
        this.a = 80;
    }

    public final void a(n nVar, String str) {
        if (nVar.a < this.a) {
            return;
        }
        if (nVar == n.CRITICAL) {
            Log.e("UniWebView", "<UniWebView-Android> " + str);
        } else if (nVar == n.WARNING) {
            Log.w("UniWebView", "<UniWebView-Android> " + str);
        } else {
            Log.d("UniWebView", "<UniWebView-Android> " + str);
        }
    }

    public static void a(n level, String mark, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(message, "message");
        int ordinal = level.ordinal();
        if (ordinal == 3) {
            Log.w("UniWebView", mark + " <UniWebView-Web> " + message);
        } else if (ordinal != 4) {
            Log.d("UniWebView", mark + " <UniWebView-Web> " + message);
        } else {
            Log.e("UniWebView", mark + " <UniWebView-Web> " + message);
        }
    }
}
