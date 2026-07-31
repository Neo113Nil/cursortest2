package com.yandex.mobile.ads.impl;

import C2.C0307f;
import C2.C0310g0;
import C2.C0343x0;
import C2.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.qz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.user.profile.UserProfileProvider;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class tz0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final long f32753b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<qz0> f32754c;

    @NotNull
    public static final b Companion = new b(0);

    @NotNull
    public static final Parcelable.Creator<tz0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f32752d = {null, new C0307f(qz0.a.f30959a)};

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f32755a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f32756b;

        static {
            a aVar = new a();
            f32755a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", aVar, 2);
            c0343x0.l("load_timeout_millis", true);
            c0343x0.l("mediation_prefetch_ad_units", true);
            f32756b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C0310g0.f284a, tz0.f32752d[1]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            long j4;
            int i4;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f32756b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = tz0.f32752d;
            List list2 = null;
            if (b4.v()) {
                j4 = b4.C(c0343x0, 0);
                list = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], null);
                i4 = 3;
            } else {
                j4 = 0;
                boolean z4 = true;
                i4 = 0;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        j4 = b4.C(c0343x0, 0);
                        i4 |= 1;
                    } else {
                        if (t4 != 1) {
                            throw new y2.o(t4);
                        }
                        list2 = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], list2);
                        i4 |= 2;
                    }
                }
                list = list2;
            }
            b4.c(c0343x0);
            return new tz0(i4, j4, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f32756b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            tz0 value = (tz0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f32756b;
            B2.d b4 = encoder.b(c0343x0);
            tz0.a(value, b4, c0343x0);
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
            return a.f32755a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<tz0> {
        @Override // android.os.Parcelable.Creator
        public final tz0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 != readInt; i4++) {
                arrayList.add(qz0.CREATOR.createFromParcel(parcel));
            }
            return new tz0(readLong, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final tz0[] newArray(int i4) {
            return new tz0[i4];
        }
    }

    public tz0() {
        this(0);
    }

    public static final /* synthetic */ void a(tz0 tz0Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f32752d;
        if (dVar.r(c0343x0, 0) || tz0Var.f32753b != UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS) {
            dVar.F(c0343x0, 0, tz0Var.f32753b);
        }
        if (!dVar.r(c0343x0, 1) && Intrinsics.areEqual(tz0Var.f32754c, CollectionsKt.emptyList())) {
            return;
        }
        dVar.m(c0343x0, 1, interfaceC3527bArr[1], tz0Var.f32754c);
    }

    public final long d() {
        return this.f32753b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final List<qz0> e() {
        return this.f32754c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return this.f32753b == tz0Var.f32753b && Intrinsics.areEqual(this.f32754c, tz0Var.f32754c);
    }

    public final int hashCode() {
        return this.f32754c.hashCode() + (Long.hashCode(this.f32753b) * 31);
    }

    @NotNull
    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f32753b + ", mediationPrefetchAdUnits=" + this.f32754c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeLong(this.f32753b);
        List<qz0> list = this.f32754c;
        out.writeInt(list.size());
        Iterator<qz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i4);
        }
    }

    public /* synthetic */ tz0(int i4) {
        this(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, CollectionsKt.emptyList());
    }

    public /* synthetic */ tz0(int i4, long j4, List list) {
        this.f32753b = (i4 & 1) == 0 ? UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS : j4;
        if ((i4 & 2) == 0) {
            this.f32754c = CollectionsKt.emptyList();
        } else {
            this.f32754c = list;
        }
    }

    public tz0(long j4, @NotNull List<qz0> mediationPrefetchAdUnits) {
        Intrinsics.checkNotNullParameter(mediationPrefetchAdUnits, "mediationPrefetchAdUnits");
        this.f32753b = j4;
        this.f32754c = mediationPrefetchAdUnits;
    }
}
