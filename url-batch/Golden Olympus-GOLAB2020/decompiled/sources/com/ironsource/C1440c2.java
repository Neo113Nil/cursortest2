package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1440c2 extends fc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f15664a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1460f1 f15665b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f15666c;

    public C1440c2(@NotNull C1525o1 adTools, @NotNull C1460f1 adProperties, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f15664a = adTools;
        this.f15665b = adProperties;
        this.f15666c = str;
    }

    @Override // com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@Nullable EnumC1433b2 enumC1433b2) {
        Map<String, Object> a4 = a(this.f15665b);
        a4.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a4.put("sessionDepth", Integer.valueOf(this.f15664a.f()));
        String str = this.f15666c;
        if (str != null) {
            a4.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a4;
    }

    public /* synthetic */ C1440c2(C1525o1 c1525o1, C1460f1 c1460f1, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1525o1, c1460f1, (i4 & 4) != 0 ? null : str);
    }
}
