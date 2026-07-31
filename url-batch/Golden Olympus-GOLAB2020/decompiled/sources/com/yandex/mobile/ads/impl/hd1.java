package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.r21;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hd1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dd1 f26716a;

    public /* synthetic */ hd1() {
        this(new dd1());
    }

    @NotNull
    public final r21 a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull bk0 impressionReporter, @NotNull y52 trackingChecker, @NotNull String viewControllerDescription, @NotNull EnumC1848c9 adStructureType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(trackingChecker, "trackingChecker");
        Intrinsics.checkNotNullParameter(viewControllerDescription, "viewControllerDescription");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        cd1 a4 = this.f26716a.a(impressionReporter, adStructureType);
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
        r21.a aVar = new r21.a(mainLooper, a4);
        C1920f9 c1920f9 = new C1920f9(context, adConfiguration);
        int i4 = ew1.f25476l;
        return new r21(context, adConfiguration, a4, trackingChecker, viewControllerDescription, adStructureType, aVar, c1920f9, ew1.a.a(), new g62());
    }

    public hd1(@NotNull dd1 noticeReportControllerCreator) {
        Intrinsics.checkNotNullParameter(noticeReportControllerCreator, "noticeReportControllerCreator");
        this.f26716a = noticeReportControllerCreator;
    }
}
