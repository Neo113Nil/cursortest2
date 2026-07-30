package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5058u extends AbstractC5021E {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f40795a;

    /* renamed from: b, reason: collision with root package name */
    public final C5034S f40796b = new C5034S(this);

    /* renamed from: c, reason: collision with root package name */
    public C5057t f40797c;

    /* renamed from: d, reason: collision with root package name */
    public C5057t f40798d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(AbstractC5019C abstractC5019C, androidx.emoji2.text.g gVar) {
        int v6 = abstractC5019C.v();
        View view = null;
        if (v6 == 0) {
            return null;
        }
        int l9 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v6; i4++) {
            View u7 = abstractC5019C.u(i4);
            int abs = Math.abs(((gVar.c(u7) / 2) + gVar.e(u7)) - l9);
            if (abs < i) {
                view = u7;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC5019C abstractC5019C, View view) {
        int[] iArr = new int[2];
        if (abstractC5019C.d()) {
            iArr[0] = b(view, d(abstractC5019C));
        } else {
            iArr[0] = 0;
        }
        if (abstractC5019C.e()) {
            iArr[1] = b(view, e(abstractC5019C));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(AbstractC5019C abstractC5019C) {
        C5057t c5057t = this.f40798d;
        if (c5057t == null || ((AbstractC5019C) c5057t.f4884b) != abstractC5019C) {
            this.f40798d = new C5057t(abstractC5019C, 0);
        }
        return this.f40798d;
    }

    public final androidx.emoji2.text.g e(AbstractC5019C abstractC5019C) {
        C5057t c5057t = this.f40797c;
        if (c5057t == null || ((AbstractC5019C) c5057t.f4884b) != abstractC5019C) {
            this.f40797c = new C5057t(abstractC5019C, 1);
        }
        return this.f40797c;
    }

    public final void f() {
        AbstractC5019C layoutManager;
        RecyclerView recyclerView = this.f40795a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c4 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c4 == null) {
            return;
        }
        int[] a9 = a(layoutManager, c4);
        int i = a9[0];
        if (i == 0 && a9[1] == 0) {
            return;
        }
        this.f40795a.Z(i, a9[1], false);
    }
}
