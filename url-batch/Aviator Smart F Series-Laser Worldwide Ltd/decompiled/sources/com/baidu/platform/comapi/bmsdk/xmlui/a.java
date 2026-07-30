package com.baidu.platform.comapi.bmsdk.xmlui;

import android.graphics.Color;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.platform.comapi.bmsdk.style.BmGuessResource;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmFrameLayout;
import com.baidu.platform.comapi.bmsdk.ui.BmGroupUI;
import com.baidu.platform.comapi.bmsdk.ui.BmHorizontalLayout;
import com.baidu.platform.comapi.bmsdk.ui.BmImageUI;
import com.baidu.platform.comapi.bmsdk.ui.BmLabelUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import com.baidu.platform.comapi.bmsdk.ui.BmVerticalLayout;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class a {
    private BmImageUI c(Node node) {
        BmImageUI bmImageUI = new BmImageUI();
        if (node.getAttributes() != null) {
            a(bmImageUI, node);
        }
        return bmImageUI;
    }

    private BmLabelUI d(Node node) {
        BmLabelUI bmLabelUI = new BmLabelUI();
        if (node.getAttributes() != null) {
            a(bmLabelUI, node);
        }
        return bmLabelUI;
    }

    private BmVerticalLayout e(Node node) {
        BmVerticalLayout bmVerticalLayout = new BmVerticalLayout();
        if (node.getAttributes() != null) {
            a(bmVerticalLayout, node);
        }
        return bmVerticalLayout;
    }

    public BmRichView a(Document document) {
        BmBaseUI b8 = b(document);
        if (b8 == null) {
            return null;
        }
        BmRichView bmRichView = new BmRichView();
        bmRichView.a(b8);
        return bmRichView;
    }

    public BmBaseUI b(Document document) {
        if (document != null) {
            return a(document.getDocumentElement(), (BmGroupUI) null);
        }
        return null;
    }

    final BmBaseUI f(Node node) {
        String nodeName = node.getNodeName();
        nodeName.hashCode();
        switch (nodeName) {
            case "VerticalLayout":
                return e(node);
            case "Label":
                return d(node);
            case "ImageView":
                return c(node);
            case "FrameLayout":
                return a(node);
            case "HorizontalLayout":
                return b(node);
            default:
                return null;
        }
    }

    private BmHorizontalLayout b(Node node) {
        BmHorizontalLayout bmHorizontalLayout = new BmHorizontalLayout();
        if (node.getAttributes() != null) {
            a(bmHorizontalLayout, node);
        }
        return bmHorizontalLayout;
    }

    private BmBaseUI a(Node node, BmGroupUI bmGroupUI) {
        BmBaseUI bmBaseUI = null;
        if (node == null) {
            return null;
        }
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            BmBaseUI f8 = f(firstChild);
            if (f8 != null) {
                if (firstChild.hasChildNodes()) {
                    a(firstChild, (BmGroupUI) f8);
                }
                if ((bmGroupUI == null || bmGroupUI.a(f8)) && bmBaseUI == null) {
                    bmBaseUI = f8;
                }
            }
        }
        return bmBaseUI;
    }

    private BmFrameLayout a(Node node) {
        BmFrameLayout bmFrameLayout = new BmFrameLayout();
        if (node.getAttributes() != null) {
            a(bmFrameLayout, node);
        }
        return bmFrameLayout;
    }

    private void a(BmBaseUI bmBaseUI, String str, String str2) {
        if ("name".equals(str)) {
            bmBaseUI.setName(str2);
            return;
        }
        if ("tag".equals(str)) {
            bmBaseUI.setTag(str2);
            return;
        }
        if ("bkImage".equals(str)) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            bmBaseUI.a(new BmGuessResource(str2));
            return;
        }
        int i8 = 0;
        if ("bkColor".equals(str)) {
            if (str2.charAt(0) == '#') {
                bmBaseUI.b(Color.parseColor(str2));
                return;
            } else {
                bmBaseUI.b(Integer.parseInt(str2));
                return;
            }
        }
        if ("bkColorL".equals(str)) {
            if (str2.charAt(0) == '#') {
                bmBaseUI.c(Color.parseColor(str2));
                return;
            } else {
                bmBaseUI.c(Integer.parseInt(str2));
                return;
            }
        }
        if ("bkColorR".equals(str)) {
            if (str2.charAt(0) == '#') {
                bmBaseUI.d(Color.parseColor(str2));
                return;
            } else {
                bmBaseUI.d(Integer.parseInt(str2));
                return;
            }
        }
        if (x.KEY_WIDTH.equals(str)) {
            if (TtmlNode.TEXT_EMPHASIS_AUTO.equals(str2)) {
                bmBaseUI.i(-2);
                return;
            } else {
                bmBaseUI.i(Integer.parseInt(str2));
                return;
            }
        }
        if (x.KEY_HEIGHT.equals(str)) {
            if (TtmlNode.TEXT_EMPHASIS_AUTO.equals(str2)) {
                bmBaseUI.f(-2);
                return;
            } else {
                bmBaseUI.f(Integer.parseInt(str2));
                return;
            }
        }
        if ("clickAction".equals(str)) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            bmBaseUI.a(str2);
            bmBaseUI.a(true);
            return;
        }
        if ("padding".equals(str)) {
            String[] split = str2.split(SystemInfoUtil.COMMA);
            if (split == null || split.length != 4) {
                return;
            }
            bmBaseUI.b(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            return;
        }
        if ("margin".equals(str)) {
            String[] split2 = str2.split(SystemInfoUtil.COMMA);
            if (split2 == null || split2.length != 4) {
                return;
            }
            bmBaseUI.a(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]), Integer.parseInt(split2[3]));
            return;
        }
        if ("visibility".equals(str)) {
            if (MapBundleKey.MapObjKey.OBJ_SL_VISI.equals(str2)) {
                bmBaseUI.h(1);
                return;
            } else if ("gone".equals(str2)) {
                bmBaseUI.h(4);
                return;
            } else {
                if ("invisible".equals(str2)) {
                    bmBaseUI.h(1);
                    return;
                }
                return;
            }
        }
        if ("vcenterInparent".equals(str)) {
            if ("true".equals(str2)) {
                bmBaseUI.e(32);
                return;
            }
            return;
        }
        if ("layoutWeight".equals(str)) {
            bmBaseUI.g(Integer.parseInt(str2));
            return;
        }
        if ("alignParent".equals(str)) {
            String[] split3 = str2.split("\\|");
            if (split3 != null && split3.length > 0) {
                int length = split3.length;
                int i9 = 0;
                while (i8 < length) {
                    String str3 = split3[i8];
                    if (str3.contains(TtmlNode.LEFT)) {
                        i9 |= 1;
                    } else if (str3.contains(TtmlNode.RIGHT)) {
                        i9 |= 4;
                    } else if (str3.contains("top")) {
                        i9 |= 2;
                    } else if (str3.contains("bottom")) {
                        i9 |= 8;
                    } else if (str3.contains("hcenter")) {
                        i9 |= 16;
                    } else if (str3.contains("vcenter")) {
                        i9 |= 32;
                    } else if (str3.contains(TtmlNode.CENTER)) {
                        i9 |= 48;
                    }
                    i8++;
                }
                i8 = i9;
            }
            bmBaseUI.a(i8);
            return;
        }
        "trim".equals(str);
    }

    private void a(BmLabelUI bmLabelUI, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        BmTextStyle bmTextStyle = new BmTextStyle();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = attributes.item(i8);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (!TextUtils.isEmpty(nodeName) && !TextUtils.isEmpty(nodeValue)) {
                if ("text".equals(nodeName)) {
                    bmLabelUI.b(nodeValue);
                } else if ("maxLines".equals(nodeName)) {
                    bmLabelUI.j(Integer.parseInt(nodeValue));
                } else if (TtmlNode.ATTR_TTS_FONT_SIZE.equals(nodeName)) {
                    bmTextStyle.e(Integer.parseInt(nodeValue));
                } else if ("fontOption".equals(nodeName)) {
                    if ("normal".equals(nodeValue)) {
                        bmTextStyle.c(0);
                    } else if (TtmlNode.BOLD.equals(nodeValue)) {
                        bmTextStyle.c(1);
                    } else if (TtmlNode.ITALIC.equals(nodeValue)) {
                        bmTextStyle.c(2);
                    }
                } else if ("textColor".equals(nodeName)) {
                    if (nodeValue.charAt(0) == '#') {
                        bmTextStyle.d(Color.parseColor(nodeValue));
                    } else {
                        bmTextStyle.d(Integer.parseInt(nodeValue));
                    }
                } else if ("borderColor".equals(nodeName)) {
                    if (nodeValue.charAt(0) == '#') {
                        bmTextStyle.a(Color.parseColor(nodeValue));
                    } else {
                        bmTextStyle.a(Integer.parseInt(nodeValue));
                    }
                } else if ("borderWidth".equals(nodeName)) {
                    bmTextStyle.b(Integer.parseInt(nodeValue));
                } else if ("gravity".equals(nodeName)) {
                    if (TtmlNode.LEFT.equals(nodeValue)) {
                        bmLabelUI.e(1);
                    } else if (TtmlNode.RIGHT.equals(nodeValue)) {
                        bmLabelUI.e(4);
                    } else if ("hcenter".equals(nodeValue)) {
                        bmLabelUI.e(16);
                    } else if ("top".equals(nodeValue)) {
                        bmLabelUI.e(2);
                    } else if ("bottom".equals(nodeValue)) {
                        bmLabelUI.e(8);
                    } else if ("vcenter".equals(nodeValue)) {
                        bmLabelUI.e(32);
                    } else if ("bottom|hcenter".equals(nodeValue)) {
                        bmLabelUI.e(24);
                    } else if (TtmlNode.CENTER.equals(nodeValue)) {
                        bmLabelUI.e(48);
                    }
                } else {
                    a(bmLabelUI, nodeName, nodeValue);
                }
            }
        }
        bmLabelUI.a(bmTextStyle);
    }

    private void a(BmImageUI bmImageUI, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = attributes.item(i8);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (!TextUtils.isEmpty(nodeName) && !TextUtils.isEmpty(nodeValue)) {
                if ("frImage".equals(nodeName)) {
                    if (!TextUtils.isEmpty(nodeValue)) {
                        bmImageUI.b(new BmGuessResource(nodeValue));
                    }
                } else if ("mask".equals(nodeName)) {
                    if (!TextUtils.isEmpty(nodeValue)) {
                        bmImageUI.c(new BmGuessResource(nodeValue));
                    }
                } else {
                    a(bmImageUI, nodeName, nodeValue);
                }
            }
        }
    }

    private void a(BmVerticalLayout bmVerticalLayout, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = attributes.item(i8);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (!TextUtils.isEmpty(nodeName) && !TextUtils.isEmpty(nodeValue)) {
                if (!"gravity".equals(nodeName) && !"childhalign".equals(nodeName)) {
                    a(bmVerticalLayout, nodeName, nodeValue);
                } else if (TtmlNode.LEFT.equals(nodeValue)) {
                    bmVerticalLayout.e(1);
                } else if (TtmlNode.RIGHT.equals(nodeValue)) {
                    bmVerticalLayout.e(4);
                } else if ("hcenter".equals(nodeValue)) {
                    bmVerticalLayout.e(16);
                }
            }
        }
    }

    private void a(BmHorizontalLayout bmHorizontalLayout, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = attributes.item(i8);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (!TextUtils.isEmpty(nodeName) && !TextUtils.isEmpty(nodeValue)) {
                if (!"gravity".equals(nodeName) && !"childvalign".equals(nodeName)) {
                    a(bmHorizontalLayout, nodeName, nodeValue);
                } else if ("top".equals(nodeValue)) {
                    bmHorizontalLayout.e(2);
                } else if ("bottom".equals(nodeValue)) {
                    bmHorizontalLayout.e(8);
                } else if ("vcenter".equals(nodeValue)) {
                    bmHorizontalLayout.e(32);
                }
            }
        }
    }

    private void a(BmFrameLayout bmFrameLayout, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = attributes.item(i8);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (!TextUtils.isEmpty(nodeName) && !TextUtils.isEmpty(nodeValue)) {
                if (!"gravity".equals(nodeName) && !"childalign".equals(nodeName)) {
                    a(bmFrameLayout, nodeName, nodeValue);
                } else if (TtmlNode.LEFT.equals(nodeValue)) {
                    bmFrameLayout.e(1);
                } else if (TtmlNode.RIGHT.equals(nodeValue)) {
                    bmFrameLayout.e(4);
                } else if (TtmlNode.CENTER.equals(nodeValue)) {
                    bmFrameLayout.e(48);
                } else if ("hcenter".equals(nodeValue)) {
                    bmFrameLayout.e(16);
                } else if ("top".equals(nodeValue)) {
                    bmFrameLayout.e(2);
                } else if ("bottom".equals(nodeValue)) {
                    bmFrameLayout.e(8);
                } else if ("vcenter".equals(nodeValue)) {
                    bmFrameLayout.e(32);
                } else if ("bottom|hcenter".equals(nodeValue)) {
                    bmFrameLayout.e(24);
                }
            }
        }
    }
}
