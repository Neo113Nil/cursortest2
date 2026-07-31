package com.bytedance.sdk.openadsdk.core.rt.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.rt.iv;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes15.dex */
public class fb {
    public static Set<iv> zmn(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        iv zmn;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastTagName.VERIFICATION.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(btk.nps, VastAttributes.VENDOR);
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !VastTagName.VERIFICATION.equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(btk.nps, "event"))) {
                                            break;
                                        } else {
                                            str3 = btk.fs(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(btk.nps, VastAttributes.API_FRAMEWORK))) {
                                            break;
                                        } else {
                                            str = btk.fs(xmlPullParser, VastTagName.JAVA_SCRIPT_RESOURCE);
                                            break;
                                        }
                                    case "VerificationParameters":
                                        str2 = btk.fs(xmlPullParser, VastTagName.VERIFICATION_PARAMETERS);
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(str) && (zmn = iv.zmn(str, attributeValue, str2, str3)) != null) {
                            hashSet.add(zmn);
                        }
                    }
                } else {
                    btk.zmn(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
