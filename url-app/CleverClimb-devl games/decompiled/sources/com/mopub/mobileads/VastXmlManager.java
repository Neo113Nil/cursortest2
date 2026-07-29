package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.util.XmlUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
class VastXmlManager {
    private static final String AD = "Ad";
    private static final String CUSTOM_CLOSE_ICON = "MoPubCloseIcon";
    private static final String CUSTOM_CTA_TEXT = "MoPubCtaText";
    private static final String CUSTOM_FORCE_ORIENTATION = "MoPubForceOrientation";
    private static final String CUSTOM_SKIP_TEXT = "MoPubSkipText";
    private static final String ERROR = "Error";
    private static final int MAX_CTA_TEXT_LENGTH = 15;
    private static final int MAX_SKIP_TEXT_LENGTH = 8;
    private static final String MP_IMPRESSION_TRACKER = "MP_TRACKING_URL";
    private static final String ROOT_TAG = "MPMoVideoXMLDocRoot";
    private static final String ROOT_TAG_CLOSE = "</MPMoVideoXMLDocRoot>";
    private static final String ROOT_TAG_OPEN = "<MPMoVideoXMLDocRoot>";
    private Document mVastDoc;

    VastXmlManager() {
    }

    void parseVastXml(String str) throws ParserConfigurationException, IOException, SAXException {
        Preconditions.checkNotNull(str, "xmlString cannot be null");
        String str2 = ROOT_TAG_OPEN + str.replaceFirst("<\\?.*\\?>", "") + ROOT_TAG_CLOSE;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        this.mVastDoc = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str2)));
    }

    List<VastAdXmlManager> getAdXmlManagers() {
        ArrayList arrayList = new ArrayList();
        if (this.mVastDoc == null) {
            return arrayList;
        }
        NodeList elementsByTagName = this.mVastDoc.getElementsByTagName(AD);
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            arrayList.add(new VastAdXmlManager(elementsByTagName.item(i)));
        }
        return arrayList;
    }

    VastTracker getErrorTracker() {
        if (this.mVastDoc == null) {
            return null;
        }
        String firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.mVastDoc, ERROR);
        if (TextUtils.isEmpty(firstMatchingStringData)) {
            return null;
        }
        return new VastTracker(firstMatchingStringData);
    }

    List<VastTracker> getMoPubImpressionTrackers() {
        List<String> stringDataAsList = XmlUtils.getStringDataAsList(this.mVastDoc, MP_IMPRESSION_TRACKER);
        ArrayList arrayList = new ArrayList(stringDataAsList.size());
        Iterator<String> it = stringDataAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker(it.next()));
        }
        return arrayList;
    }

    String getCustomCtaText() {
        String firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.mVastDoc, CUSTOM_CTA_TEXT);
        if (firstMatchingStringData == null || firstMatchingStringData.length() > 15) {
            return null;
        }
        return firstMatchingStringData;
    }

    String getCustomSkipText() {
        String firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.mVastDoc, CUSTOM_SKIP_TEXT);
        if (firstMatchingStringData == null || firstMatchingStringData.length() > 8) {
            return null;
        }
        return firstMatchingStringData;
    }

    String getCustomCloseIconUrl() {
        return XmlUtils.getFirstMatchingStringData(this.mVastDoc, CUSTOM_CLOSE_ICON);
    }

    DeviceUtils.ForceOrientation getCustomForceOrientation() {
        return DeviceUtils.ForceOrientation.getForceOrientation(XmlUtils.getFirstMatchingStringData(this.mVastDoc, CUSTOM_FORCE_ORIENTATION));
    }
}
