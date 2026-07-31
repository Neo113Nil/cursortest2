package p0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0216a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2925a = C0220e.class.getName().concat(".aot-shared-library-name");

    /* renamed from: b, reason: collision with root package name */
    public static final String f2926b = C0220e.class.getName().concat(".vm-snapshot-data");

    /* renamed from: c, reason: collision with root package name */
    public static final String f2927c = C0220e.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: d, reason: collision with root package name */
    public static final String f2928d = C0220e.class.getName().concat(".flutter-assets-dir");

    public static C0217b a(Context context) {
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = null;
            String string = bundle == null ? null : bundle.getString(f2925a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f2926b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f2927c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string2 = bundle4 == null ? null : bundle4.getString(f2928d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new C0217b(string, string2, str, str2, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
