package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
class VastWrapperXmlManager extends VastBaseInLineWrapperXmlManager {
    private static final String VAST_AD_TAG = "VASTAdTagURI";

    VastWrapperXmlManager(Node node) {
        super(node);
        Preconditions.checkNotNull(node);
    }

    String getVastAdTagURI() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mNode, VAST_AD_TAG));
    }
}
