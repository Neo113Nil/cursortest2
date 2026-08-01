package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.trembin.nirefon.betfury.MainActivity2;
import com.trembin.nirefon.betfury.R;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.databinding.ActivityMain2Binding;
import com.trembin.nirefon.betfury.receiver.AlarmReceiver;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j1 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public final /* synthetic */ Object h;

    public j1(zi ziVar, ArrayList arrayList, qe0 qe0Var) {
        this.f = 6;
        this.g = arrayList;
        this.h = qe0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p10 p10Var;
        Object[] objArr;
        m7 m7Var;
        int i;
        int[] iArr;
        RecyclerView recyclerView;
        z70 adapter;
        int G;
        int i2 = this.f;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        Object obj = this.h;
        switch (i2) {
            case 0:
                h1 h1Var = (h1) this.g;
                l1 l1Var = (l1) obj;
                r10 r10Var = l1Var.h;
                if (r10Var != null && (p10Var = r10Var.e) != null) {
                    p10Var.o(r10Var);
                }
                View view = (View) l1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (!h1Var.b()) {
                        if (h1Var.f != null) {
                            h1Var.d(0, 0, false, false);
                        }
                    }
                    l1Var.x = h1Var;
                }
                l1Var.z = null;
                return;
            case 1:
                ((s1) this.g).a = obj;
                return;
            case 2:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((s1) obj);
                return;
            case 3:
                Object obj2 = this.g;
                try {
                    Method method = t1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        t1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                k7 k7Var = (k7) obj;
                m7 m7Var2 = k7Var.i;
                if (m7Var2.g == k7Var.h) {
                    List list = k7Var.g;
                    xj xjVar = (xj) this.g;
                    m7Var2.e = list;
                    m7Var2.f = Collections.unmodifiableList(list);
                    o0 o0Var = m7Var2.a;
                    int[] iArr2 = xjVar.b;
                    ArrayList arrayList = xjVar.a;
                    int i6 = xjVar.e;
                    o0 o0Var2 = xjVar.d;
                    v8 v8Var = new v8(o0Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i7 = xjVar.f;
                    int size = arrayList.size() - 1;
                    int i8 = i7;
                    int i9 = i6;
                    while (size >= 0) {
                        wj wjVar = (wj) arrayList.get(size);
                        int i10 = wjVar.a;
                        int i11 = wjVar.c;
                        int i12 = i4;
                        int i13 = i10 + i11;
                        int i14 = wjVar.b;
                        int i15 = i14 + i11;
                        while (i9 > i13) {
                            i9--;
                            int i16 = iArr2[i9];
                            if ((i16 & 12) != 0) {
                                m7Var = m7Var2;
                                int i17 = i16 >> 4;
                                i = i13;
                                iArr = iArr2;
                                yj a = xj.a(arrayDeque, i17, false);
                                if (a != null) {
                                    int i18 = (i6 - a.b) - 1;
                                    v8Var.e(i9, i18);
                                    if ((i16 & 4) != 0) {
                                        o0Var2.B(i9, i17);
                                        v8Var.m(i18, i12);
                                    }
                                } else {
                                    boolean z = i12;
                                    arrayDeque.add(new yj(i9, (i6 - i9) - (z ? 1 : 0), z));
                                }
                            } else {
                                m7Var = m7Var2;
                                i = i13;
                                iArr = iArr2;
                                v8Var.d(i9, i12);
                                i6--;
                            }
                            i13 = i;
                            m7Var2 = m7Var;
                            iArr2 = iArr;
                            i12 = 1;
                        }
                        m7 m7Var3 = m7Var2;
                        int[] iArr3 = iArr2;
                        while (i8 > i15) {
                            i8--;
                            int i19 = xjVar.c[i8];
                            if ((i19 & 12) != 0) {
                                int i20 = i19 >> 4;
                                if (xj.a(arrayDeque, i20, true) == null) {
                                    objArr = true;
                                    arrayDeque.add(new yj(i8, i6 - i9, false));
                                } else {
                                    objArr = true;
                                    v8Var.e((i6 - r0.b) - 1, i9);
                                    if ((i19 & 4) != 0) {
                                        o0Var2.B(i20, i8);
                                        v8Var.m(i9, 1);
                                    }
                                }
                            } else {
                                v8Var.n(i9, 1);
                                i6++;
                            }
                        }
                        int i21 = i14;
                        int i22 = i10;
                        for (int i23 = 0; i23 < i11; i23++) {
                            if ((iArr3[i22] & 15) == 2) {
                                o0Var2.B(i22, i21);
                                v8Var.m(i22, 1);
                            }
                            i22++;
                            i21++;
                        }
                        size--;
                        i4 = 1;
                        i8 = i14;
                        i9 = i10;
                        m7Var2 = m7Var3;
                        iArr2 = iArr3;
                    }
                    v8Var.a();
                    m7Var2.a();
                    return;
                }
                return;
            case 5:
                Typeface typeface = (Typeface) obj;
                bi biVar = (bi) ((kz) this.g).f;
                if (biVar != null) {
                    biVar.O(typeface);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.g;
                qe0 qe0Var = (qe0) obj;
                if (arrayList2.contains(qe0Var)) {
                    arrayList2.remove(qe0Var);
                    qe0Var.a.applyState(qe0Var.c.J);
                    return;
                }
                return;
            case 7:
                xv xvVar = (xv) this.g;
                x80 x80Var = xvVar.e;
                aw awVar = (aw) obj;
                RecyclerView recyclerView2 = awVar.r;
                if (recyclerView2 == null || !recyclerView2.w || xvVar.k) {
                    return;
                }
                int i24 = -1;
                if (x80Var.b() != -1) {
                    d80 itemAnimator = awVar.r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList3 = awVar.p;
                        int size2 = arrayList3.size();
                        for (int i25 = 0; i25 < size2; i25++) {
                            if (((xv) arrayList3.get(i25)).l) {
                            }
                        }
                        nz nzVar = awVar.m;
                        MainActivity2 mainActivity2 = (MainActivity2) nzVar.d;
                        x80Var.getClass();
                        if (x80Var.s != null && (recyclerView = x80Var.r) != null && (adapter = recyclerView.getAdapter()) != null && (G = x80Var.r.G(x80Var)) != -1 && x80Var.s == adapter) {
                            i24 = G;
                        }
                        Note note = (Note) ((c40) nzVar.c).d.f.get(i24);
                        NotesViewModel l = mainActivity2.l();
                        note.getClass();
                        l.delete(note);
                        PendingIntent broadcast = PendingIntent.getBroadcast(mainActivity2, note.getId(), new Intent(mainActivity2, (Class<?>) AlarmReceiver.class), 603979776);
                        if (broadcast != null) {
                            ((AlarmManager) mainActivity2.getSystemService(AlarmManager.class)).cancel(broadcast);
                            broadcast.cancel();
                        }
                        ActivityMain2Binding activityMain2Binding = mainActivity2.F;
                        if (activityMain2Binding == null) {
                            mv.P("binding");
                            throw null;
                        }
                        CoordinatorLayout root = activityMain2Binding.getRoot();
                        int[] iArr4 = be0.C;
                        be0 f = be0.f(root, root.getResources().getText(R.string.note_deleted), 0);
                        mz mzVar = new mz(mainActivity2, note, i5);
                        CharSequence text = f.h.getText(R.string.undo);
                        Button actionView = ((SnackbarContentLayout) f.i.getChildAt(0)).getActionView();
                        if (TextUtils.isEmpty(text)) {
                            actionView.setVisibility(8);
                            actionView.setOnClickListener(null);
                            f.B = false;
                        } else {
                            f.B = true;
                            actionView.setVisibility(0);
                            actionView.setText(text);
                            actionView.setOnClickListener(new mz(f, mzVar, i3));
                        }
                        f.g();
                        return;
                    }
                    awVar.r.post(this);
                    return;
                }
                return;
            case 8:
                px pxVar = (px) obj;
                tg tgVar = pxVar.i;
                while (true) {
                    try {
                        ((Runnable) this.g).run();
                    } catch (Throwable th2) {
                        n9.x(um.f, th2);
                    }
                    Runnable R = pxVar.R();
                    if (R == null) {
                        return;
                    }
                    this.g = R;
                    i5++;
                    if (i5 >= 16 && tgVar.P(pxVar)) {
                        tgVar.O(pxVar, this);
                        return;
                    }
                }
                break;
            default:
                ((gp) this.g).accept(obj);
                return;
        }
    }

    public /* synthetic */ j1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ j1(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public j1(aw awVar, xv xvVar, int i) {
        this.f = 7;
        this.h = awVar;
        this.g = xvVar;
    }
}
