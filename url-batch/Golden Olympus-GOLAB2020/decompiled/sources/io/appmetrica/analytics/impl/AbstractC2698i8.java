package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2698i8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39181a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f39182b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2749k8 f39183c;

    /* renamed from: d, reason: collision with root package name */
    public final Yn f39184d;

    /* renamed from: e, reason: collision with root package name */
    public final Jm f39185e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2683hj f39186f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2630fj f39187g;

    /* renamed from: h, reason: collision with root package name */
    public final U6 f39188h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2723j8 f39189i;

    public AbstractC2698i8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC2749k8 abstractC2749k8, Yn yn, Jm jm, InterfaceC2683hj interfaceC2683hj, InterfaceC2630fj interfaceC2630fj, U6 u6, InterfaceC2723j8 interfaceC2723j8) {
        this.f39181a = context;
        this.f39182b = protobufStateStorage;
        this.f39183c = abstractC2749k8;
        this.f39184d = yn;
        this.f39185e = jm;
        this.f39186f = interfaceC2683hj;
        this.f39187g = interfaceC2630fj;
        this.f39188h = u6;
        this.f39189i = interfaceC2723j8;
    }

    @NotNull
    public final synchronized InterfaceC2723j8 a() {
        return this.f39189i;
    }

    public final synchronized boolean b(@NotNull InterfaceC2801m8 interfaceC2801m8) {
        try {
            boolean z4 = false;
            if (interfaceC2801m8.a() == EnumC2775l8.f39392b) {
                return false;
            }
            if (Intrinsics.areEqual(interfaceC2801m8, this.f39189i.b())) {
                return false;
            }
            List list = (List) this.f39184d.invoke(this.f39189i.a(), interfaceC2801m8);
            boolean z5 = list != null;
            if (list == null) {
                list = this.f39189i.a();
            }
            if (this.f39183c.a(interfaceC2801m8, this.f39189i.b())) {
                z4 = true;
            } else {
                interfaceC2801m8 = (InterfaceC2801m8) this.f39189i.b();
            }
            if (z4 || z5) {
                InterfaceC2723j8 interfaceC2723j8 = this.f39189i;
                InterfaceC2723j8 interfaceC2723j82 = (InterfaceC2723j8) this.f39185e.invoke(interfaceC2801m8, list);
                this.f39189i = interfaceC2723j82;
                this.f39182b.save(interfaceC2723j82);
                AbstractC2967sj.a("Update distribution data: %s -> %s", interfaceC2723j8, this.f39189i);
            }
            return z4;
        } finally {
        }
    }

    public final synchronized InterfaceC2801m8 c() {
        try {
            if (!this.f39187g.a()) {
                InterfaceC2801m8 interfaceC2801m8 = (InterfaceC2801m8) this.f39186f.invoke();
                this.f39187g.b();
                if (interfaceC2801m8 != null) {
                    b(interfaceC2801m8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC2801m8) this.f39189i.b();
    }

    @NotNull
    public final InterfaceC2801m8 a(@NotNull InterfaceC2801m8 interfaceC2801m8) {
        InterfaceC2801m8 c4;
        this.f39188h.a(this.f39181a);
        synchronized (this) {
            b(interfaceC2801m8);
            c4 = c();
        }
        return c4;
    }

    @NotNull
    public final InterfaceC2801m8 b() {
        this.f39188h.a(this.f39181a);
        return c();
    }
}
