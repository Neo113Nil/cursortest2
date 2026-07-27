package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057ve implements InterfaceC0689h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C1134ye f9465a;

    /* renamed from: b, reason: collision with root package name */
    public final C0942r3 f9466b;

    /* renamed from: c, reason: collision with root package name */
    public final C1155za f9467c;

    /* renamed from: d, reason: collision with root package name */
    public final Of f9468d;

    public C1057ve() {
        this(new C1134ye(), new C0942r3(), new C1155za(100), new Of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C1031ue c1031ue) {
        Ii ii;
        A8 a8 = new A8();
        a8.f6517a = c1031ue.f9405a;
        a8.f6522f = new C0896p8();
        C1083we c1083we = c1031ue.f9406b;
        C0844n8 c0844n8 = new C0844n8();
        c0844n8.f8841a = StringUtils.getUTF8Bytes(c1083we.f9522a);
        On a6 = this.f9467c.a(c1083we.f9523b);
        c0844n8.f8842b = StringUtils.getUTF8Bytes((String) a6.f7230a);
        c0844n8.f8845e = c1083we.f9524c.size();
        Map<String, String> map = c1083we.f9525d;
        if (map != null) {
            ii = this.f9465a.fromModel(map);
            c0844n8.f8843c = (C0947r8) ii.f6960a;
        } else {
            ii = null;
        }
        a8.f6522f.f8995a = c0844n8;
        C0710i3 c0710i3 = new C0710i3(C0710i3.b(a6, ii));
        List list = c1083we.f9524c;
        ArrayList arrayList = new ArrayList();
        this.f9468d.getClass();
        int computeInt32Size = a8.f6517a != new A8().f6517a ? CodedOutputByteBufferNano.computeInt32Size(1, a8.f6517a) : 0;
        C1153z8 c1153z8 = a8.f6518b;
        if (c1153z8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c1153z8);
        }
        C1103x8 c1103x8 = a8.f6519c;
        if (c1103x8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c1103x8);
        }
        C1128y8 c1128y8 = a8.f6520d;
        int i2 = 4;
        if (c1128y8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c1128y8);
        }
        C0740j8 c0740j8 = a8.f6521e;
        if (c0740j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0740j8);
        }
        C0896p8 c0896p8 = a8.f6522f;
        if (c0896p8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0896p8);
        }
        ArrayList arrayList2 = new ArrayList();
        A8 a82 = new A8();
        a82.f6517a = a8.f6517a;
        C0896p8 c0896p82 = new C0896p8();
        a82.f6522f = c0896p82;
        c0896p82.f8995a = new C0844n8();
        C0844n8 c0844n82 = a82.f6522f.f8995a;
        C0844n8 c0844n83 = a8.f6522f.f8995a;
        c0844n82.f8842b = c0844n83.f8842b;
        c0844n82.f8841a = c0844n83.f8841a;
        c0844n82.f8845e = c0844n83.f8845e;
        c0844n82.f8843c = c0844n83.f8843c;
        int i3 = 0;
        C0710i3 c0710i32 = c0710i3;
        int i6 = computeInt32Size;
        while (i3 < list.size()) {
            C0968s3 c0968s3 = (C0968s3) list.get(i3);
            C0870o8 c0870o8 = new C0870o8();
            c0870o8.f8912a = i3;
            Ii fromModel = this.f9466b.fromModel(c0968s3);
            c0870o8.f8913b = (C0766k8) fromModel.f6960a;
            fromModel.f6961b.getBytesTruncated();
            Ii ii2 = new Ii(c0870o8, fromModel);
            Of of = this.f9468d;
            C0870o8 c0870o82 = (C0870o8) ii2.f6960a;
            of.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0870o82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i6 + computeRawVarint32Size > 204800) {
                a82.f6522f.f8995a.f8844d = (C0870o8[]) arrayList2.toArray(new C0870o8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ii(a82, c0710i32));
                A8 a83 = new A8();
                a83.f6517a = a8.f6517a;
                C0896p8 c0896p83 = new C0896p8();
                a83.f6522f = c0896p83;
                c0896p83.f8995a = new C0844n8();
                C0844n8 c0844n84 = a83.f6522f.f8995a;
                C0844n8 c0844n85 = a8.f6522f.f8995a;
                c0844n84.f8842b = c0844n85.f8842b;
                c0844n84.f8841a = c0844n85.f8841a;
                c0844n84.f8845e = c0844n85.f8845e;
                c0844n84.f8843c = c0844n85.f8843c;
                c0710i32 = c0710i3;
                i6 = computeInt32Size;
                a82 = a83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0870o8) ii2.f6960a);
            c0710i32 = new C0710i3(C0710i3.b(c0710i32, ii2.f6961b));
            i6 += computeRawVarint32Size;
            i3++;
            i2 = 4;
        }
        a82.f6522f.f8995a.f8844d = (C0870o8[]) arrayList2.toArray(new C0870o8[arrayList2.size()]);
        arrayList.add(new Ii(a82, c0710i32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1057ve(C1134ye c1134ye, C0942r3 c0942r3, C1155za c1155za, Of of) {
        this.f9465a = c1134ye;
        this.f9466b = c0942r3;
        this.f9467c = c1155za;
        this.f9468d = of;
    }

    public final C1031ue a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
