package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class edo implements dqs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ edo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dqs
    public final String a(String str) {
        int i = this.b;
        Object obj = this.a;
        return i != 0 ? ((drc) obj).a.getContext().getString(R.string.og_use_account_a11y_no_period, str) : ((eea) obj).getResources().getString(R.string.og_selected_account_a11y, str);
    }
}
