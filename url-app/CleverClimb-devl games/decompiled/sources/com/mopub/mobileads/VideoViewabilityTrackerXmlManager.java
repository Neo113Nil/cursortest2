package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class VideoViewabilityTrackerXmlManager {
    public static final String PERCENT_VIEWABLE = "percentViewable";
    public static final String VIEWABLE_PLAYTIME = "viewablePlaytime";
    private final Node mVideoViewabilityNode;

    VideoViewabilityTrackerXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mVideoViewabilityNode = node;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Integer getViewablePlaytimeMS() {
        Integer parseAbsoluteOffset;
        String attributeValue = XmlUtils.getAttributeValue(this.mVideoViewabilityNode, VIEWABLE_PLAYTIME);
        if (attributeValue == null) {
            return null;
        }
        if (Strings.isAbsoluteTracker(attributeValue)) {
            try {
                parseAbsoluteOffset = Strings.parseAbsoluteOffset(attributeValue);
            } catch (NumberFormatException unused) {
                MoPubLog.d(String.format("Invalid VAST viewablePlaytime format for \"HH:MM:SS[.mmm]\": %s:", attributeValue));
                parseAbsoluteOffset = null;
                if (parseAbsoluteOffset != null) {
                }
                return null;
            }
        } else {
            try {
                parseAbsoluteOffset = Integer.valueOf((int) (Float.parseFloat(attributeValue) * 1000.0f));
            } catch (NumberFormatException unused2) {
                MoPubLog.d(String.format("Invalid VAST viewablePlaytime format for \"SS[.mmm]\": %s:", attributeValue));
                parseAbsoluteOffset = null;
                if (parseAbsoluteOffset != null) {
                }
                return null;
            }
        }
        if (parseAbsoluteOffset != null || parseAbsoluteOffset.intValue() < 0) {
            return null;
        }
        return parseAbsoluteOffset;
    }

    Integer getPercentViewable() {
        Integer num;
        String attributeValue = XmlUtils.getAttributeValue(this.mVideoViewabilityNode, PERCENT_VIEWABLE);
        if (attributeValue == null) {
            return null;
        }
        try {
            num = Integer.valueOf((int) Float.parseFloat(attributeValue.replace("%", "")));
        } catch (NumberFormatException unused) {
            MoPubLog.d(String.format("Invalid VAST percentViewable format for \"d{1,3}%%\": %s:", attributeValue));
            num = null;
        }
        if (num == null || num.intValue() < 0 || num.intValue() > 100) {
            return null;
        }
        return num;
    }

    String getVideoViewabilityTrackerUrl() {
        return XmlUtils.getNodeValue(this.mVideoViewabilityNode);
    }
}
