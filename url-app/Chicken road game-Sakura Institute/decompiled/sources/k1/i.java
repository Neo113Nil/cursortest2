package k1;

import G1.u;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.InterfaceC0465e;
import androidx.lifecycle.InterfaceC0481v;

/* loaded from: classes.dex */
public final class i implements InterfaceC0465e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0483x f7390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f7391e;

    public i(EmojiCompatInitializer emojiCompatInitializer, C0483x c0483x) {
        this.f7391e = emojiCompatInitializer;
        this.f7390d = c0483x;
    }

    @Override // androidx.lifecycle.InterfaceC0465e
    public final void a(InterfaceC0481v interfaceC0481v) {
        this.f7391e.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new u(), 500L);
        this.f7390d.f(this);
    }
}
