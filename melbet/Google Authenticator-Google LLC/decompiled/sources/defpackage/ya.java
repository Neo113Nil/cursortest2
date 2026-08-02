package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ya extends yf {
    public ya(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls, 0, 28);
    }

    @Override // defpackage.yf
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ym.f(view));
    }

    @Override // defpackage.yf
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ym.d(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.yf
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
