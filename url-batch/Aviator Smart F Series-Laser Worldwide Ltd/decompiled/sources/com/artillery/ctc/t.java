package com.artillery.ctc;

import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.OverseasConfigModel;
import com.google.gson.Gson;
import f6.l;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class t extends Lambda implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OverseasConfigModel f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatRequestBody f1256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(OverseasConfigModel overseasConfigModel, ChatRequestBody chatRequestBody) {
        super(1);
        this.f1255a = overseasConfigModel;
        this.f1256b = chatRequestBody;
    }

    public final void a(r4.b post) {
        kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
        r4.a.addQuery$default(post, "ak", this.f1255a.getAk(), false, 4, null);
        r4.a.addQuery$default(post, "sn", this.f1255a.getSn(), false, 4, null);
        post.json(new Gson().toJson(this.f1256b.oversea));
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r4.b) obj);
        return y5.w.INSTANCE;
    }
}
