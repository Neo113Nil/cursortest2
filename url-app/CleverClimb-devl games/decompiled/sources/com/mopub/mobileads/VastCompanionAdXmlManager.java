package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
class VastCompanionAdXmlManager {
    private static final String AD_SLOT_ID = "adSlotID";
    private static final String COMPANION_CLICK_THROUGH = "CompanionClickThrough";
    private static final String COMPANION_CLICK_TRACKING = "CompanionClickTracking";
    private static final String CREATIVE_VIEW = "creativeView";
    private static final String EVENT = "event";
    private static final String HEIGHT = "height";
    private static final String TRACKING_EVENTS = "TrackingEvents";
    private static final String VIDEO_TRACKER = "Tracking";
    private static final String WIDTH = "width";
    private final Node mCompanionNode;
    private final VastResourceXmlManager mResourceXmlManager;

    VastCompanionAdXmlManager(Node node) {
        Preconditions.checkNotNull(node, "companionNode cannot be null");
        this.mCompanionNode = node;
        this.mResourceXmlManager = new VastResourceXmlManager(node);
    }

    Integer getWidth() {
        return XmlUtils.getAttributeValueAsInt(this.mCompanionNode, "width");
    }

    Integer getHeight() {
        return XmlUtils.getAttributeValueAsInt(this.mCompanionNode, "height");
    }

    String getAdSlotId() {
        return XmlUtils.getAttributeValue(this.mCompanionNode, AD_SLOT_ID);
    }

    VastResourceXmlManager getResourceXmlManager() {
        return this.mResourceXmlManager;
    }

    String getClickThroughUrl() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, COMPANION_CLICK_THROUGH));
    }

    List<VastTracker> getClickTrackers() {
        ArrayList arrayList = new ArrayList();
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.mCompanionNode, COMPANION_CLICK_TRACKING);
        if (matchingChildNodes == null) {
            return arrayList;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (!TextUtils.isEmpty(nodeValue)) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }

    List<VastTracker> getCompanionCreativeViewTrackers() {
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, TRACKING_EVENTS);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, VIDEO_TRACKER, "event", Collections.singletonList("creativeView")).iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker(XmlUtils.getNodeValue(it.next())));
        }
        return arrayList;
    }

    boolean hasResources() {
        return (TextUtils.isEmpty(this.mResourceXmlManager.getStaticResource()) && TextUtils.isEmpty(this.mResourceXmlManager.getHTMLResource()) && TextUtils.isEmpty(this.mResourceXmlManager.getIFrameResource())) ? false : true;
    }
}
