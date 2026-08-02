package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import io.flutter.embedding.engine.FlutterEngineFlags;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ApplicationInfoLoader {
    public static final String NETWORK_POLICY_METADATA_KEY = "io.flutter.network-policy";
    public static final String PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY = "io.flutter.automatically-register-plugins";

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean getBoolean(Bundle bundle, String str, boolean z) {
        return bundle == null ? z : bundle.getBoolean(str, z);
    }

    private static String getNetworkPolicy(ApplicationInfo applicationInfo, Context context) {
        int i4;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i4 = bundle.getInt(NETWORK_POLICY_METADATA_KEY, 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        parseDomainConfig(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private static String getString(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    private static String getStringWithFallback(Bundle bundle, String str, String str2) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(str, null);
        return string == null ? bundle.getString(str2) : string;
    }

    public static FlutterApplicationInfo load(Context context) {
        ApplicationInfo applicationInfo = getApplicationInfo(context);
        return new FlutterApplicationInfo(getStringWithFallback(applicationInfo.metaData, FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.metadataKey, FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME.metadataKey), getString(applicationInfo.metaData, FlutterEngineFlags.VM_SNAPSHOT_DATA.metadataKey), getString(applicationInfo.metaData, FlutterEngineFlags.ISOLATE_SNAPSHOT_DATA.metadataKey), getStringWithFallback(applicationInfo.metaData, FlutterEngineFlags.FLUTTER_ASSETS_DIR.metadataKey, FlutterEngineFlags.DEPRECATED_FLUTTER_ASSETS_DIR.metadataKey), getNetworkPolicy(applicationInfo, context), applicationInfo.nativeLibraryDir, getBoolean(applicationInfo.metaData, PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY, true));
    }

    private static void parseDomain(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String trim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    private static void parseDomainConfig(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    parseDomain(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    parseDomainConfig(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    skipTag(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    private static void skipTag(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
