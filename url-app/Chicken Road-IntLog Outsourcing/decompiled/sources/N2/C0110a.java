package N2;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: N2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0110a implements D2.b {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.j f2076b = new l1.j(10);

    public static void d(H2.f fVar, final C0110a c0110a) {
        s0.k d6 = fVar.d(new H2.j());
        C0111b c0111b = C0111b.f2077b;
        f2.t tVar = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0111b, d6);
        if (c0110a != null) {
            final int i2 = 0;
            tVar.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar2) {
                    switch (i2) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar2.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar2.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar2.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar2.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar2.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar2.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar2.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar2.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar2.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar.h(null);
        }
        f2.t tVar2 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0111b, d6);
        if (c0110a != null) {
            final int i3 = 1;
            tVar2.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i3) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar2.h(null);
        }
        f2.t tVar3 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0111b, d6);
        if (c0110a != null) {
            final int i6 = 2;
            tVar3.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i6) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar3.h(null);
        }
        f2.t tVar4 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0111b, d6);
        if (c0110a != null) {
            final int i7 = 3;
            tVar4.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i7) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar4.h(null);
        }
        f2.t tVar5 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0111b, d6);
        if (c0110a != null) {
            final int i8 = 4;
            tVar5.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i8) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar5.h(null);
        }
        f2.t tVar6 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0111b, d6);
        if (c0110a != null) {
            final int i9 = 5;
            tVar6.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i9) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar6.h(null);
        }
        f2.t tVar7 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0111b, d6);
        if (c0110a != null) {
            final int i10 = 6;
            tVar7.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i10) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar7.h(null);
        }
        f2.t tVar8 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0111b, d6);
        if (c0110a != null) {
            final int i11 = 7;
            tVar8.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i11) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        } else {
            tVar8.h(null);
        }
        f2.t tVar9 = new f2.t(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0111b, d6);
        if (c0110a == null) {
            tVar9.h(null);
        } else {
            final int i12 = 8;
            tVar9.h(new H2.b(c0110a) { // from class: N2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0110a f2080b;

                {
                    this.f2080b = c0110a;
                }

                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    switch (i12) {
                        case 0:
                            C0110a c0110a2 = this.f2080b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0110a2.f2075a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = K1.b.w0(th);
                            }
                            tVar22.b(arrayList);
                            break;
                        case 1:
                            C0110a c0110a3 = this.f2080b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0110a3.f2075a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = K1.b.w0(th2);
                            }
                            tVar22.b(arrayList2);
                            break;
                        case 2:
                            C0110a c0110a4 = this.f2080b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0110a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = K1.b.w0(th3);
                            }
                            tVar22.b(arrayList4);
                            break;
                        case 3:
                            C0110a c0110a5 = this.f2080b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0110a5.f2075a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = K1.b.w0(th4);
                            }
                            tVar22.b(arrayList6);
                            break;
                        case 4:
                            C0110a c0110a6 = this.f2080b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0110a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0110a6.f2075a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = K1.b.w0(th5);
                            }
                            tVar22.b(arrayList8);
                            break;
                        case 5:
                            C0110a c0110a7 = this.f2080b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0110a7.f2075a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = K1.b.w0(th6);
                            }
                            tVar22.b(arrayList10);
                            break;
                        case 6:
                            C0110a c0110a8 = this.f2080b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0110a8.f2075a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0110a8.f2076b.g(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = K1.b.w0(th7);
                            }
                            tVar22.b(arrayList12);
                            break;
                        case 7:
                            C0110a c0110a9 = this.f2080b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0110a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = K1.b.w0(th8);
                            }
                            tVar22.b(arrayList14);
                            break;
                        default:
                            C0110a c0110a10 = this.f2080b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0110a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = K1.b.w0(th9);
                            }
                            tVar22.b(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f2075a.edit();
        Map<String, ?> all = this.f2075a.getAll();
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
        Map<String, ?> all = this.f2075a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z = obj2 instanceof String;
                l1.j jVar = this.f2076b;
                if (z) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            jVar.getClass();
                            try {
                                obj2 = (List) new K(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e3) {
                                throw new RuntimeException(e3);
                            }
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
                        this.f2075a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + jVar.g(arrayList)).apply();
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
        return Boolean.valueOf(this.f2075a.edit().putString(str, str2).commit());
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a aVar) {
        H2.f fVar = aVar.f435c;
        this.f2075a = aVar.f433a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a aVar) {
        d(aVar.f435c, null);
    }
}
