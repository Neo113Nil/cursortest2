package q0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.emoji2.text.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3054a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final g f3055b;

    /* renamed from: c, reason: collision with root package name */
    public f0.c f3056c;
    public f0.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3057e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3058f;

    public c(g gVar, ArrayList arrayList) {
        f0.c cVar = f0.c.f1265e;
        this.f3056c = cVar;
        this.d = cVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f3067b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            f0.c cVar2 = gVar.f3068c;
            f0.c cVar3 = gVar.d;
            this.f3056c = cVar2;
            this.d = cVar3;
            c();
            b(gVar.f3069e);
        }
        this.f3055b = gVar;
    }

    public final void a(List list, boolean z3) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) list.get(i);
            aVar.getClass();
            if (true == z3) {
                c cVar = aVar.f3043e;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
                aVar.f3043e = this;
                this.f3054a.add(aVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.f3054a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f3045g) {
                ColorDrawable colorDrawable = aVar.f3044f;
                if (aVar.f3046h != i) {
                    aVar.f3046h = i;
                    colorDrawable.setColor(i);
                    b bVar = aVar.f3041b;
                    bVar.f3050e = colorDrawable;
                    q qVar = bVar.i;
                    if (qVar != null) {
                        ((View) qVar.f347h).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        f0.c c4;
        ArrayList arrayList = this.f3054a;
        f0.c cVar = f0.c.f1265e;
        f0.c cVar2 = cVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            f0.c cVar3 = this.f3056c;
            f0.c cVar4 = this.d;
            aVar.f3042c = cVar3;
            b bVar = aVar.f3041b;
            aVar.d = cVar4;
            if (!bVar.f3049c.equals(cVar2)) {
                bVar.f3049c = cVar2;
                q qVar = bVar.i;
                if (qVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f346g;
                    layoutParams.leftMargin = cVar2.f1266a;
                    layoutParams.topMargin = cVar2.f1267b;
                    layoutParams.rightMargin = cVar2.f1268c;
                    layoutParams.bottomMargin = cVar2.d;
                    ((View) qVar.f347h).setLayoutParams(layoutParams);
                }
            }
            int i4 = aVar.f3040a;
            if (i4 == 1) {
                i = aVar.f3042c.f1266a;
                int i5 = aVar.d.f1266a;
                if (bVar.f3047a != i5) {
                    bVar.f3047a = i5;
                    q qVar2 = bVar.i;
                    if (qVar2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qVar2.f346g;
                        layoutParams2.width = i5;
                        ((View) qVar2.f347h).setLayoutParams(layoutParams2);
                    }
                }
                c4 = f0.c.c(i, 0, 0, 0);
            } else if (i4 == 2) {
                i = aVar.f3042c.f1267b;
                int i6 = aVar.d.f1267b;
                if (bVar.f3048b != i6) {
                    bVar.f3048b = i6;
                    q qVar3 = bVar.i;
                    if (qVar3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) qVar3.f346g;
                        layoutParams3.height = i6;
                        ((View) qVar3.f347h).setLayoutParams(layoutParams3);
                    }
                }
                c4 = f0.c.c(0, i, 0, 0);
            } else if (i4 == 4) {
                i = aVar.f3042c.f1268c;
                int i7 = aVar.d.f1268c;
                if (bVar.f3047a != i7) {
                    bVar.f3047a = i7;
                    q qVar4 = bVar.i;
                    if (qVar4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qVar4.f346g;
                        layoutParams4.width = i7;
                        ((View) qVar4.f347h).setLayoutParams(layoutParams4);
                    }
                }
                c4 = f0.c.c(0, 0, i, 0);
            } else if (i4 != 8) {
                c4 = cVar;
                i = 0;
            } else {
                i = aVar.f3042c.d;
                int i8 = aVar.d.d;
                if (bVar.f3048b != i8) {
                    bVar.f3048b = i8;
                    q qVar5 = bVar.i;
                    if (qVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) qVar5.f346g;
                        layoutParams5.height = i8;
                        ((View) qVar5.f347h).setLayoutParams(layoutParams5);
                    }
                }
                c4 = f0.c.c(0, 0, 0, i);
            }
            boolean z3 = i > 0;
            if (bVar.d != z3) {
                bVar.d = z3;
                q qVar6 = bVar.i;
                if (qVar6 != null) {
                    ((View) qVar6.f347h).setVisibility(z3 ? 0 : 4);
                }
            }
            float f2 = 0.0f;
            aVar.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f2 = 1.0f;
            }
            aVar.b(f2);
            cVar2 = f0.c.a(cVar2, c4);
        }
    }
}
