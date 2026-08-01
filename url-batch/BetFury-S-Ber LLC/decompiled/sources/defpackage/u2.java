package defpackage;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u2 implements w0 {
    public int f;
    public final Object g;

    public u2(Context context) {
        int h = v2.h(context, 0);
        this.g = new q2(new ContextThemeWrapper(context, v2.h(context, h)));
        this.f = h;
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = mv.i(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public v2 a() {
        q2 q2Var = (q2) this.g;
        v2 v2Var = new v2(q2Var.a, this.f);
        View view = q2Var.e;
        t2 t2Var = v2Var.l;
        if (view != null) {
            t2Var.n = view;
        } else {
            CharSequence charSequence = q2Var.d;
            if (charSequence != null) {
                t2Var.d = charSequence;
                TextView textView = t2Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = q2Var.c;
            if (drawable != null) {
                t2Var.j = drawable;
                ImageView imageView = t2Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    t2Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (q2Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) q2Var.b.inflate(t2Var.r, (ViewGroup) null);
            int i = q2Var.i ? t2Var.s : t2Var.t;
            ListAdapter listAdapter = q2Var.g;
            if (listAdapter == null) {
                listAdapter = new s2(q2Var.a, i, R.id.text1, null);
            }
            t2Var.o = listAdapter;
            t2Var.p = q2Var.j;
            if (q2Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new p2(q2Var, t2Var));
            }
            if (q2Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            t2Var.e = alertController$RecycleListView;
        }
        v2Var.setCancelable(true);
        v2Var.setCanceledOnTouchOutside(true);
        v2Var.setOnCancelListener(null);
        v2Var.setOnDismissListener(null);
        s10 s10Var = q2Var.f;
        if (s10Var != null) {
            v2Var.setOnKeyListener(s10Var);
        }
        return v2Var;
    }

    @Override // defpackage.w0
    public boolean b(View view) {
        ((BottomSheetBehavior) this.g).L(this.f);
        return true;
    }

    public boolean d() {
        return this.f < ((ArrayList) this.g).size();
    }

    public void e(yq yqVar, int i, int i2) {
        ((ea0) this.g).e(new gg0(yqVar), i, i2);
    }

    public u2(ea0 ea0Var, int i) {
        this.g = ea0Var;
        this.f = i;
    }

    public u2() {
        this.f = 1;
        this.g = Collections.singletonList(null);
    }

    public u2(ArrayList arrayList, int i) {
        switch (i) {
            case 4:
                this.g = arrayList;
                break;
            default:
                this.f = 0;
                this.g = arrayList;
                break;
        }
    }

    public u2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.g = bottomSheetBehavior;
        this.f = i;
    }
}
