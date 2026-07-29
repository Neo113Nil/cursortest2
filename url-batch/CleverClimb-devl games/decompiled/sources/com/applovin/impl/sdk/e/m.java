package com.applovin.impl.sdk.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3253a = new m();

    /* renamed from: b, reason: collision with root package name */
    protected String f3254b;

    /* renamed from: c, reason: collision with root package name */
    protected final List<m> f3255c;

    /* renamed from: d, reason: collision with root package name */
    private final m f3256d;
    private final String e;
    private final Map<String, String> f;

    private m() {
        this.f3256d = null;
        this.e = "";
        this.f = Collections.emptyMap();
        this.f3254b = "";
        this.f3255c = Collections.emptyList();
    }

    public m(String str, Map<String, String> map, m mVar) {
        this.f3256d = mVar;
        this.e = str;
        this.f = Collections.unmodifiableMap(map);
        this.f3255c = new ArrayList();
    }

    public String a() {
        return this.e;
    }

    public List<m> a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f3255c.size());
        for (m mVar : this.f3255c) {
            if (str.equalsIgnoreCase(mVar.a())) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    public m b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (m mVar : this.f3255c) {
            if (str.equalsIgnoreCase(mVar.a())) {
                return mVar;
            }
        }
        return null;
    }

    public Map<String, String> b() {
        return this.f;
    }

    public m c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f3255c.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            m mVar = (m) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(mVar.a())) {
                return mVar;
            }
            arrayList.addAll(mVar.d());
        }
        return null;
    }

    public String c() {
        return this.f3254b;
    }

    public List<m> d() {
        return Collections.unmodifiableList(this.f3255c);
    }

    public String toString() {
        return "XmlNode{, elementName='" + this.e + "', text='" + this.f3254b + "', attributes=" + this.f + '}';
    }
}
