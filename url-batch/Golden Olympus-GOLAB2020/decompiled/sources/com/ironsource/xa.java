package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xa f20303a = new xa();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f20304b = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20305c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f20306d;

    /* renamed from: e, reason: collision with root package name */
    private static int f20307e;

    private xa() {
    }

    public final void a(int i4) {
        f20307e = i4;
    }

    public final void b(boolean z4) {
        f20305c = z4;
    }

    public final void c(boolean z4) {
        f20304b = z4;
    }

    public final int d() {
        return f20307e;
    }

    public final void a(boolean z4) {
        f20306d = z4;
    }

    public final boolean b() {
        return f20305c;
    }

    public final boolean c() {
        return f20304b;
    }

    public final boolean a() {
        return f20306d;
    }
}
