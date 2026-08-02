package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edf extends kr {
    private final Context a;
    private final hel e;
    private final efu f;
    private final int g;

    public edf(Context context, hel helVar, efu efuVar, int i) {
        context.getClass();
        this.a = context;
        this.e = helVar;
        this.f = efuVar;
        this.g = i;
    }

    @Override // defpackage.kr
    public final int a() {
        return ((his) this.e).c;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        ecr ecrVar = new ecr(this.a, this.f, viewGroup);
        View view = ecrVar.a;
        int i2 = yq.a;
        int paddingStart = view.getPaddingStart();
        int i3 = this.g;
        view.setPaddingRelative(paddingStart + i3, view.getPaddingTop(), view.getPaddingEnd() + i3, view.getPaddingBottom());
        return ecrVar;
    }

    @Override // defpackage.kr
    public final /* synthetic */ void k(lp lpVar, int i) {
        ecr ecrVar = (ecr) lpVar;
        ecq ecqVar = (ecq) this.e.get(i);
        SimpleActionView simpleActionView = ecrVar.x;
        simpleActionView.a = gzp.h(Integer.valueOf(ecqVar.d));
        simpleActionView.b(ecrVar.w);
        Drawable drawable = ecqVar.a;
        if (drawable != null) {
            ImageView imageView = ecrVar.t;
            dih.af(drawable, ecrVar.v);
            imageView.setImageDrawable(drawable);
        } else {
            ImageView imageView2 = ecrVar.t;
            imageView2.setImageDrawable(dih.ac(imageView2.getContext(), ecqVar.b, ecrVar.v));
        }
        ecrVar.u.setText(ecqVar.c);
        ecrVar.a.setOnClickListener(new drl(ecrVar, ecqVar, 6));
    }

    @Override // defpackage.kr
    public final /* synthetic */ void n(lp lpVar) {
        ecr ecrVar = (ecr) lpVar;
        SimpleActionView simpleActionView = ecrVar.x;
        simpleActionView.e(ecrVar.w);
        simpleActionView.a = gyf.a;
    }
}
