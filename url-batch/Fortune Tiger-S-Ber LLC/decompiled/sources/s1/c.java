package s1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3318b;
    public final /* synthetic */ CarouselLayoutManager c;

    public c(int i4) {
        this.f3317a = i4;
    }

    public final int a() {
        switch (this.f3318b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f884n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i4) {
        this(1);
        this.f3318b = i4;
        switch (i4) {
            case 1:
                this.c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }
}
