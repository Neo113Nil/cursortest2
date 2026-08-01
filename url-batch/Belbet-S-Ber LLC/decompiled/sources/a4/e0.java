package a4;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class e0 implements o0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f167a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f168b;

    public e0(int i) {
        switch (i) {
            case 2:
                this.f167a = 1;
                this.f168b = Collections.singletonList(null);
                break;
            default:
                this.f168b = new int[10];
                break;
        }
    }

    @Override // o0.p
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f168b).E(this.f167a);
        return true;
    }

    public g.f b() {
        g.b bVar = (g.b) this.f168b;
        g.f fVar = new g.f(bVar.f1470a, this.f167a);
        View view = bVar.f1473e;
        g.e eVar = fVar.f1517l;
        if (view != null) {
            eVar.f1511w = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f1509u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f1472c;
            if (drawable != null) {
                eVar.f1507s = drawable;
                ImageView imageView = eVar.f1508t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f1508t.setImageDrawable(drawable);
                }
            }
        }
        String str = bVar.f1474f;
        if (str != null) {
            eVar.f1495e = str;
            TextView textView2 = eVar.f1510v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = bVar.f1475g;
        if (charSequence2 != null) {
            eVar.c(-1, charSequence2, bVar.h);
        }
        CharSequence charSequence3 = bVar.i;
        if (charSequence3 != null) {
            eVar.c(-2, charSequence3, null);
        }
        if (bVar.f1477k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f1471b.inflate(eVar.A, (ViewGroup) null);
            int i = bVar.f1480n ? eVar.B : eVar.C;
            ListAdapter listAdapter = bVar.f1477k;
            if (listAdapter == null) {
                listAdapter = new g.d(bVar.f1470a, i, R.id.text1, null);
            }
            eVar.f1512x = listAdapter;
            eVar.f1513y = bVar.f1481o;
            if (bVar.f1478l != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f1480n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f1496f = alertController$RecycleListView;
        }
        View view2 = bVar.f1479m;
        if (view2 != null) {
            eVar.f1497g = view2;
            eVar.h = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        k.n nVar = bVar.f1476j;
        if (nVar != null) {
            fVar.setOnKeyListener(nVar);
        }
        return fVar;
    }

    public int c() {
        if ((this.f167a & 128) != 0) {
            return ((int[]) this.f168b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f167a < ((ArrayList) this.f168b).size();
    }

    public void e(e0 e0Var) {
        i3.d.e(e0Var, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & e0Var.f167a) != 0) {
                f(i, ((int[]) e0Var.f168b)[i]);
            }
        }
    }

    public void f(int i, int i4) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f168b;
            if (i >= iArr.length) {
                return;
            }
            this.f167a = (1 << i) | this.f167a;
            iArr[i] = i4;
        }
    }

    public e0(Context context) {
        this(context, g.f.h(context, 0));
    }

    public e0(Context context, int i) {
        this.f168b = new g.b(new ContextThemeWrapper(context, g.f.h(context, i)));
        this.f167a = i;
    }

    public e0(ArrayList arrayList, int i) {
        switch (i) {
            case 4:
                this.f168b = arrayList;
                break;
            default:
                this.f167a = 0;
                this.f168b = arrayList;
                break;
        }
    }

    public e0(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f168b = bottomSheetBehavior;
        this.f167a = i;
    }
}
