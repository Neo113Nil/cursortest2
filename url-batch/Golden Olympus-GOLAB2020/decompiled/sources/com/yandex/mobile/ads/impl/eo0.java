package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.in0;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eo0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fd2 f25369a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f25370b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f25371c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final in0 f25372d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo0(fd2 fd2Var, ss ssVar, ob2 ob2Var) {
        this(fd2Var, ssVar, ob2Var, in0.a.a());
        int i4 = in0.f27295g;
    }

    public final boolean a() {
        ed2 ed2Var;
        oc2 b4 = this.f25371c.d().b();
        if (!this.f25372d.d() || b4.a() <= 1) {
            String e4 = this.f25370b.e();
            int hashCode = e4.hashCode();
            ed2Var = (hashCode == -1183812830 ? e4.equals(InstreamAdBreakType.INROLL) : hashCode == 830323571 ? e4.equals(InstreamAdBreakType.PAUSEROLL) : hashCode == 1055572677 && e4.equals(InstreamAdBreakType.MIDROLL)) ? b4.a() == 1 ? ed2.f25241e : ed2.f25239c : ed2.f25239c;
        } else {
            ed2Var = ed2.f25241e;
        }
        return this.f25369a.a(ed2Var);
    }

    public eo0(@NotNull fd2 statusController, @NotNull ss adBreak, @NotNull ob2<on0> videoAdInfo, @NotNull in0 instreamSettings) {
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f25369a = statusController;
        this.f25370b = adBreak;
        this.f25371c = videoAdInfo;
        this.f25372d = instreamSettings;
    }
}
