package io.flutter.plugins.sharedpreferences;

import E.AbstractC0005f;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import w3.o;

/* loaded from: classes.dex */
public final class SharedPreferencesBackend implements SharedPreferencesAsyncApi {
    private Context context;
    private SharedPreferencesListEncoder listEncoder;
    private BinaryMessenger messenger;

    public SharedPreferencesBackend(BinaryMessenger messenger, Context context, SharedPreferencesListEncoder listEncoder) {
        i.e(messenger, "messenger");
        i.e(context, "context");
        i.e(listEncoder, "listEncoder");
        this.messenger = messenger;
        this.context = context;
        this.listEncoder = listEncoder;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(messenger, this, "shared_preferences");
        } catch (Exception e4) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    private final SharedPreferences createSharedPreferences(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        if (sharedPreferencesPigeonOptions.getFileName() != null) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(sharedPreferencesPigeonOptions.getFileName(), 0);
            i.b(sharedPreferences);
            return sharedPreferences;
        }
        Context context = this.context;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions options) {
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        SharedPreferences.Editor edit = createSharedPreferences.edit();
        i.d(edit, "edit(...)");
        Map<String, ?> all = createSharedPreferences.getAll();
        i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter(str, all.get(str), list != null ? d3.i.p0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions options) {
        Object value;
        i.e(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter(entry.getKey(), entry.getValue(), list != null ? d3.i.p0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object transformPref = SharedPreferencesPluginKt.transformPref(value, this.listEncoder);
                i.c(transformPref, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, transformPref);
            }
        }
        return hashMap;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (createSharedPreferences.contains(key)) {
            return Boolean.valueOf(createSharedPreferences.getBoolean(key, true));
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (!createSharedPreferences.contains(key)) {
            return null;
        }
        Object transformPref = SharedPreferencesPluginKt.transformPref(createSharedPreferences.getString(key, ""), this.listEncoder);
        i.c(transformPref, "null cannot be cast to non-null type kotlin.Double");
        return (Double) transformPref;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) {
        long j4;
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (!createSharedPreferences.contains(key)) {
            return null;
        }
        try {
            j4 = createSharedPreferences.getLong(key, 0L);
        } catch (ClassCastException unused) {
            j4 = createSharedPreferences.getInt(key, 0);
        }
        return Long.valueOf(j4);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions options) {
        i.e(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            i.d(key, "<get-key>(...)");
            if (SharedPreferencesPluginKt.preferencesFilter(key, entry.getValue(), list != null ? d3.i.p0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return d3.i.n0(linkedHashMap.keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
        List list;
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (!createSharedPreferences.contains(key)) {
            return null;
        }
        String string = createSharedPreferences.getString(key, "");
        i.b(string);
        if (!o.a0(string, SharedPreferencesPluginKt.LIST_PREFIX, false) || o.a0(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(createSharedPreferences.getString(key, ""), this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (createSharedPreferences.contains(key)) {
            return createSharedPreferences.getString(key, "");
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        SharedPreferences createSharedPreferences = createSharedPreferences(options);
        if (!createSharedPreferences.contains(key)) {
            return null;
        }
        String string = createSharedPreferences.getString(key, "");
        i.b(string);
        return o.a0(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : o.a0(string, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean z, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        createSharedPreferences(options).edit().putBoolean(key, z).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        createSharedPreferences(options).edit().putString(key, AbstractC0005f.n(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value))).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double d4, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        createSharedPreferences(options).edit().putString(key, SharedPreferencesPluginKt.DOUBLE_PREFIX + d4).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        createSharedPreferences(options).edit().putString(key, value).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long j4, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(options, "options");
        createSharedPreferences(options).edit().putLong(key, j4).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
        i.e(key, "key");
        i.e(value, "value");
        i.e(options, "options");
        createSharedPreferences(options).edit().putString(key, value).apply();
    }

    public final void tearDown() {
        SharedPreferencesAsyncApi.Companion.setUp(this.messenger, null, "shared_preferences");
    }

    public /* synthetic */ SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context, SharedPreferencesListEncoder sharedPreferencesListEncoder, int i4, e eVar) {
        this(binaryMessenger, context, (i4 & 4) != 0 ? new ListEncoder() : sharedPreferencesListEncoder);
    }
}
