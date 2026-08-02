package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gxx implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gxx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gzf, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d != 0) {
            ldt ldtVar = (ldt) this.a;
            Object obj = ldtVar.c;
            if (((jiw) obj).b((jiu) this.b, (View) this.c) == jiv.a) {
                ((hrz) ldtVar.a).f(jfw.a);
                return;
            }
            return;
        }
        boolean aP = hoq.aP(view.getContext());
        ?? r1 = this.c;
        if (aP) {
            Object obj2 = this.a;
            String str = (String) view.getTag(R.id.tiktok_event_internal_trace);
            if (str == null) {
                str = view.getClass().getSimpleName();
            }
            Object obj3 = ((brn) obj2).a;
            gva gvaVar = (gva) obj3;
            gtt c = gvaVar.c(275, "Clicked ".concat(String.valueOf(str)), (guc) this.b.a(view));
            try {
                r1.onClick(view);
                c.close();
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
