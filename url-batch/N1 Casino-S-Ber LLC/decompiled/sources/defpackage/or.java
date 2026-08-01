package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.recyclerview.widget.RecyclerView;
import com.derinko.gbini.n1casino.MainActivity2;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class or implements s0 {
    public static final cp h = new cp(0);
    public static final cp i = new cp(1);
    public int f;
    public final Object g;

    public or(int i2) {
        switch (i2) {
            case 5:
                this.g = new int[10];
                break;
            default:
                this.f = 1;
                this.g = Collections.singletonList(null);
                break;
        }
    }

    public static void b(nz nzVar) {
        View view = nzVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = x80.a;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static int c(int i2, int i3) {
        int i4;
        int i5 = i2 & 3158064;
        if (i5 == 0) {
            return i2;
        }
        int i6 = i2 & (~i5);
        if (i3 == 0) {
            i4 = i5 >> 2;
        } else {
            int i7 = i5 >> 1;
            i6 |= (-3158065) & i7;
            i4 = (i7 & 3158064) >> 2;
        }
        return i6 | i4;
    }

    public static int d(int i2, int i3) {
        int i4;
        int i5 = i2 & 789516;
        if (i5 == 0) {
            return i2;
        }
        int i6 = i2 & (~i5);
        if (i3 == 0) {
            i4 = i5 << 2;
        } else {
            int i7 = i5 << 1;
            i6 |= (-789517) & i7;
            i4 = (i7 & 789516) << 2;
        }
        return i6 | i4;
    }

    public static void j(RecyclerView recyclerView, nz nzVar, float f, float f2, boolean z) {
        View view = nzVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = x80.a;
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = x80.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // defpackage.s0
    public boolean a(View view) {
        ((BottomSheetBehavior) this.g).L(this.f);
        return true;
    }

    public f2 e() {
        b2 b2Var = (b2) this.g;
        f2 f2Var = new f2(b2Var.a, this.f);
        View view = b2Var.e;
        e2 e2Var = f2Var.l;
        if (view != null) {
            e2Var.n = view;
        } else {
            CharSequence charSequence = b2Var.d;
            if (charSequence != null) {
                e2Var.d = charSequence;
                TextView textView = e2Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = b2Var.c;
            if (drawable != null) {
                e2Var.j = drawable;
                ImageView imageView = e2Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    e2Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (b2Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) b2Var.b.inflate(e2Var.r, (ViewGroup) null);
            int i2 = b2Var.i ? e2Var.s : e2Var.t;
            ListAdapter listAdapter = b2Var.g;
            if (listAdapter == null) {
                listAdapter = new d2(b2Var.a, i2, android.R.id.text1, null);
            }
            e2Var.o = listAdapter;
            e2Var.p = b2Var.j;
            if (b2Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new a2(b2Var, e2Var));
            }
            if (b2Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            e2Var.e = alertController$RecycleListView;
        }
        f2Var.setCancelable(true);
        f2Var.setCanceledOnTouchOutside(true);
        f2Var.setOnCancelListener(null);
        f2Var.setOnDismissListener(null);
        nt ntVar = b2Var.f;
        if (ntVar != null) {
            f2Var.setOnKeyListener(ntVar);
        }
        return f2Var;
    }

    public int f() {
        if ((this.f & 128) != 0) {
            return ((int[]) this.g)[7];
        }
        return 65535;
    }

    public int g(RecyclerView recyclerView, nz nzVar) {
        RecyclerView recyclerView2;
        py adapter;
        int G;
        recyclerView.getClass();
        nzVar.getClass();
        jv jvVar = ((MainActivity2) this.g).H;
        Object obj = null;
        if (jvVar == null) {
            zo.O("adapter");
            throw null;
        }
        List list = jvVar.d.f;
        list.getClass();
        int i2 = -1;
        if (nzVar.s != null && (recyclerView2 = nzVar.r) != null && (adapter = recyclerView2.getAdapter()) != null && (G = nzVar.r.G(nzVar)) != -1 && nzVar.s == adapter) {
            i2 = G;
        }
        if (i2 >= 0 && i2 < list.size()) {
            obj = list.get(i2);
        }
        int i3 = ((ov) obj) instanceof mv ? 0 : 12;
        return i3 | (i3 << 8);
    }

    public boolean h() {
        return this.f < ((ArrayList) this.g).size();
    }

    public int i(RecyclerView recyclerView, int i2, int i3, long j) {
        if (this.f == -1) {
            this.f = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (h.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (i.getInterpolation(Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2)) * ((int) Math.signum(i3)) * this.f)));
        return interpolation == 0 ? i3 > 0 ? 1 : -1 : interpolation;
    }

    public void k(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = (int[]) this.g;
            if (i2 >= iArr.length) {
                return;
            }
            this.f = (1 << i2) | this.f;
            iArr[i2] = i3;
        }
    }

    public or(Context context) {
        int h2 = f2.h(context, 0);
        this.g = new b2(new ContextThemeWrapper(context, f2.h(context, h2)));
        this.f = h2;
    }

    public or(ArrayList arrayList, int i2) {
        switch (i2) {
            case 4:
                this.g = arrayList;
                break;
            default:
                this.f = 0;
                this.g = arrayList;
                break;
        }
    }

    public or(MainActivity2 mainActivity2) {
        this.g = mainActivity2;
        this.f = -1;
    }

    public or(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.g = bottomSheetBehavior;
        this.f = i2;
    }
}
