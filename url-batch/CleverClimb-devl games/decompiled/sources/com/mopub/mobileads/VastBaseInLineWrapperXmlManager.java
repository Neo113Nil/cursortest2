package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
abstract class VastBaseInLineWrapperXmlManager {
    private static final String COMPANION = "Companion";
    private static final String COMPANION_ADS = "CompanionAds";
    private static final String CREATIVE = "Creative";
    private static final String CREATIVES = "Creatives";
    private static final String ERROR = "Error";
    private static final String EXTENSIONS = "Extensions";
    private static final String IMPRESSION_TRACKER = "Impression";
    private static final String LINEAR = "Linear";
    protected final Node mNode;

    VastBaseInLineWrapperXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mNode = node;
    }

    List<VastTracker> getImpressionTrackers() {
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.mNode, IMPRESSION_TRACKER);
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (!TextUtils.isEmpty(nodeValue)) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }

    List<VastTracker> getErrorTrackers() {
        ArrayList arrayList = new ArrayList();
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.mNode, ERROR);
        if (matchingChildNodes == null) {
            return arrayList;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (!TextUtils.isEmpty(nodeValue)) {
                arrayList.add(new VastTracker(nodeValue, true));
            }
        }
        return arrayList;
    }

    List<VastLinearXmlManager> getLinearXmlManagers() {
        List<Node> matchingChildNodes;
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mNode, CREATIVES);
        if (firstMatchingChildNode == null || (matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, CREATIVE)) == null) {
            return arrayList;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            Node firstMatchingChildNode2 = XmlUtils.getFirstMatchingChildNode(it.next(), LINEAR);
            if (firstMatchingChildNode2 != null) {
                arrayList.add(new VastLinearXmlManager(firstMatchingChildNode2));
            }
        }
        return arrayList;
    }

    List<VastCompanionAdXmlManager> getCompanionAdXmlManagers() {
        List<Node> matchingChildNodes;
        List<Node> matchingChildNodes2;
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mNode, CREATIVES);
        if (firstMatchingChildNode == null || (matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, CREATIVE)) == null) {
            return arrayList;
        }
        Iterator<Node> it = matchingChildNodes.iterator();
        while (it.hasNext()) {
            Node firstMatchingChildNode2 = XmlUtils.getFirstMatchingChildNode(it.next(), COMPANION_ADS);
            if (firstMatchingChildNode2 != null && (matchingChildNodes2 = XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, COMPANION)) != null) {
                Iterator<Node> it2 = matchingChildNodes2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new VastCompanionAdXmlManager(it2.next()));
                }
            }
        }
        return arrayList;
    }

    VastExtensionParentXmlManager getVastExtensionParentXmlManager() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mNode, EXTENSIONS);
        if (firstMatchingChildNode == null) {
            return null;
        }
        return new VastExtensionParentXmlManager(firstMatchingChildNode);
    }
}
