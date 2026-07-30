package k;

import m.Y0;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4622j extends com.bumptech.glide.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38660d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38661e;

    /* renamed from: f, reason: collision with root package name */
    public int f38662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38663g;

    public C4622j(C4623k c4623k) {
        this.f38660d = 0;
        this.f38663g = c4623k;
        this.f38661e = false;
        this.f38662f = 0;
    }

    @Override // com.bumptech.glide.f, O.f0
    public void a() {
        switch (this.f38660d) {
            case 1:
                this.f38661e = true;
                break;
        }
    }

    @Override // com.bumptech.glide.f, O.f0
    public final void b() {
        switch (this.f38660d) {
            case 0:
                if (!this.f38661e) {
                    this.f38661e = true;
                    com.bumptech.glide.f fVar = ((C4623k) this.f38663g).f38667d;
                    if (fVar != null) {
                        fVar.b();
                        break;
                    }
                }
                break;
            default:
                ((Y0) this.f38663g).f39353a.setVisibility(0);
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        switch (this.f38660d) {
            case 0:
                int i = this.f38662f + 1;
                this.f38662f = i;
                C4623k c4623k = (C4623k) this.f38663g;
                if (i == c4623k.f38664a.size()) {
                    com.bumptech.glide.f fVar = c4623k.f38667d;
                    if (fVar != null) {
                        fVar.c();
                    }
                    this.f38662f = 0;
                    this.f38661e = false;
                    c4623k.f38668e = false;
                    break;
                }
                break;
            default:
                if (!this.f38661e) {
                    ((Y0) this.f38663g).f39353a.setVisibility(this.f38662f);
                    break;
                }
                break;
        }
    }

    public C4622j(Y0 y02, int i) {
        this.f38660d = 1;
        this.f38663g = y02;
        this.f38662f = i;
        this.f38661e = false;
    }
}
