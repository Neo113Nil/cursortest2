package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0219h6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1284a;
    public final Vg b;

    public C0219h6(Context context, InterfaceC0141e6 interfaceC0141e6, EnumC0095cb enumC0095cb, InterfaceC0079bl interfaceC0079bl, Executor executor, String str) {
        this.f1284a = executor;
        this.b = new Vg(context, interfaceC0141e6, enumC0095cb, interfaceC0079bl);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f1284a;
        Vg vg = this.b;
        C0402ob c0402ob = vg.c;
        Consumer consumer = vg.e;
        Context context = vg.f1091a;
        if (C0042aa.c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C0042aa.class)) {
                if (C0042aa.c == null) {
                    C0042aa.c = new C0042aa(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        C0042aa c0042aa = C0042aa.c;
        if (c0042aa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c0042aa = null;
        }
        executor.execute(new Uf(file, c0402ob, c0402ob, consumer, c0042aa, vg.b));
    }
}
