package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zu implements iq {
    public final /* synthetic */ xg0 d;

    public zu(EmojiCompatInitializer emojiCompatInitializer, xg0 xg0Var) {
        this.d = xg0Var;
    }

    @Override // defpackage.iq
    public final void c(vg0 vg0Var) {
        cm.a(Looper.getMainLooper()).postDelayed(new bv(), 500L);
        this.d.f(this);
    }
}
