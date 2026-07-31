package d4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w f2276d;

    public m(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.w wVar) {
        this.f2276d = wVar;
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q(), 500L);
        this.f2276d.f(this);
    }
}
