package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.consent_sdk.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4333g {

    /* renamed from: d, reason: collision with root package name */
    public static final K f35838d = K.g(new Object[]{"IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String"}, 4);

    /* renamed from: a, reason: collision with root package name */
    public final Application f35839a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f35840b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f35841c;

    public C4333g(Application application) {
        this.f35839a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f35840b = sharedPreferences;
        this.f35841c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String str;
        Set<String> stringSet = this.f35840b.getStringSet("stored_info", N.f35735B);
        if (stringSet.isEmpty()) {
            stringSet = f35838d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f35839a;
            C4357m a9 = E.a(application, str2);
            if (a9 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences((String) a9.f35879n, 0).getAll().get((String) a9.f35880u);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }
}
