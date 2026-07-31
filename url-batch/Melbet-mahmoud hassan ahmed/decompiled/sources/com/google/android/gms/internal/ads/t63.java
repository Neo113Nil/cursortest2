package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class t63 {

    /* renamed from: a, reason: collision with root package name */
    private static final t63 f12104a = new q63();

    /* renamed from: b, reason: collision with root package name */
    private static final t63 f12105b = new r63(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final t63 f12106c = new r63(1);

    /* synthetic */ t63(s63 s63Var) {
    }

    public static t63 i() {
        return f12104a;
    }

    public abstract int a();

    public abstract t63 b(int i7, int i8);

    public abstract <T> t63 c(T t6, T t7, Comparator<T> comparator);

    public abstract t63 d(boolean z6, boolean z7);

    public abstract t63 e(boolean z6, boolean z7);
}
