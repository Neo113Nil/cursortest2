package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ue {
    public static final Object a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0050, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3) {
                                    if (newPullParser.getDepth() <= depth) {
                                        break;
                                    }
                                    next = 3;
                                }
                                if (next != 3 && next != 4 && newPullParser.getName().equals("locales")) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }
}
