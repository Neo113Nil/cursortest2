package y0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4192c;

    public C0316c(int i) {
        this.f4190a = i;
    }

    public final int a() {
        switch (this.f4191b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4192c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2389n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0316c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4191b = i;
        switch (i) {
            case 1:
                this.f4192c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4192c = carouselLayoutManager;
                break;
        }
    }
}
