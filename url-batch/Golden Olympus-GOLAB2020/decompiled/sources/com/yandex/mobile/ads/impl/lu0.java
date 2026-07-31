package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lu0 implements InterfaceC1998ig<mw0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mi0 f28781a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lw0 f28782b;

    public lu0(@NotNull mi0 imageAssetValueValidator, @NotNull lw0 mediaValidator) {
        Intrinsics.checkNotNullParameter(imageAssetValueValidator, "imageAssetValueValidator");
        Intrinsics.checkNotNullParameter(mediaValidator, "mediaValidator");
        this.f28781a = imageAssetValueValidator;
        this.f28782b = mediaValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC1998ig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(mw0 mw0Var) {
        boolean z4;
        boolean z5;
        mw0 value = mw0Var;
        Intrinsics.checkNotNullParameter(value, "value");
        List<ej0> a4 = value.a();
        eu0 media = value.b();
        if (a4 != null) {
            if (!a4.isEmpty()) {
                Iterator<T> it = a4.iterator();
                while (it.hasNext()) {
                    if (!this.f28781a.a((ej0) it.next())) {
                    }
                }
            }
            z4 = true;
            if (media != null) {
                this.f28782b.getClass();
                Intrinsics.checkNotNullParameter(media, "media");
                if (media.a() > 0.0f) {
                    z5 = true;
                    if (a4 != null || media == null) {
                        if (a4 != null) {
                            return z4;
                        }
                        if (media != null) {
                            return z5;
                        }
                    } else if (z5 && z4) {
                        return true;
                    }
                    return false;
                }
            }
            z5 = false;
            if (a4 != null) {
            }
            if (a4 != null) {
            }
        }
        z4 = false;
        if (media != null) {
        }
        z5 = false;
        if (a4 != null) {
        }
        if (a4 != null) {
        }
    }
}
