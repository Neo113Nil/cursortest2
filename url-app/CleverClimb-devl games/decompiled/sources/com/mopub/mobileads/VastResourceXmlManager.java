package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class VastResourceXmlManager {
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String HTML_RESOURCE = "HTMLResource";
    public static final String IFRAME_RESOURCE = "IFrameResource";
    public static final String STATIC_RESOURCE = "StaticResource";
    private final Node mResourceNode;

    VastResourceXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mResourceNode = node;
    }

    String getStaticResource() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mResourceNode, STATIC_RESOURCE));
    }

    String getStaticResourceType() {
        String attributeValue = XmlUtils.getAttributeValue(XmlUtils.getFirstMatchingChildNode(this.mResourceNode, STATIC_RESOURCE), CREATIVE_TYPE);
        if (attributeValue != null) {
            return attributeValue.toLowerCase();
        }
        return null;
    }

    String getIFrameResource() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mResourceNode, IFRAME_RESOURCE));
    }

    String getHTMLResource() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mResourceNode, HTML_RESOURCE));
    }
}
