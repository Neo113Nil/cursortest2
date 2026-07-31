package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fm1 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f25864a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final au0.a f25865b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2230sf f25866c;

    public fm1(float f4) {
        this(f4, new au0.a());
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int a4 = this.f25866c.a(size);
            if (mode2 == Integer.MIN_VALUE) {
                a4 = (int) Math.min(size2, a4);
            }
            i5 = View.MeasureSpec.makeMeasureSpec(a4, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int b4 = this.f25866c.b(size2);
            if (mode == Integer.MIN_VALUE) {
                b4 = (int) Math.min(size, b4);
            }
            i4 = View.MeasureSpec.makeMeasureSpec(b4, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f25864a) {
                i4 = View.MeasureSpec.makeMeasureSpec(this.f25866c.b(size2), 1073741824);
                i5 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int a5 = this.f25866c.a(size);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i5 = View.MeasureSpec.makeMeasureSpec(a5, 1073741824);
                i4 = makeMeasureSpec;
            }
        }
        au0.a aVar = this.f25865b;
        aVar.f23449a = i4;
        aVar.f23450b = i5;
        return aVar;
    }

    public /* synthetic */ fm1(float f4, au0.a aVar) {
        this(f4, aVar, new C2230sf(f4));
    }

    public fm1(float f4, @NotNull au0.a measureSpecHolder, @NotNull C2230sf aspectRatioResolver) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        Intrinsics.checkNotNullParameter(aspectRatioResolver, "aspectRatioResolver");
        this.f25864a = f4;
        this.f25865b = measureSpecHolder;
        this.f25866c = aspectRatioResolver;
    }
}
