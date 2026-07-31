package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.hb2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oi2<T> implements AbstractC2372yj.a<T> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final xp1<T> f30060a;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static hb2 b(hi2 hi2Var) {
            if (hi2Var instanceof v40) {
                return hb2.a.a((v40) hi2Var);
            }
            if (hi2Var instanceof uf1) {
                return hb2.a.a();
            }
            lc1 lc1Var = hi2Var.f26761b;
            if (lc1Var == null) {
                return hb2.a.a(hi2Var.getMessage());
            }
            int i4 = lc1Var.f28505a;
            if (i4 >= 500) {
                return hb2.a.b();
            }
            byte[] data = lc1Var.f28506b;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            String str = ("Network Error.  Code: " + i4 + ".") + " Data: \n" + new String(data, Charsets.UTF_8);
            ap0.c(new Object[0]);
            return hb2.a.b(str);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public oi2(@Nullable xp1<T> xp1Var) {
        this.f30060a = xp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(@NotNull hi2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f30060a != null) {
            this.f30060a.a(a.b(error));
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public final void a(@NotNull T response) {
        Intrinsics.checkNotNullParameter(response, "response");
        xp1<T> xp1Var = this.f30060a;
        if (xp1Var != null) {
            xp1Var.a((xp1<T>) response);
        }
    }
}
