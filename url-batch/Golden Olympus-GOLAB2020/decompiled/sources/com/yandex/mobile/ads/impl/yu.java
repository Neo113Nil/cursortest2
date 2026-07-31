package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yu implements u32 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pt f35318a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1871d8 f35319b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f35320c;

    private final class a implements qt {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.qt
        public final void onLeftApplication() {
            yu.this.f35319b.a(19, null);
        }

        @Override // com.yandex.mobile.ads.impl.qt
        public final void onReturnedToApplication() {
            yu.this.f35319b.a(20, null);
        }
    }

    public yu(@NotNull pt customClickHandler, @NotNull C1871d8 resultReceiver, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f35318a = customClickHandler;
        this.f35319b = resultReceiver;
        this.f35320c = handler;
    }

    @Override // com.yandex.mobile.ads.impl.u32
    public final void a(@NotNull np1 reporter, @NotNull final String targetUrl) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", "custom");
        k82.f28112a.getClass();
        hashMap.put("click_url", k82.a(targetUrl));
        ip1.b bVar = ip1.b.f27341c;
        reporter.a(hashMap);
        this.f35320c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Bm
            @Override // java.lang.Runnable
            public final void run() {
                yu.a(yu.this, targetUrl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yu this$0, String targetUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(targetUrl, "$targetUrl");
        this$0.f35318a.a(targetUrl, this$0.new a());
    }
}
