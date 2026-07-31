package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class De implements InterfaceC3034v8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ge f37364a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f37365b;

    /* renamed from: c, reason: collision with root package name */
    public final Na f37366c;

    /* renamed from: d, reason: collision with root package name */
    public final Wf f37367d;

    public De() {
        this(new Ge(), new F3(), new Na(100), new Wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull Ce ce) {
        Qi qi;
        int i4 = 0;
        boolean z4 = true;
        O8 o8 = new O8();
        o8.f38066a = ce.f37298a;
        o8.f38071f = new D8();
        Ee ee = ce.f37299b;
        B8 b8 = new B8();
        b8.f37212a = StringUtils.getUTF8Bytes(ee.f37441a);
        Jn a4 = this.f37366c.a(ee.f37442b);
        b8.f37213b = StringUtils.getUTF8Bytes((String) a4.f37851a);
        b8.f37216e = ee.f37443c.size();
        Map<String, String> map = ee.f37444d;
        if (map != null) {
            qi = this.f37364a.fromModel(map);
            b8.f37214c = (F8) qi.f38171a;
        } else {
            qi = null;
        }
        o8.f38071f.f37351a = b8;
        C3055w3 c3055w3 = new C3055w3(C3055w3.b(a4, qi));
        List list = ee.f37443c;
        ArrayList arrayList = new ArrayList();
        this.f37367d.getClass();
        int computeInt32Size = o8.f38066a != new O8().f38066a ? CodedOutputByteBufferNano.computeInt32Size(1, o8.f38066a) : 0;
        N8 n8 = o8.f38067b;
        if (n8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, n8);
        }
        L8 l8 = o8.f38068c;
        if (l8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, l8);
        }
        M8 m8 = o8.f38069d;
        int i5 = 4;
        if (m8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, m8);
        }
        C3086x8 c3086x8 = o8.f38070e;
        if (c3086x8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c3086x8);
        }
        D8 d8 = o8.f38071f;
        if (d8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, d8);
        }
        ArrayList arrayList2 = new ArrayList();
        O8 o82 = new O8();
        o82.f38066a = o8.f38066a;
        D8 d82 = new D8();
        o82.f38071f = d82;
        d82.f37351a = new B8();
        B8 b82 = o82.f38071f.f37351a;
        B8 b83 = o8.f38071f.f37351a;
        b82.f37213b = b83.f37213b;
        b82.f37212a = b83.f37212a;
        b82.f37216e = b83.f37216e;
        b82.f37214c = b83.f37214c;
        int i6 = 0;
        C3055w3 c3055w32 = c3055w3;
        int i7 = computeInt32Size;
        while (i6 < list.size()) {
            G3 g32 = (G3) list.get(i6);
            int i8 = i4;
            C8 c8 = new C8();
            c8.f37281a = i6;
            boolean z5 = z4;
            Qi fromModel = this.f37365b.fromModel(g32);
            c8.f37282b = (C3112y8) fromModel.f38171a;
            fromModel.f38172b.getBytesTruncated();
            Qi qi2 = new Qi(c8, fromModel);
            Wf wf = this.f37367d;
            C8 c82 = (C8) qi2.f38171a;
            wf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i5);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i8 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i7 + computeRawVarint32Size > 204800) {
                o82.f38071f.f37351a.f37215d = (C8[]) arrayList2.toArray(new C8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Qi(o82, c3055w32));
                O8 o83 = new O8();
                o83.f38066a = o8.f38066a;
                D8 d83 = new D8();
                o83.f38071f = d83;
                d83.f37351a = new B8();
                B8 b84 = o83.f38071f.f37351a;
                B8 b85 = o8.f38071f.f37351a;
                b84.f37213b = b85.f37213b;
                b84.f37212a = b85.f37212a;
                b84.f37216e = b85.f37216e;
                b84.f37214c = b85.f37214c;
                c3055w32 = c3055w3;
                i7 = computeInt32Size;
                o82 = o83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C8) qi2.f38171a);
            InterfaceC3081x3 interfaceC3081x3 = qi2.f38172b;
            InterfaceC3081x3[] interfaceC3081x3Arr = new InterfaceC3081x3[2];
            interfaceC3081x3Arr[i8] = c3055w32;
            interfaceC3081x3Arr[z5 ? 1 : 0] = interfaceC3081x3;
            c3055w32 = new C3055w3(C3055w3.b(interfaceC3081x3Arr));
            i7 += computeRawVarint32Size;
            i6++;
            i4 = i8;
            z4 = z5 ? 1 : 0;
            i5 = 4;
        }
        o82.f38071f.f37351a.f37215d = (C8[]) arrayList2.toArray(new C8[arrayList2.size()]);
        arrayList.add(new Qi(o82, c3055w32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public De(Ge ge, F3 f32, Na na, Wf wf) {
        this.f37364a = ge;
        this.f37365b = f32;
        this.f37366c = na;
        this.f37367d = wf;
    }

    @NonNull
    public final Ce a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
