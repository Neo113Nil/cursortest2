package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bg0 implements l80 {
    public final /* synthetic */ ad1 m;

    public bg0(EmojiCompatInitializer emojiCompatInitializer, ad1 ad1Var) {
        this.m = ad1Var;
    }

    @Override // defpackage.l80
    public final void n(id1 id1Var) {
        (Build.VERSION.SDK_INT >= 28 ? u00.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new dg0(0), 500L);
        this.m.c(this);
    }
}
