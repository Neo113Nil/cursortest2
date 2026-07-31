package com.onevcat.uniwebview;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0060l {
    public static final C0060l b = new C0060l();
    public int a;

    public C0060l() {
        Intrinsics.checkNotNullParameter("UniWebView", "tag");
        this.a = 80;
    }

    public final void a(EnumC0057k enumC0057k, String str) {
        if (enumC0057k.a < this.a) {
            return;
        }
        if (enumC0057k == EnumC0057k.CRITICAL) {
            Log.e("UniWebView", "<UniWebView-Android> " + str);
        } else if (enumC0057k == EnumC0057k.WARNING) {
            Log.w("UniWebView", "<UniWebView-Android> " + str);
        } else {
            Log.d("UniWebView", "<UniWebView-Android> " + str);
        }
    }

    public static void a(EnumC0057k level, String mark, String message) {
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
