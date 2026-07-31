package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W1.h f30280a;

    static final class a extends kotlin.jvm.internal.s implements Function0<DivConfiguration> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k20 f30282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, k20 k20Var) {
            super(0);
            this.f30281b = context;
            this.f30282c = k20Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DivConfiguration.Builder typefaceProvider = new DivConfiguration.Builder(new y10(this.f30281b)).divCustomContainerViewAdapter(new m10(new o10(), new s10(), new r10(), new n10(), new t10(), new p10())).typefaceProvider(new b30(this.f30281b));
            k20 k20Var = this.f30282c;
            if (k20Var != null) {
                typefaceProvider = typefaceProvider.extension(new l20(k20Var));
            }
            return typefaceProvider.build();
        }
    }

    public p20(@NotNull Context context, @Nullable k20 k20Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30280a = W1.i.b(new a(context, k20Var));
    }

    @NotNull
    public final DivConfiguration a() {
        return (DivConfiguration) this.f30280a.getValue();
    }
}
