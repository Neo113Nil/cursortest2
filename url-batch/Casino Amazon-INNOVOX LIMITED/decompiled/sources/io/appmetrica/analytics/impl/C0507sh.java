package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0507sh implements InterfaceC0464qn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0299k9 f1486a;
    public final /* synthetic */ C0582vh b;

    public C0507sh(C0582vh c0582vh, C0299k9 c0299k9) {
        this.b = c0582vh;
        this.f1486a = c0299k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0464qn
    public final void a(Object obj) {
        List list = (List) obj;
        C0299k9 c0299k9 = this.f1486a;
        if (mo.a((Collection) list)) {
            return;
        }
        c0299k9.d = new C0248i9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C0285jl c0285jl = (C0285jl) list.get(i);
            C0248i9[] c0248i9Arr = c0299k9.d;
            Map map = Qf.f1016a;
            C0248i9 c0248i9 = new C0248i9();
            Integer num = c0285jl.f1326a;
            if (num != null) {
                c0248i9.f1304a = num.intValue();
            }
            Integer num2 = c0285jl.b;
            if (num2 != null) {
                c0248i9.b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0285jl.d)) {
                c0248i9.c = c0285jl.d;
            }
            c0248i9.d = c0285jl.c;
            c0248i9Arr[i] = c0248i9;
            this.b.g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0299k9.d[i]);
            this.b.g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
