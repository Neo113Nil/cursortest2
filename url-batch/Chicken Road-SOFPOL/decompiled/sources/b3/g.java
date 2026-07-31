package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c5.x;
import java.util.ArrayList;
import r.v1;
import r.w;
import r.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements m0.c, v1 {

    /* renamed from: d, reason: collision with root package name */
    public int f1129d;

    /* renamed from: e, reason: collision with root package name */
    public int f1130e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1131f;

    public g(View view) {
        this.f1131f = view;
    }

    @Override // m0.c
    public void b(int i, Object obj) {
        ((m0.c) this.f1131f).b(i + (this.f1130e == 0 ? this.f1129d : 0), obj);
    }

    @Override // m0.c
    public void c(Object obj, p6.e eVar) {
        ((m0.c) this.f1131f).c(obj, eVar);
    }

    @Override // m0.c
    public void d(Object obj) {
        this.f1130e++;
        ((m0.c) this.f1131f).d(obj);
    }

    @Override // m0.c
    public void e() {
        ((m0.c) this.f1131f).e();
    }

    @Override // m0.c
    public void f(int i, Object obj) {
        ((m0.c) this.f1131f).f(i + (this.f1130e == 0 ? this.f1129d : 0), obj);
    }

    @Override // m0.c
    public void h(int i, int i8, int i9) {
        int i10 = this.f1130e == 0 ? this.f1129d : 0;
        ((m0.c) this.f1131f).h(i + i10, i8 + i10, i9);
    }

    @Override // m0.c
    public Object i() {
        return ((m0.c) this.f1131f).i();
    }

    @Override // m0.c
    public void j(int i, int i8) {
        ((m0.c) this.f1131f).j(i + (this.f1130e == 0 ? this.f1129d : 0), i8);
    }

    @Override // r.t1
    public r.p k(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((x) this.f1131f).k(j7, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public r.p l(long j7, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((x) this.f1131f).l(j7, pVar, pVar2, pVar3);
    }

    @Override // r.t1
    public long m(r.p pVar, r.p pVar2, r.p pVar3) {
        return (this.f1130e + this.f1129d) * 1000000;
    }

    @Override // m0.c
    public void n() {
        if (!(this.f1130e > 0)) {
            m0.t.c("OffsetApplier up called with no corresponding down");
        }
        this.f1130e--;
        ((m0.c) this.f1131f).n();
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f1131f = new ArrayList();
        this.f1130e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f1235h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1129d = obtainStyledAttributes.getResourceId(index, this.f1129d);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1130e);
                this.f1130e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public g(m0.c cVar, int i) {
        this.f1131f = cVar;
        this.f1129d = i;
    }

    public g(int i, int i8, r.t tVar) {
        this.f1129d = i;
        this.f1130e = i8;
        this.f1131f = new x((w) new y(i, i8, tVar));
    }
}
