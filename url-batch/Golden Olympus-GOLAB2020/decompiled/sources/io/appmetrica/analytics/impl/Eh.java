package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Eh implements InterfaceC2816mn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E9 f37450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hh f37451b;

    public Eh(Hh hh, E9 e9) {
        this.f37451b = hh;
        this.f37450a = e9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2816mn
    public final void a(Object obj) {
        List list = (List) obj;
        E9 e9 = this.f37450a;
        if (AbstractC2713io.a((Collection) list)) {
            return;
        }
        e9.f37427d = new C9[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            C2710il c2710il = (C2710il) list.get(i4);
            C9[] c9Arr = e9.f37427d;
            Map map = AbstractC2547cg.f38778a;
            C9 c9 = new C9();
            Integer num = c2710il.f39211a;
            if (num != null) {
                c9.f37284a = num.intValue();
            }
            Integer num2 = c2710il.f39212b;
            if (num2 != null) {
                c9.f37285b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c2710il.f39214d)) {
                c9.f37286c = c2710il.f39214d;
            }
            c9.f37287d = c2710il.f39213c;
            c9Arr[i4] = c9;
            this.f37451b.f37644g += CodedOutputByteBufferNano.computeMessageSizeNoTag(e9.f37427d[i4]);
            this.f37451b.f37644g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
