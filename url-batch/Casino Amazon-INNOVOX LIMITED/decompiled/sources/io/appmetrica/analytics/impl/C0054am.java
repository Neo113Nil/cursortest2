package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0054am extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f1170a;
    public final String b;
    public final Map<String, String> c;
    public final boolean d;
    public final List<String> e;

    public C0054am(I3 i3) {
        this(i3.a().c(), i3.a().d(), i3.a().a(), i3.a().h(), i3.a().b());
    }

    public final boolean a(C0054am c0054am) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0054am mergeFrom(C0054am c0054am) {
        return new C0054am((String) WrapUtils.getOrDefaultNullable(this.f1170a, c0054am.f1170a), (String) WrapUtils.getOrDefaultNullable(this.b, c0054am.b), (Map) WrapUtils.getOrDefaultNullable(this.c, c0054am.c), this.d || c0054am.d, c0054am.d ? c0054am.e : this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f1170a + "', installReferrerSource='" + this.b + "', clientClids=" + this.c + ", hasNewCustomHosts=" + this.d + ", newCustomHosts=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public C0054am(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f1170a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C0054am() {
        this(null, null, null, false, null);
    }
}
