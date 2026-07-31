package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b92 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f23636c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f23637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f23638b;

    public /* synthetic */ b92(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f23637a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Y
            @Override // java.lang.Runnable
            public final void run() {
                b92.a(b92.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.f23638b, f23636c, 1).show();
    }

    public b92(@NotNull Context context, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f23637a = handler;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f23638b = applicationContext;
    }
}
