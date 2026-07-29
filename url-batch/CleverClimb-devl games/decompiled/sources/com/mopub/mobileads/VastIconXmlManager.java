package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class VastIconXmlManager {
    public static final String DURATION = "duration";
    public static final String HEIGHT = "height";
    public static final String ICON_CLICKS = "IconClicks";
    public static final String ICON_CLICK_THROUGH = "IconClickThrough";
    public static final String ICON_CLICK_TRACKING = "IconClickTracking";
    public static final String ICON_VIEW_TRACKING = "IconViewTracking";
    public static final String OFFSET = "offset";
    public static final String WIDTH = "width";
    private final Node mIconNode;
    private final VastResourceXmlManager mResourceXmlManager;

    VastIconXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mIconNode = node;
        this.mResourceXmlManager = new VastResourceXmlManager(node);
    }

    Integer getWidth() {
        return XmlUtils.getAttributeValueAsInt(this.mIconNode, "width");
    }

    Integer getHeight() {
        return XmlUtils.getAttributeValueAsInt(this.mIconNode, "height");
    }

    Integer getOffsetMS() {
        String attributeValue = XmlUtils.getAttributeValue(this.mIconNode, OFFSET);
        try {
            return Strings.parseAbsoluteOffset(attributeValue);
        } catch (NumberFormatException unused) {
            MoPubLog.d(String.format("Invalid VAST icon offset format: %s:", attributeValue));
            return null;
        }
    }

    Integer getDurationMS() {
        String attributeValue = XmlUtils.getAttributeValue(this.mIconNode, "duration");
        try {
            return Strings.parseAbsoluteOffset(attributeValue);
        } catch (NumberFormatException unused) {
            MoPubLog.d(String.format("Invalid VAST icon duration format: %s:", attributeValue));
            return null;
        }
    }

    VastResourceXmlManager getResourceXmlManager() {
        return this.mResourceXmlManager;
    }

    List<VastTracker> getClickTrackingUris() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mIconNode, ICON_CLICKS);
        ArrayList arrayList = new ArrayList();
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, ICON_CLICK_TRACKING).iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (nodeValue != null) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }

    String getClickThroughUri() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mIconNode, ICON_CLICKS);
        if (firstMatchingChildNode == null) {
            return null;
        }
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(firstMatchingChildNode, ICON_CLICK_THROUGH));
    }

    List<VastTracker> getViewTrackingUris() {
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.mIconNode, ICON_VIEW_TRACKING);
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (nodeValue != null) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }
}
