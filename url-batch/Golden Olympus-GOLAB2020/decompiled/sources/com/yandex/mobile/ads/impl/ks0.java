package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.impl.do1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ks0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f28310a;

    public ks0(@NotNull Object taskObject) {
        Intrinsics.checkNotNullParameter(taskObject, "taskObject");
        this.f28310a = taskObject;
    }

    @Nullable
    public final Location a() {
        Object a4 = do1.a.a(this.f28310a, "getResult", new Object[0]);
        if (a4 instanceof Location) {
            return (Location) a4;
        }
        return null;
    }

    public final boolean b() {
        Object a4 = do1.a.a(this.f28310a, "isComplete", new Object[0]);
        Boolean bool = a4 instanceof Boolean ? (Boolean) a4 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
