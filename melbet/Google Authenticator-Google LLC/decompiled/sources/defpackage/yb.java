package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yb extends yf {
    public yb(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.yf
    public final /* synthetic */ Object a(View view) {
        return ym.a(view);
    }

    @Override // defpackage.yf
    public final /* synthetic */ void b(View view, Object obj) {
        ym.c(view, (CharSequence) obj);
    }

    @Override // defpackage.yf
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
