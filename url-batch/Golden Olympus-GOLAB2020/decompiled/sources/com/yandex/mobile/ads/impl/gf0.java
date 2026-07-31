package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final okio.g f26122a;

    /* renamed from: b, reason: collision with root package name */
    private long f26123b;

    public gf0(@NotNull okio.g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f26122a = source;
        this.f26123b = 262144L;
    }

    @NotNull
    public final ff0 a() {
        ff0.a aVar = new ff0.a();
        while (true) {
            String line = b();
            if (line.length() == 0) {
                return aVar.a();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int b02 = StringsKt.b0(line, ':', 1, false, 4, null);
            if (b02 != -1) {
                String substring = line.substring(0, b02);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = line.substring(b02 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                aVar.a(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                aVar.a("", substring3);
            } else {
                aVar.a("", line);
            }
        }
    }

    @NotNull
    public final String b() {
        String A4 = this.f26122a.A(this.f26123b);
        this.f26123b -= A4.length();
        return A4;
    }
}
