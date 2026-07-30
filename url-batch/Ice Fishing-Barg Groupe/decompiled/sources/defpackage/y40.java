package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y40 implements uw {
    public final /* synthetic */ s01 rtx2ld2ELZv4;

    public y40(EmojiCompatInitializer emojiCompatInitializer, s01 s01Var) {
        this.rtx2ld2ELZv4 = s01Var;
    }

    @Override // defpackage.uw
    public final void OPXfSBeufaJ8(o01 o01Var) {
        (Build.VERSION.SDK_INT >= 28 ? iq.PxuCJdSBwIXG(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new a50(), 500L);
        this.rtx2ld2ELZv4.a92UlCVFR9N8(this);
    }
}
