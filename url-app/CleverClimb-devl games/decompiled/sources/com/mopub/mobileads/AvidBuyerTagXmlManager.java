package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
class AvidBuyerTagXmlManager {
    private static final String AD_VERIFICATIONS = "AdVerifications";
    private static final String JAVA_SCRIPT_RESOURCE = "JavaScriptResource";
    private static final String VERIFICATION = "Verification";
    private final Node mAvidNode;

    AvidBuyerTagXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mAvidNode = node;
    }

    Set<String> getJavaScriptResources() {
        List<Node> matchingChildNodes;
        HashSet hashSet = new HashSet();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mAvidNode, "AdVerifications");
        if (firstMatchingChildNode == null || (matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, "Verification")) == null) {
            return hashSet;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            Node firstMatchingChildNode2 = XmlUtils.getFirstMatchingChildNode(it.next(), JAVA_SCRIPT_RESOURCE);
            if (firstMatchingChildNode2 != null) {
                hashSet.add(XmlUtils.getNodeValue(firstMatchingChildNode2));
            }
        }
        return hashSet;
    }
}
