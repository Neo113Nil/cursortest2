package com.artillery.ctc;

import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.KeyResult;
import com.google.gson.Gson;
import f6.l;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class f extends Lambda implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyResult f786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatRequestBody f787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(KeyResult keyResult, ChatRequestBody chatRequestBody, e eVar) {
        super(1);
        this.f786a = keyResult;
        this.f787b = chatRequestBody;
        this.f788c = eVar;
    }

    public final void a(r4.b post) {
        ChatRequestBody chatRequestBody;
        ChatRequestBody.DcsData dcsData;
        String c8;
        kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
        post.setHeader("Authorization", this.f786a.getAccountAiResult().getAccess_token());
        post.setHeader("Client-Id", this.f786a.getClientId());
        post.setHeader("Device-Id", this.f786a.getDeviceId());
        ChatRequestBody.DcsData dcsData2 = this.f787b.dcs_data;
        String str = dcsData2 != null ? dcsData2.events : null;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            ChatRequestBody chatRequestBody2 = this.f787b;
            ChatRequestBody.DcsData dcsData3 = chatRequestBody2.dcs_data;
            if (dcsData3 != null) {
                c8 = this.f788c.c();
                dcsData = ChatRequestBody.DcsData.copy$default(dcsData3, null, null, c8, null, 11, null);
            } else {
                dcsData = null;
            }
            chatRequestBody = chatRequestBody2.copy((r18 & 1) != 0 ? chatRequestBody2.oversea : null, (r18 & 2) != 0 ? chatRequestBody2.data : null, (r18 & 4) != 0 ? chatRequestBody2.pid : null, (r18 & 8) != 0 ? chatRequestBody2.mode : null, (r18 & 16) != 0 ? chatRequestBody2.dcs_data : dcsData, (r18 & 32) != 0 ? chatRequestBody2.userId : null, (r18 & 64) != 0 ? chatRequestBody2.qid : null, (r18 & 128) != 0 ? chatRequestBody2.tid : null);
        } else {
            chatRequestBody = this.f787b;
        }
        d.a("GPT body => " + new Gson().toJson(chatRequestBody), null, 1, null);
        String json = new Gson().toJson(chatRequestBody);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(tempBody)");
        post.json(d.a(json));
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r4.b) obj);
        return y5.w.INSTANCE;
    }
}
