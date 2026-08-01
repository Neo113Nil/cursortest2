package t0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.EnumC0088a;
import com.fortunequest.neontrack.AddHabitActivity;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import com.google.android.material.snackbar.SnackbarContentLayout;
import d1.AbstractC0100h;
import s1.InterfaceC0334q;
import u0.C0372k;
import u0.C0373l;
import u0.C0383v;
import u0.CallableC0363b;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356i extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AddHabitActivity f4133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4134g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356i(AddHabitActivity addHabitActivity, String str, int i, b1.d dVar) {
        super(dVar);
        this.f4133f = addHabitActivity;
        this.f4134g = str;
        this.h = i;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        return new C0356i(this.f4133f, this.f4134g, this.h, dVar);
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0356i) a((InterfaceC0334q) obj, (b1.d) obj2)).i(X0.g.f1277c);
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        ViewGroup viewGroup;
        boolean z2 = true;
        Object obj2 = EnumC0088a.f2060a;
        int i = this.f4132e;
        if (i == 0) {
            H1.l.h0(obj);
            C0383v c0383v = (C0383v) this.f4133f.f2072z.a();
            String str = this.f4134g;
            int i2 = this.h;
            this.f4132e = 1;
            c0383v.getClass();
            C0373l c0373l = new C0373l(0L, r1.d.T(str).toString(), i2, System.currentTimeMillis(), true);
            C0372k c0372k = c0383v.f4224a;
            c0372k.getClass();
            Object b2 = h0.e.b((FortuneQuestDatabase_Impl) c0372k.f4190a, new CallableC0363b(c0372k, 1, c0373l), this);
            if (b2 != obj2) {
                b2 = X0.g.f1277c;
            }
            if (b2 == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.l.h0(obj);
        }
        AddHabitActivity addHabitActivity = this.f4133f;
        int i3 = AddHabitActivity.f2069B;
        Editable text = addHabitActivity.t().d.getText();
        if (text != null) {
            text.clear();
        }
        View view = this.f4133f.t().f4439a;
        int[] iArr = T0.j.f1066B;
        CharSequence text2 = view.getResources().getText(R.string.habit_saved);
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(T0.j.f1066B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        T0.j jVar = new T0.j(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) jVar.i.getChildAt(0)).getMessageView().setText(text2);
        jVar.f1056k = -1;
        T0.m m2 = T0.m.m();
        int i4 = jVar.f1056k;
        if (i4 == -2) {
            i4 = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            i4 = jVar.f1067A.getRecommendedTimeoutMillis(i4, 3);
        }
        T0.f fVar = jVar.f1065t;
        synchronized (m2.f1073a) {
            try {
                if (m2.o(fVar)) {
                    T0.l lVar = (T0.l) m2.f1075c;
                    lVar.f1070b = i4;
                    ((Handler) m2.f1074b).removeCallbacksAndMessages(lVar);
                    m2.x((T0.l) m2.f1075c);
                } else {
                    T0.l lVar2 = (T0.l) m2.d;
                    if (lVar2 == null || lVar2.f1069a.get() != fVar) {
                        z2 = false;
                    }
                    if (z2) {
                        ((T0.l) m2.d).f1070b = i4;
                    } else {
                        m2.d = new T0.l(i4, fVar);
                    }
                    T0.l lVar3 = (T0.l) m2.f1075c;
                    if (lVar3 == null || !m2.c(lVar3, 4)) {
                        m2.f1075c = null;
                        m2.y();
                    }
                }
            } finally {
            }
        }
        this.f4133f.u();
        return X0.g.f1277c;
    }
}
