package com.yandex.div.core.util.mask;

import O1.Rg;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class PhoneInputMaskKt {

    @NotNull
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;

    @NotNull
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    static {
        List<BaseInputMask.MaskKey> listOf = CollectionsKt.listOf(new BaseInputMask.MaskKey('0', "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = listOf;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), listOf, false);
    }

    @NotNull
    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    @NotNull
    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    @NotNull
    public static final String getPhoneMaskPattern(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.z(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = Rg.f4694b;
        int i4 = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            String str2 = "*";
            if (i4 >= str.length()) {
                Object obj = jSONObject.get("*");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i5 = i4 + 1;
            String valueOf = String.valueOf(str.charAt(i4));
            if (jSONObject.has(valueOf)) {
                str2 = valueOf;
            }
            Object obj2 = jSONObject.get(str2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i4 = i5;
        }
        return jSONObject.getString("value") + "00";
    }
}
