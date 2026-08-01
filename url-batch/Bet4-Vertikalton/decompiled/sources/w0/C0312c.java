package w0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4167c;

    public C0312c(int i) {
        this.f4165a = i;
    }

    public final int a() {
        switch (this.f4166b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4167c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f2285n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0312c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4166b = i;
        switch (i) {
            case 1:
                this.f4167c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4167c = carouselLayoutManager;
                break;
        }
    }
}
