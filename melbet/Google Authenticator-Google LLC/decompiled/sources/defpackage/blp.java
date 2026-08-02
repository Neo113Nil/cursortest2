package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public abstract class blp extends bli {
    protected final View a;
    public final cwk b;

    public blp(View view) {
        a.v(view, "Argument must not be null");
        this.a = view;
        this.b = new cwk(view);
    }

    @Override // defpackage.bli, defpackage.bln
    public final blb a() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof blb) {
            return (blb) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.bln
    public final void bq(blg blgVar) {
        cwk cwkVar = this.b;
        int e = cwkVar.e();
        int d = cwkVar.d();
        if (cwk.g(e, d)) {
            blgVar.e(e, d);
            return;
        }
        List list = cwkVar.a;
        if (!list.contains(blgVar)) {
            list.add(blgVar);
        }
        if (cwkVar.b == null) {
            ViewTreeObserver viewTreeObserver = ((View) cwkVar.c).getViewTreeObserver();
            cwkVar.b = new blo(cwkVar);
            viewTreeObserver.addOnPreDrawListener(cwkVar.b);
        }
    }

    @Override // defpackage.bli, defpackage.bln
    public final void c(blb blbVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, blbVar);
    }

    @Override // defpackage.bln
    public final void j(blg blgVar) {
        this.b.a.remove(blgVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
