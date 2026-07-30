package com.artillery.ctc;

import com.artillery.ctc.base.DirectChatBody;
import com.artillery.ctc.base.DirectChatHeader;
import f6.l;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class u extends Lambda implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DirectChatBody f1257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DirectChatBody directChatBody) {
        super(1);
        this.f1257a = directChatBody;
    }

    public final void a(r4.b post) {
        kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
        DirectChatHeader header = this.f1257a.getHeader();
        String m88getApikey = header != null ? header.m88getApikey() : null;
        if (m88getApikey == null) {
            m88getApikey = "";
        }
        post.addHeader("api-key", m88getApikey);
        DirectChatHeader header2 = this.f1257a.getHeader();
        String m89getContenttype = header2 != null ? header2.m89getContenttype() : null;
        post.addHeader("content-type", m89getContenttype != null ? m89getContenttype : "");
        post.json(this.f1257a.getBody());
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((r4.b) obj);
        return y5.w.INSTANCE;
    }
}
