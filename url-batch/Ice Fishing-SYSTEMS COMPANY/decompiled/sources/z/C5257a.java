package z;

import w.C5141a;
import w.C5144d;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5257a extends c {

    /* renamed from: A, reason: collision with root package name */
    public int f41885A;

    /* renamed from: B, reason: collision with root package name */
    public int f41886B;

    /* renamed from: C, reason: collision with root package name */
    public C5141a f41887C;

    public boolean getAllowsGoneWidget() {
        return this.f41887C.f41387t0;
    }

    public int getMargin() {
        return this.f41887C.f41388u0;
    }

    public int getType() {
        return this.f41885A;
    }

    @Override // z.c
    public final void h(C5144d c5144d, boolean z8) {
        int i = this.f41885A;
        this.f41886B = i;
        if (z8) {
            if (i == 5) {
                this.f41886B = 1;
            } else if (i == 6) {
                this.f41886B = 0;
            }
        } else if (i == 5) {
            this.f41886B = 0;
        } else if (i == 6) {
            this.f41886B = 1;
        }
        if (c5144d instanceof C5141a) {
            ((C5141a) c5144d).f41386s0 = this.f41886B;
        }
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f41887C.f41387t0 = z8;
    }

    public void setDpMargin(int i) {
        this.f41887C.f41388u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f41887C.f41388u0 = i;
    }

    public void setType(int i) {
        this.f41885A = i;
    }
}
