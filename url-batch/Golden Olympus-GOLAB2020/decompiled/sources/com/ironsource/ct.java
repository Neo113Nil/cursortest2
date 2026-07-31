package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ct implements mm<ws, C1576v> {
    @Override // com.ironsource.mm
    @NotNull
    public C1576v a(@NotNull ws input) {
        String str;
        String str2;
        String str3;
        jg jgVar;
        String c4;
        Intrinsics.checkNotNullParameter(input, "input");
        dt b4 = input.b();
        C1524o0 a4 = input.a();
        if (a4 == null || (str = a4.h()) == null) {
            str = "0";
        }
        C1524o0 a5 = input.a();
        if (a5 == null || (str2 = a5.i()) == null) {
            str2 = "0";
        }
        C1524o0 a6 = input.a();
        if (a6 == null || (str3 = a6.g()) == null) {
            str3 = "0";
        }
        C1524o0 a7 = input.a();
        if (a7 == null || (jgVar = a7.e()) == null) {
            jgVar = jg.UnknownProvider;
        }
        C1524o0 a8 = input.a();
        return new C1576v(b4, str, str2, str3, jgVar, (a8 == null || (c4 = a8.c()) == null) ? "0" : c4);
    }
}
