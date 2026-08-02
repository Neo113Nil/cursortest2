package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzh extends dza {
    private final ehi a;
    private final fym b;
    private final ldt c;

    public dzh(ehi ehiVar, ldt ldtVar, fym fymVar) {
        this.a = ehiVar;
        this.c = ldtVar;
        this.b = fymVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dzi dziVar = (dzi) obj;
        jgn jgnVar = (jgn) obj2;
        dziVar.getClass();
        jgnVar.getClass();
        Object obj3 = dziVar.c;
        this.c.o((View) obj3, jgnVar.c, jgnVar.b, null);
        dye dyeVar = (dye) obj3;
        dyeVar.setFocusable(false);
        dyeVar.setClickable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[LOOP:0: B:13:0x00f7->B:15:0x00fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a7  */
    @Override // defpackage.dza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int aa;
        int i;
        int i2;
        edb edbVar;
        ViewGroup.LayoutParams layoutParams;
        dzi dziVar = (dzi) obj;
        jgn jgnVar = (jgn) obj2;
        dziVar.getClass();
        jgnVar.getClass();
        jgm jgmVar = jgnVar.e;
        boolean z = jgmVar instanceof jgk;
        if (z) {
            aa = dih.aa(((dye) dziVar.c).getContext().getResources().getDisplayMetrics(), 16);
            i = 1;
        } else {
            if (!(jgmVar instanceof jgl)) {
                throw new koj();
            }
            if (((jgl) jgmVar).a != null) {
                aa = dih.aa(((dye) dziVar.c).getContext().getResources().getDisplayMetrics(), 24);
                i = 3;
            } else {
                dziVar.a = 0;
                dziVar.b = 0;
                aa = dih.aa(((dye) dziVar.c).getContext().getResources().getDisplayMetrics(), 10);
                i = 2;
            }
        }
        Object obj3 = dziVar.c;
        int i3 = jgnVar.g;
        jgu jguVar = jgnVar.f;
        int i4 = jguVar != null ? 2 : 4;
        dye dyeVar = (dye) obj3;
        MaterialButton materialButton = dyeVar.a;
        if (materialButton != null) {
            if (dyeVar.e != i) {
                dyeVar.removeView(materialButton);
            }
            List<jhh> list = jgnVar.a;
            ArrayList arrayList = new ArrayList(ixc.w(list));
            for (jhh jhhVar : list) {
                Context context = dyeVar.getContext();
                context.getClass();
                arrayList.add(dih.J(jhhVar, context));
            }
            dyeVar.c = hnu.ac(arrayList);
            edbVar = dyeVar.b;
            if (edbVar != null) {
                edbVar.a(dyeVar.c);
            }
            View view = (View) obj3;
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = dziVar.a;
            marginLayoutParams.bottomMargin = dziVar.b;
            view.setLayoutParams(marginLayoutParams);
            ehi ehiVar = this.a;
            materialButton.setTextColor(ehiVar.a(jgnVar.d));
            if (z) {
                jgk jgkVar = (jgk) jgmVar;
                materialButton.setBackgroundColor(ehiVar.a(jgkVar.a));
                ColorStateList valueOf = ColorStateList.valueOf(ehiVar.a(jgkVar.b));
                if (materialButton.c != valueOf) {
                    materialButton.c = valueOf;
                    materialButton.g(false);
                }
            }
            if (jguVar != null) {
                fym fymVar = this.b;
                Context context2 = dyeVar.getContext();
                context2.getClass();
                Drawable i5 = fymVar.i(context2, jguVar);
                i5.getClass();
                MaterialButton materialButton2 = dyeVar.a;
                if (materialButton2 != null) {
                    if (materialButton2.d != i5) {
                        materialButton2.f = -2.1474836E9f;
                        materialButton2.d = i5;
                        materialButton2.g(true);
                        materialButton2.h(materialButton2.getMeasuredWidth(), materialButton2.getMeasuredHeight());
                    }
                    if (materialButton2.e != 2) {
                        materialButton2.j();
                        materialButton2.e = 2;
                        materialButton2.h(materialButton2.getMeasuredWidth(), materialButton2.getMeasuredHeight());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        dyeVar.e = i;
        Context context3 = dyeVar.getContext();
        int i6 = dyeVar.e;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 0) {
            i2 = R.attr.materialButtonStyle;
        } else if (i7 == 1) {
            i2 = R.attr.borderlessButtonStyle;
        } else {
            if (i7 != 2) {
                throw new koj();
            }
            i2 = R.attr.materialButtonOutlinedStyle;
        }
        materialButton = new MaterialButton(context3, null, i2);
        materialButton.setPadding(aa, 0, aa, 0);
        materialButton.setMaxLines(i3);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setIncludeFontPadding(false);
        dyeVar.addView(materialButton, dyeVar.d);
        materialButton.setTextAlignment(i4);
        materialButton.setOnClickListener(new cx(obj3, 8, null));
        edb edbVar2 = new edb(materialButton);
        edbVar2.a(dyeVar.c);
        edbVar2.b(dyeVar.getWidth());
        dyeVar.b = edbVar2;
        dyeVar.a = materialButton;
        List<jhh> list2 = jgnVar.a;
        ArrayList arrayList2 = new ArrayList(ixc.w(list2));
        while (r5.hasNext()) {
        }
        dyeVar.c = hnu.ac(arrayList2);
        edbVar = dyeVar.b;
        if (edbVar != null) {
        }
        View view2 = (View) obj3;
        layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
        }
    }
}
