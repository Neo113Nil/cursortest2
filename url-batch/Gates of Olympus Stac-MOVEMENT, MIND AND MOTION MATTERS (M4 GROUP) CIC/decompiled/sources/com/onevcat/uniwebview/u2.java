package com.onevcat.uniwebview;

import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class u2 extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar = t.b;
        String name = this.a;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        f5 f5Var = (f5) tVar.a.get(name);
        if (f5Var != null) {
            CustomTabsClient customTabsClient = f5Var.e;
            if (customTabsClient == null) {
                f5Var.h = true;
            } else {
                if (f5Var.f == null) {
                    f5Var.f = customTabsClient.newSession(new e5(f5Var));
                }
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(f5Var.f);
                Integer num = f5Var.g;
                if (num != null) {
                    builder.setToolbarColor(num.intValue());
                }
                builder.build().launchUrl(f5Var.a, Uri.parse(f5Var.c));
            }
        }
        return Unit.INSTANCE;
    }
}
