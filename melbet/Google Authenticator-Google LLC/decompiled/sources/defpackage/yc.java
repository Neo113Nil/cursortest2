package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yc extends yf {
    public yc(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.yf
    public final /* synthetic */ Object a(View view) {
        return yo.b(view);
    }

    @Override // defpackage.yf
    public final /* synthetic */ void b(View view, Object obj) {
        yo.c(view, (CharSequence) obj);
    }

    @Override // defpackage.yf
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
