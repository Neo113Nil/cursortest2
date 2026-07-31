package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2695i5 {

    /* renamed from: a, reason: collision with root package name */
    public final T5 f39177a;

    /* renamed from: b, reason: collision with root package name */
    public final Zc f39178b;

    /* renamed from: c, reason: collision with root package name */
    public final Zc f39179c;

    public C2695i5(@NotNull C2645g7 c2645g7, @NotNull C2575dh c2575dh) {
        He he = new He(c2645g7);
        this.f39177a = new T5(c2645g7);
        this.f39178b = new Zc(he, new C2669h5(c2575dh));
        this.f39179c = new Zc(he, C2643g5.f39040a);
    }

    @NotNull
    public final List<Y8> a() {
        return CollectionsKt.listOf((Object[]) new Y8[]{this.f39177a, this.f39178b});
    }

    @NotNull
    public final List<Y8> b() {
        return CollectionsKt.listOf(this.f39179c);
    }
}
