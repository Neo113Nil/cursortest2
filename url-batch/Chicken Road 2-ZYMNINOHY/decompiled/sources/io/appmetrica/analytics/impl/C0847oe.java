package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847oe implements InterfaceC0505b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0950se f12512a;

    /* renamed from: b, reason: collision with root package name */
    public final C0706j3 f12513b;

    /* renamed from: c, reason: collision with root package name */
    public final C0946sa f12514c;

    /* renamed from: d, reason: collision with root package name */
    public final Jf f12515d;

    public C0847oe() {
        this(new C0950se(), new C0706j3(), new C0946sa(100), new Jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0821ne c0821ne) {
        Di di;
        C0996u8 c0996u8 = new C0996u8();
        c0996u8.f12816a = c0821ne.f12454a;
        c0996u8.f12821f = new C0711j8();
        C0873pe c0873pe = c0821ne.f12455b;
        C0660h8 c0660h8 = new C0660h8();
        c0660h8.f11981a = StringUtils.getUTF8Bytes(c0873pe.f12579a);
        Mn a3 = this.f12514c.a(c0873pe.f12580b);
        c0660h8.f11982b = StringUtils.getUTF8Bytes((String) a3.f10676a);
        c0660h8.f11985e = c0873pe.f12581c.size();
        Map<String, String> map = c0873pe.f12582d;
        if (map != null) {
            di = this.f12512a.fromModel(map);
            c0660h8.f11983c = (C0763l8) di.f10202a;
        } else {
            di = null;
        }
        c0996u8.f12821f.f12106a = c0660h8;
        int i4 = 0;
        boolean z = true;
        C0474a3 c0474a3 = new C0474a3(C0474a3.b(a3, di));
        List list = c0873pe.f12581c;
        ArrayList arrayList = new ArrayList();
        this.f12515d.getClass();
        int computeInt32Size = c0996u8.f12816a != new C0996u8().f12816a ? CodedOutputByteBufferNano.computeInt32Size(1, c0996u8.f12816a) : 0;
        C0970t8 c0970t8 = c0996u8.f12817b;
        if (c0970t8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c0970t8);
        }
        C0918r8 c0918r8 = c0996u8.f12818c;
        if (c0918r8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0918r8);
        }
        C0944s8 c0944s8 = c0996u8.f12819d;
        int i5 = 4;
        if (c0944s8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0944s8);
        }
        C0557d8 c0557d8 = c0996u8.f12820e;
        if (c0557d8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0557d8);
        }
        C0711j8 c0711j8 = c0996u8.f12821f;
        if (c0711j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0711j8);
        }
        ArrayList arrayList2 = new ArrayList();
        C0996u8 c0996u82 = new C0996u8();
        c0996u82.f12816a = c0996u8.f12816a;
        C0711j8 c0711j82 = new C0711j8();
        c0996u82.f12821f = c0711j82;
        c0711j82.f12106a = new C0660h8();
        C0660h8 c0660h82 = c0996u82.f12821f.f12106a;
        C0660h8 c0660h83 = c0996u8.f12821f.f12106a;
        c0660h82.f11982b = c0660h83.f11982b;
        c0660h82.f11981a = c0660h83.f11981a;
        c0660h82.f11985e = c0660h83.f11985e;
        c0660h82.f11983c = c0660h83.f11983c;
        C0474a3 c0474a32 = c0474a3;
        int i6 = 0;
        int i7 = computeInt32Size;
        while (i6 < list.size()) {
            C0732k3 c0732k3 = (C0732k3) list.get(i6);
            boolean z4 = z;
            C0686i8 c0686i8 = new C0686i8();
            c0686i8.f12030a = i6;
            int i8 = i4;
            Di fromModel = this.f12513b.fromModel(c0732k3);
            c0686i8.f12031b = (C0582e8) fromModel.f10202a;
            fromModel.f10203b.getBytesTruncated();
            Di di2 = new Di(c0686i8, fromModel);
            Jf jf = this.f12515d;
            C0686i8 c0686i82 = (C0686i8) di2.f10202a;
            jf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i5);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0686i82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i8 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i7 + computeRawVarint32Size > 204800) {
                c0996u82.f12821f.f12106a.f11984d = (C0686i8[]) arrayList2.toArray(new C0686i8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Di(c0996u82, c0474a32));
                C0996u8 c0996u83 = new C0996u8();
                c0996u83.f12816a = c0996u8.f12816a;
                C0711j8 c0711j83 = new C0711j8();
                c0996u83.f12821f = c0711j83;
                c0711j83.f12106a = new C0660h8();
                C0660h8 c0660h84 = c0996u83.f12821f.f12106a;
                C0660h8 c0660h85 = c0996u8.f12821f.f12106a;
                c0660h84.f11982b = c0660h85.f11982b;
                c0660h84.f11981a = c0660h85.f11981a;
                c0660h84.f11985e = c0660h85.f11985e;
                c0660h84.f11983c = c0660h85.f11983c;
                c0474a32 = c0474a3;
                i7 = computeInt32Size;
                c0996u82 = c0996u83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0686i8) di2.f10202a);
            InterfaceC0500b3 interfaceC0500b3 = di2.f10203b;
            InterfaceC0500b3[] interfaceC0500b3Arr = new InterfaceC0500b3[2];
            interfaceC0500b3Arr[i8] = c0474a32;
            interfaceC0500b3Arr[z4 ? 1 : 0] = interfaceC0500b3;
            c0474a32 = new C0474a3(C0474a3.b(interfaceC0500b3Arr));
            i7 += computeRawVarint32Size;
            i6++;
            z = z4 ? 1 : 0;
            i4 = i8;
            i5 = 4;
        }
        c0996u82.f12821f.f12106a.f11984d = (C0686i8[]) arrayList2.toArray(new C0686i8[arrayList2.size()]);
        arrayList.add(new Di(c0996u82, c0474a32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0847oe(C0950se c0950se, C0706j3 c0706j3, C0946sa c0946sa, Jf jf) {
        this.f12512a = c0950se;
        this.f12513b = c0706j3;
        this.f12514c = c0946sa;
        this.f12515d = jf;
    }

    public final C0821ne a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
