package com.artillery.ctc;

import com.artillery.ctc.base.ChatBodyRequest;
import com.artillery.ctc.base.KeyResult;
import com.google.gson.Gson;
import f6.l;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g extends Lambda implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyResult f789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatBodyRequest f790b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(KeyResult keyResult, ChatBodyRequest chatBodyRequest) {
        super(1);
        this.f789a = keyResult;
        this.f790b = chatBodyRequest;
    }

    public final void a(r4.b post) {
        kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
        r4.a.addQuery$default(post, "ak", this.f789a.getOverSeaAk(), false, 4, null);
        r4.a.addQuery$default(post, "sn", this.f789a.getDeviceId(), false, 4, null);
        post.json(new Gson().toJson(this.f790b));
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r4.b) obj);
        return y5.w.INSTANCE;
    }
}
