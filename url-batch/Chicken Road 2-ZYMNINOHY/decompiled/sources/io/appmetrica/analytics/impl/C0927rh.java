package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927rh implements InterfaceC0882pn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0712j9 f12660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1005uh f12661b;

    public C0927rh(C1005uh c1005uh, C0712j9 c0712j9) {
        this.f12661b = c1005uh;
        this.f12660a = c0712j9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0882pn
    public final void a(Object obj) {
        List list = (List) obj;
        C0712j9 c0712j9 = this.f12660a;
        if (AbstractC0779lo.a((Collection) list)) {
            return;
        }
        c0712j9.f12114d = new C0661h9[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0698il c0698il = (C0698il) list.get(i4);
            C0661h9[] c0661h9Arr = c0712j9.f12114d;
            Map map = Pf.f10817a;
            C0661h9 c0661h9 = new C0661h9();
            Integer num = c0698il.f12050a;
            if (num != null) {
                c0661h9.f11987a = num.intValue();
            }
            Integer num2 = c0698il.f12051b;
            if (num2 != null) {
                c0661h9.f11988b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0698il.f12053d)) {
                c0661h9.f11989c = c0698il.f12053d;
            }
            c0661h9.f11990d = c0698il.f12052c;
            c0661h9Arr[i4] = c0661h9;
            this.f12661b.f12836g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0712j9.f12114d[i4]);
            this.f12661b.f12836g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
