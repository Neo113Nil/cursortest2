package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class x9 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static s9 a(@NotNull v9 dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String str = dto.f45122a;
        switch (str.hashCode()) {
            case -2015525726:
                if (str.equals("MOBILE")) {
                    return s9.a.f44973a;
                }
                break;
            case -875880187:
                if (str.equals("SBER_PAY")) {
                    return s9.d.f44980a;
                }
                break;
            case 81889:
                if (str.equals("SBP")) {
                    return s9.e.f44981a;
                }
                break;
            case 2061072:
                if (str.equals("CARD")) {
                    return s9.b.f44974a;
                }
                break;
            case 606815286:
                if (str.equals("CARD_BINDING")) {
                    v2 v2Var = dto.f45123b;
                    if (v2Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String value = v2Var.f45115a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    Url url = new Url(v2Var.f45116b);
                    String value2 = v2Var.f45117c;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    Url url2 = new Url(v2Var.f45118d);
                    String value3 = v2Var.f45119e;
                    Intrinsics.checkNotNullParameter(value3, "value");
                    return new s9.c(value, url, value2, url2, value3);
                }
                break;
        }
        return new s9.f(dto.f45122a);
    }
}
