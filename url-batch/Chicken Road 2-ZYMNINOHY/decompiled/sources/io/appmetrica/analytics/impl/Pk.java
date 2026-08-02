package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pk {

    /* renamed from: a, reason: collision with root package name */
    public final Vk f10828a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10829b;

    public Pk(Ok ok) {
        Vk vk;
        Integer num;
        vk = ok.f10765a;
        this.f10828a = vk;
        num = ok.f10766b;
        this.f10829b = num;
    }

    public static final Ok a(Vk vk) {
        return new Ok(vk);
    }

    public final Vk b() {
        return this.f10828a;
    }

    public final Integer a() {
        return this.f10829b;
    }
}
