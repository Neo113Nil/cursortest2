package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3533h
/* loaded from: classes3.dex */
public final class nk1 {

    @NotNull
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final W1.h f29660b;

    /* renamed from: c, reason: collision with root package name */
    public static final nk1 f29661c;

    /* renamed from: d, reason: collision with root package name */
    public static final nk1 f29662d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ nk1[] f29663e;

    static final class a extends kotlin.jvm.internal.s implements Function0<InterfaceC3527b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29664b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C2.H.a("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", nk1.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return (InterfaceC3527b) nk1.f29660b.getValue();
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    static {
        nk1 nk1Var = new nk1(0, "SUCCESS");
        f29661c = nk1Var;
        nk1 nk1Var2 = new nk1(1, "ERROR");
        f29662d = nk1Var2;
        nk1[] nk1VarArr = {nk1Var, nk1Var2};
        f29663e = nk1VarArr;
        AbstractC1372b.a(nk1VarArr);
        Companion = new b(0);
        f29660b = W1.i.a(W1.l.f9607c, a.f29664b);
    }

    private nk1(int i4, String str) {
    }

    public static nk1 valueOf(String str) {
        return (nk1) Enum.valueOf(nk1.class, str);
    }

    public static nk1[] values() {
        return (nk1[]) f29663e.clone();
    }
}
