package E0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f226c;

    public e(int i) {
        this.f224a = i;
    }

    public final int a() {
        switch (this.f225b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f226c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f2734n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f225b = i;
        switch (i) {
            case 1:
                this.f226c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f226c = carouselLayoutManager;
                break;
        }
    }
}
