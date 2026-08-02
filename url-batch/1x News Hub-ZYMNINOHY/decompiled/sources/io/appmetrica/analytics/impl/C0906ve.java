package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906ve implements InterfaceC0538h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0983ye f8513a;

    /* renamed from: b, reason: collision with root package name */
    public final C0791r3 f8514b;

    /* renamed from: c, reason: collision with root package name */
    public final C1004za f8515c;

    /* renamed from: d, reason: collision with root package name */
    public final Of f8516d;

    public C0906ve() {
        this(new C0983ye(), new C0791r3(), new C1004za(100), new Of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0880ue c0880ue) {
        Ii ii;
        int i3 = 0;
        boolean z = true;
        A8 a8 = new A8();
        a8.f5741a = c0880ue.f8456a;
        a8.f = new C0745p8();
        C0932we c0932we = c0880ue.f8457b;
        C0693n8 c0693n8 = new C0693n8();
        c0693n8.f7926a = StringUtils.getUTF8Bytes(c0932we.f8568a);
        On a3 = this.f8515c.a(c0932we.f8569b);
        c0693n8.f7927b = StringUtils.getUTF8Bytes((String) a3.f6419a);
        c0693n8.f7930e = c0932we.f8570c.size();
        Map<String, String> map = c0932we.f8571d;
        if (map != null) {
            ii = this.f8513a.fromModel(map);
            c0693n8.f7928c = (C0796r8) ii.f6160a;
        } else {
            ii = null;
        }
        a8.f.f8070a = c0693n8;
        C0559i3 c0559i3 = new C0559i3(C0559i3.b(a3, ii));
        List list = c0932we.f8570c;
        ArrayList arrayList = new ArrayList();
        this.f8516d.getClass();
        int computeInt32Size = a8.f5741a != new A8().f5741a ? CodedOutputByteBufferNano.computeInt32Size(1, a8.f5741a) : 0;
        C1002z8 c1002z8 = a8.f5742b;
        if (c1002z8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c1002z8);
        }
        C0952x8 c0952x8 = a8.f5743c;
        if (c0952x8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0952x8);
        }
        C0977y8 c0977y8 = a8.f5744d;
        int i4 = 4;
        if (c0977y8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0977y8);
        }
        C0589j8 c0589j8 = a8.f5745e;
        if (c0589j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0589j8);
        }
        C0745p8 c0745p8 = a8.f;
        if (c0745p8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0745p8);
        }
        ArrayList arrayList2 = new ArrayList();
        A8 a82 = new A8();
        a82.f5741a = a8.f5741a;
        C0745p8 c0745p82 = new C0745p8();
        a82.f = c0745p82;
        c0745p82.f8070a = new C0693n8();
        C0693n8 c0693n82 = a82.f.f8070a;
        C0693n8 c0693n83 = a8.f.f8070a;
        c0693n82.f7927b = c0693n83.f7927b;
        c0693n82.f7926a = c0693n83.f7926a;
        c0693n82.f7930e = c0693n83.f7930e;
        c0693n82.f7928c = c0693n83.f7928c;
        int i5 = 0;
        C0559i3 c0559i32 = c0559i3;
        int i6 = computeInt32Size;
        while (i5 < list.size()) {
            C0817s3 c0817s3 = (C0817s3) list.get(i5);
            int i7 = i3;
            C0719o8 c0719o8 = new C0719o8();
            c0719o8.f7992a = i5;
            boolean z2 = z;
            Ii fromModel = this.f8514b.fromModel(c0817s3);
            c0719o8.f7993b = (C0615k8) fromModel.f6160a;
            fromModel.f6161b.getBytesTruncated();
            Ii ii2 = new Ii(c0719o8, fromModel);
            Of of = this.f8516d;
            C0719o8 c0719o82 = (C0719o8) ii2.f6160a;
            of.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i4);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0719o82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i7 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i6 + computeRawVarint32Size > 204800) {
                a82.f.f8070a.f7929d = (C0719o8[]) arrayList2.toArray(new C0719o8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ii(a82, c0559i32));
                A8 a83 = new A8();
                a83.f5741a = a8.f5741a;
                C0745p8 c0745p83 = new C0745p8();
                a83.f = c0745p83;
                c0745p83.f8070a = new C0693n8();
                C0693n8 c0693n84 = a83.f.f8070a;
                C0693n8 c0693n85 = a8.f.f8070a;
                c0693n84.f7927b = c0693n85.f7927b;
                c0693n84.f7926a = c0693n85.f7926a;
                c0693n84.f7930e = c0693n85.f7930e;
                c0693n84.f7928c = c0693n85.f7928c;
                c0559i32 = c0559i3;
                i6 = computeInt32Size;
                a82 = a83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0719o8) ii2.f6160a);
            InterfaceC0584j3 interfaceC0584j3 = ii2.f6161b;
            InterfaceC0584j3[] interfaceC0584j3Arr = new InterfaceC0584j3[2];
            interfaceC0584j3Arr[i7] = c0559i32;
            interfaceC0584j3Arr[z2 ? 1 : 0] = interfaceC0584j3;
            c0559i32 = new C0559i3(C0559i3.b(interfaceC0584j3Arr));
            i6 += computeRawVarint32Size;
            i5++;
            i3 = i7;
            z = z2 ? 1 : 0;
            i4 = 4;
        }
        a82.f.f8070a.f7929d = (C0719o8[]) arrayList2.toArray(new C0719o8[arrayList2.size()]);
        arrayList.add(new Ii(a82, c0559i32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0906ve(C0983ye c0983ye, C0791r3 c0791r3, C1004za c1004za, Of of) {
        this.f8513a = c0983ye;
        this.f8514b = c0791r3;
        this.f8515c = c1004za;
        this.f8516d = of;
    }

    public final C0880ue a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
