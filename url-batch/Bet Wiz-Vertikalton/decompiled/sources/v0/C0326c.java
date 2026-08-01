package v0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4037c;

    public C0326c(int i) {
        this.f4035a = i;
    }

    public final int a() {
        switch (this.f4036b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4037c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f2102n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0326c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4036b = i;
        switch (i) {
            case 1:
                this.f4037c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4037c = carouselLayoutManager;
                break;
        }
    }
}
