package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1443c5 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private List<String> f15674a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private List<String> f15675b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private List<String> f15676c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.f15676c;
    }

    @Nullable
    public final List<String> b() {
        return this.f15675b;
    }

    @Nullable
    public final List<String> c() {
        return this.f15674a;
    }

    public final void a(@Nullable List<String> list) {
        this.f15676c = list;
    }

    public final void b(@Nullable List<String> list) {
        this.f15675b = list;
    }

    public final void c(@Nullable List<String> list) {
        this.f15674a = list;
    }
}
