package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0430pe implements InterfaceC0092c8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0529te f1433a;
    public final C0293k3 b;
    public final C0525ta c;
    public final Kf d;

    public C0430pe() {
        this(new C0529te(), new C0293k3(), new C0525ta(100), new Kf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(C0405oe c0405oe) {
        Ei ei;
        C0573v8 c0573v8 = new C0573v8();
        c0573v8.f1531a = c0405oe.f1414a;
        c0573v8.f = new C0298k8();
        C0455qe c0455qe = c0405oe.b;
        C0247i8 c0247i8 = new C0247i8();
        c0247i8.f1303a = StringUtils.getUTF8Bytes(c0455qe.f1454a);
        Nn a2 = this.c.a(c0455qe.b);
        c0247i8.b = StringUtils.getUTF8Bytes((String) a2.f977a);
        c0247i8.e = c0455qe.c.size();
        Map<String, String> map = c0455qe.d;
        if (map != null) {
            ei = this.f1433a.fromModel(map);
            c0247i8.c = (C0349m8) ei.f829a;
        } else {
            ei = null;
        }
        c0573v8.f.f1338a = c0247i8;
        int i = 0;
        boolean z = true;
        C0061b3 c0061b3 = new C0061b3(C0061b3.b(a2, ei));
        List list = c0455qe.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int computeInt32Size = c0573v8.f1531a != new C0573v8().f1531a ? CodedOutputByteBufferNano.computeInt32Size(1, c0573v8.f1531a) : 0;
        C0548u8 c0548u8 = c0573v8.b;
        if (c0548u8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c0548u8);
        }
        C0498s8 c0498s8 = c0573v8.c;
        if (c0498s8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0498s8);
        }
        C0523t8 c0523t8 = c0573v8.d;
        int i2 = 4;
        if (c0523t8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0523t8);
        }
        C0143e8 c0143e8 = c0573v8.e;
        if (c0143e8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0143e8);
        }
        C0298k8 c0298k8 = c0573v8.f;
        if (c0298k8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0298k8);
        }
        ArrayList arrayList2 = new ArrayList();
        C0573v8 c0573v82 = new C0573v8();
        c0573v82.f1531a = c0573v8.f1531a;
        C0298k8 c0298k82 = new C0298k8();
        c0573v82.f = c0298k82;
        c0298k82.f1338a = new C0247i8();
        C0247i8 c0247i82 = c0573v82.f.f1338a;
        C0247i8 c0247i83 = c0573v8.f.f1338a;
        c0247i82.b = c0247i83.b;
        c0247i82.f1303a = c0247i83.f1303a;
        c0247i82.e = c0247i83.e;
        c0247i82.c = c0247i83.c;
        C0061b3 c0061b32 = c0061b3;
        int i3 = 0;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            C0319l3 c0319l3 = (C0319l3) list.get(i3);
            boolean z2 = z;
            C0272j8 c0272j8 = new C0272j8();
            c0272j8.f1318a = i3;
            int i5 = i;
            Ei fromModel = this.b.fromModel(c0319l3);
            c0272j8.b = (C0169f8) fromModel.f829a;
            fromModel.b.getBytesTruncated();
            Ei ei2 = new Ei(c0272j8, fromModel);
            Kf kf = this.d;
            C0272j8 c0272j82 = (C0272j8) ei2.f829a;
            kf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0272j82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i5 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                c0573v82.f.f1338a.d = (C0272j8[]) arrayList2.toArray(new C0272j8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ei(c0573v82, c0061b32));
                C0573v8 c0573v83 = new C0573v8();
                c0573v83.f1531a = c0573v8.f1531a;
                C0298k8 c0298k83 = new C0298k8();
                c0573v83.f = c0298k83;
                c0298k83.f1338a = new C0247i8();
                C0247i8 c0247i84 = c0573v83.f.f1338a;
                C0247i8 c0247i85 = c0573v8.f.f1338a;
                c0247i84.b = c0247i85.b;
                c0247i84.f1303a = c0247i85.f1303a;
                c0247i84.e = c0247i85.e;
                c0247i84.c = c0247i85.c;
                c0061b32 = c0061b3;
                i4 = computeInt32Size;
                c0573v82 = c0573v83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0272j8) ei2.f829a);
            InterfaceC0087c3[] interfaceC0087c3Arr = new InterfaceC0087c3[2];
            interfaceC0087c3Arr[i5] = c0061b32;
            interfaceC0087c3Arr[z2 ? 1 : 0] = ei2.b;
            c0061b32 = new C0061b3(C0061b3.b(interfaceC0087c3Arr));
            i4 += computeRawVarint32Size;
            i3++;
            z = z2 ? 1 : 0;
            i = i5;
            i2 = 4;
        }
        c0573v82.f.f1338a.d = (C0272j8[]) arrayList2.toArray(new C0272j8[arrayList2.size()]);
        arrayList.add(new Ei(c0573v82, c0061b32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0430pe(C0529te c0529te, C0293k3 c0293k3, C0525ta c0525ta, Kf kf) {
        this.f1433a = c0529te;
        this.b = c0293k3;
        this.c = c0525ta;
        this.d = kf;
    }

    public final C0405oe a(List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
