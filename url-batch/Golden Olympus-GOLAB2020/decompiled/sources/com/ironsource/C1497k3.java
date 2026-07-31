package com.ironsource;

import com.ironsource.C1511m3;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1497k3 implements InterfaceC1504l3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16886a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16887b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f16888c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16889d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16890e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16891f;

    @Metadata
    /* renamed from: com.ironsource.k3$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16892a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f16893b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f16894c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f16895d = 1;

        private a() {
        }
    }

    public C1497k3(@NotNull String version, @NotNull String instanceId, @NotNull IronSource.AD_UNIT adFormat, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f16886a = version;
        this.f16887b = instanceId;
        this.f16888c = adFormat;
        this.f16889d = z4;
        this.f16890e = z5;
        this.f16891f = z6;
    }

    @Override // com.ironsource.InterfaceC1504l3
    @NotNull
    public ArrayList<InterfaceC1520n3> a() {
        ArrayList<InterfaceC1520n3> arrayList = new ArrayList<>();
        arrayList.add(new C1511m3.v(this.f16886a));
        arrayList.add(new C1511m3.x(this.f16887b));
        arrayList.add(new C1511m3.a(this.f16888c));
        if (this.f16889d) {
            arrayList.add(new C1511m3.p(1));
        }
        if (this.f16890e) {
            arrayList.add(new C1511m3.e(1));
        }
        if (this.f16891f) {
            arrayList.add(new C1511m3.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C1497k3(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z4, boolean z5, boolean z6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, ad_unit, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? true : z5, (i4 & 32) != 0 ? true : z6);
    }
}
