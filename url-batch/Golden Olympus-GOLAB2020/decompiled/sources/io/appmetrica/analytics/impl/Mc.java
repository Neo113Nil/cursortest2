package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class Mc extends C3083x5 {

    /* renamed from: n, reason: collision with root package name */
    public final C2942rk f37975n;

    public Mc(@NonNull Context context, @NonNull C2772l5 c2772l5, @NonNull J4 j4, @NonNull AbstractC2902q5 abstractC2902q5, @NonNull C2633fm c2633fm, @NonNull InterfaceC3017uh interfaceC3017uh, @NonNull ICommonExecutor iCommonExecutor, int i4, @NonNull C2942rk c2942rk, @NonNull C2489ac c2489ac, @NonNull N9 n9) {
        super(context, c2772l5, j4, abstractC2902q5, c2633fm, interfaceC3017uh, iCommonExecutor, i4, c2489ac, n9);
        this.f37975n = c2942rk;
    }

    @NonNull
    public final C2822n3 a(@NonNull Kc kc) {
        String str;
        Field field;
        Context context = this.f40138c;
        IHandlerExecutor a4 = this.f37975n.a();
        Executor f4 = this.f37975n.f();
        try {
            Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        return new C2822n3(context, a4, f4, (str == null || StringsKt.z(str)) ? BillingType.NONE : StringsKt.K(str, "2.", false, 2, null) ? BillingType.NONE : StringsKt.K(str, "3.", false, 2, null) ? BillingType.NONE : StringsKt.K(str, "4.", false, 2, null) ? BillingType.NONE : StringsKt.K(str, "5.", false, 2, null) ? BillingType.LIBRARY_V6 : StringsKt.K(str, "6.", false, 2, null) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6, new C2718j3(Qm.a(C3054w2.class).a(this.f40138c)), new C2693i3(kc, Ia.j().w().e()));
    }

    @NonNull
    public final Cg b(@NonNull Kc kc) {
        C3144ze c3144ze = new C3144ze(kc);
        Objects.requireNonNull(kc);
        return new Cg(c3144ze, new Jc(kc), kc);
    }

    @Override // io.appmetrica.analytics.impl.C3083x5
    @NonNull
    public final L9 a(@NonNull Q9 q9, @NonNull C2645g7 c2645g7, @NonNull C2575dh c2575dh, @NonNull J4 j4, @NonNull C2772l5 c2772l5, @NonNull C2756kf c2756kf) {
        return this.f40147l.a(q9, c2645g7, c2575dh, j4, c2772l5, c2756kf).a();
    }
}
