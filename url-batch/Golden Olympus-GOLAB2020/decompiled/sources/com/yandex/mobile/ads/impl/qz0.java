package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.sz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class qz0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30957b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<sz0> f30958c;

    @NotNull
    public static final b Companion = new b(0);

    @NotNull
    public static final Parcelable.Creator<qz0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f30956d = {null, new C0307f(sz0.a.f32086a)};

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30959a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f30960b;

        static {
            a aVar = new a();
            f30959a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", aVar, 2);
            c0343x0.l("ad_unit_id", false);
            c0343x0.l(com.ironsource.ge.f16516z1, false);
            f30960b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.M0.f224a, qz0.f30956d[1]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f30960b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = qz0.f30956d;
            String str2 = null;
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                list = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], null);
                i4 = 3;
            } else {
                boolean z4 = true;
                int i5 = 0;
                List list2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str2 = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else {
                        if (t4 != 1) {
                            throw new y2.o(t4);
                        }
                        list2 = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], list2);
                        i5 |= 2;
                    }
                }
                i4 = i5;
                str = str2;
                list = list2;
            }
            b4.c(c0343x0);
            return new qz0(i4, str, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f30960b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            qz0 value = (qz0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f30960b;
            B2.d b4 = encoder.b(c0343x0);
            qz0.a(value, b4, c0343x0);
            b4.c(c0343x0);
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] typeParametersSerializers() {
            return L.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return a.f30959a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<qz0> {
        @Override // android.os.Parcelable.Creator
        public final qz0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                arrayList.add(sz0.CREATOR.createFromParcel(parcel));
            }
            return new qz0(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final qz0[] newArray(int i4) {
            return new qz0[i4];
        }
    }

    public /* synthetic */ qz0(int i4, String str, List list) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f30959a.getDescriptor());
        }
        this.f30957b = str;
        this.f30958c = list;
    }

    public static final /* synthetic */ void a(qz0 qz0Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f30956d;
        dVar.n(c0343x0, 0, qz0Var.f30957b);
        dVar.m(c0343x0, 1, interfaceC3527bArr[1], qz0Var.f30958c);
    }

    @NotNull
    public final String d() {
        return this.f30957b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final List<sz0> e() {
        return this.f30958c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz0)) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return Intrinsics.areEqual(this.f30957b, qz0Var.f30957b) && Intrinsics.areEqual(this.f30958c, qz0Var.f30958c);
    }

    public final int hashCode() {
        return this.f30958c.hashCode() + (this.f30957b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f30957b + ", networks=" + this.f30958c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f30957b);
        List<sz0> list = this.f30958c;
        out.writeInt(list.size());
        Iterator<sz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i4);
        }
    }

    public qz0(@NotNull String adUnitId, @NotNull ArrayList networks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(networks, "networks");
        this.f30957b = adUnitId;
        this.f30958c = networks;
    }
}
