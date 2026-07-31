package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0298a0;
import C2.C0343x0;
import C2.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class sz0 implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f32083d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32084b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f32085c;

    @NotNull
    public static final b Companion = new b(0);

    @NotNull
    public static final Parcelable.Creator<sz0> CREATOR = new c();

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f32086a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f32087b;

        static {
            a aVar = new a();
            f32086a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", aVar, 2);
            c0343x0.l(com.ironsource.ge.f16389B1, false);
            c0343x0.l("network_data", false);
            f32087b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.M0.f224a, sz0.f32083d[1]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            Map map;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f32087b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = sz0.f32083d;
            String str2 = null;
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                map = (Map) b4.y(c0343x0, 1, interfaceC3527bArr[1], null);
                i4 = 3;
            } else {
                boolean z4 = true;
                int i5 = 0;
                Map map2 = null;
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
                        map2 = (Map) b4.y(c0343x0, 1, interfaceC3527bArr[1], map2);
                        i5 |= 2;
                    }
                }
                i4 = i5;
                str = str2;
                map = map2;
            }
            b4.c(c0343x0);
            return new sz0(i4, str, map);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f32087b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            sz0 value = (sz0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f32087b;
            B2.d b4 = encoder.b(c0343x0);
            sz0.a(value, b4, c0343x0);
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
            return a.f32086a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<sz0> {
        @Override // android.os.Parcelable.Creator
        public final sz0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new sz0(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final sz0[] newArray(int i4) {
            return new sz0[i4];
        }
    }

    static {
        C2.M0 m02 = C2.M0.f224a;
        f32083d = new InterfaceC3527b[]{null, new C0298a0(m02, AbstractC3551a.t(m02))};
    }

    public /* synthetic */ sz0(int i4, String str, Map map) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f32086a.getDescriptor());
        }
        this.f32084b = str;
        this.f32085c = map;
    }

    public static final /* synthetic */ void a(sz0 sz0Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f32083d;
        dVar.n(c0343x0, 0, sz0Var.f32084b);
        dVar.m(c0343x0, 1, interfaceC3527bArr[1], sz0Var.f32085c);
    }

    @NotNull
    public final String d() {
        return this.f32084b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final Map<String, String> e() {
        return this.f32085c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return Intrinsics.areEqual(this.f32084b, sz0Var.f32084b) && Intrinsics.areEqual(this.f32085c, sz0Var.f32085c);
    }

    public final int hashCode() {
        return this.f32085c.hashCode() + (this.f32084b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f32084b + ", networkData=" + this.f32085c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f32084b);
        Map<String, String> map = this.f32085c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public sz0(@NotNull String adapter, @NotNull LinkedHashMap networkData) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.f32084b = adapter;
        this.f32085c = networkData;
    }
}
