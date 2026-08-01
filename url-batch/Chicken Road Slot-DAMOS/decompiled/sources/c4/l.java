package c4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import b7.p0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f1765d;

    public l(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.w wVar) {
        this.f1765d = wVar;
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p0(1), 500L);
        this.f1765d.f(this);
    }
}
