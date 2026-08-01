package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4234c;

    public c(int i) {
        this.f4232a = i;
    }

    public final int a() {
        switch (this.f4233b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4234c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2125n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4233b = i;
        switch (i) {
            case 1:
                this.f4234c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4234c = carouselLayoutManager;
                break;
        }
    }
}
