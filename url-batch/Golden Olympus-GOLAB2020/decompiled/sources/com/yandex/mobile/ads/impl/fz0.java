package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25951a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25952a;

        static {
            int[] iArr = new int[ez0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25952a = iArr;
        }
    }

    public fz0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25951a = context;
    }

    @Nullable
    public final String a(@Nullable ez0 ez0Var) {
        int i4 = ez0Var == null ? -1 : a.f25952a[ez0Var.ordinal()];
        if (i4 == -1) {
            return null;
        }
        if (i4 == 1) {
            return this.f25951a.getString(R.string.invalid_mediation_adapter_version);
        }
        throw new W1.m();
    }
}
