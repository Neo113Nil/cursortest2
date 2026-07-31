package j1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.InterfaceC0220e;
import androidx.lifecycle.InterfaceC0236v;

/* renamed from: j1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519j implements InterfaceC0220e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0238x f5265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f5266e;

    public C0519j(EmojiCompatInitializer emojiCompatInitializer, C0238x c0238x) {
        this.f5266e = emojiCompatInitializer;
        this.f5265d = c0238x;
    }

    @Override // androidx.lifecycle.InterfaceC0220e
    public final void a(InterfaceC0236v interfaceC0236v) {
        this.f5266e.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0511b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(), 500L);
        this.f5265d.f(this);
    }
}
