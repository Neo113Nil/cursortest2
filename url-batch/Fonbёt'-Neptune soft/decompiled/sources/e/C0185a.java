package e;

import a.AbstractC0132a;
import android.graphics.drawable.Animatable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185a extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2115j;

    /* renamed from: k, reason: collision with root package name */
    public final Animatable f2116k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0185a(Animatable animatable, int i2) {
        super(23);
        this.f2115j = i2;
        this.f2116k = animatable;
    }

    @Override // a.AbstractC0132a
    public final void M() {
        switch (this.f2115j) {
            case 0:
                this.f2116k.start();
                break;
            default:
                ((S.e) this.f2116k).start();
                break;
        }
    }

    @Override // a.AbstractC0132a
    public final void O() {
        switch (this.f2115j) {
            case 0:
                this.f2116k.stop();
                break;
            default:
                ((S.e) this.f2116k).stop();
                break;
        }
    }
}
