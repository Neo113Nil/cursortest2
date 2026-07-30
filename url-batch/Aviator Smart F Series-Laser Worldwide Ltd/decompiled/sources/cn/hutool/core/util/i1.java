package cn.hutool.core.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.map.BiMap;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class i1 {
    public static final String AMP = "&amp;";
    public static final String APOS = "&apos;";
    public static final String COMMENT_REGEX = "(?s)<!--.+?-->";
    public static final String GT = "&gt;";
    public static final int INDENT_DEFAULT = 2;
    public static final String INVALID_REGEX = "[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f]";
    public static final String LT = "&lt;";
    public static final String NBSP = "&nbsp;";
    public static final String QUOTE = "&quot;";
    private static String defaultDocumentBuilderFactory = "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl";
    private static SAXParserFactory factory = null;
    private static boolean namespaceAware = true;

    public static class a implements NamespaceContext {
        private static final String DEFAULT_NS = "DEFAULT";
        private final BiMap<String, String> prefixUri = new BiMap<>(new HashMap());

        public a(Node node, boolean z7) {
            examineNode(node.getFirstChild(), z7);
        }

        private void examineNode(Node node, boolean z7) {
            NodeList childNodes;
            NamedNodeMap attributes = node.getAttributes();
            if (attributes != null) {
                int length = attributes.getLength();
                for (int i8 = 0; i8 < length; i8++) {
                    storeAttribute(attributes.item(i8));
                }
            }
            if (z7 || (childNodes = node.getChildNodes()) == null) {
                return;
            }
            int length2 = childNodes.getLength();
            for (int i9 = 0; i9 < length2; i9++) {
                Node item = childNodes.item(i9);
                if (item.getNodeType() == 1) {
                    examineNode(item, false);
                }
            }
        }

        private void storeAttribute(Node node) {
            if (node != null && "http://www.w3.org/2000/xmlns/".equals(node.getNamespaceURI())) {
                if ("xmlns".equals(node.getNodeName())) {
                    this.prefixUri.put(DEFAULT_NS, node.getNodeValue());
                } else {
                    this.prefixUri.put(node.getLocalName(), node.getNodeValue());
                }
            }
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getNamespaceURI(String str) {
            return (str == null || "".equals(str)) ? this.prefixUri.get(DEFAULT_NS) : this.prefixUri.get(str);
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getPrefix(String str) {
            return this.prefixUri.getInverse().get(str);
        }

        @Override // javax.xml.namespace.NamespaceContext
        public Iterator<String> getPrefixes(String str) {
            return null;
        }
    }

    public static void append(Node node, Object obj) {
        append(getOwnerDocument(node), node, obj);
    }

    public static Element appendChild(Node node, String str) {
        return appendChild(node, str, null);
    }

    private static void appendIterator(Document document, Node node, Iterator it) {
        Node parentNode = node.getParentNode();
        boolean z7 = true;
        while (it.hasNext()) {
            Object next = it.next();
            if (z7) {
                append(document, node, next);
                z7 = false;
            } else {
                Node cloneNode = node.cloneNode(false);
                parentNode.appendChild(cloneNode);
                append(document, cloneNode, next);
            }
        }
    }

    private static void appendMap(final Document document, final Node node, Map map) {
        map.forEach(new BiConsumer() { // from class: cn.hutool.core.util.h1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i1.lambda$appendMap$0(node, document, obj, obj2);
            }
        });
    }

    public static Node appendText(Node node, CharSequence charSequence) {
        return appendText(getOwnerDocument(node), node, charSequence);
    }

    public static Document beanToXml(Object obj) {
        return beanToXml(obj, null);
    }

    public static String cleanComment(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(COMMENT_REGEX, "");
    }

    public static String cleanInvalid(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(INVALID_REGEX, "");
    }

    public static DocumentBuilder createDocumentBuilder() {
        try {
            return createDocumentBuilderFactory().newDocumentBuilder();
        } catch (Exception e8) {
            throw new UtilException(e8, "Create xml document error!", new Object[0]);
        }
    }

    public static DocumentBuilderFactory createDocumentBuilderFactory() {
        DocumentBuilderFactory newInstance = cn.hutool.core.text.l.isNotEmpty(defaultDocumentBuilderFactory) ? DocumentBuilderFactory.newInstance(defaultDocumentBuilderFactory, null) : DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(namespaceAware);
        return disableXXE(newInstance);
    }

    public static XPath createXPath() {
        return XPathFactory.newInstance().newXPath();
    }

    public static Document createXml() {
        return createDocumentBuilder().newDocument();
    }

    public static synchronized void disableDefaultDocumentBuilderFactory() {
        synchronized (i1.class) {
            defaultDocumentBuilderFactory = null;
        }
    }

    private static DocumentBuilderFactory disableXXE(DocumentBuilderFactory documentBuilderFactory) {
        try {
            documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactory.setXIncludeAware(false);
            documentBuilderFactory.setExpandEntityReferences(false);
        } catch (ParserConfigurationException unused) {
        }
        return documentBuilderFactory;
    }

    public static String elementText(Element element, String str) {
        Element element2 = getElement(element, str);
        if (element2 == null) {
            return null;
        }
        return element2.getTextContent();
    }

    public static String escape(String str) {
        return y.escapeHtml4(str);
    }

    public static String format(Document document) {
        return toStr(document, true);
    }

    public static Object getByXPath(String str, Object obj, QName qName) {
        return getByXPath(str, obj, qName, obj instanceof Node ? new a((Node) obj, false) : null);
    }

    public static Element getElement(Element element, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        int length = elementsByTagName.getLength();
        if (length < 1) {
            return null;
        }
        for (int i8 = 0; i8 < length; i8++) {
            Element element2 = (Element) elementsByTagName.item(i8);
            if (element2 == null || element2.getParentNode() == element) {
                return element2;
            }
        }
        return null;
    }

    public static Element getElementByXPath(String str, Object obj) {
        return (Element) getNodeByXPath(str, obj);
    }

    public static List<Element> getElements(Element element, String str) {
        return transElements(element, cn.hutool.core.text.l.isBlank(str) ? element.getChildNodes() : element.getElementsByTagName(str));
    }

    public static Node getNodeByXPath(String str, Object obj) {
        return (Node) getByXPath(str, obj, XPathConstants.NODE);
    }

    public static NodeList getNodeListByXPath(String str, Object obj) {
        return (NodeList) getByXPath(str, obj, XPathConstants.NODESET);
    }

    public static Document getOwnerDocument(Node node) {
        return node instanceof Document ? (Document) node : node.getOwnerDocument();
    }

    public static Element getRootElement(Document document) {
        if (document == null) {
            return null;
        }
        return document.getDocumentElement();
    }

    public static boolean isElement(Node node) {
        return node != null && 1 == node.getNodeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$appendMap$0(Node node, Document document, Object obj, Object obj2) {
        if (obj != null) {
            Element appendChild = appendChild(node, obj.toString());
            if (obj2 != null) {
                append(document, appendChild, obj2);
            }
        }
    }

    public static Document mapToXml(Map<?, ?> map, String str) {
        return mapToXml(map, str, null);
    }

    public static String mapToXmlStr(Map<?, ?> map) {
        return toStr(mapToXml(map, "xml"));
    }

    public static Document parseXml(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            throw new IllegalArgumentException("XML content string is empty !");
        }
        return readXML(c1.getReader(cleanInvalid(str)));
    }

    public static void readBySax(File file, ContentHandler contentHandler) {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = cn.hutool.core.io.l.getInputStream(file);
            try {
                readBySax(new InputSource(bufferedInputStream), contentHandler);
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
            } catch (Throwable th) {
                th = th;
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static Document readXML(File file) {
        BufferedInputStream bufferedInputStream;
        cn.hutool.core.lang.q.notNull(file, "Xml file is null !", new Object[0]);
        if (!file.exists()) {
            throw new UtilException("File [{}] not a exist!", file.getAbsolutePath());
        }
        if (!file.isFile()) {
            throw new UtilException("[{}] not a file!", file.getAbsolutePath());
        }
        try {
            file = file.getCanonicalFile();
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream = cn.hutool.core.io.l.getInputStream(file);
            try {
                Document readXML = readXML(bufferedInputStream);
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                return readXML;
            } catch (Throwable th) {
                th = th;
                cn.hutool.core.io.n.close((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    public static synchronized void setNamespaceAware(boolean z7) {
        synchronized (i1.class) {
            namespaceAware = z7;
        }
    }

    public static void toFile(Document document, String str) {
        toFile(document, str, null);
    }

    public static String toStr(Node node) {
        return toStr(node, false);
    }

    public static List<Element> transElements(NodeList nodeList) {
        return transElements(null, nodeList);
    }

    public static void transform(Source source, Result result, String str, int i8) {
        transform(source, result, str, i8, false);
    }

    public static String unescape(String str) {
        return y.unescapeHtml4(str);
    }

    public static void write(Node node, Writer writer, String str, int i8) {
        transform(new DOMSource(node), new StreamResult(writer), str, i8);
    }

    public static void writeObjectAsXml(File file, Object obj) {
        AutoCloseable autoCloseable = null;
        try {
            AutoCloseable xMLEncoder = new XMLEncoder(cn.hutool.core.io.l.getOutputStream(file));
            try {
                xMLEncoder.writeObject(obj);
                cn.hutool.core.io.q.close(xMLEncoder);
            } catch (Throwable th) {
                th = th;
                autoCloseable = xMLEncoder;
                cn.hutool.core.io.q.close(autoCloseable);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static <T> T xmlToBean(Node node, Class<T> cls) {
        Map<String, Object> xmlToMap = xmlToMap(node);
        if (xmlToMap != null && xmlToMap.size() == 1) {
            String simpleName = cls.getSimpleName();
            String str = (String) CollUtil.getFirst(xmlToMap.keySet());
            if (simpleName.equalsIgnoreCase(str)) {
                return (T) cn.hutool.core.bean.q.toBean(xmlToMap.get(str), cls);
            }
        }
        return (T) cn.hutool.core.bean.q.toBean(xmlToMap, cls);
    }

    public static Map<String, Object> xmlToMap(String str) {
        return xmlToMap(str, new HashMap());
    }

    private static void append(Document document, Node node, Object obj) {
        if (obj instanceof Map) {
            appendMap(document, node, (Map) obj);
            return;
        }
        if (obj instanceof Iterator) {
            appendIterator(document, node, (Iterator) obj);
        } else if (obj instanceof Iterable) {
            appendIterator(document, node, ((Iterable) obj).iterator());
        } else {
            appendText(document, node, obj.toString());
        }
    }

    public static Element appendChild(Node node, String str, String str2) {
        Document ownerDocument = getOwnerDocument(node);
        Element createElement = str2 == null ? ownerDocument.createElement(str) : ownerDocument.createElementNS(str2, str);
        node.appendChild(createElement);
        return createElement;
    }

    private static Node appendText(Document document, Node node, CharSequence charSequence) {
        return node.appendChild(document.createTextNode(cn.hutool.core.text.l.str(charSequence)));
    }

    public static Document beanToXml(Object obj, String str) {
        return beanToXml(obj, str, false);
    }

    public static Document createXml(String str) {
        return createXml(str, null);
    }

    public static String format(String str) {
        return format(parseXml(str));
    }

    public static Document mapToXml(Map<?, ?> map, String str, String str2) {
        Document createXml = createXml();
        appendMap(createXml, appendChild(createXml, str, str2), map);
        return createXml;
    }

    public static String mapToXmlStr(Map<?, ?> map, boolean z7) {
        return toStr(mapToXml(map, "xml"), l.UTF_8, false, z7);
    }

    public static void toFile(Document document, String str, String str2) {
        if (cn.hutool.core.text.l.isBlank(str2)) {
            str2 = document.getXmlEncoding();
        }
        if (cn.hutool.core.text.l.isBlank(str2)) {
            str2 = l.UTF_8;
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = cn.hutool.core.io.l.getWriter(str, l.charset(str2), false);
            write(document, bufferedWriter, str2, 2);
        } finally {
            cn.hutool.core.io.n.close((Closeable) bufferedWriter);
        }
    }

    public static String toStr(Document document) {
        return toStr((Node) document);
    }

    public static List<Element> transElements(Element element, NodeList nodeList) {
        int length = nodeList.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            if (1 == nodeList.item(i8).getNodeType()) {
                Element element2 = (Element) nodeList.item(i8);
                if (element == null || element2.getParentNode() == element) {
                    arrayList.add(element2);
                }
            }
        }
        return arrayList;
    }

    public static void transform(Source source, Result result, String str, int i8, boolean z7) {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            if (i8 > 0) {
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("doctype-public", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(i8));
            }
            if (cn.hutool.core.text.l.isNotBlank(str)) {
                newTransformer.setOutputProperty("encoding", str);
            }
            if (z7) {
                newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            }
            newTransformer.transform(source, result);
        } catch (Exception e8) {
            throw new UtilException(e8, "Trans xml document to string error!", new Object[0]);
        }
    }

    public static void write(Node node, Writer writer, String str, int i8, boolean z7) {
        transform(new DOMSource(node), new StreamResult(writer), str, i8, z7);
    }

    public static Map<String, Object> xmlToMap(Node node) {
        return xmlToMap(node, new HashMap());
    }

    public static Document beanToXml(Object obj, String str, boolean z7) {
        if (obj == null) {
            return null;
        }
        return mapToXml(cn.hutool.core.bean.q.beanToMap(obj, false, z7), obj.getClass().getSimpleName(), str);
    }

    public static Document createXml(String str, String str2) {
        Document createXml = createXml();
        createXml.appendChild(str2 == null ? createXml.createElement(str) : createXml.createElementNS(str2, str));
        return createXml;
    }

    public static String elementText(Element element, String str, String str2) {
        Element element2 = getElement(element, str);
        return element2 == null ? str2 : element2.getTextContent();
    }

    public static String mapToXmlStr(Map<?, ?> map, String str) {
        return toStr(mapToXml(map, str));
    }

    public static String toStr(Node node, boolean z7) {
        return toStr(node, l.UTF_8, z7);
    }

    public static void write(Node node, OutputStream outputStream, String str, int i8) {
        transform(new DOMSource(node), new StreamResult(outputStream), str, i8);
    }

    public static Map<String, Object> xmlToMap(String str, Map<String, Object> map) {
        Element rootElement = getRootElement(parseXml(str));
        rootElement.normalize();
        return xmlToMap(rootElement, map);
    }

    public static Object getByXPath(String str, Object obj, QName qName, NamespaceContext namespaceContext) {
        XPath createXPath = createXPath();
        if (namespaceContext != null) {
            createXPath.setNamespaceContext(namespaceContext);
        }
        try {
            if (obj instanceof InputSource) {
                return createXPath.evaluate(str, (InputSource) obj, qName);
            }
            return createXPath.evaluate(str, obj, qName);
        } catch (XPathExpressionException e8) {
            throw new UtilException(e8);
        }
    }

    public static String mapToXmlStr(Map<?, ?> map, String str, String str2) {
        return toStr(mapToXml(map, str, str2));
    }

    public static String toStr(Document document, boolean z7) {
        return toStr((Node) document, z7);
    }

    public static void write(Node node, OutputStream outputStream, String str, int i8, boolean z7) {
        transform(new DOMSource(node), new StreamResult(outputStream), str, i8, z7);
    }

    public static String mapToXmlStr(Map<?, ?> map, String str, String str2, boolean z7) {
        return toStr(mapToXml(map, str, str2), l.UTF_8, false, z7);
    }

    public static void readBySax(Reader reader, ContentHandler contentHandler) {
        try {
            readBySax(new InputSource(reader), contentHandler);
        } finally {
            cn.hutool.core.io.n.close((Closeable) reader);
        }
    }

    public static String toStr(Node node, String str, boolean z7) {
        return toStr(node, str, z7, false);
    }

    public static String mapToXmlStr(Map<?, ?> map, String str, String str2, boolean z7, boolean z8) {
        return toStr(mapToXml(map, str, str2), l.UTF_8, z7, z8);
    }

    public static String toStr(Document document, String str, boolean z7) {
        return toStr((Node) document, str, z7);
    }

    public static String mapToXmlStr(Map<?, ?> map, String str, String str2, String str3, boolean z7, boolean z8) {
        return toStr(mapToXml(map, str, str2), str3, z7, z8);
    }

    public static String toStr(Node node, String str, boolean z7, boolean z8) {
        StringWriter writer = c1.getWriter();
        try {
            write(node, writer, str, z7 ? 2 : 0, z8);
            return writer.toString();
        } catch (Exception e8) {
            throw new UtilException(e8, "Trans xml document to string error!", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    public static Map<String, Object> xmlToMap(Node node, Map<String, Object> map) {
        String str;
        Map<String, Object> map2 = map;
        if (map == null) {
            map2 = new HashMap();
        }
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i8 = 0; i8 < length; i8++) {
            Node item = childNodes.item(i8);
            if (isElement(item)) {
                Element element = (Element) item;
                Object obj = map2.get(element.getNodeName());
                if (element.hasChildNodes()) {
                    ?? xmlToMap = xmlToMap(element);
                    boolean isNotEmpty = cn.hutool.core.map.h1.isNotEmpty(xmlToMap);
                    str = xmlToMap;
                    if (!isNotEmpty) {
                        str = element.getTextContent();
                    }
                } else {
                    str = element.getTextContent();
                }
                if (str != null) {
                    if (obj != null) {
                        if (obj instanceof List) {
                            ((List) obj).add(str);
                        } else {
                            map2.put(element.getNodeName(), CollUtil.newArrayList(obj, str));
                        }
                    } else {
                        map2.put(element.getNodeName(), str);
                    }
                }
            }
        }
        return map2;
    }

    public static void readBySax(InputStream inputStream, ContentHandler contentHandler) {
        try {
            readBySax(new InputSource(inputStream), contentHandler);
        } finally {
            cn.hutool.core.io.n.close((Closeable) inputStream);
        }
    }

    public static void readBySax(InputSource inputSource, ContentHandler contentHandler) {
        if (factory == null) {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            factory = newInstance;
            newInstance.setValidating(false);
            factory.setNamespaceAware(namespaceAware);
            try {
                factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
                factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            } catch (Exception unused) {
            }
        }
        try {
            SAXParser newSAXParser = factory.newSAXParser();
            if (contentHandler instanceof DefaultHandler) {
                newSAXParser.parse(inputSource, (DefaultHandler) contentHandler);
                return;
            }
            XMLReader xMLReader = newSAXParser.getXMLReader();
            xMLReader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            xMLReader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
            xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            xMLReader.setContentHandler(contentHandler);
            xMLReader.parse(inputSource);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        } catch (ParserConfigurationException e9) {
            e = e9;
            throw new UtilException(e);
        } catch (SAXException e10) {
            e = e10;
            throw new UtilException(e);
        }
    }

    public static Document readXML(String str) {
        if (cn.hutool.core.text.l.startWith((CharSequence) str, '<')) {
            return parseXml(str);
        }
        return readXML(cn.hutool.core.io.l.file(str));
    }

    public static Document readXML(InputStream inputStream) {
        return readXML(new InputSource(inputStream));
    }

    public static Document readXML(Reader reader) {
        return readXML(new InputSource(reader));
    }

    public static Document readXML(InputSource inputSource) {
        try {
            return createDocumentBuilder().parse(inputSource);
        } catch (Exception e8) {
            throw new UtilException(e8, "Parse XML from stream error!", new Object[0]);
        }
    }
}
