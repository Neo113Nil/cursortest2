package W1;

import U1.C0080a;
import android.content.SharedPreferences;
import android.util.Log;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: W1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0089a implements L1.b {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f1661a;

    /* renamed from: b, reason: collision with root package name */
    public final C0080a f1662b = new C0080a(5);

    public static void d(P1.f fVar, final C0089a c0089a) {
        K0.j e3 = fVar.e(new P1.j());
        C0090b c0090b = C0090b.f1663b;
        B0.p pVar = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i3 = 0;
            pVar.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i3) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar.i(null);
        }
        B0.p pVar2 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i4 = 1;
            pVar2.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i4) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar2.i(null);
        }
        B0.p pVar3 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i5 = 2;
            pVar3.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i5) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar3.i(null);
        }
        B0.p pVar4 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i6 = 3;
            pVar4.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i6) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar4.i(null);
        }
        B0.p pVar5 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i7 = 4;
            pVar5.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i7) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar5.i(null);
        }
        B0.p pVar6 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i8 = 5;
            pVar6.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i8) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar6.i(null);
        }
        B0.p pVar7 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i9 = 6;
            pVar7.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i9) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar7.i(null);
        }
        B0.p pVar8 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", (P1.k) c0090b, e3);
        if (c0089a != null) {
            final int i10 = 7;
            pVar8.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i10) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            pVar8.i(null);
        }
        B0.p pVar9 = new B0.p(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", (P1.k) c0090b, e3);
        if (c0089a == null) {
            pVar9.i(null);
        } else {
            final int i11 = 8;
            pVar9.i(new P1.b(c0089a) { // from class: W1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0089a f1666b;

                {
                    this.f1666b = c0089a;
                }

                @Override // P1.b
                public final void a(Object obj, V0.e eVar) {
                    switch (i11) {
                        case 0:
                            C0089a c0089a2 = this.f1666b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0089a2.f1661a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.X(th);
                            }
                            eVar.n(arrayList);
                            break;
                        case 1:
                            C0089a c0089a3 = this.f1666b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0089a3.f1661a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.X(th2);
                            }
                            eVar.n(arrayList2);
                            break;
                        case 2:
                            C0089a c0089a4 = this.f1666b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0089a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.X(th3);
                            }
                            eVar.n(arrayList4);
                            break;
                        case 3:
                            C0089a c0089a5 = this.f1666b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0089a5.f1661a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.X(th4);
                            }
                            eVar.n(arrayList6);
                            break;
                        case 4:
                            C0089a c0089a6 = this.f1666b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0089a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0089a6.f1661a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.X(th5);
                            }
                            eVar.n(arrayList8);
                            break;
                        case 5:
                            C0089a c0089a7 = this.f1666b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0089a7.f1661a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.X(th6);
                            }
                            eVar.n(arrayList10);
                            break;
                        case 6:
                            C0089a c0089a8 = this.f1666b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0089a8.f1661a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0089a8.f1662b.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.X(th7);
                            }
                            eVar.n(arrayList12);
                            break;
                        case 7:
                            C0089a c0089a9 = this.f1666b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0089a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.X(th8);
                            }
                            eVar.n(arrayList14);
                            break;
                        default:
                            C0089a c0089a10 = this.f1666b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0089a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.X(th9);
                            }
                            eVar.n(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f1661a.edit();
        Map<String, ?> all = this.f1661a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f1661a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z = obj2 instanceof String;
                C0080a c0080a = this.f1662b;
                if (z) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = c0080a.c(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f1661a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0080a.e(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f1661a.edit().putString(str, str2).commit());
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        P1.f fVar = aVar.f888b;
        this.f1661a = aVar.f887a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        d(aVar.f888b, null);
    }
}
