package a;

import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.oriondriftchasers.arordrft.QuizActivityGame;
import java.util.ArrayList;
import n0.l0;
import n0.n1;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements e3.l, n0.n, g2.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18g;

    public /* synthetic */ e0(int i, Object obj) {
        this.f17f = i;
        this.f18g = obj;
    }

    public boolean a(a0.a aVar, int i, Bundle bundle) {
        n0.c cVar;
        l.w wVar = (l.w) this.f18g;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 25 && (i & 1) != 0) {
            try {
                ((p0.g) aVar.f81g).a();
                Parcelable parcelable = (Parcelable) ((p0.g) aVar.f81g).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        p0.g gVar = (p0.g) aVar.f81g;
        ClipData clipData = new ClipData(gVar.c(), new ClipData.Item(gVar.e()));
        if (i4 >= 31) {
            cVar = new a0.a(clipData, 2);
        } else {
            n0.d dVar = new n0.d();
            dVar.f2721g = clipData;
            dVar.f2722h = 2;
            cVar = dVar;
        }
        cVar.q(gVar.b());
        cVar.setExtras(bundle);
        return l0.i(wVar, cVar.build()) == null;
    }

    @Override // e3.l
    public Object b(Object obj) {
        switch (this.f17f) {
            case 1:
                a0 a0Var = (a0) this.f18g;
                f3.d.e(obj, "it");
                return a0Var.a();
            default:
                v2.d dVar = (v2.d) this.f18g;
                y2.f fVar = (y2.f) obj;
                f3.d.e(fVar, "quizData");
                Intent intent = new Intent(dVar.C(), (Class<?>) QuizActivityGame.class);
                intent.putExtra("quiz_id", fVar.f3826a);
                androidx.fragment.app.w wVar = dVar.f552x;
                if (wVar != null) {
                    wVar.f568o.startActivity(intent, null);
                    return z2.d.f3888c;
                }
                throw new IllegalStateException("Fragment " + dVar + " not attached to Activity");
        }
    }

    @Override // n0.n
    public q1 t(View view, q1 q1Var) {
        q0.g gVar = (q0.g) this.f18g;
        ArrayList arrayList = gVar.f3067b;
        n1 n1Var = q1Var.f2775a;
        f0.c b4 = f0.c.b(n1Var.f(519), n1Var.f(64));
        f0.c b5 = f0.c.b(n1Var.g(519), n1Var.g(64));
        if (!b4.equals(gVar.f3068c) || !b5.equals(gVar.d)) {
            gVar.f3068c = b4;
            gVar.d = b5;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q0.c cVar = (q0.c) arrayList.get(size);
                cVar.f3056c = b4;
                cVar.d = b5;
                cVar.c();
            }
        }
        return q1Var;
    }
}
