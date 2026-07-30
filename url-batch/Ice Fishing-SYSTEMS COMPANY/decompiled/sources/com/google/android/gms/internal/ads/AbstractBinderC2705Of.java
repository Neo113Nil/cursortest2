package com.google.android.gms.internal.ads;

import B2.BinderC0278l;
import B2.C0267a;
import B2.C0268b;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p.AbstractC4841a;
import p.AbstractC4846f;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2705Of extends AbstractBinderC3186f8 implements InterfaceC2722Pf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f26718n = 0;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        V2.b bVar;
        int i4 = 1;
        InterfaceC2671Mf interfaceC2671Mf = null;
        switch (i) {
            case 1:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                C2790Tf c2790Tf = (C2790Tf) AbstractC3241g8.b(parcel, C2790Tf.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC2671Mf = queryLocalInterface instanceof InterfaceC2671Mf ? (InterfaceC2671Mf) queryLocalInterface : new C2654Lf(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                ((BinderC0278l) this).G1(u02, c2790Tf, interfaceC2671Mf);
                parcel2.writeNoException();
                return true;
            case 2:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                BinderC0278l binderC0278l = (BinderC0278l) this;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31833x8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) V2.b.A0(u03);
                    C4179xe c4179xe = binderC0278l.f246B;
                    View view = c4179xe != null ? c4179xe.f35192n : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    binderC0278l.f247C = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        binderC0278l.f248D = binderC0278l.f247C;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC0278l.f247C;
                    obtain.setLocation(point.x, point.y);
                    binderC0278l.f271w.f31319b.b(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                V2.b.u0(parcel.readStrongBinder());
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                InterfaceC3909se G32 = AbstractBinderC3855re.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                ((BinderC0278l) this).G3(createTypedArrayList, u04, G32, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                InterfaceC3909se G33 = AbstractBinderC3855re.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                ((BinderC0278l) this).H3(createTypedArrayList2, u05, G33, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C4179xe c4179xe2 = (C4179xe) AbstractC3241g8.b(parcel, C4179xe.CREATOR);
                AbstractC3241g8.f(parcel);
                BinderC0278l binderC0278l2 = (BinderC0278l) this;
                binderC0278l2.f246B = c4179xe2;
                binderC0278l2.f273y.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                BinderC0278l binderC0278l3 = (BinderC0278l) this;
                C3151ea c3151ea = AbstractC3368ia.Wa;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    C3151ea c3151ea2 = AbstractC3368ia.f31814v8;
                    SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                    if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
                        binderC0278l3.I3();
                    }
                    WebView webView = (WebView) V2.b.A0(u06);
                    if (webView == null) {
                        int i9 = t2.C.f40822b;
                        u2.i.c("The webView cannot be null.");
                    } else {
                        C3157eg c3157eg = AbstractC3212fg.f30743f;
                        C0268b c0268b = binderC0278l3.f268Z;
                        B2.B b9 = new B2.B(webView, c0268b, c3157eg);
                        webView.addJavascriptInterface(new C0267a(webView, binderC0278l3.f271w, binderC0278l3.f249E, binderC0278l3.f250F, binderC0278l3.f272x, binderC0278l3.Y, c0268b, b9), "gmaSdk");
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.gb)).booleanValue()) {
                            p2.j.f39798C.f39808h.f29022l.incrementAndGet();
                        }
                        if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
                            c0268b.a(webView);
                            if (((Boolean) AbstractC2734Qa.f27166d.r()).booleanValue()) {
                                b9.f146d = AbstractC3212fg.f30741d.scheduleWithFixedDelay(new B2.A(b9, i4), 0L, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.hb)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
                            binderC0278l3.I3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                V2.a u07 = V2.b.u0(parcel.readStrongBinder());
                InterfaceC3909se G34 = AbstractBinderC3855re.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                ((BinderC0278l) this).G3(createTypedArrayList3, u07, G34, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                V2.a u08 = V2.b.u0(parcel.readStrongBinder());
                InterfaceC3909se G35 = AbstractBinderC3855re.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                ((BinderC0278l) this).H3(createTypedArrayList4, u08, G35, true);
                parcel2.writeNoException();
                return true;
            case 11:
                V2.a u09 = V2.b.u0(parcel.readStrongBinder());
                V2.a u010 = V2.b.u0(parcel.readStrongBinder());
                String readString = parcel.readString();
                V2.a u011 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                BinderC0278l binderC0278l4 = (BinderC0278l) this;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.kb)).booleanValue()) {
                    Context context = (Context) V2.b.A0(u09);
                    AbstractC4846f abstractC4846f = (AbstractC4846f) V2.b.A0(u010);
                    AbstractC4841a abstractC4841a = (AbstractC4841a) V2.b.A0(u011);
                    C4067va c4067va = binderC0278l4.f267X;
                    c4067va.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(readString)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (abstractC4846f == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    c4067va.f34811l = context;
                    c4067va.f34808h = readString;
                    C3381io c3381io = c4067va.f34804d;
                    C3959ta c3959ta = new C3959ta(c4067va, abstractC4841a, c3381io);
                    c4067va.f34806f = c3959ta;
                    f4.p c4 = abstractC4846f.c(c3959ta);
                    c4067va.f34807g = c4;
                    if (c4 == null) {
                        int i10 = t2.C.f40822b;
                        u2.i.c("CustomTabsClient failed to create new session.");
                    }
                    K3.b.L(c3381io, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue()) {
                        B2.E e6 = binderC0278l4.Y;
                        synchronized (e6) {
                            e6.c(true);
                            e6.c(false);
                        }
                    }
                    if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
                        binderC0278l4.f268Z.a(null);
                    }
                    bVar = new V2.b(c4067va.f34807g);
                } else {
                    bVar = new V2.b(null);
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
