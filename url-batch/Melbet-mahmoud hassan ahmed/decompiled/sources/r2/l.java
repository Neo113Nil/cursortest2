package r2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.mz;
import com.google.android.gms.internal.ads.yu;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    protected final mz f21166f;

    protected l(@RecentlyNonNull Context context, int i7) {
        super(context);
        this.f21166f = new mz(this, i7);
    }

    public void a() {
        this.f21166f.n();
    }

    public void b(@RecentlyNonNull g gVar) {
        this.f21166f.o(gVar.a());
    }

    public void c() {
        this.f21166f.p();
    }

    public void d() {
        this.f21166f.q();
    }

    @RecentlyNonNull
    public d getAdListener() {
        return this.f21166f.d();
    }

    @RecentlyNullable
    public h getAdSize() {
        return this.f21166f.e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f21166f.m();
    }

    @RecentlyNullable
    public r getOnPaidEventListener() {
        return this.f21166f.f();
    }

    @RecentlyNullable
    public v getResponseInfo() {
        return this.f21166f.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i7) - measuredWidth) / 2;
        int i12 = ((i10 - i8) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        h hVar;
        int i9;
        int i10 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e7) {
                io0.e("Unable to retrieve ad size.", e7);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int k7 = hVar.k(context);
                i9 = hVar.d(context);
                i10 = k7;
            } else {
                i9 = 0;
            }
        } else {
            measureChild(childAt, i7, i8);
            i10 = childAt.getMeasuredWidth();
            i9 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i10, getSuggestedMinimumWidth()), i7), View.resolveSize(Math.max(i9, getSuggestedMinimumHeight()), i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@RecentlyNonNull d dVar) {
        this.f21166f.s(dVar);
        if (dVar == 0) {
            this.f21166f.r(null);
            return;
        }
        if (dVar instanceof yu) {
            this.f21166f.r((yu) dVar);
        }
        if (dVar instanceof s2.e) {
            this.f21166f.w((s2.e) dVar);
        }
    }

    public void setAdSize(@RecentlyNonNull h hVar) {
        this.f21166f.t(hVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f21166f.v(str);
    }

    public void setOnPaidEventListener(r rVar) {
        this.f21166f.y(rVar);
    }
}
