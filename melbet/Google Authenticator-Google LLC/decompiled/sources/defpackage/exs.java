package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exs extends bd {
    private exr a;
    private LicenseMenuActivity b;

    @Override // defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.bd
    public final void Z() {
        super.Z();
        bg D = D();
        if (D != null) {
            agt a = agt.a(D);
            agx agxVar = a.b;
            if (agxVar.c) {
                throw new IllegalStateException("Called while creating a loader");
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("destroyLoader must be called on the main thread");
            }
            if (agt.b(2)) {
                Objects.toString(a);
            }
            agu b = agxVar.b();
            if (b != null) {
                b.m();
                qz qzVar = agxVar.b;
                int a2 = rb.a(qzVar.b, qzVar.d, 54321);
                if (a2 >= 0) {
                    Object[] objArr = qzVar.c;
                    Object obj = objArr[a2];
                    Object obj2 = ra.a;
                    if (obj != obj2) {
                        objArr[a2] = obj2;
                        qzVar.a = true;
                    }
                }
            }
        }
    }

    public final void a(List list) {
        exr exrVar = this.a;
        if (exrVar != null) {
            exrVar.a.a(list);
        }
    }

    @Override // defpackage.bd
    public final void ad(View view, Bundle bundle) {
        bg D = D();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.license_list);
        this.a = new exr(this.b);
        recyclerView.Y(new LinearLayoutManager(1));
        recyclerView.X(this.a);
        recyclerView.av(new jj(D));
        exp expVar = new exp(recyclerView, recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom(), 0);
        int i = yq.a;
        yi.c(recyclerView, expVar);
        agt a = agt.a(D);
        agx agxVar = a.b;
        if (agxVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        agu b = agxVar.b();
        if (agt.b(2)) {
            Objects.toString(a);
        }
        if (b != null) {
            if (agt.b(3)) {
                Objects.toString(b);
            }
            b.n(a.a, this);
            return;
        }
        try {
            agxVar.c = true;
            agz agzVar = new agz(D());
            if (agzVar.getClass().isMemberClass() && !Modifier.isStatic(agzVar.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + agzVar);
            }
            agu aguVar = new agu(agzVar);
            if (agt.b(3)) {
                aguVar.toString();
            }
            agxVar.b.d(54321, aguVar);
            agxVar.a();
            aguVar.n(a.a, this);
        } catch (Throwable th) {
            a.b.a();
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void e(Context context) {
        super.e(context);
        bg D = D();
        if (D instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) D;
        }
    }

    @Override // defpackage.bd
    public final void g() {
        super.g();
        this.a = null;
    }

    @Override // defpackage.bd
    public final void h() {
        super.h();
        this.b = null;
    }
}
