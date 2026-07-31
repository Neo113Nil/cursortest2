package com.yandex.mobile.ads.impl;

import android.util.Xml;
import java.io.StringReader;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class bi2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23828a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o70 f23829b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1793a2 f23830c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2056l2 f23831d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2377z1 f23832e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ bi2() {
        this(r1, r2, new C1793a2(r1, r2), new C2056l2(), new C2377z1());
        uk2 uk2Var = new uk2();
        o70 o70Var = new o70(uk2Var);
    }

    @NotNull
    public final zh2 a(@NotNull String data, @NotNull C1882dj base64EncodingParameters) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        parser.setInput(new StringReader(data));
        parser.nextTag();
        Intrinsics.checkNotNull(parser);
        this.f23828a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "VMAP");
        ArrayList adBreaks = new ArrayList();
        ArrayList extensions = new ArrayList();
        String version = parser.getAttributeValue(null, "version");
        while (true) {
            this.f23828a.getClass();
            if (!uk2.a(parser)) {
                break;
            }
            this.f23828a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("AdBreak", name)) {
                    C2308w1 a4 = this.f23830c.a(parser, base64EncodingParameters);
                    if (a4 != null) {
                        adBreaks.add(a4);
                    }
                } else if (Intrinsics.areEqual("Extensions", name)) {
                    extensions.addAll(this.f23829b.a(parser, base64EncodingParameters));
                } else {
                    this.f23828a.getClass();
                    uk2.d(parser);
                }
            }
        }
        if (version == null || version.length() == 0) {
            throw new ai2();
        }
        this.f23832e.getClass();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        int size = extensions.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = extensions.get(i5);
            i5++;
            if (Intrinsics.areEqual(((k70) obj).a(), "PageID")) {
                break;
            }
        }
        k70 k70Var = (k70) obj;
        String b4 = k70Var != null ? k70Var.b() : null;
        int size2 = extensions.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = extensions.get(i6);
            i6++;
            if (Intrinsics.areEqual(((k70) obj2).a(), "CategoryID")) {
                break;
            }
        }
        k70 k70Var2 = (k70) obj2;
        String b5 = k70Var2 != null ? k70Var2.b() : null;
        int size3 = extensions.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = extensions.get(i7);
            i7++;
            if (Intrinsics.areEqual(((k70) obj3).a(), "SessionID")) {
                break;
            }
        }
        k70 k70Var3 = (k70) obj3;
        C2354y1 adBreakParameters = new C2354y1(b4, b5, k70Var3 != null ? k70Var3.b() : null);
        this.f23831d.getClass();
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(adBreakParameters, "adBreakParameters");
        int size4 = adBreaks.size();
        while (i4 < size4) {
            Object obj4 = adBreaks.get(i4);
            i4++;
            ((C2308w1) obj4).a(adBreakParameters);
        }
        Intrinsics.checkNotNull(version);
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return new zh2(version, adBreaks, extensions);
    }

    public bi2(@NotNull uk2 mXmlHelper, @NotNull o70 extensionsParser, @NotNull C1793a2 adBreakParser, @NotNull C2056l2 adBreaksConfigurator, @NotNull C2377z1 adBreakParametersCreator) {
        Intrinsics.checkNotNullParameter(mXmlHelper, "mXmlHelper");
        Intrinsics.checkNotNullParameter(extensionsParser, "extensionsParser");
        Intrinsics.checkNotNullParameter(adBreakParser, "adBreakParser");
        Intrinsics.checkNotNullParameter(adBreaksConfigurator, "adBreaksConfigurator");
        Intrinsics.checkNotNullParameter(adBreakParametersCreator, "adBreakParametersCreator");
        this.f23828a = mXmlHelper;
        this.f23829b = extensionsParser;
        this.f23830c = adBreakParser;
        this.f23831d = adBreaksConfigurator;
        this.f23832e = adBreakParametersCreator;
    }
}
