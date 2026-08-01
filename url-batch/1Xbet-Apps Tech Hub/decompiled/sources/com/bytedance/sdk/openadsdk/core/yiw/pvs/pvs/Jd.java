package com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.yiw.Wyp;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastAdVerificationsParser.java */
/* loaded from: classes2.dex */
public class Jd {
    public static Set<Wyp> pvs(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Wyp pvs;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(NB.yiw, "vendor");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(NB.yiw, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            str3 = NB.icD(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(NB.yiw, "apiFramework"))) {
                                            break;
                                        } else {
                                            str = NB.icD(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        str2 = NB.icD(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(str) && (pvs = Wyp.pvs("omid", str, attributeValue, str2, str3)) != null) {
                            hashSet.add(pvs);
                        }
                    }
                } else {
                    NB.pvs(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
