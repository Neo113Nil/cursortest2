package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class hb {
    public final PackageManager a;
    public final Function0 b;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo4828invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public hb(PackageManager packageManager, Function0 intentFactory) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        this.a = packageManager;
        this.b = intentFactory;
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return !a(a(str)).isEmpty();
        } catch (Exception e) {
            xb.b("Cannot open URL", e);
            return false;
        }
    }

    public /* synthetic */ hb(PackageManager packageManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i & 2) != 0 ? a.b : function0);
    }

    public final Intent a(String str) {
        Intent intent = (Intent) this.b.mo4828invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    public final List a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List queryIntentActivities;
        queryIntentActivities = this.a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        return queryIntentActivities;
    }

    public final List a(Intent intent) {
        PackageManager.ResolveInfoFlags of;
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            Intrinsics.checkNotNullExpressionValue(of, "of(...)");
            return a(intent, of);
        }
        List<ResolveInfo> queryIntentActivities = this.a.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNull(queryIntentActivities);
        return queryIntentActivities;
    }
}
