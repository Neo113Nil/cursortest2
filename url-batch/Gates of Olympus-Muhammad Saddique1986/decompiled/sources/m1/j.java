package m1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.InterfaceC0276e;
import androidx.lifecycle.InterfaceC0292v;

/* loaded from: classes.dex */
public final class j implements InterfaceC0276e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0294x f6955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f6956e;

    public j(EmojiCompatInitializer emojiCompatInitializer, C0294x c0294x) {
        this.f6956e = emojiCompatInitializer;
        this.f6955d = c0294x;
    }

    @Override // androidx.lifecycle.InterfaceC0276e
    public final void a(InterfaceC0292v interfaceC0292v) {
        this.f6956e.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0644b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(), 500L);
        this.f6955d.f(this);
    }
}
