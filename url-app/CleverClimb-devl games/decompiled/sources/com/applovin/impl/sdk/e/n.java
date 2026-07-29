package com.applovin.impl.sdk.e;

import android.util.Xml;
import com.applovin.impl.sdk.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final p f3257a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3258b;

    /* renamed from: c, reason: collision with root package name */
    private Stack<a> f3259c;

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f3260d;
    private long e;
    private a f;

    private static class a extends m {
        a(String str, Map<String, String> map, m mVar) {
            super(str, map, mVar);
        }

        void a(m mVar) {
            if (mVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f3255c.add(mVar);
        }

        void d(String str) {
            this.f3254b = str;
        }
    }

    n(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f3257a = jVar.u();
        this.f3258b = ((Boolean) jVar.a(com.applovin.impl.sdk.b.b.eT)).booleanValue();
    }

    public static m a(String str, com.applovin.impl.sdk.j jVar) throws SAXException {
        return new n(jVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        return hashMap;
    }

    public m a(String str) throws SAXException {
        if (str == null) {
            throw new IllegalArgumentException("Unable to parse. No XML specified.");
        }
        this.f3260d = new StringBuilder();
        this.f3259c = new Stack<>();
        this.f = null;
        Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.e.n.1
            @Override // org.xml.sax.ContentHandler
            public void characters(char[] cArr, int i, int i2) throws SAXException {
                if (!n.this.f3258b) {
                    i = 0;
                }
                String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                if (i.b(trim)) {
                    n.this.f3260d.append(trim);
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void endDocument() throws SAXException {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - n.this.e;
                n.this.f3257a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }

            @Override // org.xml.sax.ContentHandler
            public void endElement(String str2, String str3, String str4) throws SAXException {
                n.this.f = (a) n.this.f3259c.pop();
                n.this.f.d(n.this.f3260d.toString().trim());
                n.this.f3260d.setLength(0);
            }

            @Override // org.xml.sax.ContentHandler
            public void endPrefixMapping(String str2) throws SAXException {
            }

            @Override // org.xml.sax.ContentHandler
            public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
            }

            @Override // org.xml.sax.ContentHandler
            public void processingInstruction(String str2, String str3) throws SAXException {
            }

            @Override // org.xml.sax.ContentHandler
            public void setDocumentLocator(Locator locator) {
            }

            @Override // org.xml.sax.ContentHandler
            public void skippedEntity(String str2) throws SAXException {
            }

            @Override // org.xml.sax.ContentHandler
            public void startDocument() throws SAXException {
                n.this.f3257a.a("XmlParser", "Begin parsing...");
                n.this.e = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            }

            @Override // org.xml.sax.ContentHandler
            public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                try {
                    a aVar = n.this.f3259c.isEmpty() ? null : (a) n.this.f3259c.peek();
                    a aVar2 = new a(str3, n.this.a(attributes), aVar);
                    if (aVar != null) {
                        aVar.a(aVar2);
                    }
                    n.this.f3259c.push(aVar2);
                } catch (Exception e) {
                    n.this.f3257a.b("XmlParser", "Unable to process element <" + str3 + ">", e);
                    throw new SAXException("Failed to start element", e);
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void startPrefixMapping(String str2, String str3) throws SAXException {
            }
        });
        if (this.f != null) {
            return this.f;
        }
        throw new SAXException("Unable to parse XML into node");
    }
}
