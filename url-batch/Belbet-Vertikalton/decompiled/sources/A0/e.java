package A0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f11a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f13c;

    public e(int i) {
        this.f11a = i;
    }

    public final int a() {
        switch (this.f12b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f13c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2914n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f12b = i;
        switch (i) {
            case 1:
                this.f13c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f13c = carouselLayoutManager;
                break;
        }
    }
}
