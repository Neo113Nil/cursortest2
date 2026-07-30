package com.artillery.ctc;

import com.google.gson.Gson;
import f6.l;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class v extends Lambda implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, String str2, String str3, String str4, boolean z7) {
        super(1);
        this.f1263a = str;
        this.f1264b = str2;
        this.f1265c = str3;
        this.f1266d = str4;
        this.f1267e = z7;
    }

    public final void a(r4.b post) {
        Map mapOf;
        kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
        r4.a.addQuery$default(post, "api-version", this.f1263a, false, 4, null);
        post.addHeader("Authorization", this.f1264b + ' ' + this.f1265c);
        Gson gson = new Gson();
        mapOf = m0.mapOf(y5.h.to("assistant_id", this.f1266d), y5.h.to("stream", Boolean.valueOf(this.f1267e)));
        post.json(gson.toJson(mapOf));
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r4.b) obj);
        return y5.w.INSTANCE;
    }
}
