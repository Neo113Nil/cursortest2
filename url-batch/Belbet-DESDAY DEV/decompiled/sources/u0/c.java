package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3831c;

    public c(int i) {
        this.f3829a = i;
    }

    public final int a() {
        switch (this.f3830b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3831c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1969n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3830b = i;
        switch (i) {
            case 1:
                this.f3831c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3831c = carouselLayoutManager;
                break;
        }
    }
}
