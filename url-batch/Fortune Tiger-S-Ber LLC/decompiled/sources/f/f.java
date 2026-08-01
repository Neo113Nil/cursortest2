package f;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements l0.o {

    /* renamed from: f, reason: collision with root package name */
    public int f1596f;
    public final Object g;

    public f(ArrayList arrayList, int i4) {
        switch (i4) {
            case 2:
                this.f1596f = 0;
                this.g = arrayList;
                break;
            default:
                this.g = arrayList;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public g a() {
        b bVar = (b) this.g;
        g gVar = new g(bVar.f1534a, this.f1596f);
        View view = bVar.f1537e;
        e eVar = gVar.f1599k;
        if (view != null) {
            eVar.f1581n = view;
        } else {
            CharSequence charSequence = bVar.f1536d;
            if (charSequence != null) {
                eVar.f1573d = charSequence;
                TextView textView = eVar.f1579l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.c;
            if (drawable != null) {
                eVar.f1577j = drawable;
                ImageView imageView = eVar.f1578k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f1578k.setImageDrawable(drawable);
                }
            }
        }
        if (bVar.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f1535b.inflate(eVar.f1585r, (ViewGroup) null);
            int i4 = bVar.f1539i ? eVar.f1586s : eVar.f1587t;
            Object obj = bVar.g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new d(bVar.f1534a, i4, R.id.text1, null);
            }
            eVar.f1582o = r7;
            eVar.f1583p = bVar.f1540j;
            if (bVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.f1539i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f1574e = alertController$RecycleListView;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        j.n nVar = bVar.f1538f;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    public int b() {
        if ((this.f1596f & 128) != 0) {
            return ((int[]) this.g)[7];
        }
        return 65535;
    }

    public boolean c() {
        return this.f1596f < ((ArrayList) this.g).size();
    }

    @Override // l0.o
    public boolean d(View view) {
        ((BottomSheetBehavior) this.g).E(this.f1596f);
        return true;
    }

    public void e(f fVar) {
        u2.c.e(fVar, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (((1 << i4) & fVar.f1596f) != 0) {
                f(i4, ((int[]) fVar.g)[i4]);
            }
        }
    }

    public void f(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = (int[]) this.g;
            if (i4 >= iArr.length) {
                return;
            }
            this.f1596f = (1 << i4) | this.f1596f;
            iArr[i4] = i5;
        }
    }

    public f(Context context) {
        int g = g.g(context, 0);
        this.g = new b(new ContextThemeWrapper(context, g.g(context, g)));
        this.f1596f = g;
    }

    public f(int i4) {
        switch (i4) {
            case 3:
                this.g = new int[10];
                break;
            default:
                this.f1596f = 1;
                this.g = Collections.singletonList(null);
                break;
        }
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i4) {
        this.g = bottomSheetBehavior;
        this.f1596f = i4;
    }
}
