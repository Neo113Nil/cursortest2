package B0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f87a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f89c;

    public e(int i) {
        this.f87a = i;
    }

    public final int a() {
        switch (this.f88b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f89c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2152n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f88b = i;
        switch (i) {
            case 1:
                this.f89c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f89c = carouselLayoutManager;
                break;
        }
    }
}
