package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Parcel;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public mr(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.b = view;
        this.a = i;
        this.c = bottomSheetBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, ob] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Serializable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                mw mwVar = (mw) this.c;
                RecyclerView recyclerView = mwVar.p;
                if (recyclerView != null && recyclerView.p) {
                    mv mvVar = (mv) this.b;
                    if (!mvVar.n) {
                        lp lpVar = mvVar.h;
                        if (lpVar.a() != -1) {
                            kv kvVar = mwVar.p.C;
                            if (kvVar == null || !kvVar.h()) {
                                List list = mwVar.n;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    if (((mv) list.get(i)).o) {
                                    }
                                }
                                ms msVar = mwVar.l;
                                int i2 = this.a;
                                int a = lpVar.a();
                                if (i2 == 16) {
                                    bvm bvmVar = ((bvc) msVar).b;
                                    bvmVar.p((btw) bvmVar.H.get(a));
                                } else {
                                    bvm bvmVar2 = ((bvc) msVar).b;
                                    bvmVar2.m(((btw) bvmVar2.H.get(a)).d);
                                }
                                ((bvc) msVar).b.f.f(a);
                                break;
                            }
                            mwVar.p.post(this);
                            break;
                        }
                    }
                }
                break;
            case 1:
                it.b((TextView) this.c, (Typeface) this.b, this.a);
                break;
            case 2:
                int i3 = this.a;
                oh ohVar = (oh) this.b;
                String str = (String) ohVar.a.get(Integer.valueOf(i3));
                if (str != null) {
                    oe oeVar = (oe) ohVar.d.get(str);
                    Object obj = oeVar != null ? oeVar.a : null;
                    Object obj2 = ((brn) this.c).a;
                    if (obj != null) {
                        ?? r2 = oeVar.a;
                        if (ohVar.c.remove(str)) {
                            r2.a(obj2);
                            break;
                        }
                    } else {
                        ohVar.f.remove(str);
                        ohVar.e.put(str, obj2);
                        break;
                    }
                }
                break;
            case 3:
                ((oh) this.c).f(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.b));
                break;
            case 4:
                ((pn) this.b).a.q().b(this.a, this.c);
                break;
            case 5:
                ((pn) this.b).o(this.a, this.c);
                break;
            case 6:
                dru druVar = (dru) this.b;
                dsf dsfVar = druVar.a;
                dsg dsgVar = dsfVar.b;
                hel g = dsgVar.g();
                gzp gzpVar = dsfVar.e.a;
                Object obj3 = this.c;
                int i4 = this.a;
                Object f = dru.f(g, obj3, i4);
                if (!druVar.a(f, obj3)) {
                    druVar.c(i4);
                    efc efcVar = dsfVar.f;
                    int i5 = i4 == 3 ? 40 : 39;
                    jkj k = jnu.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    jnu jnuVar = (jnu) jkpVar;
                    jnuVar.d = 8;
                    jnuVar.b |= 2;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    jkp jkpVar2 = k.b;
                    jnu jnuVar2 = (jnu) jkpVar2;
                    jnuVar2.f = 10;
                    jnuVar2.b |= 32;
                    if (!jkpVar2.M()) {
                        k.t();
                    }
                    jkp jkpVar3 = k.b;
                    jnu jnuVar3 = (jnu) jkpVar3;
                    jnuVar3.e = 3;
                    jnuVar3.b |= 8;
                    if (!jkpVar3.M()) {
                        k.t();
                    }
                    jnu jnuVar4 = (jnu) k.b;
                    jnuVar4.c = i5 - 1;
                    jnuVar4.b |= 1;
                    efcVar.a(obj3, (jnu) k.q());
                    dsgVar.c(f);
                    break;
                }
                break;
            case 7:
                int i6 = this.a;
                dru druVar2 = (dru) this.b;
                druVar2.c(i6);
                ((ebp) this.c).f.onClick(druVar2.b);
                break;
            case 8:
                Layout layout = ((TextView) ((di) this.c).findViewById(R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) this.b).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    break;
                }
                break;
            case 9:
                ((BottomSheetBehavior) this.c).U((View) this.b, this.a, false);
                break;
            case 10:
                hux huxVar = (hux) this.c;
                hvi[] hviVarArr = huxVar.d;
                int i7 = this.a;
                hvi hviVar = hviVarArr[i7];
                hviVar.getClass();
                hviVarArr[i7] = null;
                int i8 = huxVar.e;
                while (true) {
                    Object obj4 = this.b;
                    int i9 = ((his) obj4).c;
                    if (i8 >= i9) {
                        huxVar.e = i9;
                        break;
                    } else {
                        int i10 = i8 + 1;
                        if (((hsw) ((hel) obj4).get(i8)).q(hviVar)) {
                            huxVar.a();
                            huxVar.e = i10;
                            break;
                        } else {
                            i8 = i10;
                        }
                    }
                }
            default:
                try {
                    if (!((kdo) this.c).b(this.a, (Parcel) this.b)) {
                        kdo.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
                        break;
                    }
                } catch (Exception e) {
                    kdo.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ mr(dru druVar, Object obj, int i, int i2) {
        this.d = i2;
        this.b = druVar;
        this.c = obj;
        this.a = i;
    }

    public /* synthetic */ mr(hux huxVar, hel helVar, int i, int i2) {
        this.d = i2;
        this.c = huxVar;
        this.b = helVar;
        this.a = i;
    }

    public /* synthetic */ mr(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ mr(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public mr(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
