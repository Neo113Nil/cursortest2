package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3830c;

    public c(int i) {
        this.f3828a = i;
    }

    public final int a() {
        switch (this.f3829b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3830c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1970n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3829b = i;
        switch (i) {
            case 1:
                this.f3830c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3830c = carouselLayoutManager;
                break;
        }
    }
}
