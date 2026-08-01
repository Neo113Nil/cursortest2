package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class l2 implements t0 {
    public int f;
    public final Object g;

    public l2(ArrayList arrayList, int i) {
        switch (i) {
            case 3:
                this.g = arrayList;
                break;
            default:
                this.f = 0;
                this.g = arrayList;
                break;
        }
    }

    @Override // defpackage.t0
    public boolean a(View view) {
        ((BottomSheetBehavior) this.g).L(this.f);
        return true;
    }

    public m2 b() {
        h2 h2Var = (h2) this.g;
        m2 m2Var = new m2(h2Var.a, this.f);
        View view = h2Var.e;
        k2 k2Var = m2Var.l;
        if (view != null) {
            k2Var.u = view;
        } else {
            CharSequence charSequence = h2Var.d;
            if (charSequence != null) {
                k2Var.d = charSequence;
                TextView textView = k2Var.s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = h2Var.c;
            if (drawable != null) {
                k2Var.q = drawable;
                ImageView imageView = k2Var.r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    k2Var.r.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = h2Var.f;
        if (charSequence2 != null) {
            k2Var.e = charSequence2;
            TextView textView2 = k2Var.t;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = h2Var.g;
        if (charSequence3 != null) {
            k2Var.b(-1, charSequence3, h2Var.h);
        }
        CharSequence charSequence4 = h2Var.i;
        if (charSequence4 != null) {
            k2Var.b(-2, charSequence4, h2Var.j);
        }
        if (h2Var.l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) h2Var.b.inflate(k2Var.y, (ViewGroup) null);
            int i = h2Var.n ? k2Var.z : k2Var.A;
            ListAdapter listAdapter = h2Var.l;
            if (listAdapter == null) {
                listAdapter = new j2(h2Var.a, i, R.id.text1, null);
            }
            k2Var.v = listAdapter;
            k2Var.w = h2Var.o;
            if (h2Var.m != null) {
                alertController$RecycleListView.setOnItemClickListener(new g2(h2Var, k2Var));
            }
            if (h2Var.n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            k2Var.f = alertController$RecycleListView;
        }
        m2Var.setCancelable(true);
        m2Var.setCanceledOnTouchOutside(true);
        m2Var.setOnCancelListener(null);
        m2Var.setOnDismissListener(null);
        nw nwVar = h2Var.k;
        if (nwVar != null) {
            m2Var.setOnKeyListener(nwVar);
        }
        return m2Var;
    }

    public boolean c() {
        return this.f < ((ArrayList) this.g).size();
    }

    public l2(Context context, int i) {
        this.g = new h2(new ContextThemeWrapper(context, m2.h(context, i)));
        this.f = i;
    }

    public l2() {
        this.f = 1;
        this.g = Collections.singletonList(null);
    }

    public l2(Context context) {
        this(context, m2.h(context, 0));
    }

    public l2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.g = bottomSheetBehavior;
        this.f = i;
    }
}
