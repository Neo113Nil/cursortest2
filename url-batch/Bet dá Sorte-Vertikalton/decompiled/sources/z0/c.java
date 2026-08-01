package z0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4252c;

    public c(int i) {
        this.f4250a = i;
    }

    public final int a() {
        switch (this.f4251b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4252c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2077n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4251b = i;
        switch (i) {
            case 1:
                this.f4252c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4252c = carouselLayoutManager;
                break;
        }
    }
}
