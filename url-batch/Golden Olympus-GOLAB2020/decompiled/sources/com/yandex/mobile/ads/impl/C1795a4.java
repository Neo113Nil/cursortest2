package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* renamed from: com.yandex.mobile.ads.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1795a4 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23145b;

    @NotNull
    public static final b Companion = new b(0);

    @NotNull
    public static final Parcelable.Creator<C1795a4> CREATOR = new c();

    /* renamed from: com.yandex.mobile.ads.impl.a4$a */
    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f23146a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f23147b;

        static {
            a aVar = new a();
            f23146a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.common.AdImpressionData", aVar, 1);
            c0343x0.l(Constants.MessagePayloadKeys.RAW_DATA, false);
            f23147b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.M0.f224a};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f23147b;
            B2.c b4 = decoder.b(c0343x0);
            int i4 = 1;
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
            } else {
                str = null;
                boolean z4 = true;
                int i5 = 0;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else {
                        if (t4 != 0) {
                            throw new y2.o(t4);
                        }
                        str = b4.h(c0343x0, 0);
                        i5 = 1;
                    }
                }
                i4 = i5;
            }
            b4.c(c0343x0);
            return new C1795a4(i4, str);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f23147b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            C1795a4 value = (C1795a4) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f23147b;
            B2.d b4 = encoder.b(c0343x0);
            C1795a4.a(value, b4, c0343x0);
            b4.c(c0343x0);
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] typeParametersSerializers() {
            return L.a.a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.a4$b */
    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return a.f23146a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.a4$c */
    public static final class c implements Parcelable.Creator<C1795a4> {
        @Override // android.os.Parcelable.Creator
        public final C1795a4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C1795a4(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C1795a4[] newArray(int i4) {
            return new C1795a4[i4];
        }
    }

    public /* synthetic */ C1795a4(int i4, String str) {
        if (1 != (i4 & 1)) {
            AbstractC0341w0.a(i4, 1, a.f23146a.getDescriptor());
        }
        this.f23145b = str;
    }

    public static final /* synthetic */ void a(C1795a4 c1795a4, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, c1795a4.f23145b);
    }

    @NotNull
    public final String c() {
        return this.f23145b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1795a4) && Intrinsics.areEqual(this.f23145b, ((C1795a4) obj).f23145b);
    }

    public final int hashCode() {
        return this.f23145b.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdImpressionData(rawData=" + this.f23145b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f23145b);
    }

    public C1795a4(@NotNull String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.f23145b = rawData;
    }
}
