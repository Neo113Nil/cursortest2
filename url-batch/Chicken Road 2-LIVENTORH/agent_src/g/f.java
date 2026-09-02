package g;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements o0.o {

    /* renamed from: f, reason: collision with root package name */
    public final int f1631f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1632g;

    public f(Context context) {
        int h4 = g.h(context, 0);
        this.f1632g = new b(new ContextThemeWrapper(context, g.h(context, h4)));
        this.f1631f = h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public g a() {
        b bVar = (b) this.f1632g;
        g gVar = new g(bVar.f1558a, this.f1631f);
        View view = bVar.f1561e;
        e eVar = gVar.f1642l;
        if (view != null) {
            eVar.f1618n = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f1616l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f1560c;
            if (drawable != null) {
                eVar.f1614j = drawable;
                ImageView imageView = eVar.f1615k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f1615k.setImageDrawable(drawable);
                }
            }
        }
        if (bVar.f1563g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f1559b.inflate(eVar.f1622r, (ViewGroup) null);
            int i = bVar.i ? eVar.f1623s : eVar.f1624t;
            Object obj = bVar.f1563g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new d(bVar.f1558a, i, R.id.text1, null);
            }
            eVar.f1619o = r7;
            eVar.f1620p = bVar.f1565j;
            if (bVar.f1564h != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f1610e = alertController$RecycleListView;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        k.n nVar = bVar.f1562f;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    @Override // o0.o
    public boolean g(View view) {
        ((BottomSheetBehavior) this.f1632g).B(this.f1631f);
        return true;
    }

    public f() {
        this.f1631f = 1;
        this.f1632g = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f1631f = 0;
        this.f1632g = arrayList;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1632g = bottomSheetBehavior;
        this.f1631f = i;
    }
}
