package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qn1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30853b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f30854c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile qn1 f30855d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f30856a;

    public static final class a {
        private a() {
        }

        @NotNull
        public final qn1 a() {
            qn1 qn1Var;
            qn1 qn1Var2 = qn1.f30855d;
            if (qn1Var2 != null) {
                return qn1Var2;
            }
            synchronized (this) {
                qn1Var = qn1.f30855d;
                if (qn1Var == null) {
                    qn1Var = new qn1(0);
                    qn1.f30855d = qn1Var;
                }
            }
            return qn1Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private qn1() {
        this.f30856a = new WeakHashMap();
    }

    @Nullable
    public final String a(@NotNull op1<?> request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (f30854c) {
            str = (String) this.f30856a.get(request);
            this.f30856a.remove(request);
        }
        return str;
    }

    public /* synthetic */ qn1(int i4) {
        this();
    }

    public final void a(@NotNull AbstractC1978hj request, @NotNull String response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        synchronized (f30854c) {
            this.f30856a.put(request, response);
            Unit unit = Unit.f41027a;
        }
    }
}
