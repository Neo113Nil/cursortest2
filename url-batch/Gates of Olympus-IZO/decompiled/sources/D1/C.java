package D1;

import android.content.Context;
import com.gates.olympus.miruv.tenon.TenonLocker;
import e1.InterfaceC0359h;
import i1.C0467d;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f520a;

    /* renamed from: b, reason: collision with root package name */
    public final C0467d f521b;

    /* renamed from: c, reason: collision with root package name */
    public final C0467d f522c;

    /* renamed from: d, reason: collision with root package name */
    public final C0467d f523d;

    /* renamed from: e, reason: collision with root package name */
    public final A f524e;

    /* renamed from: f, reason: collision with root package name */
    public final A f525f;

    public C(Context context) {
        this.f520a = context;
        TenonLocker tenonLocker = TenonLocker.INSTANCE;
        String at = tenonLocker.at(3);
        Z1.i.f(at, "name");
        this.f521b = new C0467d(at);
        String at2 = tenonLocker.at(4);
        Z1.i.f(at2, "name");
        this.f522c = new C0467d(at2);
        String at3 = tenonLocker.at(5);
        Z1.i.f(at3, "name");
        this.f523d = new C0467d(at3);
        this.f524e = new A(((InterfaceC0359h) D.a(context).f83b).g(), this, 0);
        this.f525f = new A(((InterfaceC0359h) D.a(context).f83b).g(), this, 1);
    }
}
