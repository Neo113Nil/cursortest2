package com.youappi.sdk.utils;

import com.youappi.sdk.net.model.Vast;
import com.youappi.sdk.net.model.VideoEvent;
import com.youappi.sdk.net.model.vast.MediaFileItem;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private Vast.VastCarriageObject f9535a;

    public h(Vast.VastCarriageObject vastCarriageObject) {
        this.f9535a = vastCarriageObject;
    }

    private int a(String str) {
        String[] split = str.split(":");
        if (split.length == 3) {
            return Integer.parseInt(split[2]) + (Integer.parseInt(split[1]) * 60) + (Integer.parseInt(split[0]) * 3600);
        }
        return -1;
    }

    private int a(Node node, String str, int i) {
        Node namedItem = node.getAttributes().getNamedItem(str);
        return namedItem == null ? i : Integer.parseInt(namedItem.getNodeValue());
    }

    private Vast.Wrapper a(Node node) {
        Vast.Wrapper wrapper = new Vast.Wrapper();
        a(wrapper, node);
        wrapper.setWrapperUrl(a(node, "VASTAdTagURI"));
        return wrapper;
    }

    private String a(Node node, String str) {
        LinkedList linkedList = new LinkedList();
        if (node == null) {
            return "";
        }
        linkedList.add(node);
        while (!linkedList.isEmpty()) {
            Node poll = linkedList.poll();
            if (poll != null) {
                if (poll.getNodeName().equalsIgnoreCase(str)) {
                    return d(poll.getChildNodes().item(0));
                }
                a(linkedList, poll);
            }
        }
        return "";
    }

    private HashMap<String, LinkedList<String>> a(Node node, String str, String str2) {
        LinkedList linkedList = new LinkedList();
        HashMap<String, LinkedList<String>> hashMap = new HashMap<>();
        if (node == null) {
            return null;
        }
        linkedList.add(node);
        while (!linkedList.isEmpty()) {
            Node poll = linkedList.poll();
            if (poll != null) {
                if (poll.getNodeName().equalsIgnoreCase(str)) {
                    Node namedItem = poll.getAttributes().getNamedItem(str2);
                    Node item = poll.getChildNodes().item(0);
                    String nodeValue = namedItem == null ? "" : namedItem.getNodeValue();
                    String c2 = c(item == null ? "" : item.getNodeValue());
                    if (nodeValue == null) {
                        nodeValue = "";
                    }
                    if (c2 == null) {
                        c2 = "";
                    }
                    String trim = c2.replace("/null", "").trim();
                    if (hashMap.get(nodeValue) == null) {
                        LinkedList<String> linkedList2 = new LinkedList<>();
                        linkedList2.add(trim);
                        hashMap.put(nodeValue, linkedList2);
                    } else {
                        hashMap.get(nodeValue).add(trim);
                    }
                }
                a(linkedList, poll);
            }
        }
        return hashMap;
    }

    private List<Node> a(Vast.VastCarriageObject vastCarriageObject, Node node) {
        vastCarriageObject.addEvents(VideoEvent.EVENT_IMPRESSION, b(node, "Impression"));
        List<Node> c2 = c(node);
        if (c2 != null && c2.size() > 0) {
            HashMap<String, LinkedList<String>> a2 = a(c2.get(0), "Tracking", "event");
            vastCarriageObject.addEvents(a2);
            vastCarriageObject.addEvents("click", b(c2.get(0), "clickTracking"));
            vastCarriageObject.addEvents(VideoEvent.EVENT_IMPRESSION, a2.get(VideoEvent.EVENT_CREATIVE_VIEW));
        }
        return c2;
    }

    private Document a(InputStream inputStream) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(Vast vast, Node node) {
        Vast.Wrapper a2;
        if (node == null) {
            return;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName() != null && item.getNodeName().equalsIgnoreCase("InLine")) {
                Vast.Inline b2 = b(item);
                b2.setParent(this.f9535a);
                vast.insertInline(b2);
            } else if (item.getNodeName() != null && item.getNodeName().equalsIgnoreCase("Wrapper") && (a2 = a(item)) != null && a2.getWrapperUrl() != null) {
                a2.setParent(this.f9535a);
                vast.insertWrapper(a2);
            }
        }
    }

    private void a(Queue<Node> queue, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            queue.add(childNodes.item(i));
        }
    }

    private Vast.Inline b(Node node) {
        Vast.Inline inline = new Vast.Inline();
        List<Node> a2 = a(inline, node);
        if (a2 != null && a2.size() > 0) {
            inline.setClickThroughUrl(a(a2.get(0), VideoEvent.EVENT_CLICK_THROUGH));
            inline.setDuration(a(a(a2.get(0), "Duration")));
            inline.setMediaFiles(e(a2.get(0)));
        }
        return inline;
    }

    private String b(Node node, String str, String str2) {
        Node namedItem = node.getAttributes().getNamedItem(str);
        return namedItem == null ? str2 : namedItem.getNodeValue();
    }

    private LinkedList<String> b(Node node, String str) {
        LinkedList linkedList = new LinkedList();
        LinkedList<String> linkedList2 = new LinkedList<>();
        if (node == null) {
            return null;
        }
        linkedList.add(node);
        while (!linkedList.isEmpty()) {
            Node poll = linkedList.poll();
            if (poll != null) {
                if (poll.getNodeName().equalsIgnoreCase(str)) {
                    linkedList2.add(d(poll.getChildNodes().item(0)));
                }
                a(linkedList, poll);
            }
        }
        return linkedList2;
    }

    private Document b(String str) {
        return a(new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8"))));
    }

    private String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private List<Node> c(Node node) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (node == null) {
            return null;
        }
        linkedList2.add(node);
        while (!linkedList2.isEmpty()) {
            Node poll = linkedList2.poll();
            if (poll != null) {
                if (poll.getNodeName().equalsIgnoreCase("Creatives")) {
                    poll.getChildNodes().item(0);
                    NodeList childNodes = poll.getChildNodes();
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        NodeList childNodes2 = childNodes.item(i).getChildNodes();
                        int i2 = 0;
                        while (true) {
                            if (i2 < childNodes2.getLength()) {
                                Node item = childNodes2.item(i2);
                                if (item.getNodeName().equalsIgnoreCase("Linear")) {
                                    linkedList.add(item);
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
                a(linkedList2, poll);
            }
        }
        return linkedList;
    }

    private String d(Node node) {
        return (node == null ? "" : node.getNodeValue()).replace("/null", "").trim();
    }

    private LinkedList<MediaFileItem> e(Node node) {
        LinkedList linkedList = new LinkedList();
        LinkedList<MediaFileItem> linkedList2 = new LinkedList<>();
        if (node == null) {
            return linkedList2;
        }
        linkedList.add(node);
        while (!linkedList.isEmpty()) {
            Node poll = linkedList.poll();
            if (poll != null) {
                if (poll.getNodeName().equalsIgnoreCase("MediaFile")) {
                    int a2 = a(poll, "height", 0);
                    int a3 = a(poll, "width", 0);
                    int a4 = a(poll, "bitrate", 0);
                    String b2 = b(poll, "type", "");
                    String b3 = b(poll, "delivery", "");
                    Node item = poll.getChildNodes().item(0);
                    MediaFileItem mediaFileItem = new MediaFileItem(a2, a3, a4, b2, b3, c(item == null ? "" : item.getNodeValue()));
                    if (mediaFileItem.valid()) {
                        linkedList2.add(mediaFileItem);
                    }
                }
                a(linkedList, poll);
            }
        }
        return linkedList2;
    }

    public boolean a(String str, Vast vast) {
        Document b2 = b(str);
        if (b2 != null) {
            b2.getDocumentElement().normalize();
            NodeList childNodes = b2.getFirstChild().getChildNodes();
            if (childNodes != null) {
                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node item = childNodes.item(i);
                    if (item.getNodeName() != null && "Ad".equalsIgnoreCase(item.getNodeName()) && item.getChildNodes().getLength() > 0) {
                        a(vast, item);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
