package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2307w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f33849a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, String> f33850b = MapsKt.mapOf(TuplesKt.to(16, "ActivityInfo.CONFIG_KEYBOARD"), TuplesKt.to(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), TuplesKt.to(Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN), "ActivityInfo.CONFIG_ORIENTATION"), TuplesKt.to(Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT), "ActivityInfo.CONFIG_SCREEN_LAYOUT"), TuplesKt.to(Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE), "ActivityInfo.CONFIG_UI_MODE"), TuplesKt.to(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), TuplesKt.to(Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f17688n), "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NotNull ActivityInfo adActivity) {
        String str;
        Intrinsics.checkNotNullParameter(adActivity, "adActivity");
        Map<Integer, String> map = f33850b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int intValue = next.getKey().intValue();
            String value = next.getValue();
            if ((intValue & adActivity.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            if (((String) obj) != null) {
                str = obj;
                break;
            }
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        String a4 = C2284v0.a(new Object[]{str2}, 1, f33849a, "format(...)");
        throw new jo0(a4, a4);
    }
}
