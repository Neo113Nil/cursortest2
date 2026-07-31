package n5;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import r2.r;
import r5.h;
import r5.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5377b;

    public /* synthetic */ b(int i, Object obj) {
        this.f5376a = i;
        this.f5377b = obj;
    }

    @Override // r2.r
    public final void G(int i) {
        switch (this.f5376a) {
            case 0:
                break;
            default:
                i iVar = (i) this.f5377b;
                iVar.f6674d = true;
                h hVar = (h) iVar.f6675e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.A();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // r2.r
    public final void H(Typeface typeface, boolean z3) {
        switch (this.f5376a) {
            case 0:
                Chip chip = (Chip) this.f5377b;
                f fVar = chip.f1901h;
                chip.setText(fVar.O0 ? fVar.Q : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z3) {
                    i iVar = (i) this.f5377b;
                    iVar.f6674d = true;
                    h hVar = (h) iVar.f6675e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.A();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void a0(int i) {
    }
}
