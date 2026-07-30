package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19317a = "anythink_template/other";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19318c = "anythink_template/";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19319d = "anythink_template/res/Movies";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19320e = "anythink_template/res";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19321f = "anythink_template/res/.Anythink_VC";

    /* renamed from: g, reason: collision with root package name */
    private static final String f19322g = "anythink_template/res/.anythink700";

    /* renamed from: h, reason: collision with root package name */
    private static final String f19323h = "anythink_template/res/img";
    private static final String i = "anythink_template/crashinfo";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19324j = "anythink_template/res/xml";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19325k = "anythink_template/anythink/config";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19326l = "anythink_template/res/res";

    /* renamed from: m, reason: collision with root package name */
    private static final String f19327m = "anythink_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        f.a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, f19320e);
        f.a(arrayList, a.AD_MOVIES, f19319d).a(a.ANYTHINK_VC, f19321f);
        e a9 = f.a(arrayList, a.AD_ANYTHINK_700, f19322g);
        a9.a(a.ANYTHINK_700_IMG, f19323h);
        a9.a(a.ANYTHINK_700_XML, f19324j);
        a9.a(a.ANYTHINK_700_CONFIG, f19325k);
        a9.a(a.ANYTHINK_700_RES, f19326l);
        a9.a(a.ANYTHINK_700_HTML, f19327m);
        a aVar = a.ANYTHINK_OTHER;
        f.a(arrayList, aVar, f19317a);
        f.a(arrayList, a.ANYTHINK_CRASH_INFO, i);
        f.a(arrayList, aVar, f19317a);
        return arrayList;
    }
}
