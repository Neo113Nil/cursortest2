package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3090xc {

    /* renamed from: a, reason: collision with root package name */
    public final C2575dh f40164a;

    /* renamed from: b, reason: collision with root package name */
    public final M9 f40165b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f40166c;

    /* renamed from: d, reason: collision with root package name */
    public final C2756kf f40167d;

    /* renamed from: e, reason: collision with root package name */
    public final C2695i5 f40168e;

    /* renamed from: f, reason: collision with root package name */
    public final Qc f40169f = new Qc();

    /* renamed from: g, reason: collision with root package name */
    public final W1.h f40170g = W1.i.b(new C3064wc(this));

    public C3090xc(@NotNull C2645g7 c2645g7, @NotNull C2575dh c2575dh, @NotNull M9 m9, @NotNull J4 j4, @NotNull C2756kf c2756kf) {
        this.f40164a = c2575dh;
        this.f40165b = m9;
        this.f40166c = j4;
        this.f40167d = c2756kf;
        this.f40168e = new C2695i5(c2645g7, c2575dh);
    }

    @NotNull
    public final List<Y8> a() {
        return this.f40168e.a();
    }

    @NotNull
    public final List<Y8> b() {
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f40168e.f39179c), (Iterable) CollectionsKt.listOf((Y8) this.f40170g.getValue()));
    }
}
