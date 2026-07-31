package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.unity.purchasing.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s32 implements q82 {
    @Override // com.yandex.mobile.ads.impl.q82
    @NotNull
    public final String a() {
        String str;
        String str2 = null;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            ap0.b(new Object[0]);
            str = null;
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        try {
            str2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            ap0.b(new Object[0]);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = "1.0.0";
        }
        sb.append(str2);
        sb.append(" (Linux; U; Android ");
        String str3 = Build.VERSION.RELEASE;
        if (str3.length() == 0) {
            str3 = BuildConfig.VERSION_NAME;
        }
        sb.append(str3);
        if (Intrinsics.areEqual("REL", Build.VERSION.CODENAME)) {
            String str4 = Build.MODEL;
            Intrinsics.checkNotNull(str4);
            if (str4.length() > 0) {
                sb.append("; ");
                sb.append(str4);
            }
        }
        String str5 = Build.ID;
        Intrinsics.checkNotNull(str5);
        if (str5.length() > 0) {
            sb.append(" Build/");
            sb.append(str5);
        }
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
