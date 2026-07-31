package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2010j4 implements InterfaceC2332x2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1871d8 f27459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<e51> f27460b;

    public /* synthetic */ C2010j4(e51 e51Var) {
        this(e51Var, new C1871d8(), new WeakReference(e51Var));
    }

    @NotNull
    public final C1871d8 a() {
        return this.f27459a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2332x2
    public final void a(int i4, @Nullable Bundle bundle) {
        e51 e51Var = this.f27460b.get();
        if (e51Var != null) {
            if (i4 == 19) {
                e51Var.g();
                return;
            }
            if (i4 == 20) {
                e51Var.f();
                return;
            }
            switch (i4) {
                case 6:
                    e51Var.e();
                    break;
                case 7:
                    e51Var.d();
                    break;
                case 8:
                    e51Var.c();
                    break;
                case 9:
                    e51Var.b();
                    break;
            }
        }
    }

    public C2010j4(@NotNull e51 nativeAdEventController, @NotNull C1871d8 adResultReceiver, @NotNull WeakReference<e51> eventControllerReference) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        Intrinsics.checkNotNullParameter(eventControllerReference, "eventControllerReference");
        this.f27459a = adResultReceiver;
        this.f27460b = eventControllerReference;
        adResultReceiver.a(this);
    }
}
