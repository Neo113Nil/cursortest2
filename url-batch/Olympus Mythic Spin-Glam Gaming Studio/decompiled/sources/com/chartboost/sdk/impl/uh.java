package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class uh implements q7 {
    public final /* synthetic */ q7 a;

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ Map b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(1);
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "matchResult");
            String value = matchResult.getValue();
            String str = (String) this.b.get(value);
            return str != null ? str : value;
        }
    }

    public uh(q7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.a.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.a.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3222track(event);
    }

    public final String a(String str) {
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "{{", false, 2, (Object) null)) {
            return str;
        }
        throw new IllegalArgumentException("Missing required template parameter " + str);
    }

    public final String a(File htmlFile, Map allParams, String adTypeName, String location) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(allParams, "allParams");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            Regex regex = new Regex("\\{\\{\\s*([^}]+)\\s*\\}\\}|\\{%\\s*([^}]+)\\s*%\\}");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allParams.entrySet()) {
                String str = (String) entry.getKey();
                if (!StringsKt.startsWith$default(str, "{{", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "{%", false, 2, (Object) null)) {
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return a(regex.replace(FilesKt.readText(htmlFile, Charsets.UTF_8), new a(linkedHashMap)));
        } catch (Exception e) {
            xb.b("Failed to parse template", e);
            a(adTypeName, location, e.toString());
            return null;
        }
    }

    public final void a(String str, String str2, String str3) {
        track((pi) s5.m.a(si.i.h, str3, str, str2));
    }
}
