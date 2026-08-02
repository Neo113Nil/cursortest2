package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935wh implements InterfaceC0811rn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0772q9 f8573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1011zh f8574b;

    public C0935wh(C1011zh c1011zh, C0772q9 c0772q9) {
        this.f8574b = c1011zh;
        this.f8573a = c0772q9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0811rn
    public final void a(Object obj) {
        List list = (List) obj;
        C0772q9 c0772q9 = this.f8573a;
        if (AbstractC0709no.a((Collection) list)) {
            return;
        }
        c0772q9.f8148d = new C0720o9[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0680ml c0680ml = (C0680ml) list.get(i3);
            C0720o9[] c0720o9Arr = c0772q9.f8148d;
            Map map = Uf.f6759a;
            C0720o9 c0720o9 = new C0720o9();
            Integer num = c0680ml.f7884a;
            if (num != null) {
                c0720o9.f7995a = num.intValue();
            }
            Integer num2 = c0680ml.f7885b;
            if (num2 != null) {
                c0720o9.f7996b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0680ml.f7887d)) {
                c0720o9.f7997c = c0680ml.f7887d;
            }
            c0720o9.f7998d = c0680ml.f7886c;
            c0720o9Arr[i3] = c0720o9;
            this.f8574b.f8694g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0772q9.f8148d[i3]);
            this.f8574b.f8694g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
