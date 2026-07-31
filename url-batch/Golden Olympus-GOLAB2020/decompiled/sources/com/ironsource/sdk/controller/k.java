package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC1465g;
import com.ironsource.InterfaceC1472h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface k {

    @Metadata
    public static final class a implements InterfaceC1465g {
        @Override // com.ironsource.InterfaceC1465g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    @Metadata
    public static final class b implements InterfaceC1472h {
        @Override // com.ironsource.InterfaceC1472h
        @NotNull
        public Intent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
