package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxe extends dza {
    private final fym a;
    private final ekx b;

    public dxe(fym fymVar, ekx ekxVar) {
        this.a = fymVar;
        this.b = ekxVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dxf dxfVar = (dxf) obj;
        jfv jfvVar = (jfv) obj2;
        dxfVar.getClass();
        jfvVar.getClass();
        jft jftVar = jfvVar.c;
        jfs jfsVar = jftVar instanceof jfs ? (jfs) jftVar : null;
        if (jfsVar != null) {
            ekx ekxVar = this.b;
            iee ieeVar = dxfVar.i;
            jiu jiuVar = jfsVar.b;
            Object obj3 = ieeVar.g;
            if (jiuVar == null) {
                FrameLayout frameLayout = (FrameLayout) obj3;
                frameLayout.setClickable(false);
                frameLayout.setContentDescription(null);
                frameLayout.setImportantForAccessibility(4);
                return;
            }
            View view = (View) obj3;
            ((ldt) ekxVar.b).o(view, 111271, jiuVar, null);
            FrameLayout frameLayout2 = (FrameLayout) obj3;
            frameLayout2.setContentDescription(frameLayout2.getContext().getString(R.string.og_edit_my_info_a11y));
            frameLayout2.setImportantForAccessibility(1);
            dih.I(view, Button.class.getName());
        }
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        dxf dxfVar = (dxf) obj;
        jfv jfvVar = (jfv) obj2;
        dxfVar.getClass();
        jfvVar.getClass();
        jft jftVar = jfvVar.c;
        if (jftVar instanceof jfu) {
            dxfVar.a(false);
            TextView textView = dxfVar.f;
            jhq jhqVar = ((jfu) jftVar).a;
            jhh jhhVar = (jhh) ixc.f(jhqVar.a);
            Context context = textView.getContext();
            context.getClass();
            textView.setText(dih.J(jhhVar, context));
            CharSequence text = textView.getText();
            jhh jhhVar2 = (jhh) ixc.f(jhqVar.d);
            Context context2 = textView.getContext();
            context2.getClass();
            textView.setContentDescription(((Object) text) + "\n" + dih.J(jhhVar2, context2));
            dxfVar.a.t(jfvVar.a);
            i = 1;
        } else {
            if (!(jftVar instanceof jfs)) {
                throw new koj();
            }
            dxfVar.a(true);
            ekx ekxVar = this.b;
            iee ieeVar = dxfVar.i;
            jfs jfsVar = (jfs) jftVar;
            List list = jfsVar.c;
            View view = (View) ieeVar.e;
            Context context3 = view.getContext();
            i = 1;
            view.setContentDescription(ixc.y(list, "\n", null, null, new dwd(context3, 9), 30));
            jgg jggVar = jfsVar.a;
            jhq jhqVar2 = new jhq(new jhh(jggVar.c), (jhb) null, 8, (Integer) 1, 18);
            dza dzaVar = (dza) ekxVar.d;
            Object obj3 = ieeVar.b;
            dzaVar.c(obj3, jhqVar2);
            ((TextView) ((iyi) obj3).b).setTextSize(0, context3.getResources().getDimension(R.dimen.bento_compact_header_title_text_size));
            String str = jggVar.d;
            if (str != null) {
                Object obj4 = ieeVar.f;
                ((TextView) ((iyi) obj4).b).setVisibility(0);
                dzaVar.c(obj4, new jhq(new jhh(str), jhb.c, 4, (Integer) 1, 16));
            } else {
                ((TextView) ((iyi) ieeVar.f).b).setVisibility(8);
            }
            ((dza) ekxVar.c).c(ieeVar.a, new dzc(jggVar.a, jggVar.b, jggVar.g));
            jhi jhiVar = jfsVar.d;
            ((View) ieeVar.d).setVisibility(jhiVar != null ? 0 : 8);
            if (jhiVar != null) {
                ((dza) ekxVar.a).c(ieeVar.c, jhiVar);
            }
        }
        int a = jftVar.a() - 1;
        Drawable drawable = null;
        jha jhaVar = a != 0 ? a != i ? null : new jha(21, null) : new jha(20, null);
        ImageView imageView = dxfVar.c;
        if (jhaVar != null) {
            fym fymVar = this.a;
            Context context4 = imageView.getContext();
            context4.getClass();
            drawable = fymVar.i(context4, jhaVar);
        }
        imageView.setImageDrawable(drawable);
        jgr jgrVar = jfvVar.b;
        int i2 = jftVar.a() != 3 ? 0 : 8;
        imageView.setVisibility(i2);
        dxfVar.d.setVisibility(jftVar.a() == 1 ? 0 : 8);
        if (ksp.b(jgrVar, dxfVar.h)) {
            return;
        }
        dxfVar.h = jgrVar;
        if (jgrVar instanceof jgz) {
            imageView.setVisibility(i2);
            dxfVar.b.setVisibility(8);
            return;
        }
        if (jgrVar instanceof jgx) {
            throw new IllegalStateException("AccountManagementHeaderViewBinding received an unexpected NonCollapsibleState");
        }
        if (!(jgrVar instanceof jgs)) {
            throw new koj();
        }
        imageView.setVisibility(i2);
        jgs jgsVar = (jgs) jgrVar;
        int i3 = jgsVar.b;
        if (!dxfVar.g) {
            dxfVar.b.setVisibility(i3 == 2 ? 0 : 8);
        }
        float f = i3 == 2 ? 360.0f : 180.0f;
        if (imageView.getRotation() != f) {
            ObjectAnimator objectAnimator = dxfVar.e;
            objectAnimator.setFloatValues(imageView.getRotation(), f);
            objectAnimator.start();
        }
        TextView textView2 = dxfVar.f;
        jhh jhhVar3 = jgsVar.a;
        Context context5 = textView2.getContext();
        context5.getClass();
        yq.n(textView2, dih.J(jhhVar3, context5));
    }
}
