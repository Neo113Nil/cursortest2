package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.moontiko.really.admiralcasino.MainActivity2;
import com.moontiko.really.admiralcasino.R;
import com.moontiko.really.admiralcasino.data.Note;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class iu implements co {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity2 g;

    public /* synthetic */ iu(MainActivity2 mainActivity2, int i) {
        this.f = i;
        this.g = mainActivity2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [ku] */
    @Override // defpackage.co
    public final Object g(Object obj) {
        int i = this.f;
        final MainActivity2 mainActivity2 = this.g;
        switch (i) {
            case 0:
                Note note = (Note) obj;
                int i2 = MainActivity2.H;
                note.getClass();
                if (mainActivity2.k().B("AddEditNoteSheet") == null) {
                    d2 d2Var = new d2();
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", note.getId());
                    bundle.putString("title", note.getTitle());
                    bundle.putString("content", note.getContent());
                    bundle.putString("colorHex", note.getColorHex());
                    bundle.putString("category", note.getCategory());
                    bundle.putBoolean("isPinned", note.isPinned());
                    bundle.putLong("createdAt", note.getCreatedAt());
                    bundle.putLong("updatedAt", note.getUpdatedAt());
                    d2Var.H(bundle);
                    en k = mainActivity2.k();
                    d2Var.l0 = false;
                    d2Var.m0 = true;
                    k.getClass();
                    o7 o7Var = new o7(k);
                    o7Var.o = true;
                    o7Var.e(0, d2Var, "AddEditNoteSheet", 1);
                    o7Var.d(false);
                }
                return ej.q;
            case 1:
                final Note note2 = (Note) obj;
                int i3 = MainActivity2.H;
                note2.getClass();
                qu quVar = new qu(mainActivity2);
                h2 h2Var = (h2) quVar.g;
                h2Var.d = h2Var.a.getText(R.string.delete_note_title);
                ContextThemeWrapper contextThemeWrapper = h2Var.a;
                h2Var.f = contextThemeWrapper.getText(R.string.delete_note_message);
                ju juVar = new ju();
                h2Var.i = contextThemeWrapper.getText(R.string.cancel);
                h2Var.j = juVar;
                ?? r3 = new DialogInterface.OnClickListener() { // from class: ku
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ViewGroup viewGroup;
                        int i5;
                        MainActivity2 mainActivity22 = MainActivity2.this;
                        Note note3 = note2;
                        int i6 = MainActivity2.H;
                        ry r = mainActivity22.r();
                        r.getClass();
                        note3.getClass();
                        tb E = kr.E(r);
                        og ogVar = zh.a;
                        int i7 = 0;
                        mz.z(E, eg.h, new py(r, note3, null, i7));
                        o1 o1Var = mainActivity22.E;
                        if (o1Var == null) {
                            kr.g0("binding");
                            throw null;
                        }
                        View view = (CoordinatorLayout) o1Var.e;
                        int[] iArr = y50.D;
                        CharSequence text = view.getResources().getText(R.string.note_deleted);
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
                            g9.i("No suitable parent found from the given view. Please provide a valid view.");
                            return;
                        }
                        Context context = viewGroup.getContext();
                        LayoutInflater from = LayoutInflater.from(context);
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y50.D);
                        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                        obtainStyledAttributes.recycle();
                        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
                        y50 y50Var = new y50(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                        ((SnackbarContentLayout) y50Var.i.getChildAt(0)).getMessageView().setText(text);
                        lu luVar = new lu(mainActivity22, note3, i7);
                        CharSequence text2 = context.getText(R.string.undo);
                        Button actionView = ((SnackbarContentLayout) y50Var.i.getChildAt(0)).getActionView();
                        if (TextUtils.isEmpty(text2)) {
                            actionView.setVisibility(8);
                            actionView.setOnClickListener(null);
                            y50Var.C = false;
                        } else {
                            y50Var.C = true;
                            actionView.setVisibility(0);
                            actionView.setText(text2);
                            actionView.setOnClickListener(new lu(y50Var, luVar, 2));
                        }
                        o1 o1Var2 = mainActivity22.E;
                        if (o1Var2 == null) {
                            kr.g0("binding");
                            throw null;
                        }
                        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) o1Var2.c;
                        c8 c8Var = y50Var.k;
                        if (c8Var != null) {
                            c8Var.a();
                        }
                        c8 c8Var2 = new c8(y50Var, extendedFloatingActionButton);
                        if (extendedFloatingActionButton.isAttachedToWindow()) {
                            extendedFloatingActionButton.getViewTreeObserver().addOnGlobalLayoutListener(c8Var2);
                        }
                        extendedFloatingActionButton.addOnAttachStateChangeListener(c8Var2);
                        y50Var.k = c8Var2;
                        rg o = rg.o();
                        AccessibilityManager accessibilityManager = y50Var.B;
                        int i8 = Build.VERSION.SDK_INT;
                        boolean z = y50Var.C;
                        if (i8 >= 29) {
                            i5 = accessibilityManager.getRecommendedTimeoutMillis(0, (z ? 4 : 0) | 3);
                        } else {
                            i5 = (z && accessibilityManager.isTouchExplorationEnabled()) ? -2 : 0;
                        }
                        b8 b8Var = y50Var.u;
                        synchronized (o.f) {
                            try {
                                if (o.q(b8Var)) {
                                    a60 a60Var = (a60) o.h;
                                    a60Var.b = i5;
                                    ((Handler) o.g).removeCallbacksAndMessages(a60Var);
                                    o.z((a60) o.h);
                                    return;
                                }
                                a60 a60Var2 = (a60) o.i;
                                if (a60Var2 != null && a60Var2.a.get() == b8Var) {
                                    i7 = 1;
                                }
                                if (i7 != 0) {
                                    ((a60) o.i).b = i5;
                                } else {
                                    o.i = new a60(i5, b8Var);
                                }
                                a60 a60Var3 = (a60) o.h;
                                if (a60Var3 == null || !o.e(a60Var3, 4)) {
                                    o.h = null;
                                    o.A();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
                h2Var.g = contextThemeWrapper.getText(R.string.delete);
                h2Var.h = r3;
                quVar.b().show();
                return ej.q;
            default:
                List list = (List) obj;
                ny nyVar = mainActivity2.F;
                if (nyVar == null) {
                    kr.g0("adapter");
                    throw null;
                }
                d7 d7Var = nyVar.d;
                rc0 rc0Var = d7Var.a;
                int i4 = d7Var.g + 1;
                d7Var.g = i4;
                List list2 = d7Var.e;
                if (list != list2) {
                    if (list == null) {
                        int size = list2.size();
                        d7Var.e = null;
                        d7Var.f = Collections.EMPTY_LIST;
                        rc0Var.d(0, size);
                        d7Var.a();
                    } else if (list2 == null) {
                        d7Var.e = list;
                        d7Var.f = Collections.unmodifiableList(list);
                        rc0Var.p(0, list.size());
                        d7Var.a();
                    } else {
                        ((Executor) d7Var.b.g).execute(new b7(d7Var, list2, list, i4));
                    }
                }
                boolean isEmpty = list.isEmpty();
                o1 o1Var = mainActivity2.E;
                if (o1Var == null) {
                    kr.g0("binding");
                    throw null;
                }
                ((LinearLayout) o1Var.d).setVisibility(isEmpty ? 0 : 8);
                o1 o1Var2 = mainActivity2.E;
                if (o1Var2 != null) {
                    ((RecyclerView) o1Var2.f).setVisibility(isEmpty ? 8 : 0);
                    return ej.q;
                }
                kr.g0("binding");
                throw null;
        }
    }
}
