package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
class VastMediaXmlManager {
    private static final String DELIVERY = "delivery";
    private static final String HEIGHT = "height";
    private static final String VIDEO_TYPE = "type";
    private static final String WIDTH = "width";
    private final Node mMediaNode;

    VastMediaXmlManager(Node node) {
        Preconditions.checkNotNull(node, "mediaNode cannot be null");
        this.mMediaNode = node;
    }

    String getDelivery() {
        return XmlUtils.getAttributeValue(this.mMediaNode, DELIVERY);
    }

    Integer getWidth() {
        return XmlUtils.getAttributeValueAsInt(this.mMediaNode, "width");
    }

    Integer getHeight() {
        return XmlUtils.getAttributeValueAsInt(this.mMediaNode, "height");
    }

    String getType() {
        return XmlUtils.getAttributeValue(this.mMediaNode, "type");
    }

    String getMediaUrl() {
        return XmlUtils.getNodeValue(this.mMediaNode);
    }
}
