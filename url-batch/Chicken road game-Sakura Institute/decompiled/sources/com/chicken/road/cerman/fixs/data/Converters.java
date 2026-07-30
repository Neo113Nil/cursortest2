package com.chicken.road.cerman.fixs.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDatabase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/Converters;", "", "<init>", "()V", "toType", "Lcom/chicken/road/cerman/fixs/data/ChickenType;", "v", "", "fromType", "toStatus", "Lcom/chicken/road/cerman/fixs/data/ChickenStatus;", "fromStatus", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Converters {
    public static final int $stable = 0;

    public final ChickenType toType(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return ChickenType.valueOf(v);
    }

    public final String fromType(ChickenType v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.name();
    }

    public final ChickenStatus toStatus(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return ChickenStatus.valueOf(v);
    }

    public final String fromStatus(ChickenStatus v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.name();
    }
}
