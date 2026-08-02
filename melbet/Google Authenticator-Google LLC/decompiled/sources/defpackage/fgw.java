package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgw extends abp {
    final /* synthetic */ Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgw(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    @Override // defpackage.abp
    protected final void k(List list) {
        list.add(0);
        this.f.g();
    }

    @Override // defpackage.abp
    protected final void m(aah aahVar) {
        Chip chip = this.f;
        aahVar.n(chip.e());
        aahVar.p(chip.isClickable());
        aahVar.o(chip.getAccessibilityClassName());
        aahVar.A(chip.getText());
    }

    @Override // defpackage.abp
    protected final void n(int i, aah aahVar) {
        if (i != 1) {
            aahVar.s("");
            aahVar.l(Chip.b);
            return;
        }
        Chip chip = this.f;
        CharSequence text = chip.getText();
        aahVar.s(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, true != TextUtils.isEmpty(text) ? text : "").trim());
        RectF a = chip.a();
        int i2 = (int) a.left;
        int i3 = (int) a.top;
        int i4 = (int) a.right;
        int i5 = (int) a.bottom;
        Rect rect = chip.f;
        rect.set(i2, i3, i4, i5);
        aahVar.l(rect);
        aahVar.h(aag.c);
        aahVar.t(chip.isEnabled());
        aahVar.o(Button.class.getName());
    }

    @Override // defpackage.abp
    protected final void o(int i, boolean z) {
        if (i == 1) {
            this.f.e = z;
        }
        Chip chip = this.f;
        fgy fgyVar = chip.c;
        boolean z2 = chip.e;
        if (fgyVar.f != null) {
            if (fgyVar.r(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : fgy.a)) {
                chip.refreshDrawableState();
            }
        }
    }

    @Override // defpackage.abp
    public final boolean r(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f.performClick();
            }
            if (i == 1) {
                this.f.playSoundEffect(0);
            }
        }
        return false;
    }
}
