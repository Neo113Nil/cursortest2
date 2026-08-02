package com.stripe.android.core.networking;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class NetworkTypeDetector {
    public static final MarkdownParser$$ExternalSyntheticLambda0 DEFAULT_SYSTEM_PROPERTY_SUPPLIER = new MarkdownParser$$ExternalSyntheticLambda0(6);
    public final Object connectivityManager;

    public enum NetworkType {
        WiFi("Wi-Fi"),
        Mobile2G("2G"),
        Mobile3G("3G"),
        Mobile4G("4G"),
        Mobile5G("5G"),
        Unknown("unknown");

        public final String value;

        NetworkType(String str) {
            this.value = str;
        }
    }

    public NetworkTypeDetector(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public Map create() {
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("os.name", "android"), new Pair("os.version", String.valueOf(Build.VERSION.SDK_INT)), new Pair("bindings.version", "23.9.1"), new Pair("lang", "Java"), new Pair("publisher", "Stripe"), new Pair("http.agent", ((Function1) this.connectivityManager).invoke("http.agent")));
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return Thread$State$EnumUnboxingLocalUtility.m("X-Stripe-Client-User-Agent", new JSONObject(MapsKt__MapsKt.plus(mapOf, emptyMap)).toString());
    }

    public NetworkTypeDetector() {
        this.connectivityManager = DEFAULT_SYSTEM_PROPERTY_SUPPLIER;
    }
}
