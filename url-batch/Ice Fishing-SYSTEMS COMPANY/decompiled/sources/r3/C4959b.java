package r3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import w3.InterfaceC5169h;
import w3.i;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4959b extends com.bumptech.glide.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f40282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f40283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4959b(int i, Object obj) {
        super(13);
        this.f40282g = i;
        this.f40283h = obj;
    }

    @Override // com.bumptech.glide.e
    public final void u(int i) {
        switch (this.f40282g) {
            case 0:
                break;
            default:
                i iVar = (i) this.f40283h;
                iVar.f41670d = true;
                InterfaceC5169h interfaceC5169h = (InterfaceC5169h) iVar.f41671e.get();
                if (interfaceC5169h != null) {
                    C4963f c4963f = (C4963f) interfaceC5169h;
                    c4963f.u();
                    c4963f.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.e
    public final void v(Typeface typeface, boolean z8) {
        switch (this.f40282g) {
            case 0:
                Chip chip = (Chip) this.f40283h;
                C4963f c4963f = chip.f36092x;
                chip.setText(c4963f.f40330i1 ? c4963f.f40317X : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z8) {
                    i iVar = (i) this.f40283h;
                    iVar.f41670d = true;
                    InterfaceC5169h interfaceC5169h = (InterfaceC5169h) iVar.f41671e.get();
                    if (interfaceC5169h != null) {
                        C4963f c4963f2 = (C4963f) interfaceC5169h;
                        c4963f2.u();
                        c4963f2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void D(int i) {
    }
}
