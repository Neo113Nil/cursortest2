package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cq1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class aq1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f23417a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile aq1 f23418b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23419c = 0;

    public static final class a {
        @NotNull
        public static aq1 a() {
            aq1 aq1Var;
            aq1 aq1Var2 = aq1.f23418b;
            if (aq1Var2 != null) {
                return aq1Var2;
            }
            synchronized (aq1.f23417a) {
                aq1Var = aq1.f23418b;
                if (aq1Var == null) {
                    aq1Var = new aq1();
                    aq1.f23418b = aq1Var;
                }
            }
            return aq1Var;
        }
    }

    public static void a(@NotNull Context context, @NotNull final Object tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        vc1.a(context).a(new cq1.b() { // from class: com.yandex.mobile.ads.impl.K
            @Override // com.yandex.mobile.ads.impl.cq1.b
            public final boolean a(op1 op1Var) {
                boolean a4;
                a4 = aq1.a(tag, op1Var);
                return a4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Object tag, op1 op1Var) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        return Intrinsics.areEqual(tag, op1Var.i());
    }
}
