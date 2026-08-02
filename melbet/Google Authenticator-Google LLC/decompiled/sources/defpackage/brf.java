package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brf implements TextWatcher {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public brf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b == 3 && TextUtils.isEmpty(charSequence)) {
            Object obj = this.a;
            jkj k = hqs.a.k();
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar = k.b;
            hqs hqsVar = (hqs) jkpVar;
            hqsVar.c = 29;
            hqsVar.b |= 1;
            bvm bvmVar = (bvm) obj;
            String str = bvmVar.C;
            if (!jkpVar.M()) {
                k.t();
            }
            bov bovVar = bvmVar.o;
            hqs hqsVar2 = (hqs) k.b;
            str.getClass();
            hqsVar2.b |= 64;
            hqsVar2.g = str;
            bovVar.a((hqs) k.q());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 == 0) {
            bre breVar = ((bri) this.a).b;
            if (bri.e(breVar).e() != null) {
                bri.e(breVar).k(null);
                return;
            }
            return;
        }
        if (i4 == 1) {
            bqs bqsVar = ((bqw) this.a).c;
            if (bqw.d(bqsVar).e() != null) {
                bqw.d(bqsVar).k(null);
                return;
            }
            return;
        }
        if (i4 == 2) {
            bre breVar2 = ((bri) this.a).b;
            if (bri.f(breVar2).e() != null) {
                bri.f(breVar2).k(null);
                return;
            }
            return;
        }
        if (i4 != 3) {
            ((fng) this.a).l.setVisibility(charSequence.length() <= 0 ? 8 : 0);
            return;
        }
        String lowerCase = String.valueOf(charSequence).toLowerCase(Locale.ROOT);
        boolean isEmpty = TextUtils.isEmpty(lowerCase);
        Object obj = this.a;
        if (isEmpty) {
            bvm bvmVar = (bvm) obj;
            List list = bvmVar.F;
            bvmVar.I = list;
            bvmVar.J = new ArrayList(list.size());
            Iterator it = bvmVar.F.iterator();
            while (it.hasNext()) {
                bvmVar.J.add(btw.a((bpc) it.next(), false));
            }
        } else {
            bvm bvmVar2 = (bvm) obj;
            bvmVar2.I = new ArrayList();
            bvmVar2.J = new ArrayList();
            for (bpc bpcVar : bvmVar2.F) {
                if (bpcVar.f().toLowerCase(Locale.ROOT).contains(lowerCase)) {
                    bvmVar2.I.add(bpcVar);
                    bvmVar2.J.add(btw.a(bpcVar, false));
                }
            }
        }
        bvm bvmVar3 = (bvm) this.a;
        List list2 = bvmVar3.J;
        gfy gfyVar = bvmVar3.g;
        gfyVar.t(list2);
        gfyVar.e();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
