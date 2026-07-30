package l3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements androidx.lifecycle.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.x f5917f;

    public l(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.x xVar) {
        this.f5917f = xVar;
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.v vVar) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
        this.f5917f.f(this);
    }
}
