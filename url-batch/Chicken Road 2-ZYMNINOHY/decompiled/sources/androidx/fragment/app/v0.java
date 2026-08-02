package androidx.fragment.app;

import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4987e;

    public v0(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f4983a = i4;
        this.f4984b = arrayList;
        this.f4985c = arrayList2;
        this.f4986d = arrayList3;
        this.f4987e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i4 = 0; i4 < this.f4983a; i4++) {
            View view = (View) this.f4984b.get(i4);
            String str = (String) this.f4985c.get(i4);
            Field field = E.H.f375a;
            E.A.f(view, str);
            E.A.f((View) this.f4986d.get(i4), (String) this.f4987e.get(i4));
        }
    }
}
