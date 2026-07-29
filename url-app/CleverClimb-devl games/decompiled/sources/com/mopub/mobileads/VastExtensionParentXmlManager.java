package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class VastExtensionParentXmlManager {
    private static final String EXTENSION = "Extension";
    private final Node mVastExtensionParentNode;

    VastExtensionParentXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mVastExtensionParentNode = node;
    }

    List<VastExtensionXmlManager> getVastExtensionXmlManagers() {
        ArrayList arrayList = new ArrayList();
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.mVastExtensionParentNode, EXTENSION);
        if (matchingChildNodes == null) {
            return arrayList;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastExtensionXmlManager(it.next()));
        }
        return arrayList;
    }
}
