package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
class VastLinearXmlManager {
    private static final String CLICK_THROUGH = "ClickThrough";
    private static final String CLICK_TRACKER = "ClickTracking";
    private static final String CLOSE = "close";
    private static final String CLOSE_LINEAR = "closeLinear";
    private static final String COMPLETE = "complete";
    private static final String CREATIVE_VIEW = "creativeView";
    private static final int CREATIVE_VIEW_TRACKER_THRESHOLD = 0;
    private static final String EVENT = "event";
    private static final float FIRST_QUARTER_MARKER = 0.25f;
    private static final String FIRST_QUARTILE = "firstQuartile";
    public static final String ICON = "Icon";
    public static final String ICONS = "Icons";
    private static final String MEDIA_FILE = "MediaFile";
    private static final String MEDIA_FILES = "MediaFiles";
    private static final String MIDPOINT = "midpoint";
    private static final float MID_POINT_MARKER = 0.5f;
    private static final String OFFSET = "offset";
    private static final String PAUSE = "pause";
    private static final String PROGRESS = "progress";
    private static final String RESUME = "resume";
    private static final String SKIP = "skip";
    private static final String SKIP_OFFSET = "skipoffset";
    private static final String START = "start";
    private static final int START_TRACKER_THRESHOLD = 0;
    private static final float THIRD_QUARTER_MARKER = 0.75f;
    private static final String THIRD_QUARTILE = "thirdQuartile";
    private static final String TRACKING_EVENTS = "TrackingEvents";
    private static final String VIDEO_CLICKS = "VideoClicks";
    private static final String VIDEO_TRACKER = "Tracking";
    private final Node mLinearNode;

    VastLinearXmlManager(Node node) {
        Preconditions.checkNotNull(node);
        this.mLinearNode = node;
    }

    List<VastFractionalProgressTracker> getFractionalProgressTrackers() {
        ArrayList arrayList = new ArrayList();
        addQuartileTrackerWithFraction(arrayList, getVideoTrackersByAttribute("firstQuartile"), FIRST_QUARTER_MARKER);
        addQuartileTrackerWithFraction(arrayList, getVideoTrackersByAttribute("midpoint"), MID_POINT_MARKER);
        addQuartileTrackerWithFraction(arrayList, getVideoTrackersByAttribute("thirdQuartile"), THIRD_QUARTER_MARKER);
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, TRACKING_EVENTS);
        if (firstMatchingChildNode != null) {
            for (Node node : XmlUtils.getMatchingChildNodes(firstMatchingChildNode, VIDEO_TRACKER, "event", Collections.singletonList("progress"))) {
                String attributeValue = XmlUtils.getAttributeValue(node, "offset");
                if (attributeValue != null) {
                    String trim = attributeValue.trim();
                    if (Strings.isPercentageTracker(trim)) {
                        String nodeValue = XmlUtils.getNodeValue(node);
                        try {
                            float parseFloat = Float.parseFloat(trim.replace("%", "")) / 100.0f;
                            if (parseFloat >= 0.0f) {
                                arrayList.add(new VastFractionalProgressTracker(nodeValue, parseFloat));
                            }
                        } catch (NumberFormatException unused) {
                            MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", trim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    List<VastAbsoluteProgressTracker> getAbsoluteProgressTrackers() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = getVideoTrackersByAttribute("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new VastAbsoluteProgressTracker(it.next(), 0));
        }
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, TRACKING_EVENTS);
        if (firstMatchingChildNode != null) {
            for (Node node : XmlUtils.getMatchingChildNodes(firstMatchingChildNode, VIDEO_TRACKER, "event", Collections.singletonList("progress"))) {
                String attributeValue = XmlUtils.getAttributeValue(node, "offset");
                if (attributeValue != null) {
                    String trim = attributeValue.trim();
                    if (Strings.isAbsoluteTracker(trim)) {
                        String nodeValue = XmlUtils.getNodeValue(node);
                        try {
                            Integer parseAbsoluteOffset = Strings.parseAbsoluteOffset(trim);
                            if (parseAbsoluteOffset != null && parseAbsoluteOffset.intValue() >= 0) {
                                arrayList.add(new VastAbsoluteProgressTracker(nodeValue, parseAbsoluteOffset.intValue()));
                            }
                        } catch (NumberFormatException unused) {
                            MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", trim));
                        }
                    }
                }
            }
            Iterator<Node> it2 = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, VIDEO_TRACKER, "event", Collections.singletonList("creativeView")).iterator();
            while (it2.hasNext()) {
                String nodeValue2 = XmlUtils.getNodeValue(it2.next());
                if (nodeValue2 != null) {
                    arrayList.add(new VastAbsoluteProgressTracker(nodeValue2, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    List<VastTracker> getVideoCompleteTrackers() {
        return getVideoTrackersByAttributeAsVastTrackers("complete");
    }

    List<VastTracker> getPauseTrackers() {
        List<String> videoTrackersByAttribute = getVideoTrackersByAttribute("pause");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = videoTrackersByAttribute.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker(it.next(), true));
        }
        return arrayList;
    }

    List<VastTracker> getResumeTrackers() {
        List<String> videoTrackersByAttribute = getVideoTrackersByAttribute("resume");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = videoTrackersByAttribute.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker(it.next(), true));
        }
        return arrayList;
    }

    List<VastTracker> getVideoCloseTrackers() {
        List<VastTracker> videoTrackersByAttributeAsVastTrackers = getVideoTrackersByAttributeAsVastTrackers("close");
        videoTrackersByAttributeAsVastTrackers.addAll(getVideoTrackersByAttributeAsVastTrackers(CLOSE_LINEAR));
        return videoTrackersByAttributeAsVastTrackers;
    }

    List<VastTracker> getVideoSkipTrackers() {
        return getVideoTrackersByAttributeAsVastTrackers("skip");
    }

    String getClickThroughUrl() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, VIDEO_CLICKS);
        if (firstMatchingChildNode == null) {
            return null;
        }
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(firstMatchingChildNode, "ClickThrough"));
    }

    List<VastTracker> getClickTrackers() {
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, VIDEO_CLICKS);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, CLICK_TRACKER).iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (nodeValue != null) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }

    String getSkipOffset() {
        String attributeValue = XmlUtils.getAttributeValue(this.mLinearNode, SKIP_OFFSET);
        if (attributeValue == null || attributeValue.trim().isEmpty()) {
            return null;
        }
        return attributeValue.trim();
    }

    List<VastMediaXmlManager> getMediaXmlManagers() {
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, MEDIA_FILES);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, MEDIA_FILE).iterator();
        while (it.hasNext()) {
            arrayList.add(new VastMediaXmlManager(it.next()));
        }
        return arrayList;
    }

    List<VastIconXmlManager> getIconXmlManagers() {
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, ICONS);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, ICON).iterator();
        while (it.hasNext()) {
            arrayList.add(new VastIconXmlManager(it.next()));
        }
        return arrayList;
    }

    private List<VastTracker> getVideoTrackersByAttributeAsVastTrackers(String str) {
        List<String> videoTrackersByAttribute = getVideoTrackersByAttribute(str);
        ArrayList arrayList = new ArrayList(videoTrackersByAttribute.size());
        Iterator<String> it = videoTrackersByAttribute.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker(it.next()));
        }
        return arrayList;
    }

    private List<String> getVideoTrackersByAttribute(String str) {
        Preconditions.checkNotNull(str);
        ArrayList arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.mLinearNode, TRACKING_EVENTS);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        Iterator<Node> it = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, VIDEO_TRACKER, "event", Collections.singletonList(str)).iterator();
        while (it.hasNext()) {
            String nodeValue = XmlUtils.getNodeValue(it.next());
            if (nodeValue != null) {
                arrayList.add(nodeValue);
            }
        }
        return arrayList;
    }

    private void addQuartileTrackerWithFraction(List<VastFractionalProgressTracker> list, List<String> list2, float f) {
        Preconditions.checkNotNull(list, "trackers cannot be null");
        Preconditions.checkNotNull(list2, "urls cannot be null");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            list.add(new VastFractionalProgressTracker(it.next(), f));
        }
    }
}
