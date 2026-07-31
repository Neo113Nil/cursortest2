package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1961h2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yl0 f26528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vi1 f26529b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private C1937g2 f26530c;

    public /* synthetic */ C1961h2(yl0 yl0Var) {
        this(yl0Var, new vi1());
    }

    @NotNull
    public final C1937g2 a() {
        C1937g2 c1937g2 = this.f26530c;
        if (c1937g2 != null) {
            return c1937g2;
        }
        wl0 playlist = this.f26528a.a();
        this.f26529b.getClass();
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        List createListBuilder = CollectionsKt.createListBuilder();
        ss c4 = playlist.c();
        if (c4 != null) {
            createListBuilder.add(c4);
        }
        List<wi1> a4 = playlist.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
        Iterator<T> it = a4.iterator();
        while (it.hasNext()) {
            arrayList.add(((wi1) it.next()).a());
        }
        createListBuilder.addAll(arrayList);
        ss b4 = playlist.b();
        if (b4 != null) {
            createListBuilder.add(b4);
        }
        C1937g2 c1937g22 = new C1937g2(CollectionsKt.build(createListBuilder));
        this.f26530c = c1937g22;
        return c1937g22;
    }

    public C1961h2(@NotNull yl0 instreamAdPlaylistHolder, @NotNull vi1 playlistAdBreaksProvider) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        Intrinsics.checkNotNullParameter(playlistAdBreaksProvider, "playlistAdBreaksProvider");
        this.f26528a = instreamAdPlaylistHolder;
        this.f26529b = playlistAdBreaksProvider;
    }
}
