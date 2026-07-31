package ru.rustore.unitysdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import ru.rustore.unitysdk.payclient.RuStoreUnityPayClient;

/* loaded from: classes3.dex */
public class RuStoreDeeplinkActivityDefault extends Activity {
    private static final String DEFAULT_ENTRY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";
    private static final String OVERRIDE_CLASS = "ru.rustore.unitysdk.RuStoreEntryPointOverride";
    private static final String OVERRIDE_FIELD = "UNITY_PLAYER_ACTIVITY_CLASS";
    private static final String TAG = "RuStoreIntentFilter";

    private static String GetStaticString(String str, String str2) {
        try {
            Object obj = Class.forName(str).getField(str2).get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static Class<?> LoadClass(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        try {
            return Class.forName(trim);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String resolveEntryActivityClassName() {
        String GetStaticString = GetStaticString(OVERRIDE_CLASS, OVERRIDE_FIELD);
        return (GetStaticString == null || GetStaticString.trim().isEmpty()) ? "com.unity3d.player.UnityPlayerActivity" : GetStaticString.trim();
    }

    private void startGameActivity() {
        String resolveEntryActivityClassName = resolveEntryActivityClassName();
        Class<?> LoadClass = LoadClass(resolveEntryActivityClassName);
        if (LoadClass != null) {
            Intent intent = new Intent(this, LoadClass);
            intent.addFlags(603979776);
            startActivity(intent);
        } else {
            Log.e(TAG, "Entry activity class not found: " + resolveEntryActivityClassName);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            RuStoreUnityPayClient.INSTANCE.proceedIntent(getIntent());
        }
        if (!isTaskRoot()) {
            finish();
        } else {
            startGameActivity();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        RuStoreUnityPayClient.INSTANCE.proceedIntent(intent);
    }
}
